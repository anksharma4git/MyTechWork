/**
 * This class is generated by jOOQ
 */
package com.mmt.holiday.assist.services.contract;

import org.joda.time.DateTime;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OnlineBookings implements java.io.Serializable {

	private static final long serialVersionUID = 561318767;

	private final java.lang.Integer       id;
	private final java.lang.Integer       rateId;
	private final java.lang.String      createdTime;
	private final java.lang.String      updatedTime;
	/*private final DateTime createdTime;
	private final DateTime updatedTime;*/
	private final java.lang.String        paymentReferenceId;
	private final java.lang.String        serverIp;
	private final java.lang.Integer       packageId;
	private final java.lang.Integer       packageValidityId;
	private final java.lang.Integer       inventoryId;
	private final java.lang.String        paymentStatus;
	private final java.lang.String        bookingStatus;
	private final java.lang.String        navisionBookingXml;
	private final java.lang.String        navisionStatus;
	private final java.lang.String        packageName;
	private final org.jooq.types.UInteger paymentId;
	private final java.lang.String        imintNo;
	private final java.lang.String        dealCode;
	private final java.lang.String        ecouponNo;
	private final java.lang.String        ecouponEmail;
	private final java.lang.String        paymentSchedule;
	private final java.lang.Integer       transportConfigId;
	private final java.lang.String        selectedItr;
	private final java.lang.Integer       ecouponDiscount;
	private final java.lang.Integer       paymentDiscount;
	private final java.lang.Integer       avgRateId;
	private final java.lang.String        lob;
	private final java.lang.String        lobCode;
	private final java.lang.String        cityName;
	private final java.lang.String        branch;
	private final java.lang.String        tourcode;
	private final java.lang.Integer       bookingCost;
	private final org.jooq.types.UInteger penaltyCharges;
	private final java.lang.String        feeprotplan;
	private final java.lang.String        tourcostprotlan;
	private final java.lang.Byte          valuePack;
	private final java.lang.String        modifiedBy;
	private final java.lang.String        cancellationReason;
	private final java.lang.Integer       agentid;
	private final java.lang.String        phoneno;
	private final java.lang.String        emailid;
	private final java.lang.String        typeOfBooking;
	private final java.lang.Integer       oldBookingId;
	private final org.jooq.types.UInteger paymentScheduleId;
	private final java.lang.Byte          foreignNational;
	private final java.math.BigDecimal    gpmAmount;
	private final java.math.BigDecimal    gpmLoss;
	private final java.math.BigDecimal    fphPackagePrice;
	private final java.lang.Byte          overnightFlight;
	private final java.lang.Byte          customizedBooking;
	private final java.lang.Byte          dynamicbooking;
	private final java.lang.Byte          fitBooking;
	private final java.lang.Byte          diyBooking;
	private final java.lang.Integer       noOfNights;
	private final java.lang.String        visa;
	private final java.lang.String        cancellationpolicy;
	private final java.lang.String        conditions;
	private final java.lang.String        navisionCode;
	private final java.lang.Double        defaultTaxPercent;
	private final java.lang.String        flightsBookingStatus;
	private final java.lang.String        paymentCheckoutid;
	private final java.lang.Byte          flightIncluded;
	private final java.lang.String        tagDestination;
	private final java.lang.String        importantInfo;
	private final java.lang.Byte          mobileBooking;
	private final java.lang.Byte          zeroPaymentBooking;
	private final java.lang.String        destWiseDuration;
	private final java.lang.String        dealCodeMessage;
	private final java.lang.String        packageTypeString;
	private final java.lang.Byte          overnightflighthandled;

	public OnlineBookings(
		java.lang.Integer       id,
		java.lang.Integer       rateId,
		java.lang.String      createdTime,
		java.lang.String      updatedTime,
		java.lang.String        paymentReferenceId,
		java.lang.String        serverIp,
		java.lang.Integer       packageId,
		java.lang.Integer       packageValidityId,
		java.lang.Integer       inventoryId,
		java.lang.String        paymentStatus,
		java.lang.String        bookingStatus,
		java.lang.String        navisionBookingXml,
		java.lang.String        navisionStatus,
		java.lang.String        packageName,
		org.jooq.types.UInteger paymentId,
		java.lang.String        imintNo,
		java.lang.String        dealCode,
		java.lang.String        ecouponNo,
		java.lang.String        ecouponEmail,
		java.lang.String        paymentSchedule,
		java.lang.Integer       transportConfigId,
		java.lang.String        selectedItr,
		java.lang.Integer       ecouponDiscount,
		java.lang.Integer       paymentDiscount,
		java.lang.Integer       avgRateId,
		java.lang.String        lob,
		java.lang.String        lobCode,
		java.lang.String        cityName,
		java.lang.String        branch,
		java.lang.String        tourcode,
		java.lang.Integer       bookingCost,
		org.jooq.types.UInteger penaltyCharges,
		java.lang.String        feeprotplan,
		java.lang.String        tourcostprotlan,
		java.lang.Byte          valuePack,
		java.lang.String        modifiedBy,
		java.lang.String        cancellationReason,
		java.lang.Integer       agentid,
		java.lang.String        phoneno,
		java.lang.String        emailid,
		java.lang.String        typeOfBooking,
		java.lang.Integer       oldBookingId,
		org.jooq.types.UInteger paymentScheduleId,
		java.lang.Byte          foreignNational,
		java.math.BigDecimal    gpmAmount,
		java.math.BigDecimal    gpmLoss,
		java.math.BigDecimal    fphPackagePrice,
		java.lang.Byte          overnightFlight,
		java.lang.Byte          customizedBooking,
		java.lang.Byte          dynamicbooking,
		java.lang.Byte          fitBooking,
		java.lang.Byte          diyBooking,
		java.lang.Integer       noOfNights,
		java.lang.String        visa,
		java.lang.String        cancellationpolicy,
		java.lang.String        conditions,
		java.lang.String        navisionCode,
		java.lang.Double        defaultTaxPercent,
		java.lang.String        flightsBookingStatus,
		java.lang.String        paymentCheckoutid,
		java.lang.Byte          flightIncluded,
		java.lang.String        tagDestination,
		java.lang.String        importantInfo,
		java.lang.Byte          mobileBooking,
		java.lang.Byte          zeroPaymentBooking,
		java.lang.String        destWiseDuration,
		java.lang.String        dealCodeMessage,
		java.lang.String        packageTypeString,
		java.lang.Byte          overnightflighthandled
	) {
		this.id = id;
		this.rateId = rateId;
		this.createdTime = createdTime;
		this.updatedTime = updatedTime;
		this.paymentReferenceId = paymentReferenceId;
		this.serverIp = serverIp;
		this.packageId = packageId;
		this.packageValidityId = packageValidityId;
		this.inventoryId = inventoryId;
		this.paymentStatus = paymentStatus;
		this.bookingStatus = bookingStatus;
		this.navisionBookingXml = navisionBookingXml;
		this.navisionStatus = navisionStatus;
		this.packageName = packageName;
		this.paymentId = paymentId;
		this.imintNo = imintNo;
		this.dealCode = dealCode;
		this.ecouponNo = ecouponNo;
		this.ecouponEmail = ecouponEmail;
		this.paymentSchedule = paymentSchedule;
		this.transportConfigId = transportConfigId;
		this.selectedItr = selectedItr;
		this.ecouponDiscount = ecouponDiscount;
		this.paymentDiscount = paymentDiscount;
		this.avgRateId = avgRateId;
		this.lob = lob;
		this.lobCode = lobCode;
		this.cityName = cityName;
		this.branch = branch;
		this.tourcode = tourcode;
		this.bookingCost = bookingCost;
		this.penaltyCharges = penaltyCharges;
		this.feeprotplan = feeprotplan;
		this.tourcostprotlan = tourcostprotlan;
		this.valuePack = valuePack;
		this.modifiedBy = modifiedBy;
		this.cancellationReason = cancellationReason;
		this.agentid = agentid;
		this.phoneno = phoneno;
		this.emailid = emailid;
		this.typeOfBooking = typeOfBooking;
		this.oldBookingId = oldBookingId;
		this.paymentScheduleId = paymentScheduleId;
		this.foreignNational = foreignNational;
		this.gpmAmount = gpmAmount;
		this.gpmLoss = gpmLoss;
		this.fphPackagePrice = fphPackagePrice;
		this.overnightFlight = overnightFlight;
		this.customizedBooking = customizedBooking;
		this.dynamicbooking = dynamicbooking;
		this.fitBooking = fitBooking;
		this.diyBooking = diyBooking;
		this.noOfNights = noOfNights;
		this.visa = visa;
		this.cancellationpolicy = cancellationpolicy;
		this.conditions = conditions;
		this.navisionCode = navisionCode;
		this.defaultTaxPercent = defaultTaxPercent;
		this.flightsBookingStatus = flightsBookingStatus;
		this.paymentCheckoutid = paymentCheckoutid;
		this.flightIncluded = flightIncluded;
		this.tagDestination = tagDestination;
		this.importantInfo = importantInfo;
		this.mobileBooking = mobileBooking;
		this.zeroPaymentBooking = zeroPaymentBooking;
		this.destWiseDuration = destWiseDuration;
		this.dealCodeMessage = dealCodeMessage;
		this.packageTypeString = packageTypeString;
		this.overnightflighthandled = overnightflighthandled;
	}

	public java.lang.Integer getId() {
		return this.id;
	}

	public java.lang.Integer getRateId() {
		return this.rateId;
	}

	public java.lang.String getCreatedTime() {
		return this.createdTime;
	}

	public java.lang.String getUpdatedTime() {
		return this.updatedTime;
	}

	public java.lang.String getPaymentReferenceId() {
		return this.paymentReferenceId;
	}

	public java.lang.String getServerIp() {
		return this.serverIp;
	}

	public java.lang.Integer getPackageId() {
		return this.packageId;
	}

	public java.lang.Integer getPackageValidityId() {
		return this.packageValidityId;
	}

	public java.lang.Integer getInventoryId() {
		return this.inventoryId;
	}

	public java.lang.String getPaymentStatus() {
		return this.paymentStatus;
	}

	public java.lang.String getBookingStatus() {
		return this.bookingStatus;
	}

	public java.lang.String getNavisionBookingXml() {
		return this.navisionBookingXml;
	}

	public java.lang.String getNavisionStatus() {
		return this.navisionStatus;
	}

	public java.lang.String getPackageName() {
		return this.packageName;
	}

	public org.jooq.types.UInteger getPaymentId() {
		return this.paymentId;
	}

	public java.lang.String getImintNo() {
		return this.imintNo;
	}

	public java.lang.String getDealCode() {
		return this.dealCode;
	}

	public java.lang.String getEcouponNo() {
		return this.ecouponNo;
	}

	public java.lang.String getEcouponEmail() {
		return this.ecouponEmail;
	}

	public java.lang.String getPaymentSchedule() {
		return this.paymentSchedule;
	}

	public java.lang.Integer getTransportConfigId() {
		return this.transportConfigId;
	}

	public java.lang.String getSelectedItr() {
		return this.selectedItr;
	}

	public java.lang.Integer getEcouponDiscount() {
		return this.ecouponDiscount;
	}

	public java.lang.Integer getPaymentDiscount() {
		return this.paymentDiscount;
	}

	public java.lang.Integer getAvgRateId() {
		return this.avgRateId;
	}

	public java.lang.String getLob() {
		return this.lob;
	}

	public java.lang.String getLobCode() {
		return this.lobCode;
	}

	public java.lang.String getCityName() {
		return this.cityName;
	}

	public java.lang.String getBranch() {
		return this.branch;
	}

	public java.lang.String getTourcode() {
		return this.tourcode;
	}

	public java.lang.Integer getBookingCost() {
		return this.bookingCost;
	}

	public org.jooq.types.UInteger getPenaltyCharges() {
		return this.penaltyCharges;
	}

	public java.lang.String getFeeprotplan() {
		return this.feeprotplan;
	}

	public java.lang.String getTourcostprotlan() {
		return this.tourcostprotlan;
	}

	public java.lang.Byte getValuePack() {
		return this.valuePack;
	}

	public java.lang.String getModifiedBy() {
		return this.modifiedBy;
	}

	public java.lang.String getCancellationReason() {
		return this.cancellationReason;
	}

	public java.lang.Integer getAgentid() {
		return this.agentid;
	}

	public java.lang.String getPhoneno() {
		return this.phoneno;
	}

	public java.lang.String getEmailid() {
		return this.emailid;
	}

	public java.lang.String getTypeOfBooking() {
		return this.typeOfBooking;
	}

	public java.lang.Integer getOldBookingId() {
		return this.oldBookingId;
	}

	public org.jooq.types.UInteger getPaymentScheduleId() {
		return this.paymentScheduleId;
	}

	public java.lang.Byte getForeignNational() {
		return this.foreignNational;
	}

	public java.math.BigDecimal getGpmAmount() {
		return this.gpmAmount;
	}

	public java.math.BigDecimal getGpmLoss() {
		return this.gpmLoss;
	}

	public java.math.BigDecimal getFphPackagePrice() {
		return this.fphPackagePrice;
	}

	public java.lang.Byte getOvernightFlight() {
		return this.overnightFlight;
	}

	public java.lang.Byte getCustomizedBooking() {
		return this.customizedBooking;
	}

	public java.lang.Byte getDynamicbooking() {
		return this.dynamicbooking;
	}

	public java.lang.Byte getFitBooking() {
		return this.fitBooking;
	}

	public java.lang.Byte getDiyBooking() {
		return this.diyBooking;
	}

	public java.lang.Integer getNoOfNights() {
		return this.noOfNights;
	}

	public java.lang.String getVisa() {
		return this.visa;
	}

	public java.lang.String getCancellationpolicy() {
		return this.cancellationpolicy;
	}

	public java.lang.String getConditions() {
		return this.conditions;
	}

	public java.lang.String getNavisionCode() {
		return this.navisionCode;
	}

	public java.lang.Double getDefaultTaxPercent() {
		return this.defaultTaxPercent;
	}

	public java.lang.String getFlightsBookingStatus() {
		return this.flightsBookingStatus;
	}

	public java.lang.String getPaymentCheckoutid() {
		return this.paymentCheckoutid;
	}

	public java.lang.Byte getFlightIncluded() {
		return this.flightIncluded;
	}

	public java.lang.String getTagDestination() {
		return this.tagDestination;
	}

	public java.lang.String getImportantInfo() {
		return this.importantInfo;
	}

	public java.lang.Byte getMobileBooking() {
		return this.mobileBooking;
	}

	public java.lang.Byte getZeroPaymentBooking() {
		return this.zeroPaymentBooking;
	}

	public java.lang.String getDestWiseDuration() {
		return this.destWiseDuration;
	}

	public java.lang.String getDealCodeMessage() {
		return this.dealCodeMessage;
	}

	public java.lang.String getPackageTypeString() {
		return this.packageTypeString;
	}

	public java.lang.Byte getOvernightflighthandled() {
		return this.overnightflighthandled;
	}
	
	
}
