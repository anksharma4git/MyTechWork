package com.mmt.holiday.assist.services.contract;



public class BookingDashBoardServiceResponse {
	String message;
	Integer exitCode;
	OnlineCommuteResponse onlineCommuteResponse;
	
	
	

	public OnlineCommuteResponse getOnlineCommuteResponse() {
		return onlineCommuteResponse;
	}
	public void setOnlineCommuteResponse(OnlineCommuteResponse onlineCommuteResponse) {
		this.onlineCommuteResponse = onlineCommuteResponse;
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
