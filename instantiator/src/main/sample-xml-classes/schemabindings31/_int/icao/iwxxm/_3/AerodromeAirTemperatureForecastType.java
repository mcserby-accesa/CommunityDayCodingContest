//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package schemabindings31._int.icao.iwxxm._3;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import schemabindings31.net.opengis.gml.v_3_2_1.MeasureType;
import schemabindings31.net.opengis.gml.v_3_2_1.TimeInstantPropertyType;


/**
 * <p>Java class for AerodromeAirTemperatureForecastType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AerodromeAirTemperatureForecastType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maximumAirTemperature" type="{http://www.opengis.net/gml/3.2}MeasureType"/>
 *         &lt;element name="maximumAirTemperatureTime" type="{http://www.opengis.net/gml/3.2}TimeInstantPropertyType"/>
 *         &lt;element name="minimumAirTemperature" type="{http://www.opengis.net/gml/3.2}MeasureType"/>
 *         &lt;element name="minimumAirTemperatureTime" type="{http://www.opengis.net/gml/3.2}TimeInstantPropertyType"/>
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
@XmlType(name = "AerodromeAirTemperatureForecastType", propOrder = {
    "maximumAirTemperature",
    "maximumAirTemperatureTime",
    "minimumAirTemperature",
    "minimumAirTemperatureTime",
    "extension"
})
public class AerodromeAirTemperatureForecastType {

    @XmlElement(required = true)
    protected MeasureType maximumAirTemperature;
    @XmlElement(required = true)
    protected TimeInstantPropertyType maximumAirTemperatureTime;
    @XmlElement(required = true)
    protected MeasureType minimumAirTemperature;
    @XmlElement(required = true)
    protected TimeInstantPropertyType minimumAirTemperatureTime;
    protected List<ExtensionType> extension;

    /**
     * Gets the value of the maximumAirTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getMaximumAirTemperature() {
        return maximumAirTemperature;
    }

    /**
     * Sets the value of the maximumAirTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setMaximumAirTemperature(MeasureType value) {
        this.maximumAirTemperature = value;
    }

    public boolean isSetMaximumAirTemperature() {
        return (this.maximumAirTemperature!= null);
    }

    /**
     * Gets the value of the maximumAirTemperatureTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public TimeInstantPropertyType getMaximumAirTemperatureTime() {
        return maximumAirTemperatureTime;
    }

    /**
     * Sets the value of the maximumAirTemperatureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public void setMaximumAirTemperatureTime(TimeInstantPropertyType value) {
        this.maximumAirTemperatureTime = value;
    }

    public boolean isSetMaximumAirTemperatureTime() {
        return (this.maximumAirTemperatureTime!= null);
    }

    /**
     * Gets the value of the minimumAirTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getMinimumAirTemperature() {
        return minimumAirTemperature;
    }

    /**
     * Sets the value of the minimumAirTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setMinimumAirTemperature(MeasureType value) {
        this.minimumAirTemperature = value;
    }

    public boolean isSetMinimumAirTemperature() {
        return (this.minimumAirTemperature!= null);
    }

    /**
     * Gets the value of the minimumAirTemperatureTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public TimeInstantPropertyType getMinimumAirTemperatureTime() {
        return minimumAirTemperatureTime;
    }

    /**
     * Sets the value of the minimumAirTemperatureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public void setMinimumAirTemperatureTime(TimeInstantPropertyType value) {
        this.minimumAirTemperatureTime = value;
    }

    public boolean isSetMinimumAirTemperatureTime() {
        return (this.minimumAirTemperatureTime!= null);
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
