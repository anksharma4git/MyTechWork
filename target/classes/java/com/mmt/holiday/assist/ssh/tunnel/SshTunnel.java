package com.mmt.holiday.assist.ssh.tunnel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.commons.io.IOUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.testng.Reporter;

import ch.ethz.ssh2.Connection;
import ch.ethz.ssh2.Session;
import ch.ethz.ssh2.StreamGobbler;
import com.mmt.holiday.assist.services.common.Constants;
import com.mmt.holiday.assist.ssh.tunnel.tentakel.TentakelData;
import com.mmt.holiday.assist.ssh.tunnel.tentakel.TentakelGroup;

public class SshTunnel {

	private static Session connectToServer(String localServerIp) throws IOException {
		Connection nodeConnection = setUpServerConnection(localServerIp);
		return nodeConnection.openSession();
	}

	private static boolean isCurrentDate(String lookUpDate) {

		DateTimeFormatter formatter = DateTimeFormat.forPattern("YYYY-MM-dd");

		String currentDate = formatter.print(DateTime.now());
		String logFileDate = formatter.print(DateTime.parse(lookUpDate));

		return currentDate.equals(logFileDate) ? true : false;
	}

	private static String getLogFileToLookUp(TentakelData tentakelData) {

		TentakelGroup group = tentakelData.getGroup();

		String logFileName = "";
		switch (group) {

		case HOLIDAY_SERVICE:

			logFileName = isCurrentDate(tentakelData.getDateToLookup()) ? Constants.HOLIDAY_SERVICE_LOG_FILE_NAME :
				Constants.HOLIDAY_SERVICE_LOG_FILE_NAME+"."+tentakelData.getDateToLookup()+".gz";

			break;
		default:
			Reporter.log("Unknown Tentakel group", true);
			break;

		}

		return logFileName;
	}

	public static String performOperationOnServer(String localServerIp, Object operation, HolOperations action,StringBuffer messageFromServer) {
		

		Reporter.log("Starting a thread for : "+localServerIp,true);
		BufferedReader  messageReader = null;
		
		InputStream stdout=null;

		try {
			Session session = connectToServer(localServerIp);
			session.requestPTY("xterm");
			

			switch (action) {

			case TENTAKEL:
				TentakelData tentakelData = (TentakelData) operation;
				
				String grepVariant=isCurrentDate(tentakelData.getDateToLookup())?"grep":"zgrep";
				
				Reporter.log("tentakel -g " + tentakelData.getGroup().toString() + " \"hostname; "+grepVariant+" -C70 '"
						+ tentakelData.getTextToSearch() + "' /opt/apache-tomcat-7.0.42/logs/"
						+getLogFileToLookUp(tentakelData)+"\"",true);
				
				session.execCommand("tentakel -g " + tentakelData.getGroup().toString() + " \"hostname; "+grepVariant+" -C70 '"
						+ tentakelData.getTextToSearch() + "' /opt/apache-tomcat-7.0.42/logs/"
								+getLogFileToLookUp(tentakelData)+"\"");
				
				/*Reporter.log(("tentakel -g HolidaysNode  \"hostname; "+grepVariant+" -C3 '"
						+ tentakelData.getTextToSearch() + "' /opt/logs/node_logs.log.2017-02-10 \""),true);
				
				session.execCommand("tentakel -g HolidaysNode  \"hostname; "+grepVariant+" -C3 '"
						+ tentakelData.getTextToSearch() + "' /opt/logs/node_logs.log.2017-02-10 \"");
				*/
				
				 stdout = new StreamGobbler(session.getStdout());
		
				break;
			
			default:
				Reporter.log("Unknown action", true);

			}
			
			messageReader = new BufferedReader(new InputStreamReader(stdout));
			String x=getMessageFromStream(messageReader, new StringBuffer()).toString();
			 messageFromServer.append(x);

		
			session.close();
		

		} catch (Exception ex) {
			ex.printStackTrace();

		} finally {
			
			IOUtils.closeQuietly(messageReader);
		}
		return messageFromServer.toString();

	}

	public static boolean isServerPingable(String localServerIp, String serverToPing) {
		BufferedReader messageReader = null;
		try {
			Connection nodeConnection = setUpServerConnection(localServerIp);
			Session session = nodeConnection.openSession();
			session.requestPTY("xterm");
			session.execCommand("echo root | sudo ping " + serverToPing);
			messageReader = new BufferedReader(new InputStreamReader(session.getStdout()));
			StringBuffer messageFromServer = getMessageFromStream(messageReader, new StringBuffer());
			Reporter.log(messageFromServer.toString(), true);

			session.close();
			nodeConnection.close();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			IOUtils.closeQuietly(messageReader);
		}

		return isPingable;
	}

	static boolean isPingable = false;

	private static StringBuffer getMessageFromStream(BufferedReader messageReader, StringBuffer messageFromServer) {
		String readLine = "";
		

		try {
			while ((readLine = messageReader.readLine()) != null) {
				messageFromServer.append(readLine).append(System.lineSeparator());
				
				
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return messageFromServer;

	}

	private static Connection setUpServerConnection(String nodeName) {
		Connection nodeConnection = new Connection(nodeName, 22);
		try {

			nodeConnection.connect();
			nodeConnection.authenticateWithPassword("mmtusr", "p@55word");
		} catch (Exception ex) {
			Reporter.log("Unable to connect to Node " + nodeName,true);
			ex.printStackTrace();
		}
		return nodeConnection;
	}

}
