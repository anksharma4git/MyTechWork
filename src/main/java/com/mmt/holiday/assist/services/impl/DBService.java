package com.mmt.holiday.assist.services.impl;

import java.util.List;

import com.mmt.holiday.assist.services.common.Constants;
import com.mmt.holiday.assist.services.common.FileUtil;
import com.mmt.holiday.assist.services.common.ServiceUtil;
import com.mmt.holiday.assist.services.contract.DBServiceResponse;
import com.mmt.holiday.assist.services.contract.DataForDateRange;
import com.mmt.holiday.assist.services.contract.DataForDateRangeServiceResponse;
import com.mmt.holiday.assist.services.contract.HotelResponse;
import com.mmt.holiday.assist.services.contract.OnlineBookingActivity;
import com.mmt.holiday.assist.services.contract.OnlineBookingActivityResponse;
import com.mmt.holiday.assist.services.contract.OnlineBookingCommute;
import com.mmt.holiday.assist.services.contract.OnlineBookingHotels;
import com.mmt.holiday.assist.services.contract.OnlineBookings;
import com.mmt.holiday.assist.services.contract.OnlineCommuteInventory;
import com.mmt.holiday.assist.services.contract.OnlineCommuteResponse;

public class DBService {

	
	private DBProcessHandlerImpl dbProcessHandler;

	public DBService(DBProcessHandlerImpl dbProcessHandlerImpl) {
		this.dbProcessHandler=dbProcessHandlerImpl;
	}



	public String updateCountForUser() throws Exception {
		String count = FileUtil.readFromFile(Constants.USER_COUNT_FILE);
		int updatedCount = Integer.valueOf(count) + 1;
		if (FileUtil.saveCountToFile(Constants.USER_COUNT_FILE, String.valueOf(updatedCount))) {
			return String.valueOf(updatedCount);
		} else {
			return "unable to update count";
		}
	}

	public DBServiceResponse getDataForNLid(String paymentReferenceId) {
		DBServiceResponse dbServiceResponse = new DBServiceResponse();
		String bookingId = "";
		List<OnlineBookings> onlineBookingsList = dbProcessHandler.getOnlineBookingsData(paymentReferenceId, bookingId);
		dbServiceResponse = ServiceUtil.updateServiceResponse(dbServiceResponse, onlineBookingsList,
				"No record found in booking table !");

		if (dbServiceResponse.getExitCode().equals(1)) {

			bookingId = String.valueOf(onlineBookingsList.get(0).getId());

			dbServiceResponse.setBooking_extra_info(
					dbProcessHandler.getOnlineBookingsExtraInfoData(paymentReferenceId, bookingId));
			dbServiceResponse.setBooking_Summary(dbProcessHandler.getOnlineBookSummary(paymentReferenceId, bookingId));

			if (onlineBookingsList.get(0).getNavisionStatus().equalsIgnoreCase("Y")) {
				dbServiceResponse.setLinkToFormattedNavXml(Constants.NAV_XML_URL + bookingId);
			}
			dbServiceResponse.setOnline_Bookings(onlineBookingsList);

			dbServiceResponse.setOnline_Booked_Passengers(
					dbProcessHandler.getOnlineBookedPassengersData(paymentReferenceId, bookingId));
			dbServiceResponse.setOnline_Booking_Flights(
					dbProcessHandler.getOnlineBookingFlightsData(paymentReferenceId, bookingId));

			dbServiceResponse.setOnline_Booking_Hotels(
					dbProcessHandler.getOnlineBookingHotelsData(paymentReferenceId, bookingId));

			dbServiceResponse.setOnline_Booking_Commute(
					dbProcessHandler.getOnlineBookingCommuteData(paymentReferenceId, bookingId));
			dbServiceResponse.setOnline_booking_activity(dbProcessHandler.getOnlineBookingActivity(bookingId));

		} else {
			return dbServiceResponse;
		}
		return dbServiceResponse;
	}

	public DataForDateRangeServiceResponse getDataForDateRange(String startDate, String endDate) {
		DataForDateRangeServiceResponse serviceResponse = new DataForDateRangeServiceResponse();

		startDate = startDate + " 00:00:00";
		endDate = endDate + " 23:59:59";
		List<DataForDateRange> dateForDateRangeList = dbProcessHandler.getBookingDataForDateRange(startDate, endDate);
		ServiceUtil.updateDataForDateRangeServiceResponse(serviceResponse, dateForDateRangeList,
				"No records found from DB !!");
		serviceResponse.setBookingData(dateForDateRangeList);
		ServiceUtil.formatDataFromDateRangeResponse(serviceResponse);

		return serviceResponse;
	}

	public OnlineCommuteResponse getOnlineBookingCommuteCarData(String nlId) {

		OnlineCommuteResponse commuteResponse = new OnlineCommuteResponse();
		List<OnlineCommuteInventory> commuteList = dbProcessHandler.getOnlineBookingCommuteInventoryData(nlId);

		if (!commuteList.isEmpty()) {

			commuteResponse.setExitCode(Constants.SERVICE_SUCCESS_EXIT_CODE);
			commuteResponse.setMessage(Constants.SERVICE_SUCCESS_MESSAGE);
			commuteResponse.setOnline_commute_inventory(commuteList);
			commuteResponse.setOnline_booking_commute(
					getOnlineBookingCommuteData(commuteList.get(0).getOnlineBookingCommuteId()));

		} else {
			commuteResponse.setExitCode(Constants.SERVICE_ERROR_EXIT_CODE);
			commuteResponse.setMessage(Constants.SERVICE_FAILURE_MESSAGE);
		}
		return commuteResponse;
	}

	private List<OnlineBookingCommute> getOnlineBookingCommuteData(Integer onlineBookingCommuteId) {
		return dbProcessHandler.getOnlineBookingCommuteData(String.valueOf(onlineBookingCommuteId));

	}

	public OnlineBookingActivityResponse getOnlineBookingActivityData(String nlId) {
		OnlineBookingActivityResponse activityResponse = new OnlineBookingActivityResponse();
		List<OnlineBookingActivity> activityList = dbProcessHandler.getOnlineBookingActivityData(nlId);
		if (!activityList.isEmpty()) {
			activityResponse.setExitCode(Constants.SERVICE_SUCCESS_EXIT_CODE);
			activityResponse.setMessage(Constants.SERVICE_SUCCESS_MESSAGE);
			activityResponse.setOnline_booking_activity(activityList);
		} else {
			activityResponse.setExitCode(Constants.SERVICE_ERROR_EXIT_CODE);
			activityResponse.setMessage(Constants.SERVICE_FAILURE_MESSAGE);
		}
		return activityResponse;
	}

	public HotelResponse getOnlineHotelData(String nlId) {
		List<OnlineBookingHotels> hotelList = dbProcessHandler.getOnlineBookingHotelsData(nlId);
		HotelResponse hotelResponse = new HotelResponse();
		if (!hotelList.isEmpty()) {
			hotelResponse.setExitCode(Constants.SERVICE_SUCCESS_EXIT_CODE);
			hotelResponse.setMessage(Constants.SERVICE_SUCCESS_MESSAGE);
			hotelResponse.setOnline_booking_hotels(hotelList);
		} else {
			hotelResponse.setExitCode(Constants.SERVICE_ERROR_EXIT_CODE);
			hotelResponse.setMessage(Constants.SERVICE_FAILURE_MESSAGE);
		}
		return hotelResponse;
	}
}
