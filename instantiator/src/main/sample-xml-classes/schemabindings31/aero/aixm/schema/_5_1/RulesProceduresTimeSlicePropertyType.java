//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package schemabindings31.aero.aixm.schema._5_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RulesProceduresTimeSlicePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RulesProceduresTimeSlicePropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}RulesProceduresTimeSlice"/>
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
@XmlType(name = "RulesProceduresTimeSlicePropertyType", propOrder = {
    "rulesProceduresTimeSlice"
})
public class RulesProceduresTimeSlicePropertyType {

    @XmlElement(name = "RulesProceduresTimeSlice", required = true)
    protected RulesProceduresTimeSliceType rulesProceduresTimeSlice;
    @XmlAttribute(name = "owns")
    protected Boolean owns;

    /**
     * Gets the value of the rulesProceduresTimeSlice property.
     * 
     * @return
     *     possible object is
     *     {@link RulesProceduresTimeSliceType }
     *     
     */
    public RulesProceduresTimeSliceType getRulesProceduresTimeSlice() {
        return rulesProceduresTimeSlice;
    }

    /**
     * Sets the value of the rulesProceduresTimeSlice property.
     * 
     * @param value
     *     allowed object is
     *     {@link RulesProceduresTimeSliceType }
     *     
     */
    public void setRulesProceduresTimeSlice(RulesProceduresTimeSliceType value) {
        this.rulesProceduresTimeSlice = value;
    }

    public boolean isSetRulesProceduresTimeSlice() {
        return (this.rulesProceduresTimeSlice!= null);
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
