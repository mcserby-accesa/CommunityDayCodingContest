//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package schemabindings31.aero.aixm.schema._5_1;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FASDataBlockType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FASDataBlockType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1.1}FASDataBlockPropertyGroup"/>
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractFASDataBlockExtension"/>
 *                 &lt;/choice>
 *                 &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FASDataBlockType", propOrder = {
    "horizontalAlarmLimit",
    "verticalAlarmLimit",
    "thresholdCourseWidth",
    "lengthOffset",
    "crcRemainder",
    "operationType",
    "serviceProviderSBAS",
    "approachPerformanceDesignator",
    "routeIndicator",
    "referencePathDataSelector",
    "referencePathIdentifier",
    "codeICAO",
    "annotation",
    "extension"
})
public class FASDataBlockType
    extends AbstractAIXMObjectType
{

    @XmlElementRef(name = "horizontalAlarmLimit", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAlarmLimitType> horizontalAlarmLimit;
    @XmlElementRef(name = "verticalAlarmLimit", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAlarmLimitType> verticalAlarmLimit;
    @XmlElementRef(name = "thresholdCourseWidth", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> thresholdCourseWidth;
    @XmlElementRef(name = "lengthOffset", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> lengthOffset;
    @XmlElementRef(name = "CRCRemainder", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValHexType> crcRemainder;
    @XmlElementRef(name = "operationType", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoSequenceType> operationType;
    @XmlElementRef(name = "serviceProviderSBAS", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoSequenceType> serviceProviderSBAS;
    @XmlElementRef(name = "approachPerformanceDesignator", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoSequenceType> approachPerformanceDesignator;
    @XmlElementRef(name = "routeIndicator", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRouteIndicatorType> routeIndicator;
    @XmlElementRef(name = "referencePathDataSelector", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoSequenceType> referencePathDataSelector;
    @XmlElementRef(name = "referencePathIdentifier", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeReferencePathIdentifierType> referencePathIdentifier;
    @XmlElementRef(name = "codeICAO", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeICAOCountryType> codeICAO;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<FASDataBlockType.Extension> extension;

    /**
     * Gets the value of the horizontalAlarmLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAlarmLimitType }{@code >}
     *     
     */
    public JAXBElement<ValAlarmLimitType> getHorizontalAlarmLimit() {
        return horizontalAlarmLimit;
    }

    /**
     * Sets the value of the horizontalAlarmLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAlarmLimitType }{@code >}
     *     
     */
    public void setHorizontalAlarmLimit(JAXBElement<ValAlarmLimitType> value) {
        this.horizontalAlarmLimit = value;
    }

    public boolean isSetHorizontalAlarmLimit() {
        return (this.horizontalAlarmLimit!= null);
    }

    /**
     * Gets the value of the verticalAlarmLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAlarmLimitType }{@code >}
     *     
     */
    public JAXBElement<ValAlarmLimitType> getVerticalAlarmLimit() {
        return verticalAlarmLimit;
    }

    /**
     * Sets the value of the verticalAlarmLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAlarmLimitType }{@code >}
     *     
     */
    public void setVerticalAlarmLimit(JAXBElement<ValAlarmLimitType> value) {
        this.verticalAlarmLimit = value;
    }

    public boolean isSetVerticalAlarmLimit() {
        return (this.verticalAlarmLimit!= null);
    }

    /**
     * Gets the value of the thresholdCourseWidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getThresholdCourseWidth() {
        return thresholdCourseWidth;
    }

    /**
     * Sets the value of the thresholdCourseWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setThresholdCourseWidth(JAXBElement<ValDistanceType> value) {
        this.thresholdCourseWidth = value;
    }

    public boolean isSetThresholdCourseWidth() {
        return (this.thresholdCourseWidth!= null);
    }

    /**
     * Gets the value of the lengthOffset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getLengthOffset() {
        return lengthOffset;
    }

    /**
     * Sets the value of the lengthOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setLengthOffset(JAXBElement<ValDistanceType> value) {
        this.lengthOffset = value;
    }

    public boolean isSetLengthOffset() {
        return (this.lengthOffset!= null);
    }

    /**
     * Gets the value of the crcRemainder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValHexType }{@code >}
     *     
     */
    public JAXBElement<ValHexType> getCRCRemainder() {
        return crcRemainder;
    }

    /**
     * Sets the value of the crcRemainder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValHexType }{@code >}
     *     
     */
    public void setCRCRemainder(JAXBElement<ValHexType> value) {
        this.crcRemainder = value;
    }

    public boolean isSetCRCRemainder() {
        return (this.crcRemainder!= null);
    }

    /**
     * Gets the value of the operationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    public JAXBElement<NoSequenceType> getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    public void setOperationType(JAXBElement<NoSequenceType> value) {
        this.operationType = value;
    }

    public boolean isSetOperationType() {
        return (this.operationType!= null);
    }

    /**
     * Gets the value of the serviceProviderSBAS property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    public JAXBElement<NoSequenceType> getServiceProviderSBAS() {
        return serviceProviderSBAS;
    }

    /**
     * Sets the value of the serviceProviderSBAS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    public void setServiceProviderSBAS(JAXBElement<NoSequenceType> value) {
        this.serviceProviderSBAS = value;
    }

    public boolean isSetServiceProviderSBAS() {
        return (this.serviceProviderSBAS!= null);
    }

    /**
     * Gets the value of the approachPerformanceDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    public JAXBElement<NoSequenceType> getApproachPerformanceDesignator() {
        return approachPerformanceDesignator;
    }

    /**
     * Sets the value of the approachPerformanceDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    public void setApproachPerformanceDesignator(JAXBElement<NoSequenceType> value) {
        this.approachPerformanceDesignator = value;
    }

    public boolean isSetApproachPerformanceDesignator() {
        return (this.approachPerformanceDesignator!= null);
    }

    /**
     * Gets the value of the routeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteIndicatorType }{@code >}
     *     
     */
    public JAXBElement<CodeRouteIndicatorType> getRouteIndicator() {
        return routeIndicator;
    }

    /**
     * Sets the value of the routeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteIndicatorType }{@code >}
     *     
     */
    public void setRouteIndicator(JAXBElement<CodeRouteIndicatorType> value) {
        this.routeIndicator = value;
    }

    public boolean isSetRouteIndicator() {
        return (this.routeIndicator!= null);
    }

    /**
     * Gets the value of the referencePathDataSelector property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    public JAXBElement<NoSequenceType> getReferencePathDataSelector() {
        return referencePathDataSelector;
    }

    /**
     * Sets the value of the referencePathDataSelector property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    public void setReferencePathDataSelector(JAXBElement<NoSequenceType> value) {
        this.referencePathDataSelector = value;
    }

    public boolean isSetReferencePathDataSelector() {
        return (this.referencePathDataSelector!= null);
    }

    /**
     * Gets the value of the referencePathIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeReferencePathIdentifierType }{@code >}
     *     
     */
    public JAXBElement<CodeReferencePathIdentifierType> getReferencePathIdentifier() {
        return referencePathIdentifier;
    }

    /**
     * Sets the value of the referencePathIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeReferencePathIdentifierType }{@code >}
     *     
     */
    public void setReferencePathIdentifier(JAXBElement<CodeReferencePathIdentifierType> value) {
        this.referencePathIdentifier = value;
    }

    public boolean isSetReferencePathIdentifier() {
        return (this.referencePathIdentifier!= null);
    }

    /**
     * Gets the value of the codeICAO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeICAOCountryType }{@code >}
     *     
     */
    public JAXBElement<CodeICAOCountryType> getCodeICAO() {
        return codeICAO;
    }

    /**
     * Sets the value of the codeICAO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeICAOCountryType }{@code >}
     *     
     */
    public void setCodeICAO(JAXBElement<CodeICAOCountryType> value) {
        this.codeICAO = value;
    }

    public boolean isSetCodeICAO() {
        return (this.codeICAO!= null);
    }

    /**
     * Gets the value of the annotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotePropertyType }
     * 
     * 
     */
    public List<NotePropertyType> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<NotePropertyType>();
        }
        return this.annotation;
    }

    public boolean isSetAnnotation() {
        return ((this.annotation!= null)&&(!this.annotation.isEmpty()));
    }

    public void unsetAnnotation() {
        this.annotation = null;
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
     * {@link FASDataBlockType.Extension }
     * 
     * 
     */
    public List<FASDataBlockType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<FASDataBlockType.Extension>();
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractFASDataBlockExtension"/>
     *       &lt;/choice>
     *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "abstractFASDataBlockExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractFASDataBlockExtension")
        protected AbstractExtensionType abstractFASDataBlockExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Gets the value of the abstractFASDataBlockExtension property.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractFASDataBlockExtension() {
            return abstractFASDataBlockExtension;
        }

        /**
         * Sets the value of the abstractFASDataBlockExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractFASDataBlockExtension(AbstractExtensionType value) {
            this.abstractFASDataBlockExtension = value;
        }

        public boolean isSetAbstractFASDataBlockExtension() {
            return (this.abstractFASDataBlockExtension!= null);
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

}
