package com.mmt.holiday.assist.services.contract;

import java.util.List;

public class HotelResponse {

	String message;
	Integer exitCode;
	List<OnlineBookingHotels>online_booking_hotels;
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
	public List<OnlineBookingHotels> getOnline_booking_hotels() {
		return online_booking_hotels;
	}
	public void setOnline_booking_hotels(List<OnlineBookingHotels> online_booking_hotels) {
		this.online_booking_hotels = online_booking_hotels;
	}
	
}
