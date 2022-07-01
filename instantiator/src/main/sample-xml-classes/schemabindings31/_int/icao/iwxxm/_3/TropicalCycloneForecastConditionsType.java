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

import schemabindings31.aero.aixm.schema._5_1.PointPropertyType;
import schemabindings31.net.opengis.gml.v_3_2_1.AbstractFeatureType;
import schemabindings31.net.opengis.gml.v_3_2_1.SpeedType;


/**
 * <p>Java class for TropicalCycloneForecastConditionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TropicalCycloneForecastConditionsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="phenomenonTime" type="{http://icao.int/iwxxm/3.0}AbstractTimeObjectPropertyType"/>
 *         &lt;element name="tropicalCyclonePosition" type="{http://www.opengis.net/gml/3.2}PointPropertyType"/>
 *         &lt;element name="maximumSurfaceWindSpeed" type="{http://www.opengis.net/gml/3.2}SpeedType"/>
 *         &lt;element name="extension" type="{http://icao.int/iwxxm/3.0}ExtensionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TropicalCycloneForecastConditionsType", propOrder = {
    "phenomenonTime",
    "tropicalCyclonePosition",
    "maximumSurfaceWindSpeed",
    "extension"
})
public class TropicalCycloneForecastConditionsType
    extends AbstractFeatureType
{

    @XmlElement(required = true)
    protected AbstractTimeObjectPropertyType phenomenonTime;
    @XmlElement(required = true)
    protected PointPropertyType tropicalCyclonePosition;
    @XmlElement(required = true)
    protected SpeedType maximumSurfaceWindSpeed;
    protected List<ExtensionType> extension;

    /**
     * Gets the value of the phenomenonTime property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractTimeObjectPropertyType }
     *     
     */
    public AbstractTimeObjectPropertyType getPhenomenonTime() {
        return phenomenonTime;
    }

    /**
     * Sets the value of the phenomenonTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractTimeObjectPropertyType }
     *     
     */
    public void setPhenomenonTime(AbstractTimeObjectPropertyType value) {
        this.phenomenonTime = value;
    }

    public boolean isSetPhenomenonTime() {
        return (this.phenomenonTime!= null);
    }

    /**
     * Gets the value of the tropicalCyclonePosition property.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    public PointPropertyType getTropicalCyclonePosition() {
        return tropicalCyclonePosition;
    }

    /**
     * Sets the value of the tropicalCyclonePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointPropertyType }
     *     
     */
    public void setTropicalCyclonePosition(PointPropertyType value) {
        this.tropicalCyclonePosition = value;
    }

    public boolean isSetTropicalCyclonePosition() {
        return (this.tropicalCyclonePosition!= null);
    }

    /**
     * Gets the value of the maximumSurfaceWindSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedType }
     *     
     */
    public SpeedType getMaximumSurfaceWindSpeed() {
        return maximumSurfaceWindSpeed;
    }

    /**
     * Sets the value of the maximumSurfaceWindSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedType }
     *     
     */
    public void setMaximumSurfaceWindSpeed(SpeedType value) {
        this.maximumSurfaceWindSpeed = value;
    }

    public boolean isSetMaximumSurfaceWindSpeed() {
        return (this.maximumSurfaceWindSpeed!= null);
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
