//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.17 at 11:40:05 AM ICT 
//


package org.opencps.thirdparty.system.nsw.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CLVNonCommercialCrossBorderTransportPermit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CLVNonCommercialCrossBorderTransportPermit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegistrationNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ManufacturedYear" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TrademarkCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TrademarkName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Model" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VehicleType">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Truck">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Bus">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Others">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="VehicleColor" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EngineNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ChassisNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NameOfCompany" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Address" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Tel" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Fax" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VehicleOwner" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VehicleOwnerAddress" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VehicleOwnerTel" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VehicleOwnerFax" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LicenceNo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExpiredDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[0-9]{4}-[01][0-9]-[0-3][0-9] [0-2][0-9]:[0-5][0-9]:[0-6][0-9]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExpImpGateCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExpImpGate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TravelingArea">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Routes">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GoodsPassengerTransport" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OtherRemarks" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Extension">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ExtendedUntil">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="[0-9]{4}-[01][0-9]-[0-3][0-9] [0-2][0-9]:[0-5][0-9]:[0-6][0-9]"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "CLVNonCommercialCrossBorderTransportPermit", propOrder = {
    "registrationNumber",
    "manufacturedYear",
    "trademarkCode",
    "trademarkName",
    "model",
    "vehicleType",
    "vehicleColor",
    "engineNumber",
    "chassisNumber",
    "nameOfCompany",
    "address",
    "tel",
    "fax",
    "vehicleOwner",
    "vehicleOwnerAddress",
    "vehicleOwnerTel",
    "vehicleOwnerFax",
    "licenceNo",
    "expiredDate",
    "expImpGateCode",
    "expImpGate",
    "travelingArea",
    "routes",
    "goodsPassengerTransport",
    "otherRemarks",
    "extension",
    "attachedFile",
    "issuingAuthority"
})
public class CLVNonCommercialCrossBorderTransportPermit {

    @XmlElement(name = "RegistrationNumber", required = true)
    protected String registrationNumber;
    @XmlElement(name = "ManufacturedYear")
    protected String manufacturedYear;
    @XmlElement(name = "TrademarkCode")
    protected String trademarkCode;
    @XmlElement(name = "TrademarkName")
    protected String trademarkName;
    @XmlElement(name = "Model")
    protected String model;
    @XmlElement(name = "VehicleType", required = true)
    protected CLVNonCommercialCrossBorderTransportPermit.VehicleType vehicleType;
    @XmlElement(name = "VehicleColor")
    protected String vehicleColor;
    @XmlElement(name = "EngineNumber")
    protected String engineNumber;
    @XmlElement(name = "ChassisNumber")
    protected String chassisNumber;
    @XmlElement(name = "NameOfCompany")
    protected String nameOfCompany;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "Tel")
    protected String tel;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "VehicleOwner")
    protected String vehicleOwner;
    @XmlElement(name = "VehicleOwnerAddress")
    protected String vehicleOwnerAddress;
    @XmlElement(name = "VehicleOwnerTel")
    protected String vehicleOwnerTel;
    @XmlElement(name = "VehicleOwnerFax")
    protected String vehicleOwnerFax;
    @XmlElement(name = "LicenceNo")
    protected String licenceNo;
    @XmlElement(name = "ExpiredDate", required = true)
    protected String expiredDate;
    @XmlElement(name = "ExpImpGateCode", required = true)
    protected String expImpGateCode;
    @XmlElement(name = "ExpImpGate", required = true)
    protected String expImpGate;
    @XmlElement(name = "TravelingArea", required = true)
    protected String travelingArea;
    @XmlElement(name = "Routes", required = true)
    protected String routes;
    @XmlElement(name = "GoodsPassengerTransport")
    protected String goodsPassengerTransport;
    @XmlElement(name = "OtherRemarks")
    protected String otherRemarks;
    @XmlElement(name = "Extension", required = true)
    protected CLVNonCommercialCrossBorderTransportPermit.Extension extension;
    @XmlElement(name = "AttachedFile", required = true)
    protected List<AttachedFile> attachedFile;
    @XmlElement(name = "IssuingAuthority", required = true)
    protected IssuingAuthority issuingAuthority;

    /**
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNumber(String value) {
        this.registrationNumber = value;
    }

    /**
     * Gets the value of the manufacturedYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturedYear() {
        return manufacturedYear;
    }

    /**
     * Sets the value of the manufacturedYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturedYear(String value) {
        this.manufacturedYear = value;
    }

    /**
     * Gets the value of the trademarkCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrademarkCode() {
        return trademarkCode;
    }

    /**
     * Sets the value of the trademarkCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrademarkCode(String value) {
        this.trademarkCode = value;
    }

    /**
     * Gets the value of the trademarkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrademarkName() {
        return trademarkName;
    }

    /**
     * Sets the value of the trademarkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrademarkName(String value) {
        this.trademarkName = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the vehicleType property.
     * 
     * @return
     *     possible object is
     *     {@link CLVNonCommercialCrossBorderTransportPermit.VehicleType }
     *     
     */
    public CLVNonCommercialCrossBorderTransportPermit.VehicleType getVehicleType() {
        return vehicleType;
    }

    /**
     * Sets the value of the vehicleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLVNonCommercialCrossBorderTransportPermit.VehicleType }
     *     
     */
    public void setVehicleType(CLVNonCommercialCrossBorderTransportPermit.VehicleType value) {
        this.vehicleType = value;
    }

    /**
     * Gets the value of the vehicleColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleColor() {
        return vehicleColor;
    }

    /**
     * Sets the value of the vehicleColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleColor(String value) {
        this.vehicleColor = value;
    }

    /**
     * Gets the value of the engineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineNumber() {
        return engineNumber;
    }

    /**
     * Sets the value of the engineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineNumber(String value) {
        this.engineNumber = value;
    }

    /**
     * Gets the value of the chassisNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChassisNumber() {
        return chassisNumber;
    }

    /**
     * Sets the value of the chassisNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChassisNumber(String value) {
        this.chassisNumber = value;
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
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the tel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel() {
        return tel;
    }

    /**
     * Sets the value of the tel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel(String value) {
        this.tel = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the vehicleOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleOwner() {
        return vehicleOwner;
    }

    /**
     * Sets the value of the vehicleOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleOwner(String value) {
        this.vehicleOwner = value;
    }

    /**
     * Gets the value of the vehicleOwnerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleOwnerAddress() {
        return vehicleOwnerAddress;
    }

    /**
     * Sets the value of the vehicleOwnerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleOwnerAddress(String value) {
        this.vehicleOwnerAddress = value;
    }

    /**
     * Gets the value of the vehicleOwnerTel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleOwnerTel() {
        return vehicleOwnerTel;
    }

    /**
     * Sets the value of the vehicleOwnerTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleOwnerTel(String value) {
        this.vehicleOwnerTel = value;
    }

    /**
     * Gets the value of the vehicleOwnerFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleOwnerFax() {
        return vehicleOwnerFax;
    }

    /**
     * Sets the value of the vehicleOwnerFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleOwnerFax(String value) {
        this.vehicleOwnerFax = value;
    }

    /**
     * Gets the value of the licenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenceNo() {
        return licenceNo;
    }

    /**
     * Sets the value of the licenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenceNo(String value) {
        this.licenceNo = value;
    }

    /**
     * Gets the value of the expiredDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiredDate() {
        return expiredDate;
    }

    /**
     * Sets the value of the expiredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiredDate(String value) {
        this.expiredDate = value;
    }

    /**
     * Gets the value of the expImpGateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpImpGateCode() {
        return expImpGateCode;
    }

    /**
     * Sets the value of the expImpGateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpImpGateCode(String value) {
        this.expImpGateCode = value;
    }

    /**
     * Gets the value of the expImpGate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpImpGate() {
        return expImpGate;
    }

    /**
     * Sets the value of the expImpGate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpImpGate(String value) {
        this.expImpGate = value;
    }

    /**
     * Gets the value of the travelingArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelingArea() {
        return travelingArea;
    }

    /**
     * Sets the value of the travelingArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelingArea(String value) {
        this.travelingArea = value;
    }

    /**
     * Gets the value of the routes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutes() {
        return routes;
    }

    /**
     * Sets the value of the routes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutes(String value) {
        this.routes = value;
    }

    /**
     * Gets the value of the goodsPassengerTransport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsPassengerTransport() {
        return goodsPassengerTransport;
    }

    /**
     * Sets the value of the goodsPassengerTransport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodsPassengerTransport(String value) {
        this.goodsPassengerTransport = value;
    }

    /**
     * Gets the value of the otherRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherRemarks() {
        return otherRemarks;
    }

    /**
     * Sets the value of the otherRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherRemarks(String value) {
        this.otherRemarks = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link CLVNonCommercialCrossBorderTransportPermit.Extension }
     *     
     */
    public CLVNonCommercialCrossBorderTransportPermit.Extension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLVNonCommercialCrossBorderTransportPermit.Extension }
     *     
     */
    public void setExtension(CLVNonCommercialCrossBorderTransportPermit.Extension value) {
        this.extension = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ExtendedUntil">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="[0-9]{4}-[01][0-9]-[0-3][0-9] [0-2][0-9]:[0-5][0-9]:[0-6][0-9]"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "extendedUntil"
    })
    public static class Extension {

        @XmlElement(name = "ExtendedUntil", required = true)
        protected String extendedUntil;

        /**
         * Gets the value of the extendedUntil property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtendedUntil() {
            return extendedUntil;
        }

        /**
         * Sets the value of the extendedUntil property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtendedUntil(String value) {
            this.extendedUntil = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Truck">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Bus">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Others">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "truck",
        "bus",
        "others"
    })
    public static class VehicleType {

        @XmlElement(name = "Truck", required = true)
        protected String truck;
        @XmlElement(name = "Bus", required = true)
        protected String bus;
        @XmlElement(name = "Others", required = true)
        protected String others;

        /**
         * Gets the value of the truck property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTruck() {
            return truck;
        }

        /**
         * Sets the value of the truck property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTruck(String value) {
            this.truck = value;
        }

        /**
         * Gets the value of the bus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBus() {
            return bus;
        }

        /**
         * Sets the value of the bus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBus(String value) {
            this.bus = value;
        }

        /**
         * Gets the value of the others property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOthers() {
            return others;
        }

        /**
         * Sets the value of the others property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOthers(String value) {
            this.others = value;
        }

    }

}
