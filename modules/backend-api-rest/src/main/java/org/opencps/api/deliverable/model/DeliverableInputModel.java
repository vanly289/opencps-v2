//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.07 at 10:58:13 AM ICT 
//


package org.opencps.api.deliverable.model;

import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliverableTypeInputModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliverableTypeInputModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deliverableType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliverableCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="govAgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicantIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}String" minOccurs="0"/>
 *         &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="revalidate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliverableState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliverableInputModel", propOrder = {
    "deliverableType",
    "deliverableCode",
    "govAgencyCode",
    "govAgencyName",
    "applicantIdNo",
    "applicantName",
    "subject",
    "issueDate",
    "expireDate",
    "revalidate",
    "deliverableState",
})
public class DeliverableInputModel {

	@FormParam(value = "deliverableType")
    protected String deliverableType;
	@FormParam(value = "deliverableCode")
    protected String deliverableCode;
	@FormParam(value = "govAgencyCode")
    protected String govAgencyCode;
	@FormParam(value = "govAgencyName")
    protected String govAgencyName;
	@FormParam(value = "applicantIdNo")
    protected String applicantIdNo;
	@FormParam(value = "applicantName")
    protected String applicantName;
	@FormParam(value = "subject")
    protected String subject;
	@FormParam(value = "issueDate")
    protected String issueDate;
	@FormParam(value = "expireDate")
    protected String expireDate;
	@FormParam(value = "revalidate")
    protected String revalidate;
	@FormParam(value = "deliverableState")
    protected String deliverableState;

    public String getGovAgencyName() {
		return govAgencyName;
	}

	public void setGovAgencyName(String govAgencyName) {
		this.govAgencyName = govAgencyName;
	}

    /**
     * Gets the value of the deliverableType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliverableType() {
        return deliverableType;
    }

    /**
     * Sets the value of the deliverableType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliverableType(String deliverableType) {
        this.deliverableType = deliverableType;
    }

    /**
     * Gets the value of the deliverableCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getDeliverableCode() {
		return deliverableCode;
	}

    /**
     * Sets the value of the deliverableCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
	public void setDeliverableCode(String deliverableCode) {
		this.deliverableCode = deliverableCode;
	}

    /**
     * Gets the value of the govAgencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getGovAgencyCode() {
		return govAgencyCode;
	}

    /**
     * Sets the value of the govAgencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
	public void setGovAgencyCode(String govAgencyCode) {
		this.govAgencyCode = govAgencyCode;
	}

    /**
     * Gets the value of the applicantIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getApplicantIdNo() {
		return applicantIdNo;
	}

    /**
     * Sets the value of the applicantIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
	public void setApplicantIdNo(String applicantIdNo) {
		this.applicantIdNo = applicantIdNo;
	}

    /**
     * Gets the value of the applicantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getApplicantName() {
		return applicantName;
	}

    /**
     * Sets the value of the applicantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getSubject() {
		return subject;
	}

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
	public void setSubject(String subject) {
		this.subject = subject;
	}

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getIssueDate() {
		return issueDate;
	}

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

    /**
     * Gets the value of the expireDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getExpireDate() {
		return expireDate;
	}

    /**
     * Sets the value of the expireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

    /**
     * Gets the value of the revalidate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getRevalidate() {
		return revalidate;
	}

    /**
     * Sets the value of the revalidate property.
     * 
     * @param revalidate
     *     allowed object is
     *     {@link String }
     *     
     */
	public void setRevalidate(String revalidate) {
		this.revalidate = revalidate;
	}

    /**
     * Gets the value of the deliverableState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getDeliverableState() {
		return deliverableState;
	}

    /**
     * Sets the value of the deliverableState property.
     * 
     * @param deliverableState
     *     allowed object is
     *     {@link String }
     *     
     */
	public void setDeliverableState(String deliverableState) {
		this.deliverableState = deliverableState;
	}

}
