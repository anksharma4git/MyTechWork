package com.mmt.holiday.assist.services.impl;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.jooq.DSLContext;
import org.testng.Reporter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import com.mmt.holiday.assist.services.contract.DefaultResponse;
import com.mmt.holiday.assist.services.common.*;

@Path("/db-service")
public class BookingDashboardController {

	private static  ObjectWriter jsonWriter;
	private  boolean isProductionDB=true;
	private static DSLContext create;


	static {
		Reporter.log("within static block ",true);
		jsonWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();

	}

	private void setUp(){

		create = DBUtils.getDSLContext(isProductionDB);
	}

	@GET
	@Path("getBookingDataForDateRange")
	@Produces(MediaType.APPLICATION_JSON)
	public String getBookingDataForDateRange(@QueryParam("startDate") String startDate,
			@QueryParam("endDate") String endDate) throws JsonProcessingException {
		setUp();
		DBProcessHandlerImpl dbProcessHandler = new DBProcessHandlerImpl(create);
		DBService dbService=new DBService(dbProcessHandler);

		return jsonWriter.writeValueAsString(dbService.getDataForDateRange(startDate, endDate));

	}

	@GET
	@Path("updateCount")
	@Produces(MediaType.TEXT_PLAIN)
	public String updateCount() {
		setUp();
		DBProcessHandlerImpl dbProcessHandler = new DBProcessHandlerImpl(create);
		DBService dbService=new DBService(dbProcessHandler);
		String count = "";
		try {
			count = dbService.updateCountForUser();
		} catch (Exception e) {
			return ("Exception occurred " + e.getMessage());
			// Reporter.log("Exception occurred "+e.getMessage(),true);
		}
		return "Usage count: " + count;

	}

	@GET
	@Path("getCount")
	@Produces(MediaType.TEXT_PLAIN)
	public String getCount() {
		String message = "";
		try {
			message = FileUtil.readFromFile("userCount.txt");
		} catch (IOException e) {
			message = "Some Exception occurred :" + e.getMessage();
		}
		return message;
	}

	@GET
	@Path("try")
	@Produces(MediaType.TEXT_PLAIN)
	public String returnString() {
		return "sucess";
	}

	/*@Test
	public void testData() throws JsonProcessingException{*/
	@GET
	@Path("getBookingData")
	@Produces(MediaType.APPLICATION_JSON)
	public String getBookingDataForDashboard(@QueryParam("nlid")String nlId) throws JsonProcessingException {

	//	String nlId = "NL4t";// "NL4104531270920";//"NS860503139536";//
							// "NL23102366856";//"NC860513187492";

		return jsonWriter.writeValueAsString(kickOffProcess(ServiceUtil.getNlType(nlId), nlId));

	}

	private Object kickOffProcess(NLIDType nlType, String nlId) {
		setUp();
		DBProcessHandlerImpl dbProcessHandler = new DBProcessHandlerImpl(create);
		DBService dbService=new DBService(dbProcessHandler);

		DefaultResponse defaultResponse = new DefaultResponse();

		switch (nlType) {
		case HOLIDAY:
			return dbService.getDataForNLid(nlId);
		case COMMUTE_ACTIVITY:
			return dbService.getOnlineBookingActivityData(nlId);
		case COMMUTE_CAR:
			return dbService.getOnlineBookingCommuteCarData(nlId);
		case HOTEL:
			return dbService.getOnlineHotelData(nlId);
		default:
			defaultResponse.setExitCode(Constants.SERVICE_ERROR_EXIT_CODE);
			defaultResponse.setMessage("Invalid Input provided");
			return defaultResponse;
		}

	}


}
