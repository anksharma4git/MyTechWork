package com.mmt.holiday.assist.services.contract;

import java.util.List;

public class DBServiceResponse {

	String message;
	Integer exitCode;
	String linkToFormattedNavXml;
	List<OnlineBookingsExtraInfo> booking_extra_info;
	List<BookingSummary> booking_Summary;
	List<OnlineBookings> online_Bookings;
	List<OnlineBookedPassengers> online_Booked_Passengers;
	List<OnlineBookingFlights> online_Booking_Flights;
	List<OnlineBookingHotels> online_Booking_Hotels;
	List<OnlineBookingCommute> online_Booking_Commute;
	List<OnlineBookingActivity>online_booking_activity;

	
	public List<OnlineBookingActivity> getOnline_booking_activity() {
		return online_booking_activity;
	}

	public void setOnline_booking_activity(List<OnlineBookingActivity> online_booking_activity) {
		this.online_booking_activity = online_booking_activity;
	}

	public List<OnlineBookingsExtraInfo> getBooking_extra_info() {
		return booking_extra_info;
	}

	public void setBooking_extra_info(List<OnlineBookingsExtraInfo> booking_extra_info) {
		this.booking_extra_info = booking_extra_info;
	}

	public String getLinkToFormattedNavXml() {
		return linkToFormattedNavXml;
	}

	public void setLinkToFormattedNavXml(String linkToFormattedNavXml) {
		this.linkToFormattedNavXml = linkToFormattedNavXml;
	}

	public List<OnlineBookingCommute> getOnline_Booking_Commute() {
		return online_Booking_Commute;
	}

	public void setOnline_Booking_Commute(List<OnlineBookingCommute> online_Booking_Commute) {
		this.online_Booking_Commute = online_Booking_Commute;
	}

	public List<OnlineBookingHotels> getOnline_Booking_Hotels() {
		return online_Booking_Hotels;
	}

	public void setOnline_Booking_Hotels(List<OnlineBookingHotels> online_Booking_Hotels) {
		this.online_Booking_Hotels = online_Booking_Hotels;
	}

	public List<BookingSummary> getBooking_Summary() {
		return booking_Summary;
	}

	public void setBooking_Summary(List<BookingSummary> booking_Summary) {
		this.booking_Summary = booking_Summary;
	}

	public List<OnlineBookings> getOnline_Bookings() {
		return online_Bookings;
	}

	public void setOnline_Bookings(List<OnlineBookings> online_Bookings) {
		this.online_Bookings = online_Bookings;
	}

	public List<OnlineBookedPassengers> getOnline_Booked_Passengers() {
		return online_Booked_Passengers;
	}

	public void setOnline_Booked_Passengers(List<OnlineBookedPassengers> online_Booked_Passengers) {
		this.online_Booked_Passengers = online_Booked_Passengers;
	}

	public List<OnlineBookingFlights> getOnline_Booking_Flights() {
		return online_Booking_Flights;
	}

	public void setOnline_Booking_Flights(List<OnlineBookingFlights> online_Booking_Flights) {
		this.online_Booking_Flights = online_Booking_Flights;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getExitCode() {
		return exitCode;
	}

	public void setExitCode(Integer exitCode) {
		this.exitCode = exitCode;
	}

}
