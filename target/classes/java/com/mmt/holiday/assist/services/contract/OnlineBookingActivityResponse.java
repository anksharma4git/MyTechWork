package com.mmt.holiday.assist.services.contract;

import java.util.List;

public class OnlineBookingActivityResponse {
	String message;
	Integer exitCode;
	List<OnlineBookingActivity>online_booking_activity;
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
	public List<OnlineBookingActivity> getOnline_booking_activity() {
		return online_booking_activity;
	}
	public void setOnline_booking_activity(List<OnlineBookingActivity> online_booking_activity) {
		this.online_booking_activity = online_booking_activity;
	}
	
}
