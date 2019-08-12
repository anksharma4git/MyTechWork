
package com.mmt.holiday.assist.services.contract;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="packageId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="searchKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="creationTimestamp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customisationSessionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="packageClassId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lob" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bookingInfo" type="{http://review.reviewandbooking.hld.core.engine.mmt.com}BookingInfo"/&gt;
 *         &lt;element name="website" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="branch" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emailId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fromQuote" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="quoteRatePromised" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="quotePartialRatePromised" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="partPaymentDroolsTemplateJson" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="quoteSendDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="quoteEcouponDisc" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ignoreThreshHold" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="logId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "packageId", "searchKey", "creationTimestamp", "customisationSessionId",
        "packageClassId", "lob", "channel", "bookingInfo", "website", "branch", "requestId", "emailId", "fromQuote",
        "quoteRatePromised", "quotePartialRatePromised", "partPaymentDroolsTemplateJson", "quoteSendDate",
        "quoteEcouponDisc", "ignoreThreshHold", "logId" })
@XmlRootElement(name = "ReviewRequest", namespace = "http://review.reviewandbooking.hld.core.engine.mmt.com")
public class ReviewRequest implements Serializable {

    private final static long serialVersionUID = 1L;
    protected int packageId;
    @XmlElement(required = true)
    protected String searchKey;
    @XmlElement(required = true)
    protected String creationTimestamp;
    @XmlElement(required = true)
    protected String customisationSessionId;
    protected int packageClassId;
    @XmlElement(required = true)
    protected String lob;
    @XmlElement(required = true)
    protected String channel;
   /* @XmlElement(required = true)
    protected BookingInfo bookingInfo;*/
    @XmlElement(required = true)
    protected String website;
    @XmlElement(required = true)
    protected String branch;
    protected String requestId;
    protected String emailId;
    protected boolean fromQuote;
    protected int quoteRatePromised;
    protected int quotePartialRatePromised;
    @XmlElement(required = true)
    protected String partPaymentDroolsTemplateJson;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar quoteSendDate;
    protected int quoteEcouponDisc;
    protected boolean ignoreThreshHold;
    protected String logId;

    /**
     * Gets the value of the packageId property.
     * 
     */
    public int getPackageId() {
        return packageId;
    }

    /**
     * Sets the value of the packageId property.
     * 
     */
    public void setPackageId(int value) {
        this.packageId = value;
    }

    /**
     * Gets the value of the searchKey property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSearchKey() {
        return searchKey;
    }

    /**
     * Sets the value of the searchKey property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSearchKey(String value) {
        this.searchKey = value;
    }

    /**
     * Gets the value of the creationTimestamp property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCreationTimestamp() {
        return creationTimestamp;
    }

    /**
     * Sets the value of the creationTimestamp property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setCreationTimestamp(String value) {
        this.creationTimestamp = value;
    }

    /**
     * Gets the value of the customisationSessionId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCustomisationSessionId() {
        return customisationSessionId;
    }

    /**
     * Sets the value of the customisationSessionId property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setCustomisationSessionId(String value) {
        this.customisationSessionId = value;
    }

    /**
     * Gets the value of the packageClassId property.
     * 
     */
    public int getPackageClassId() {
        return packageClassId;
    }

    /**
     * Sets the value of the packageClassId property.
     * 
     */
    public void setPackageClassId(int value) {
        this.packageClassId = value;
    }

    /**
     * Gets the value of the lob property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLob() {
        return lob;
    }

    /**
     * Sets the value of the lob property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setLob(String value) {
        this.lob = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setChannel(String value) {
        this.channel = value;
    }

    /**
     * Gets the value of the bookingInfo property.
     * 
     * @return possible object is {@link BookingInfo }
     * 
     */


    /**
     * Gets the value of the website property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Sets the value of the website property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setWebsite(String value) {
        this.website = value;
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getBranch() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setBranch(String value) {
        this.branch = value;
    }

    /**
     * Gets the value of the requestId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the emailId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getEmailId() {
        return emailId;
    }

    /**
     * Sets the value of the emailId property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setEmailId(String value) {
        this.emailId = value;
    }

    /**
     * Gets the value of the fromQuote property.
     * 
     */
    public boolean isFromQuote() {
        return fromQuote;
    }

    /**
     * Sets the value of the fromQuote property.
     * 
     */
    public void setFromQuote(boolean value) {
        this.fromQuote = value;
    }

    /**
     * Gets the value of the quoteRatePromised property.
     * 
     */
    public int getQuoteRatePromised() {
        return quoteRatePromised;
    }

    /**
     * Sets the value of the quoteRatePromised property.
     * 
     */
    public void setQuoteRatePromised(int value) {
        this.quoteRatePromised = value;
    }

    /**
     * Gets the value of the quotePartialRatePromised property.
     * 
     */
    public int getQuotePartialRatePromised() {
        return quotePartialRatePromised;
    }

    /**
     * Sets the value of the quotePartialRatePromised property.
     * 
     */
    public void setQuotePartialRatePromised(int value) {
        this.quotePartialRatePromised = value;
    }

    /**
     * Gets the value of the partPaymentDroolsTemplateJson property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPartPaymentDroolsTemplateJson() {
        return partPaymentDroolsTemplateJson;
    }

    /**
     * Sets the value of the partPaymentDroolsTemplateJson property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setPartPaymentDroolsTemplateJson(String value) {
        this.partPaymentDroolsTemplateJson = value;
    }

    /**
     * Gets the value of the quoteSendDate property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getQuoteSendDate() {
        return quoteSendDate;
    }

    /**
     * Sets the value of the quoteSendDate property.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setQuoteSendDate(XMLGregorianCalendar value) {
        this.quoteSendDate = value;
    }

    /**
     * Gets the value of the quoteEcouponDisc property.
     * 
     */
    public int getQuoteEcouponDisc() {
        return quoteEcouponDisc;
    }

    /**
     * Sets the value of the quoteEcouponDisc property.
     * 
     */
    public void setQuoteEcouponDisc(int value) {
        this.quoteEcouponDisc = value;
    }

    /**
     * Gets the value of the ignoreThreshHold property.
     * 
     */
    public boolean isIgnoreThreshHold() {
        return ignoreThreshHold;
    }

    /**
     * Sets the value of the ignoreThreshHold property.
     * 
     */
    public void setIgnoreThreshHold(boolean value) {
        this.ignoreThreshHold = value;
    }

    /**
     * Gets the value of the logId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLogId() {
        return logId;
    }

    /**
     * Sets the value of the logId property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setLogId(String value) {
        this.logId = value;
    }

}
