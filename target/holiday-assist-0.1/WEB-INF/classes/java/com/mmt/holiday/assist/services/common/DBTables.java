package com.mmt.holiday.assist.services.common;



public enum DBTables {

	ONLINE_BOOKINGS("online_bookings"),
	ONLINE_BOOKED_PASSENGERS("online_booked_passengers"),
	ONLINE_BOOKING_FLIGHTS("online_booking_flights"),
	ONLINE_BOOKING_SUMMARY(""),
	ONLINE_BOOKING_HOTELS("online_booking_hotels"),
	ONLINE_BOOKING_COMMUTE("online_booking_commute"),
	ONLINE_BOOKINGS_EXTRA_INFO("online_bookings_extra_info"),
	BOOKING_DATA_FOR_DATE_RANGE(""),
	HA_USER("ha_user"), ONLINE_BOOKING_COMMUTE_INVENTORY("online_commute_inventory"),
	ONLINE_BOOKING_ACTIVITY("online_booking_activity");

	public String tableName;

	DBTables(String tableName) {
		this.tableName = tableName;

	}

	public static DBTables getTableEnumFromTableName(String tableName) {

		if (tableName != null) {
			for (DBTables tableEnum : DBTables.values()) {
				if (tableEnum.tableName.equalsIgnoreCase(tableName)) {
					return tableEnum;
				}
			}
		}
		throw new IllegalArgumentException("Unable to find enum for Table or null table Name found!!! ");
	}
}
