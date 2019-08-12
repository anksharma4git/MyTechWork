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
public class OnlineBookedPassengers implements java.io.Serializable {

	private static final long serialVersionUID = -1452229533;

	private final java.lang.Integer       id;
	private final java.lang.Integer       bookingId;
	private final java.lang.String        firstName;
	private final java.lang.String        lastName;
	private final java.lang.String        middleName;
	private final java.lang.Short         age;
	private final java.lang.String        email;
	private final java.lang.String        mobileNo;
	private final java.lang.String      createdTime;
	private final java.lang.String      updatedTime;
	private final java.lang.Byte          isPrimary;
	private final java.lang.String        title;
	private final java.lang.String        type;
	private final java.lang.Integer       roomIndex;
	private final java.lang.Short         mobileCountryCode;
	private final java.lang.String        stdCode;
	private final java.lang.String        landlineNo;
	private final java.lang.Integer       departureDiscount;
	private final org.jooq.types.UInteger mandatoryCharges;
	private final java.lang.Integer       rateId;
	private final java.lang.Integer       onlineDiscount;
	private final java.lang.Integer       rateDateSlabId;
	private final java.lang.Integer       roomId;
	private final java.lang.String        mealtype;
	private final java.lang.Byte          status;
	private final java.lang.Byte          paxAdded;
	private final java.lang.Integer       lineNumberNavision;
	private final java.lang.String        dob;
	private final java.lang.Integer       bookedRateId;
	private final java.lang.String        visarequired;
	private final java.lang.String        passportno;
	private final java.lang.String        issuancedate;
	private final java.lang.String        expirydate;
	private final java.lang.String        placeofissue;
	private final java.lang.Integer       oldPassengerId;
	private final java.lang.String        baggagetype;
	private final java.lang.String        nationality;

	public OnlineBookedPassengers(
		java.lang.Integer       id,
		java.lang.Integer       bookingId,
		java.lang.String        firstName,
		java.lang.String        lastName,
		java.lang.String        middleName,
		java.lang.Short         age,
		java.lang.String        email,
		java.lang.String        mobileNo,
		java.lang.String      createdTime,
		java.lang.String      updatedTime,
		java.lang.Byte          isPrimary,
		java.lang.String        title,
		java.lang.String        type,
		java.lang.Integer       roomIndex,
		java.lang.Short         mobileCountryCode,
		java.lang.String        stdCode,
		java.lang.String        landlineNo,
		java.lang.Integer       departureDiscount,
		org.jooq.types.UInteger mandatoryCharges,
		java.lang.Integer       rateId,
		java.lang.Integer       onlineDiscount,
		java.lang.Integer       rateDateSlabId,
		java.lang.Integer       roomId,
		java.lang.String        mealtype,
		java.lang.Byte          status,
		java.lang.Byte          paxAdded,
		java.lang.Integer       lineNumberNavision,
		java.lang.String        dob,
		java.lang.Integer       bookedRateId,
		java.lang.String        visarequired,
		java.lang.String        passportno,
		java.lang.String        issuancedate,
		java.lang.String        expirydate,
		java.lang.String        placeofissue,
		java.lang.Integer       oldPassengerId,
		java.lang.String        baggagetype,
		java.lang.String        nationality
	) {
		this.id = id;
		this.bookingId = bookingId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.age = age;
		this.email = email;
		this.mobileNo = mobileNo;
		this.createdTime = createdTime;
		this.updatedTime = updatedTime;
		this.isPrimary = isPrimary;
		this.title = title;
		this.type = type;
		this.roomIndex = roomIndex;
		this.mobileCountryCode = mobileCountryCode;
		this.stdCode = stdCode;
		this.landlineNo = landlineNo;
		this.departureDiscount = departureDiscount;
		this.mandatoryCharges = mandatoryCharges;
		this.rateId = rateId;
		this.onlineDiscount = onlineDiscount;
		this.rateDateSlabId = rateDateSlabId;
		this.roomId = roomId;
		this.mealtype = mealtype;
		this.status = status;
		this.paxAdded = paxAdded;
		this.lineNumberNavision = lineNumberNavision;
		this.dob = dob;
		this.bookedRateId = bookedRateId;
		this.visarequired = visarequired;
		this.passportno = passportno;
		this.issuancedate = issuancedate;
		this.expirydate = expirydate;
		this.placeofissue = placeofissue;
		this.oldPassengerId = oldPassengerId;
		this.baggagetype = baggagetype;
		this.nationality = nationality;
	}

	public java.lang.Integer getId() {
		return this.id;
	}

	public java.lang.Integer getBookingId() {
		return this.bookingId;
	}

	public java.lang.String getFirstName() {
		return this.firstName;
	}

	public java.lang.String getLastName() {
		return this.lastName;
	}

	public java.lang.String getMiddleName() {
		return this.middleName;
	}

	public java.lang.Short getAge() {
		return this.age;
	}

	public java.lang.String getEmail() {
		return this.email;
	}

	public java.lang.String getMobileNo() {
		return this.mobileNo;
	}

	public java.lang.String getCreatedTime() {
		return this.createdTime;
	}

	public java.lang.String getUpdatedTime() {
		return this.updatedTime;
	}

	public java.lang.Byte getIsPrimary() {
		return this.isPrimary;
	}

	public java.lang.String getTitle() {
		return this.title;
	}

	public java.lang.String getType() {
		return this.type;
	}

	public java.lang.Integer getRoomIndex() {
		return this.roomIndex;
	}

	public java.lang.Short getMobileCountryCode() {
		return this.mobileCountryCode;
	}

	public java.lang.String getStdCode() {
		return this.stdCode;
	}

	public java.lang.String getLandlineNo() {
		return this.landlineNo;
	}

	public java.lang.Integer getDepartureDiscount() {
		return this.departureDiscount;
	}

	public org.jooq.types.UInteger getMandatoryCharges() {
		return this.mandatoryCharges;
	}

	public java.lang.Integer getRateId() {
		return this.rateId;
	}

	public java.lang.Integer getOnlineDiscount() {
		return this.onlineDiscount;
	}

	public java.lang.Integer getRateDateSlabId() {
		return this.rateDateSlabId;
	}

	public java.lang.Integer getRoomId() {
		return this.roomId;
	}

	public java.lang.String getMealtype() {
		return this.mealtype;
	}

	public java.lang.Byte getStatus() {
		return this.status;
	}

	public java.lang.Byte getPaxAdded() {
		return this.paxAdded;
	}

	public java.lang.Integer getLineNumberNavision() {
		return this.lineNumberNavision;
	}

	public java.lang.String getDob() {
		return this.dob;
	}

	public java.lang.Integer getBookedRateId() {
		return this.bookedRateId;
	}

	public java.lang.String getVisarequired() {
		return this.visarequired;
	}

	public java.lang.String getPassportno() {
		return this.passportno;
	}

	public java.lang.String getIssuancedate() {
		return this.issuancedate;
	}

	public java.lang.String getExpirydate() {
		return this.expirydate;
	}

	public java.lang.String getPlaceofissue() {
		return this.placeofissue;
	}

	public java.lang.Integer getOldPassengerId() {
		return this.oldPassengerId;
	}

	public java.lang.String getBaggagetype() {
		return this.baggagetype;
	}

	public java.lang.String getNationality() {
		return this.nationality;
	}
}