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
import javax.xml.bind.annotation.XmlType;

import schemabindings31._int.wmo.def.metce._2013.TropicalCyclonePropertyType;


/**
 * <p>Java class for TropicalCycloneSIGMETType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TropicalCycloneSIGMETType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://icao.int/iwxxm/3.0}SIGMETType">
 *       &lt;sequence>
 *         &lt;element name="tropicalCyclone" type="{http://def.wmo.int/metce/2013}TropicalCyclonePropertyType" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TropicalCycloneSIGMETType", propOrder = {
    "tropicalCyclone"
})
public class TropicalCycloneSIGMETType
    extends SIGMETType
{

    protected List<TropicalCyclonePropertyType> tropicalCyclone;

    /**
     * Gets the value of the tropicalCyclone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tropicalCyclone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTropicalCyclone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TropicalCyclonePropertyType }
     * 
     * 
     */
    public List<TropicalCyclonePropertyType> getTropicalCyclone() {
        if (tropicalCyclone == null) {
            tropicalCyclone = new ArrayList<TropicalCyclonePropertyType>();
        }
        return this.tropicalCyclone;
    }

    public boolean isSetTropicalCyclone() {
        return ((this.tropicalCyclone!= null)&&(!this.tropicalCyclone.isEmpty()));
    }

    public void unsetTropicalCyclone() {
        this.tropicalCyclone = null;
    }

}
