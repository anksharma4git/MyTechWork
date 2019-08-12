package com.mmt.holiday.assist.services.contract;

public class BookingSummary {

	
	String bookingPaymentStatus;
	String isNavXmlGenerated;
	String HotelNl4Id;
	String HotelBookingStatus;
	
	public String getHotelNl4Id() {
		return HotelNl4Id;
	}
	public void setHotelNl4Id(String hotelNl4Id) {
		HotelNl4Id = hotelNl4Id;
	}
	public String getHotelBookingStatus() {
		return HotelBookingStatus;
	}
	public void setHotelBookingStatus(String hotelBookingStatus) {
		HotelBookingStatus = hotelBookingStatus;
	}
	public String getBookingPaymentStatus() {
		return bookingPaymentStatus;
	}
	public void setBookingPaymentStatus(String bookingPaymentStatus) {
		this.bookingPaymentStatus = bookingPaymentStatus;
	}
	public String getIsNavXmlGenerated() {
		return isNavXmlGenerated;
	}
	public void setIsNavXmlGenerated(String isNavXmlGenerated) {
		this.isNavXmlGenerated = isNavXmlGenerated;
	}
	
}
