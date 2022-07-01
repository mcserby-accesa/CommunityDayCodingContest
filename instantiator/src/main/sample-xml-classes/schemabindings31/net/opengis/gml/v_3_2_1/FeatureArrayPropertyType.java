//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package schemabindings31.net.opengis.gml.v_3_2_1;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import schemabindings31._int.icao.iwxxm._3.SpaceWeatherAdvisoryType;
import schemabindings31._int.icao.iwxxm._3.SpaceWeatherAnalysisType;
import schemabindings31._int.icao.iwxxm._3.SpaceWeatherRegionType;
import schemabindings31._int.icao.iwxxm._3.TropicalCycloneSIGMETEvolvingConditionCollectionType;
import schemabindings31._int.icao.iwxxm._3.TropicalCycloneSIGMETPositionCollectionType;
import schemabindings31._int.icao.iwxxm._3.VolcanicAshCloudForecastType;
import schemabindings31._int.icao.iwxxm._3.VolcanicAshCloudObservedOrEstimatedType;
import schemabindings31._int.icao.iwxxm._3.VolcanicAshForecastConditionsType;
import schemabindings31._int.icao.iwxxm._3.VolcanicAshObservedOrEstimatedConditionsType;
import schemabindings31._int.icao.iwxxm._3.VolcanicAshSIGMETEvolvingConditionCollectionType;
import schemabindings31._int.icao.iwxxm._3.VolcanicAshSIGMETPositionCollectionType;
import schemabindings31._int.icao.iwxxm._3.WindObservedOrEstimatedType;
import schemabindings31.aero.aixm.schema._5_1.*;


/**
 * <p>Java class for FeatureArrayPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureArrayPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}AbstractFeature"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureArrayPropertyType", propOrder = {
    "abstractFeature"
})
public class FeatureArrayPropertyType {

    @XmlElementRef(name = "AbstractFeature", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends AbstractFeatureType>> abstractFeature;

    /**
     * Gets the value of the abstractFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link FlightRestrictionType }{@code >}
     * {@link JAXBElement }{@code <}{@link VolcanicAshCloudObservedOrEstimatedType }{@code >}
     * {@link JAXBElement }{@code <}{@link EruptingVolcanoType }{@code >}
     * {@link JAXBElement }{@code <}{@link AeronauticalGroundLightType }{@code >}
     * {@link JAXBElement }{@code <}{@link GuidanceLineMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractRadarEquipmentType }{@code >}
     * {@link JAXBElement }{@code <}{@link SIGMETPositionType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpaceWeatherRegionType }{@code >}
     * {@link JAXBElement }{@code <}{@link SearchRescueServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardLevelSectorType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiHoldingPositionLightSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link TerminalArrivalAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link VolcanicAshObservedOrEstimatedConditionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractSegmentLegType }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerLoadingBridgeType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportProtectionAreaMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link InformationServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link AzimuthType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link PrecisionApproachRadarType }{@code >}
     * {@link JAXBElement }{@code <}{@link NonMovementAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link HoldingAssessmentType }{@code >}
     * {@link JAXBElement }{@code <}{@link RouteType }{@code >}
     * {@link JAXBElement }{@code <}{@link VolcanicAshAdvisoryType }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link MeteorologicalAerodromeObservationReportType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirTrafficControlServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProcedureDMEType }{@code >}
     * {@link JAXBElement }{@code <}{@link RadioFrequencyAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link GroundTrafficControlServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link InstrumentApproachProcedureType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirspaceBorderCrossingType }{@code >}
     * {@link JAXBElement }{@code <}{@link DepartureLegType }{@code >}
     * {@link JAXBElement }{@code <}{@link AerialRefuellingType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecialNavigationSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiHoldingPositionType }{@code >}
     * {@link JAXBElement }{@code <}{@link GlidepathType }{@code >}
     * {@link JAXBElement }{@code <}{@link VolcanicAshForecastConditionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link VORType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrivalFeederLegType }{@code >}
     * {@link JAXBElement }{@code <}{@link SeaplaneLandingAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElevationType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardInstrumentArrivalType }{@code >}
     * {@link JAXBElement }{@code <}{@link VolcanicAshSIGMETType }{@code >}
     * {@link JAXBElement }{@code <}{@link SeaplaneRampSiteType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiHoldingPositionMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link TropicalCycloneSIGMETType }{@code >}
     * {@link JAXBElement }{@code <}{@link SignificantPointInAirspaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TropicalCycloneSIGMETPositionCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardLevelTableType }{@code >}
     * {@link JAXBElement }{@code <}{@link TropicalCycloneAdvisoryType }{@code >}
     * {@link JAXBElement }{@code <}{@link AngleIndicationType }{@code >}
     * {@link JAXBElement }{@code <}{@link DynamicFeatureType }{@code >}
     * {@link JAXBElement }{@code <}{@link HoldingPatternType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportHeliportType }{@code >}
     * {@link JAXBElement }{@code <}{@link VolcanicAshCloudForecastType }{@code >}
     * {@link JAXBElement }{@code <}{@link AIRMETEvolvingConditionType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiwayType }{@code >}
     * {@link JAXBElement }{@code <}{@link SurveyControlPointType }{@code >}
     * {@link JAXBElement }{@code <}{@link AIRMETType }{@code >}
     * {@link JAXBElement }{@code <}{@link METARType }{@code >}
     * {@link JAXBElement }{@code <}{@link MarkerBeaconType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportClearanceServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportHeliportCollocationType }{@code >}
     * {@link JAXBElement }{@code <}{@link RouteDMEType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractApproachLegType }{@code >}
     * {@link JAXBElement }{@code <}{@link FinalLegType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayCentrelinePointType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayElementType }{@code >}
     * {@link JAXBElement }{@code <}{@link InitialLegType }{@code >}
     * {@link JAXBElement }{@code <}{@link TropicalCycloneObservedConditionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link RadioCommunicationChannelType }{@code >}
     * {@link JAXBElement }{@code <}{@link CirclingAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link OrganisationAuthorityType }{@code >}
     * {@link JAXBElement }{@code <}{@link RouteSegmentType }{@code >}
     * {@link JAXBElement }{@code <}{@link VisualGlideSlopeIndicatorType }{@code >}
     * {@link JAXBElement }{@code <}{@link VerticalStructureType }{@code >}
     * {@link JAXBElement }{@code <}{@link VolcanoType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTrafficSeparationServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SIGMETType }{@code >}
     * {@link JAXBElement }{@code <}{@link TAFType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link OMObservationType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeicingAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link WindObservedOrEstimatedType }{@code >}
     * {@link JAXBElement }{@code <}{@link TACANType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayProtectAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link DirectedObservationType }{@code >}
     * {@link JAXBElement }{@code <}{@link SafeAltitudeAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeoBorderType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractNavaidEquipmentType }{@code >}
     * {@link JAXBElement }{@code <}{@link UnitType }{@code >}
     * {@link JAXBElement }{@code <}{@link GuidanceLineType }{@code >}
     * {@link JAXBElement }{@code <}{@link SPECIType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAirportGroundServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link LocalizerType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractProcedureType }{@code >}
     * {@link JAXBElement }{@code <}{@link RoadType }{@code >}
     * {@link JAXBElement }{@code <}{@link TouchDownLiftOffType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrivalLegType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAIXMFeatureType }{@code >}
     * {@link JAXBElement }{@code <}{@link FireFightingServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link MarkingBuoyType }{@code >}
     * {@link JAXBElement }{@code <}{@link DesignatedPointType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrestingGearType }{@code >}
     * {@link JAXBElement }{@code <}{@link SDFType }{@code >}
     * {@link JAXBElement }{@code <}{@link VolcanicAshSIGMETEvolvingConditionCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAirportHeliportProtectionAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecialNavigationStationType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayDirectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link SIGMETEvolvingConditionType }{@code >}
     * {@link JAXBElement }{@code <}{@link AircraftGroundServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link PilotControlledLightingType }{@code >}
     * {@link JAXBElement }{@code <}{@link MissedApproachLegType }{@code >}
     * {@link JAXBElement }{@code <}{@link FloatingDockSiteType }{@code >}
     * {@link JAXBElement }{@code <}{@link TropicalCycloneSIGMETEvolvingConditionCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link TouchDownLiftOffSafeAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApronElementType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecialDateType }{@code >}
     * {@link JAXBElement }{@code <}{@link CheckpointVORType }{@code >}
     * {@link JAXBElement }{@code <}{@link TropicalCycloneType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeicingAreaMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link NavigationAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiwayElementType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardLevelColumnType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link VolcanicAshSIGMETPositionCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link TouchDownLiftOffMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirspaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link WorkAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirTrafficManagementServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link NavigationAreaRestrictionType }{@code >}
     * {@link JAXBElement }{@code <}{@link FeatureCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link DirectedObservationAtDistanceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayDirectionLightSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link IntermediateLegType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link DistanceIndicationType }{@code >}
     * {@link JAXBElement }{@code <}{@link ObstacleAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link RadarSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link SIGMETEvolvingConditionCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardInstrumentDepartureType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApronMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportHotSpotType }{@code >}
     * {@link JAXBElement }{@code <}{@link ObservationType }{@code >}
     * {@link JAXBElement }{@code <}{@link PrimarySurveillanceRadarType }{@code >}
     * {@link JAXBElement }{@code <}{@link DynamicFeatureCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayType }{@code >}
     * {@link JAXBElement }{@code <}{@link AircraftStandType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiwayLightSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportSuppliesServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link GuidanceLineLightSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link TouchDownLiftOffLightSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link RulesProceduresType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayVisualRangeType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayBlastPadType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractFeatureType }{@code >}
     * {@link JAXBElement }{@code <}{@link AltimeterSourceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link UnplannedHoldingType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProcessType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayProtectAreaLightSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link NavaidType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractContinuousCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ReportType }{@code >}
     * {@link JAXBElement }{@code <}{@link SecondarySurveillanceRadarType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApproachLightingSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link DirectionFinderType }{@code >}
     * {@link JAXBElement }{@code <}{@link AuthorityForAirspaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractNavigationSystemCheckpointType }{@code >}
     * {@link JAXBElement }{@code <}{@link TropicalCycloneForecastConditionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGroundLightSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link CheckpointINSType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApronLightSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractFeatureCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractSurveillanceRadarType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpaceWeatherAdvisoryType }{@code >}
     * {@link JAXBElement }{@code <}{@link DMEType }{@code >}
     * {@link JAXBElement }{@code <}{@link AIRMETEvolvingConditionCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiwayMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link SIGMETPositionCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link NDBType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApronType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpaceWeatherAnalysisType }{@code >}
     * {@link JAXBElement }{@code <}{@link ChangeOverPointType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractFeatureType>> getAbstractFeature() {
        if (abstractFeature == null) {
            abstractFeature = new ArrayList<JAXBElement<? extends AbstractFeatureType>>();
        }
        return this.abstractFeature;
    }

    public boolean isSetAbstractFeature() {
        return ((this.abstractFeature!= null)&&(!this.abstractFeature.isEmpty()));
    }

    public void unsetAbstractFeature() {
        this.abstractFeature = null;
    }

}
