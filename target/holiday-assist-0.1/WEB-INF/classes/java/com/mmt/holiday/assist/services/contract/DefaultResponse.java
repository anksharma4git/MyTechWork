package com.mmt.holiday.assist.services.contract;

public class DefaultResponse {
	String message;
	Integer exitCode;
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
