package com.mmt.holiday.mock.service.commons;

public enum LOB {

	FLIGHTS("flight"), HOTELS("hotel");

	String lob;
	
	LOB(String lob) {
		this.lob = lob;
	}
	
	public String getLob() {
		return lob;
	}

	public void setLob(String lob) {
		this.lob = lob;
	}
}
