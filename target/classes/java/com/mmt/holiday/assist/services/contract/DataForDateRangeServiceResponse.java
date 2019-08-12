package com.mmt.holiday.assist.services.contract;

import java.util.List;

public class DataForDateRangeServiceResponse {

	Integer exitCode;
	String message;
	List<DataForDateRange>bookingData;


	public Integer getExitCode() {
		return exitCode;
	}
	public void setExitCode(Integer exitCode) {
		this.exitCode = exitCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<DataForDateRange> getBookingData() {
		return bookingData;
	}
	public void setBookingData(List<DataForDateRange> bookingData) {
		this.bookingData = bookingData;
	}
	
}
