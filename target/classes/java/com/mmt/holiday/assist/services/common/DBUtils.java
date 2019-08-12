package com.mmt.holiday.assist.services.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.testng.Reporter;

public class DBUtils {

	/**
	 * set isProductionDB to true if you need prod DB instance, for QA DB pass
	 * false
	 * 
	 * @param isProdutionDB
	 * @return
	 */
	public static DSLContext getDSLContext(Boolean isProdutionDB) {

		String dataBase = "", userName = "", password = "";

		if (isProdutionDB) {
			dataBase = Constants.PROD_DB_HOST;
			userName = Constants.PROD_DB_USERNAME;
			password = Constants.PROD_DB_PASSWORD;
		} else {
			dataBase = Constants.QA_DB_HOST;
			userName = Constants.QA_DB_USERNAME;
			password = Constants.QA_DB_PASSWORD;
		}
		Connection connection = getConnection(dataBase, userName, password);
		return DSL.using(connection, SQLDialect.MYSQL);
	}
	
	public static DSLContext getTestDataDSLContext() {
		 String dataBase = Constants.TEST_DATA_DB_HOST;
		 String userName = Constants.TEST_DATA_DB_USERNAME;
		 String password = Constants.TEST_DATA_DB_PASSWORD;
		
		Connection connection = getConnection(dataBase, userName, password);
		return DSL.using(connection, SQLDialect.MYSQL);
	}

	
	private static Connection getConnection(String dbHost, String userName, String dbPassword) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(dbHost, userName, dbPassword);
		} catch (ClassNotFoundException | SQLException ex) {
			ex.printStackTrace();
		}
		return null;

	}

	public static String getQueryString(DBTables tableName, String paymentReferenceId, String bookingId) {

		String queryString = "";
		switch (tableName) {

		case ONLINE_BOOKINGS:
			queryString = "SELECT * from " + tableName.tableName + " WHERE payment_reference_id='" + paymentReferenceId
					+ "';";
			break;
		case ONLINE_BOOKED_PASSENGERS:
			queryString = "SELECT * FROM " + tableName.tableName + " WHERE booking_id=" + bookingId;
			break;

		case ONLINE_BOOKING_FLIGHTS:

			queryString = "SELECT * FROM " + tableName.tableName + " WHERE booking_id=" + bookingId;

			break;
		case ONLINE_BOOKING_SUMMARY:
			queryString = "SELECT obp.payment_status AS bookingPaymentStatus, ob.navision_status AS isNavXmlGenerated,"
					+ " obh.hotel_booking_id as HotelNl4Id, obh.booking_status as HotelBookingStatus FROM online_bookings ob "
					+ "INNER JOIN online_booking_payments obp ON ob.payment_reference_id=obp.payment_reference_id "
					+ " Inner join online_booking_hotels obh ON obh.booking_id=ob.id "
					+ "WHERE ob.payment_reference_id='" + paymentReferenceId + "';";
			break;
		case ONLINE_BOOKING_HOTELS:
			queryString = "SELECT * FROM online_booking_hotels ";//WHERE booking_id=" + bookingId + ";";
			break;
		case ONLINE_BOOKING_COMMUTE:
			queryString = "SELECT * FROM online_booking_commute ";//WHERE booking_id=" + bookingId + ";";
			break;
		case ONLINE_BOOKINGS_EXTRA_INFO:
			queryString = "SELECT * FROM " + tableName.tableName + " WHERE booking_id=" + bookingId + ";";
			break;
		case HA_USER:
			queryString="UPDATE ha_user SET COUNT = COUNT+1";
			break;
		case ONLINE_BOOKING_COMMUTE_INVENTORY:
			queryString="SELECT * FROM "+tableName.tableName;
			break;
		case ONLINE_BOOKING_ACTIVITY:
			queryString="SELECT * FROM online_booking_activity ";
			break;
		default:
			queryString = "";
			Reporter.log("Incorrect DB Table enum passed :", true);
			break;

		}
		return queryString;
	}

	public static String getQueryString(String startDate, String endDate) {
		
		return "SELECT DISTINCT ob.payment_reference_id as paymentReferenceId,hpi.id as packageId,hpi.pkg_name as packageName,"
				+ "ob.deal_code as dealCode, ob.ecoupon_no as ecouponNo,ob.branch as branch,hc.name as departureCity ,"
				+ "ob.created_time AS bookingDate, hpi.`type` AS packageType, obpv.departure_date AS departureDate ,"
				+ "obp.amount_paid as amountPaid, obp.amount_pending as amountPending,ob.dynamicBooking,ob.tag_destination as tagDestination,"
				+ " obei.quote_id as quoteId "
				+ "FROM online_bookings ob LEFT OUTER JOIN online_booking_payments obp "
				+ "ON obp.payment_reference_id=ob.payment_reference_id LEFT OUTER JOIN online_booked_package_validity obpv "
				+ "ON obpv.id=ob.package_validity_id LEFT OUTER JOIN hp_package_info hpi ON hpi.id=ob.package_id "
				+ "LEFT OUTER JOIN hp_city hc ON obpv.city_id=hc.id "
				+ "LEFT OUTER JOIN online_bookings_extra_info obei ON obei.booking_id=ob.id WHERE "
				+ "ob.created_time BETWEEN '"+startDate+"' AND '"+endDate+"' AND obp.payment_status='success' AND ob.booking_status='Confirmed' ORDER by ob.created_time";
	}

}
