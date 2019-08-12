package com.mmt.holiday.assist.services.common;

public class Constants {

	public static final String  HOLIDAY_SERVICE_LOG_FILE_NAME="holidays-service.log";
	public static final String  SERVICE_SUCCESS_MESSAGE="success.";
	public static final String  SERVICE_FAILURE_MESSAGE="Failure.";
	public static final Integer  SERVICE_SUCCESS_EXIT_CODE=1;
	public static final Integer  SERVICE_ERROR_EXIT_CODE=0;
	public static final String  PROD_DB_HOST="jdbc:mysql://10.96.22.61:3306/hpcms_db_new?autoReconnect=true";
	public static final String  PROD_DB_USERNAME="hpcmsuser";
	public static final String  PROD_DB_PASSWORD="stg1@mmyt";
	public static final String  QA_DB_HOST="jdbc:mysql://172.16.43.123:3306/hpcms_db_new";
	public static final String  QA_DB_USERNAME="hpcmsqausr";
	public static final String  QA_DB_PASSWORD="hpcms3TqA@12";
												 
	public static final String  TEST_DATA_DB_HOST="jdbc:mysql://172.16.43.75:3306/testdatabase?useSSL=false";
	public static final String  TEST_DATA_DB_USERNAME="root";
	public static final String  TEST_DATA_DB_PASSWORD="root";
	
	public static final String  NAV_XML_URL="http://10.66.29.33/NavRequest/xmlrequestnl.php?id=";
	public static final String  REVIEW_REQUEST_URL_PATTERN="http://holidayservice.mmt.mmt/HolidayServices/service/bookingReview/review/";
	public static final String  REVIEW_REQUEST_END_PATTERN="</ns61:ReviewRequest>";
	public static final String DIY="DIY";
	public static final String BOOKING_TYPE_ONLINE="Online";
	public static final String BOOKING_TYPE_AGENT="Agent";
	public static final String DATE_FORMAT_DD_MM_YYYY="dd-MM-YYYY";
	public static final String DATE_FORMAT_YYYY_MM_DD="YYYY-MM-dd";
	public static final String DATE_FORMAT_YYYY_MM_DD_WITH_TIME="yyyy-MM-dd HH:mm:ss.SS";
	public static final String USER_COUNT_FILE="userCount.txt";
	
	public static final String HOL_BOOKING_NL_ID_PATTERN="NL2";
	public static final String HOTEL_BOOKING_NL_ID_PATTERN="NL4";
	public static final String COMMUTE_CAR_BOOKING_NL_ID_PATTERN="NC8";
	public static final String COMMUTE_ACTIVITY_BOOKING_NL_ID_PATTERN="NS8";
	
}
