package com.mmt.holiday.assist.services.impl;

import java.util.List;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;

import com.mmt.holiday.assist.services.common.DBTables;
import com.mmt.holiday.assist.services.common.DBUtils;
import com.mmt.holiday.assist.services.contract.BookingSummary;
import com.mmt.holiday.assist.services.contract.DataForDateRange;
import com.mmt.holiday.assist.services.contract.OnlineBookedPassengers;
import com.mmt.holiday.assist.services.contract.OnlineBookingActivity;
import com.mmt.holiday.assist.services.contract.OnlineBookingCommute;
import com.mmt.holiday.assist.services.contract.OnlineBookingFlights;
import com.mmt.holiday.assist.services.contract.OnlineBookingHotels;
import com.mmt.holiday.assist.services.contract.OnlineBookings;
import com.mmt.holiday.assist.services.contract.OnlineBookingsExtraInfo;
import com.mmt.holiday.assist.services.contract.OnlineCommuteInventory;
import com.mmt.holiday.assist.services.dbcontroller.DBProcessHandler;

public class DBProcessHandlerImpl implements DBProcessHandler {

	DSLContext create;

	public DBProcessHandlerImpl(DSLContext create) {
		this.create = create;
	}

	@Override
	public Result<Record> getData(String queryToExecute) {

		return create.fetch(queryToExecute);
	}

	public List<OnlineBookings> getOnlineBookingsData(String paymentReferenceId, String bookingId) {
		return getData(DBUtils.getQueryString(DBTables.ONLINE_BOOKINGS, paymentReferenceId, bookingId))
				.into(OnlineBookings.class);

	}

	public void updateUserCount() {
		create.execute(DBUtils.getQueryString(DBTables.HA_USER, "", ""));

	}

	public List<DataForDateRange> getBookingDataForDateRange(String startDate, String endDate) {
		return getData(DBUtils.getQueryString(startDate, endDate)).into(DataForDateRange.class);

	}

	public List<OnlineBookingsExtraInfo> getOnlineBookingsExtraInfoData(String paymentReferenceId, String bookingId) {
		return getData(DBUtils.getQueryString(DBTables.ONLINE_BOOKINGS_EXTRA_INFO, paymentReferenceId, bookingId))
				.into(OnlineBookingsExtraInfo.class);

	}

	public List<OnlineBookedPassengers> getOnlineBookedPassengersData(String paymentReferenceId, String bookingId) {
		return getData(DBUtils.getQueryString(DBTables.ONLINE_BOOKED_PASSENGERS, paymentReferenceId, bookingId))
				.into(OnlineBookedPassengers.class);

	}

	public List<BookingSummary> getOnlineBookSummary(String paymentReferenceId, String bookingId) {

		return getData(DBUtils.getQueryString(DBTables.ONLINE_BOOKING_SUMMARY, paymentReferenceId, bookingId))
				.into(BookingSummary.class);

	}

	public List<OnlineBookingFlights> getOnlineBookingFlightsData(String paymentReferenceId, String bookingId) {
		return getData(DBUtils.getQueryString(DBTables.ONLINE_BOOKING_FLIGHTS, paymentReferenceId, bookingId))
				.into(OnlineBookingFlights.class);

	}

	public List<OnlineBookingHotels> getOnlineBookingHotelsData(String paymentReferenceId, String bookingId) {
		return getData(DBUtils.getQueryString(DBTables.ONLINE_BOOKING_HOTELS, paymentReferenceId, bookingId)+" WHERE booking_id=" + bookingId + ";")
				.into(OnlineBookingHotels.class);

	}
	
	public List<OnlineBookingHotels> getOnlineBookingHotelsData(String hotelBookingId) {
		return getData(DBUtils.getQueryString(DBTables.ONLINE_BOOKING_HOTELS, "", "")+" WHERE hotel_booking_id='"+hotelBookingId+"';")
				.into(OnlineBookingHotels.class);

	}

	public List<OnlineBookingCommute> getOnlineBookingCommuteData(String paymentReferenceId, String bookingId) {
		return getData(DBUtils.getQueryString(DBTables.ONLINE_BOOKING_COMMUTE, paymentReferenceId, bookingId)
				+ " WHERE booking_id=" + bookingId + ";").into(OnlineBookingCommute.class);

	}

	public List<OnlineCommuteInventory> getOnlineBookingCommuteInventoryData(String commuteBookingId) {
		return getData(DBUtils.getQueryString(DBTables.ONLINE_BOOKING_COMMUTE_INVENTORY, "", "")
				+ " WHERE commute_booking_id='" + commuteBookingId + "';").into(OnlineCommuteInventory.class);

	}
	
	public List<OnlineBookingCommute> getOnlineBookingCommuteData(String commuteId) {
		return getData(DBUtils.getQueryString(DBTables.ONLINE_BOOKING_COMMUTE, "", "")
				+ " WHERE id='" + commuteId + "';").into(OnlineBookingCommute.class);

	}

	public List<OnlineBookingActivity> getOnlineBookingActivityData(String activityBookingId) {
		return getData(DBUtils.getQueryString(DBTables.ONLINE_BOOKING_ACTIVITY, "", "") + " WHERE activity_booking_id='"
				+ activityBookingId + "';").into(OnlineBookingActivity.class);

	}
	
	public List<OnlineBookingActivity> getOnlineBookingActivity(String onlineBookingId) {
		return getData(DBUtils.getQueryString(DBTables.ONLINE_BOOKING_ACTIVITY, "", "") + " WHERE online_bookings_id="
				+ onlineBookingId + ";").into(OnlineBookingActivity.class);

	}
	
	
}
