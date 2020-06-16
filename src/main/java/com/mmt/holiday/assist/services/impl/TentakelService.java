package com.mmt.holiday.assist.services.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.testng.Reporter;
import com.mmt.holiday.assist.services.HolidayOperations;
import com.mmt.holiday.assist.ssh.tunnel.HolOperations;
import com.mmt.holiday.assist.ssh.tunnel.tentakel.TentakelData;
import com.mmt.holiday.assist.ssh.tunnel.tentakel.TentakelGroup;

@Path("/tentakel-service")
public class TentakelService implements HolidayOperations {

	@GET
	@Path("getTentakelData")
	@Produces(MediaType.TEXT_PLAIN)
	public String testTentakel(@QueryParam("stringToSearch") String stringToSearch,
			@QueryParam("lookUpDate") String lookUpDate) {
		ExecutorService execService = Executors.newFixedThreadPool(2);
		return startWorkerJob(execService, stringToSearch, lookUpDate);
	}

	private String startWorkerJob(ExecutorService execService, String stringToSearch, String lookUpDate) {

		List<Future<?>> futureList = new ArrayList<>();
		StringBuffer finalText = new StringBuffer();

		Runnable tentakelRunnableMum = new TentakelWorker("10.96.104.21", getTantakelData(stringToSearch, lookUpDate),
				HolOperations.TENTAKEL, finalText);
		Future<?> futureMum = execService.submit(tentakelRunnableMum);
		futureList.add(futureMum);

		Runnable tentakelRunnableChn = new TentakelWorker("10.66.104.21", getTantakelData(stringToSearch, lookUpDate),
				HolOperations.TENTAKEL, finalText);
		Future<?> futureChn = execService.submit(tentakelRunnableChn);
		futureList.add(futureChn);

		logFailedCalls(futureList);

		return finalText.toString();

	}

	@GET
	@Path("try")
	@Produces(MediaType.TEXT_PLAIN)
	public String tryService() {

		return "this is to check";
	}

	private void logFailedCalls(List<Future<?>> futureList) {
		Iterator<Future<?>> iterator = futureList.iterator();

		while (iterator.hasNext()) {
			try {
				iterator.next().get();
			} catch (Exception e) {
				Reporter.log("Request failed !!" + e, true);
			}
		}
	}

	private TentakelData getTantakelData(String stringToSearch, String lookUpDate) {
		TentakelData tentakelData = new TentakelData();

		tentakelData.setGroup(TentakelGroup.HOLIDAY_SERVICE);
		tentakelData.setTextToSearch(stringToSearch);
		tentakelData.setDateToLookup(lookUpDate);

		return tentakelData;
	}


}
