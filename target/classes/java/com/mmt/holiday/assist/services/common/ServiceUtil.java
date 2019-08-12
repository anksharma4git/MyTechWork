package com.mmt.holiday.assist.services.common;

import java.util.List;

import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import com.mmt.holiday.assist.services.contract.DBServiceResponse;
import com.mmt.holiday.assist.services.contract.DataForDateRange;
import com.mmt.holiday.assist.services.contract.DataForDateRangeServiceResponse;

public class ServiceUtil {

	
	public static NLIDType getNlType(String nlId) {

		if (nlId.contains(Constants.HOL_BOOKING_NL_ID_PATTERN)) {
			return NLIDType.HOLIDAY;
		} else if (nlId.contains(Constants.COMMUTE_ACTIVITY_BOOKING_NL_ID_PATTERN)) {
			return NLIDType.COMMUTE_ACTIVITY;
		} else if (nlId.contains(Constants.COMMUTE_CAR_BOOKING_NL_ID_PATTERN)) {
			return NLIDType.COMMUTE_CAR;
		} else if (nlId.contains(Constants.HOTEL_BOOKING_NL_ID_PATTERN)) {
			return NLIDType.HOTEL;
		} else {
			return NLIDType.DEFAULT;
		}

	}
	public static <T> DBServiceResponse updateServiceResponse(DBServiceResponse dbServiceResponse,
			List<T> dataFromDBList, String errorMessage) {
		if (dataFromDBList.isEmpty()) {
			setServiceResponse(dbServiceResponse, false, errorMessage);

		} else {
			setServiceResponse(dbServiceResponse, true, "");

		}
		return dbServiceResponse;

	}
	
	public static <T> DataForDateRangeServiceResponse updateDataForDateRangeServiceResponse(DataForDateRangeServiceResponse serviceResponse,
			List<T> dataFromDBList, String errorMessage) {
		if (dataFromDBList.isEmpty()) {
			setDateForDateRangeServiceResponse(serviceResponse, false, errorMessage);

		} else {
			setDateForDateRangeServiceResponse(serviceResponse, true, "");

		}
		return serviceResponse;

	}


	private static void setDateForDateRangeServiceResponse(DataForDateRangeServiceResponse serviceResponse, boolean isSuccess,
			String errorMessage) {
		if (isSuccess){
			serviceResponse.setExitCode(Constants.SERVICE_SUCCESS_EXIT_CODE);
			serviceResponse.setMessage(Constants.SERVICE_SUCCESS_MESSAGE);
		}
		else{
			serviceResponse.setExitCode(Constants.SERVICE_ERROR_EXIT_CODE);
			serviceResponse.setMessage(Constants.SERVICE_FAILURE_MESSAGE + errorMessage);
		}
		
	}

	private static void setServiceResponse(DBServiceResponse dbServiceResponse, Boolean isSuccess,
			String failureReason) {
		if (isSuccess)
			setSuccessServiceResponse(dbServiceResponse);
		else
			setFailureServiceResponse(dbServiceResponse, failureReason);
	}
	
	

	private static void setSuccessServiceResponse(DBServiceResponse dbServiceResponse) {
		dbServiceResponse.setExitCode(Constants.SERVICE_SUCCESS_EXIT_CODE);
		dbServiceResponse.setMessage(Constants.SERVICE_SUCCESS_MESSAGE);

	}

	private static void setFailureServiceResponse(DBServiceResponse dbServiceResponse, String message) {
		dbServiceResponse.setExitCode(Constants.SERVICE_ERROR_EXIT_CODE);
		dbServiceResponse.setMessage(Constants.SERVICE_FAILURE_MESSAGE + message);

	}
	
	public static DataForDateRangeServiceResponse formatDataFromDateRangeResponse(
			DataForDateRangeServiceResponse response) {

		for (DataForDateRange dataForDateRange : response.getBookingData()) {
			dataForDateRange
					.setBookingDate(formatDate(dataForDateRange.getBookingDate(), Constants.DATE_FORMAT_DD_MM_YYYY,true));
			dataForDateRange.setDepartureDate(
					formatDate(dataForDateRange.getDepartureDate(), Constants.DATE_FORMAT_DD_MM_YYYY,false));
			
			String bookingType=dataForDateRange.getQuoteId()==null?Constants.BOOKING_TYPE_ONLINE:Constants.BOOKING_TYPE_AGENT;	
			dataForDateRange.setBookingType(bookingType);
		}

		return response;
	}

	private static String formatDate(String dateToFormat, String formatToConvert, boolean isDateWithTime) {
		LocalDate localDate;
		if (isDateWithTime) {
			DateTimeFormatter formatter = DateTimeFormat.forPattern(Constants.DATE_FORMAT_YYYY_MM_DD_WITH_TIME);
			LocalDateTime localDateTime = formatter.parseLocalDateTime(dateToFormat);
			localDate = localDateTime.toLocalDate();
		}else{
			localDate=new LocalDate(dateToFormat);
		}
		
		DateTimeFormatter dateFormat = DateTimeFormat.forPattern(formatToConvert);
		return dateFormat.print(localDate);
	}

	public static String formatDate(String startDate, String dateFormatYyyyMmDd) {
		DateTimeFormatter currentFormat = DateTimeFormat.forPattern(Constants.DATE_FORMAT_DD_MM_YYYY);
		DateTimeFormatter requiredFormat = DateTimeFormat.forPattern(dateFormatYyyyMmDd);
		
		LocalDate date=currentFormat.parseLocalDate(startDate);
		return requiredFormat.print(date);
	}
}
