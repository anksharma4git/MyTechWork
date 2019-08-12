package com.mmt.holiday.assist.services.contract;

import java.util.List;

public class OnlineCommuteResponse {

	String message;
	Integer exitCode;
	List<OnlineCommuteInventory>online_commute_inventory;
	List<OnlineBookingCommute>online_booking_commute;
	
	
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
	public List<OnlineBookingCommute> getOnline_booking_commute() {
		return online_booking_commute;
	}
	public void setOnline_booking_commute(List<OnlineBookingCommute> online_booking_commute) {
		this.online_booking_commute = online_booking_commute;
	}
	public List<OnlineCommuteInventory> getOnline_commute_inventory() {
		return online_commute_inventory;
	}
	public void setOnline_commute_inventory(List<OnlineCommuteInventory> online_commute_inventory) {
		this.online_commute_inventory = online_commute_inventory;
	}
}
