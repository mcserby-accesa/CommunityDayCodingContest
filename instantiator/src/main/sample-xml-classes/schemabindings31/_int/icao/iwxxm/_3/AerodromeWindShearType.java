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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AerodromeWindShearType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AerodromeWindShearType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="runway" type="{http://icao.int/iwxxm/3.0}RunwayDirectionPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://icao.int/iwxxm/3.0}ExtensionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="allRunways" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AerodromeWindShearType", propOrder = {
    "runway",
    "extension"
})
public class AerodromeWindShearType {

    @XmlElement(nillable = true)
    protected List<RunwayDirectionPropertyType> runway;
    protected List<ExtensionType> extension;
    @XmlAttribute(name = "allRunways")
    protected Boolean allRunways;

    /**
     * Gets the value of the runway property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the runway property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRunway().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RunwayDirectionPropertyType }
     * 
     * 
     */
    public List<RunwayDirectionPropertyType> getRunway() {
        if (runway == null) {
            runway = new ArrayList<RunwayDirectionPropertyType>();
        }
        return this.runway;
    }

    public boolean isSetRunway() {
        return ((this.runway!= null)&&(!this.runway.isEmpty()));
    }

    public void unsetRunway() {
        this.runway = null;
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

    /**
     * Gets the value of the allRunways property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAllRunways() {
        return allRunways;
    }

    /**
     * Sets the value of the allRunways property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllRunways(boolean value) {
        this.allRunways = value;
    }

    public boolean isSetAllRunways() {
        return (this.allRunways!= null);
    }

    public void unsetAllRunways() {
        this.allRunways = null;
    }

}
