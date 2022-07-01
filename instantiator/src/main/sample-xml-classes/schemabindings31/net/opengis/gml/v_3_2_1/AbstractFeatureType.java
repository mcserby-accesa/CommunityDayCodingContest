//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package schemabindings31.net.opengis.gml.v_3_2_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import schemabindings31._int.icao.iwxxm._3.AIRMETEvolvingConditionCollectionType;
import schemabindings31._int.icao.iwxxm._3.AIRMETEvolvingConditionType;
import schemabindings31._int.icao.iwxxm._3.ReportType;
import schemabindings31._int.icao.iwxxm._3.SIGMETEvolvingConditionCollectionType;
import schemabindings31._int.icao.iwxxm._3.SIGMETEvolvingConditionType;
import schemabindings31._int.icao.iwxxm._3.SIGMETPositionCollectionType;
import schemabindings31._int.icao.iwxxm._3.SIGMETPositionType;
import schemabindings31._int.icao.iwxxm._3.SpaceWeatherAnalysisType;
import schemabindings31._int.icao.iwxxm._3.SpaceWeatherRegionType;
import schemabindings31._int.icao.iwxxm._3.TropicalCycloneForecastConditionsType;
import schemabindings31._int.icao.iwxxm._3.TropicalCycloneObservedConditionsType;
import schemabindings31._int.icao.iwxxm._3.VolcanicAshCloudForecastType;
import schemabindings31._int.icao.iwxxm._3.VolcanicAshCloudObservedOrEstimatedType;
import schemabindings31._int.icao.iwxxm._3.VolcanicAshForecastConditionsType;
import schemabindings31._int.icao.iwxxm._3.VolcanicAshObservedOrEstimatedConditionsType;
import schemabindings31._int.icao.iwxxm._3.WindObservedOrEstimatedType;
import schemabindings31._int.wmo.def.metce._2013.ProcessType;
import schemabindings31._int.wmo.def.metce._2013.TropicalCycloneType;
import schemabindings31._int.wmo.def.metce._2013.VolcanoType;
import schemabindings31.net.opengis.om._2.OMObservationType;


/**
 * The basic feature model is given by the gml:AbstractFeatureType.
 * The content model for gml:AbstractFeatureType adds two specific properties suitable for geographic features to the content model defined in gml:AbstractGMLType. 
 * The value of the gml:boundedBy property describes an envelope that encloses the entire feature instance, and is primarily useful for supporting rapid searching for features that occur in a particular location. 
 * The value of the gml:location property describes the extent, position or relative location of the feature.
 * 
 * <p>Java class for AbstractFeatureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractFeatureType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGMLType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}boundedBy" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}location" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractFeatureType", propOrder = {
    "boundedBy",
    "location"
})
@XmlSeeAlso({
    VolcanicAshCloudForecastType.class,
    VolcanicAshObservedOrEstimatedConditionsType.class,
    SIGMETEvolvingConditionType.class,
    AIRMETEvolvingConditionType.class,
    TropicalCycloneObservedConditionsType.class,
    SIGMETPositionType.class,
    TropicalCycloneForecastConditionsType.class,
    AIRMETEvolvingConditionCollectionType.class,
    SpaceWeatherAnalysisType.class,
    VolcanicAshCloudObservedOrEstimatedType.class,
    SIGMETPositionCollectionType.class,
    SpaceWeatherRegionType.class,
    WindObservedOrEstimatedType.class,
    VolcanicAshForecastConditionsType.class,
    ReportType.class,
    SIGMETEvolvingConditionCollectionType.class,
    ObservationType.class,
    AbstractCoverageType.class,
    AbstractFeatureCollectionType.class,
    BoundedFeatureType.class,
    DynamicFeatureType.class,
    VolcanoType.class,
    ProcessType.class,
    TropicalCycloneType.class,
    OMObservationType.class
})
public abstract class AbstractFeatureType
    extends AbstractGMLType
{

    @XmlElement(/*nillable = true,*/ required=false)
    protected BoundingShapeType boundedBy;
    @XmlElementRef(name = "location", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends LocationPropertyType> location;

    /**
     * Gets the value of the boundedBy property.
     * 
     * @return
     *     possible object is
     *     {@link BoundingShapeType }
     *     
     */
    public BoundingShapeType getBoundedBy() {
        return boundedBy;
    }

    /**
     * Sets the value of the boundedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoundingShapeType }
     *     
     */
    public void setBoundedBy(BoundingShapeType value) {
        this.boundedBy = value;
    }

    public boolean isSetBoundedBy() {
        return (this.boundedBy!= null);
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LocationPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PriorityLocationPropertyType }{@code >}
     *     
     */
    public JAXBElement<? extends LocationPropertyType> getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LocationPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PriorityLocationPropertyType }{@code >}
     *     
     */
    public void setLocation(JAXBElement<? extends LocationPropertyType> value) {
        this.location = value;
    }

    public boolean isSetLocation() {
        return (this.location!= null);
    }

}
