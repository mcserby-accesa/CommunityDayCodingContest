//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package schemabindings31._int.icao.iwxxm._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AerodromeAirTemperatureForecastPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AerodromeAirTemperatureForecastPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://icao.int/iwxxm/3.0}AerodromeAirTemperatureForecast"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AerodromeAirTemperatureForecastPropertyType", propOrder = {
    "aerodromeAirTemperatureForecast"
})
public class AerodromeAirTemperatureForecastPropertyType {

    @XmlElement(name = "AerodromeAirTemperatureForecast", required = true)
    protected AerodromeAirTemperatureForecastType aerodromeAirTemperatureForecast;
    @XmlAttribute(name = "owns")
    protected Boolean owns;

    /**
     * Gets the value of the aerodromeAirTemperatureForecast property.
     * 
     * @return
     *     possible object is
     *     {@link AerodromeAirTemperatureForecastType }
     *     
     */
    public AerodromeAirTemperatureForecastType getAerodromeAirTemperatureForecast() {
        return aerodromeAirTemperatureForecast;
    }

    /**
     * Sets the value of the aerodromeAirTemperatureForecast property.
     * 
     * @param value
     *     allowed object is
     *     {@link AerodromeAirTemperatureForecastType }
     *     
     */
    public void setAerodromeAirTemperatureForecast(AerodromeAirTemperatureForecastType value) {
        this.aerodromeAirTemperatureForecast = value;
    }

    public boolean isSetAerodromeAirTemperatureForecast() {
        return (this.aerodromeAirTemperatureForecast!= null);
    }

    /**
     * Gets the value of the owns property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOwns() {
        if (owns == null) {
            return false;
        } else {
            return owns;
        }
    }

    /**
     * Sets the value of the owns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOwns(boolean value) {
        this.owns = value;
    }

    public boolean isSetOwns() {
        return (this.owns!= null);
    }

    public void unsetOwns() {
        this.owns = null;
    }

}
