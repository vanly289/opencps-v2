//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.25 at 10:36:56 AM ICT 
//


package org.opencps.thirdparty.system.nsw.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApprovalOfVLStopTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApprovalOfVLStopTransport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OfficialDispatchNo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NameOfCompany">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DepartureFrom">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DepartureTo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FromParkingLot">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FromProvinceCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FromProvinceName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ToParkingLot">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ToProvinceCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ToProvinceName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}AttachedFile" maxOccurs="unbounded"/>
 *         &lt;element ref="{}IssuingAuthority"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApprovalOfVLStopTransport", propOrder = {
    "officialDispatchNo",
    "nameOfCompany",
    "departureFrom",
    "departureTo",
    "fromParkingLot",
    "fromProvinceCode",
    "fromProvinceName",
    "toParkingLot",
    "toProvinceCode",
    "toProvinceName",
    "attachedFile",
    "issuingAuthority"
})
public class ApprovalOfVLStopTransport {

    @XmlElement(name = "OfficialDispatchNo")
    protected String officialDispatchNo;
    @XmlElement(name = "NameOfCompany", required = true)
    protected String nameOfCompany;
    @XmlElement(name = "DepartureFrom", required = true)
    protected String departureFrom;
    @XmlElement(name = "DepartureTo", required = true)
    protected String departureTo;
    @XmlElement(name = "FromParkingLot", required = true)
    protected String fromParkingLot;
    @XmlElement(name = "FromProvinceCode", required = true)
    protected String fromProvinceCode;
    @XmlElement(name = "FromProvinceName", required = true)
    protected String fromProvinceName;
    @XmlElement(name = "ToParkingLot", required = true)
    protected String toParkingLot;
    @XmlElement(name = "ToProvinceCode", required = true)
    protected String toProvinceCode;
    @XmlElement(name = "ToProvinceName", required = true)
    protected String toProvinceName;
    @XmlElement(name = "AttachedFile", required = true)
    protected List<AttachedFile> attachedFile;
    @XmlElement(name = "IssuingAuthority", required = true)
    protected IssuingAuthority issuingAuthority;

    /**
     * Gets the value of the officialDispatchNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficialDispatchNo() {
        return officialDispatchNo;
    }

    /**
     * Sets the value of the officialDispatchNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficialDispatchNo(String value) {
        this.officialDispatchNo = value;
    }

    /**
     * Gets the value of the nameOfCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfCompany() {
        return nameOfCompany;
    }

    /**
     * Sets the value of the nameOfCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfCompany(String value) {
        this.nameOfCompany = value;
    }

    /**
     * Gets the value of the departureFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureFrom() {
        return departureFrom;
    }

    /**
     * Sets the value of the departureFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureFrom(String value) {
        this.departureFrom = value;
    }

    /**
     * Gets the value of the departureTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTo() {
        return departureTo;
    }

    /**
     * Sets the value of the departureTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTo(String value) {
        this.departureTo = value;
    }

    /**
     * Gets the value of the fromParkingLot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromParkingLot() {
        return fromParkingLot;
    }

    /**
     * Sets the value of the fromParkingLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromParkingLot(String value) {
        this.fromParkingLot = value;
    }

    /**
     * Gets the value of the fromProvinceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromProvinceCode() {
        return fromProvinceCode;
    }

    /**
     * Sets the value of the fromProvinceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromProvinceCode(String value) {
        this.fromProvinceCode = value;
    }

    /**
     * Gets the value of the fromProvinceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromProvinceName() {
        return fromProvinceName;
    }

    /**
     * Sets the value of the fromProvinceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromProvinceName(String value) {
        this.fromProvinceName = value;
    }

    /**
     * Gets the value of the toParkingLot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToParkingLot() {
        return toParkingLot;
    }

    /**
     * Sets the value of the toParkingLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToParkingLot(String value) {
        this.toParkingLot = value;
    }

    /**
     * Gets the value of the toProvinceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToProvinceCode() {
        return toProvinceCode;
    }

    /**
     * Sets the value of the toProvinceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToProvinceCode(String value) {
        this.toProvinceCode = value;
    }

    /**
     * Gets the value of the toProvinceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToProvinceName() {
        return toProvinceName;
    }

    /**
     * Sets the value of the toProvinceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToProvinceName(String value) {
        this.toProvinceName = value;
    }

    /**
     * Gets the value of the attachedFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachedFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachedFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachedFile }
     * 
     * 
     */
    public List<AttachedFile> getAttachedFile() {
        if (attachedFile == null) {
            attachedFile = new ArrayList<AttachedFile>();
        }
        return this.attachedFile;
    }

    /**
     * Gets the value of the issuingAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link IssuingAuthority }
     *     
     */
    public IssuingAuthority getIssuingAuthority() {
        return issuingAuthority;
    }

    /**
     * Sets the value of the issuingAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuingAuthority }
     *     
     */
    public void setIssuingAuthority(IssuingAuthority value) {
        this.issuingAuthority = value;
    }

}
