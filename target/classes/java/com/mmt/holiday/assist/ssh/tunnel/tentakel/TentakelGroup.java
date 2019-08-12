package com.mmt.holiday.assist.ssh.tunnel.tentakel;

public enum TentakelGroup {

	HOLIDAY_SERVICE("Holidayservice"), HOLIDAY_PACKAGE("Holiday");

	String groupName;

	private TentakelGroup(String groupName) {
		this.groupName = groupName;
	}

	
	public String toString() {
		return this.groupName;

	}

}
