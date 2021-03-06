/**
 * This class is generated by jOOQ
 */
package com.mmt.holiday.assist.services.contract;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OnlineBookingCommute implements java.io.Serializable {

	private static final long serialVersionUID = 1733963731;

	private final java.lang.Integer    id;
	private final java.lang.Integer    bookingId;
	private final java.lang.Integer    commuteId;
	private final java.lang.String     activitycode;
	private final java.lang.String     vendorname;
	private final java.math.BigDecimal costprice;
	private final java.math.BigDecimal marketsellingprice;
	private final java.math.BigDecimal totalmarkup;
	private final java.math.BigDecimal totalsellingprice;
	private final java.lang.String     vehiclename;
	private final java.lang.Integer    maxpaxcapacity;
	private final java.lang.String     vehiclecategory;
	private final java.lang.String     privateorshared;
	private final java.lang.String   updatedTime;
	private final java.lang.String   createdTime;
	private final java.lang.String   applicableOnDate;
	private final java.lang.Integer    count;
	private final java.lang.String     tocityname;
	private final java.lang.String     fromcityname;
	private final java.lang.String     listofcities;
	private final java.lang.String     vendorId;
	private final java.lang.String     rateId;
	private final java.lang.String     roe;
	private final java.lang.String     currencyCode;
	private final java.lang.String     uniqueJourneyId;

	public OnlineBookingCommute(
		java.lang.Integer    id,
		java.lang.Integer    bookingId,
		java.lang.Integer    commuteId,
		java.lang.String     activitycode,
		java.lang.String     vendorname,
		java.math.BigDecimal costprice,
		java.math.BigDecimal marketsellingprice,
		java.math.BigDecimal totalmarkup,
		java.math.BigDecimal totalsellingprice,
		java.lang.String     vehiclename,
		java.lang.Integer    maxpaxcapacity,
		java.lang.String     vehiclecategory,
		java.lang.String     privateorshared,
		java.lang.String   updatedTime,
		java.lang.String   createdTime,
		java.lang.String   applicableOnDate,
		java.lang.Integer    count,
		java.lang.String     tocityname,
		java.lang.String     fromcityname,
		java.lang.String     listofcities,
		java.lang.String     vendorId,
		java.lang.String     rateId,
		java.lang.String     roe,
		java.lang.String     currencyCode,
		java.lang.String     uniqueJourneyId
	) {
		this.id = id;
		this.bookingId = bookingId;
		this.commuteId = commuteId;
		this.activitycode = activitycode;
		this.vendorname = vendorname;
		this.costprice = costprice;
		this.marketsellingprice = marketsellingprice;
		this.totalmarkup = totalmarkup;
		this.totalsellingprice = totalsellingprice;
		this.vehiclename = vehiclename;
		this.maxpaxcapacity = maxpaxcapacity;
		this.vehiclecategory = vehiclecategory;
		this.privateorshared = privateorshared;
		this.updatedTime = updatedTime;
		this.createdTime = createdTime;
		this.applicableOnDate = applicableOnDate;
		this.count = count;
		this.tocityname = tocityname;
		this.fromcityname = fromcityname;
		this.listofcities = listofcities;
		this.vendorId = vendorId;
		this.rateId = rateId;
		this.roe = roe;
		this.currencyCode = currencyCode;
		this.uniqueJourneyId = uniqueJourneyId;
	}

	public java.lang.Integer getId() {
		return this.id;
	}

	public java.lang.Integer getBookingId() {
		return this.bookingId;
	}

	public java.lang.Integer getCommuteId() {
		return this.commuteId;
	}

	public java.lang.String getActivitycode() {
		return this.activitycode;
	}

	public java.lang.String getVendorname() {
		return this.vendorname;
	}

	public java.math.BigDecimal getCostprice() {
		return this.costprice;
	}

	public java.math.BigDecimal getMarketsellingprice() {
		return this.marketsellingprice;
	}

	public java.math.BigDecimal getTotalmarkup() {
		return this.totalmarkup;
	}

	public java.math.BigDecimal getTotalsellingprice() {
		return this.totalsellingprice;
	}

	public java.lang.String getVehiclename() {
		return this.vehiclename;
	}

	public java.lang.Integer getMaxpaxcapacity() {
		return this.maxpaxcapacity;
	}

	public java.lang.String getVehiclecategory() {
		return this.vehiclecategory;
	}

	public java.lang.String getPrivateorshared() {
		return this.privateorshared;
	}

	public java.lang.String getUpdatedTime() {
		return this.updatedTime;
	}

	public java.lang.String getCreatedTime() {
		return this.createdTime;
	}

	public java.lang.String getApplicableOnDate() {
		return this.applicableOnDate;
	}

	public java.lang.Integer getCount() {
		return this.count;
	}

	public java.lang.String getTocityname() {
		return this.tocityname;
	}

	public java.lang.String getFromcityname() {
		return this.fromcityname;
	}

	public java.lang.String getListofcities() {
		return this.listofcities;
	}

	public java.lang.String getVendorId() {
		return this.vendorId;
	}

	public java.lang.String getRateId() {
		return this.rateId;
	}

	public java.lang.String getRoe() {
		return this.roe;
	}

	public java.lang.String getCurrencyCode() {
		return this.currencyCode;
	}

	public java.lang.String getUniqueJourneyId() {
		return this.uniqueJourneyId;
	}
}
