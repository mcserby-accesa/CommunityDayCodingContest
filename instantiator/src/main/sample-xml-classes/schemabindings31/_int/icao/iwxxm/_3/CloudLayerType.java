//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package schemabindings31._int.icao.iwxxm._3;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CloudLayerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CloudLayerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://icao.int/iwxxm/3.0}CloudAmountReportedAtAerodromeType"/>
 *         &lt;element name="base" type="{http://icao.int/iwxxm/3.0}DistanceWithNilReasonType"/>
 *         &lt;element name="cloudType" type="{http://icao.int/iwxxm/3.0}SigConvectiveCloudTypeType" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://icao.int/iwxxm/3.0}ExtensionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CloudLayerType", propOrder = {
    "amount",
    "base",
    "cloudType",
    "extension"
})
public class CloudLayerType {

    @XmlElement(required = true, nillable = true)
    protected CloudAmountReportedAtAerodromeType amount;
    @XmlElement(required = true, nillable = true)
    protected DistanceWithNilReasonType base;
    @XmlElementRef(name = "cloudType", namespace = "http://icao.int/iwxxm/3.0", type = JAXBElement.class, required = false)
    protected JAXBElement<SigConvectiveCloudTypeType> cloudType;
    protected List<ExtensionType> extension;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link CloudAmountReportedAtAerodromeType }
     *     
     */
    public CloudAmountReportedAtAerodromeType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CloudAmountReportedAtAerodromeType }
     *     
     */
    public void setAmount(CloudAmountReportedAtAerodromeType value) {
        this.amount = value;
    }

    public boolean isSetAmount() {
        return (this.amount!= null);
    }

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceWithNilReasonType }
     *     
     */
    public DistanceWithNilReasonType getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceWithNilReasonType }
     *     
     */
    public void setBase(DistanceWithNilReasonType value) {
        this.base = value;
    }

    public boolean isSetBase() {
        return (this.base!= null);
    }

    /**
     * Gets the value of the cloudType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SigConvectiveCloudTypeType }{@code >}
     *     
     */
    public JAXBElement<SigConvectiveCloudTypeType> getCloudType() {
        return cloudType;
    }

    /**
     * Sets the value of the cloudType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SigConvectiveCloudTypeType }{@code >}
     *     
     */
    public void setCloudType(JAXBElement<SigConvectiveCloudTypeType> value) {
        this.cloudType = value;
    }

    public boolean isSetCloudType() {
        return (this.cloudType!= null);
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionType }
     * 
     * 
     */
    public List<ExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<ExtensionType>();
        }
        return this.extension;
    }

    public boolean isSetExtension() {
        return ((this.extension!= null)&&(!this.extension.isEmpty()));
    }

    public void unsetExtension() {
        this.extension = null;
    }

}
