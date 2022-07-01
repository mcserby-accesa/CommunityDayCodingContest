//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package schemabindings31.aero.aixm.schema._5_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import schemabindings31.net.opengis.gml.v_3_2_1.AbstractGMLType;


/**
 * Base type for AIXM complex types that are NOT features. For example, City, ContactInformation, AirspaceVolume, etc. It derives from AbstractGMLType so that AIXM objects are recognised as GML objects, thus ensuring that GML-aware applications recognise them properly. Retains only the mandatory gml:id attribute.
 * 
 * <p>Java class for AbstractAIXMObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractAIXMObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.opengis.net/gml/3.2}AbstractGMLType">
 *       &lt;sequence>
 *         &lt;sequence>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.opengis.net/gml/3.2}id use="required""/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractAIXMObjectType")
@XmlSeeAlso({
    AuthorityForSpecialNavigationStationType.class,
    AbstractExtensionType.class,
    NavigationAreaSectorType.class,
    HoldingPatternDurationType.class,
    TimesheetType.class,
    MarkingElementType.class,
    NoteType.class,
    LinguisticNoteType.class,
    SafeAltitudeAreaSectorType.class,
    OxygenType.class,
    PointReferenceType.class,
    AuthorityForNavaidEquipmentType.class,
    TerminalArrivalAreaSectorType.class,
    NavaidComponentType.class,
    AuthorityForSpecialNavigationSystemType.class,
    ObstructionType.class,
    EquipmentUnavailableAdjustmentColumnType.class,
    NitrogenType.class,
    CallsignDetailType.class,
    FlightRestrictionRouteType.class,
    ApproachConditionType.class,
    MeteorologyType.class,
    MinimaType.class,
    FlightCharacteristicType.class,
    AirspaceGeometryComponentType.class,
    ObstacleAssessmentAreaType.class,
    StandardLevelType.class,
    AirspaceLayerType.class,
    ObstaclePlacementType.class,
    AerialRefuellingTrackType.class,
    AerialRefuellingAnchorType.class,
    EquipmentUnavailableAdjustmentType.class,
    CityType.class,
    OilType.class,
    AltitudeAdjustmentType.class,
    AirspaceVolumeDependencyType.class,
    SurfaceCharacteristicsType.class,
    MissedApproachGroupType.class,
    RadarComponentType.class,
    CircleSectorType.class,
    DepartureArrivalConditionType.class,
    FlightRestrictionLevelType.class,
    FuelType.class,
    AbstractSurfaceContaminationType.class,
    FlightConditionElementType.class,
    FlightConditionCircumstanceType.class,
    ApproachTimingTableType.class,
    RidgeType.class,
    FASDataBlockType.class,
    RunwayDeclaredDistanceType.class,
    HoldingPatternDistanceType.class,
    LightActivationType.class,
    AirspaceVolumeType.class,
    ReflectorType.class,
    OrganisationAuthorityAssociationType.class,
    FinalProfileType.class,
    AircraftCharacteristicType.class,
    ProcedureTransitionType.class,
    SurveillanceGroundStationType.class,
    AngleUseType.class,
    RoutePortionType.class,
    LightElementType.class,
    HoldingUseType.class,
    LandingTakeoffAreaCollectionType.class,
    ApproachDistanceTableType.class,
    AbstractDirectFlightType.class,
    ProcedureTransitionLegType.class,
    AbstractUsageConditionType.class,
    ApproachAltitudeTableType.class,
    UnitDependencyType.class,
    AbstractPropertiesWithScheduleType.class,
    AbstractSegmentPointType.class,
    SectorDesignType.class,
    FlightRoutingElementType.class,
    ContactInformationType.class,
    AuthorityForAerialRefuellingType.class,
    SurfaceContaminationLayerType.class,
    NavaidEquipmentDistanceType.class
})
public abstract class AbstractAIXMObjectType
    extends AbstractGMLType
{


}
