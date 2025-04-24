package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for Meters Object
 */
@IID("{86705B6C-352A-47F8-A24B-78B750EC3859}")
public interface IMeters extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Array of all energy Meter names
   * </p>
   * <p>
   * Getter method for the COM property "AllNames"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object allNames();


  /**
   * <p>
   * Set the first energy Meter active. Returns 0 if none.
   * </p>
   * <p>
   * Getter method for the COM property "First"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(8)
  int first();


  /**
   * <p>
   * Sets the next energy Meter active.  Returns 0 if no more.
   * </p>
   * <p>
   * Getter method for the COM property "Next"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(9)
  int next();


  /**
   * <p>
   * Array of strings containing the names of the registers.
   * </p>
   * <p>
   * Getter method for the COM property "RegisterNames"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object registerNames();


  /**
   * <p>
   * Array of all the values contained in the Meter registers for the active Meter.
   * </p>
   * <p>
   * Getter method for the COM property "RegisterValues"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object registerValues();


  /**
   * <p>
   * Resets registers of active Meter.
   * </p>
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(12)
  void reset();


  /**
   * <p>
   * Resets registers of all Meter objects.
   * </p>
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(13)
  void resetAll();


  /**
   * <p>
   * Forces active Meter to take a sample.
   * </p>
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(14)
  void sample();


  /**
   * <p>
   * Saves meter register values.
   * </p>
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(15)
  void save();


  /**
   * <p>
   * Get/Set the active meter  name.
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String name();


  /**
   * <p>
   * Get/Set the active meter  name.
   * </p>
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(17)
  void name(
    java.lang.String value);


  /**
   * <p>
   * Totals of all registers of all meters
   * </p>
   * <p>
   * Getter method for the COM property "Totals"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object totals();


  /**
   * <p>
   * Array of doubles to set values of Peak Current property
   * </p>
   * <p>
   * Getter method for the COM property "Peakcurrent"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(19)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object peakcurrent();


  /**
   * <p>
   * Array of doubles to set values of Peak Current property
   * </p>
   * <p>
   * Setter method for the COM property "Peakcurrent"
   * </p>
   * @param value Mandatory java.lang.Object parameter.
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(20)
  void peakcurrent(
    @MarshalAs(NativeType.VARIANT) java.lang.Object value);


  /**
   * <p>
   * Set the magnitude of the real part of the Calculated Current (normally determined by solution) for the Meter to force some behavior on Load Allocation
   * </p>
   * <p>
   * Getter method for the COM property "CalcCurrent"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(21)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object calcCurrent();


  /**
   * <p>
   * Set the magnitude of the real part of the Calculated Current (normally determined by solution) for the Meter to force some behavior on Load Allocation
   * </p>
   * <p>
   * Setter method for the COM property "CalcCurrent"
   * </p>
   * @param value Mandatory java.lang.Object parameter.
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(22)
  void calcCurrent(
    @MarshalAs(NativeType.VARIANT) java.lang.Object value);


  /**
   * <p>
   * Array of doubles: set the phase allocation factors for the active meter.
   * </p>
   * <p>
   * Getter method for the COM property "AllocFactors"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(23)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object allocFactors();


  /**
   * <p>
   * Array of doubles: set the phase allocation factors for the active meter.
   * </p>
   * <p>
   * Setter method for the COM property "AllocFactors"
   * </p>
   * @param value Mandatory java.lang.Object parameter.
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(24)
  void allocFactors(
    @MarshalAs(NativeType.VARIANT) java.lang.Object value);


  /**
   * <p>
   * Set Name of metered element
   * </p>
   * <p>
   * Getter method for the COM property "MeteredElement"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(25)
  java.lang.String meteredElement();


  /**
   * <p>
   * Set Name of metered element
   * </p>
   * <p>
   * Setter method for the COM property "MeteredElement"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(26)
  void meteredElement(
    java.lang.String value);


  /**
   * <p>
   * set Number of Metered Terminal
   * </p>
   * <p>
   * Getter method for the COM property "MeteredTerminal"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(27)
  int meteredTerminal();


  /**
   * <p>
   * set Number of Metered Terminal
   * </p>
   * <p>
   * Setter method for the COM property "MeteredTerminal"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(28)
  void meteredTerminal(
    int value);


  /**
   * <p>
   * Global Flag in the DSS to indicate if Demand Interval (DI) files have been properly opened.
   * </p>
   * <p>
   * Getter method for the COM property "DIFilesAreOpen"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(29)
  boolean diFilesAreOpen();


  /**
   * <p>
   * Causes all EnergyMeter objects to take a sample at the present time
   * </p>
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(30)
  void sampleAll();


  /**
   * <p>
   * Save All EnergyMeter objects
   * </p>
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(31)
  void saveAll();


  /**
   * <p>
   * Open Demand Interval (DI) files
   * </p>
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(32)
  void openAllDIFiles();


  /**
   * <p>
   * Close All Demand Interval Files ( Necessary at the end of a run)
   * </p>
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(33)
  void closeAllDIFiles();


  /**
   * <p>
   * Number of zone end elements in the active meter zone.
   * </p>
   * <p>
   * Getter method for the COM property "CountEndElements"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(34)
  int countEndElements();


  /**
   * <p>
   * Variant array of names of all zone end elements.
   * </p>
   * <p>
   * Getter method for the COM property "AllEndElements"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(35)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object allEndElements();


  /**
   * <p>
   * Number of Energy Meters in the Active Circuit
   * </p>
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(36)
  int count();


  /**
   * <p>
   * Wide string list of all branches in zone of the active energymeter object.
   * </p>
   * <p>
   * Getter method for the COM property "AllBranchesInZone"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(37)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object allBranchesInZone();


  /**
   * <p>
   * Number of branches in Active energymeter zone. (Same as sequencelist size)
   * </p>
   * <p>
   * Getter method for the COM property "CountBranches"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(38)
  int countBranches();


  /**
   * <p>
   * Returns SAIFI for this meter's Zone. Execute Reliability Calc method first.
   * </p>
   * <p>
   * Getter method for the COM property "SAIFI"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(39)
  double saifi();


  /**
   * <p>
   * Get/set Index into Meter's SequenceList that contains branch pointers in lexical order. Earlier index guaranteed to be upline from later index. Sets PDelement active.
   * </p>
   * <p>
   * Getter method for the COM property "SequenceIndex"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(40)
  int sequenceIndex();


  /**
   * <p>
   * Get/set Index into Meter's SequenceList that contains branch pointers in lexical order. Earlier index guaranteed to be upline from later index. Sets PDelement active.
   * </p>
   * <p>
   * Setter method for the COM property "SequenceIndex"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(41)
  void sequenceIndex(
    int value);


  /**
   * <p>
   * SAIFI based on kW rather than number of customers. Get after reliability calcs.
   * </p>
   * <p>
   * Getter method for the COM property "SAIFIKW"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(42)
  double saifikw();


  /**
   * <p>
   * Calculate SAIFI, etc.
   * </p>
   * @param assumeRestoration Mandatory boolean parameter.
   */

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(43)
  void doReliabilityCalc(
    boolean assumeRestoration);


  /**
   * <p>
   * Size of Sequence List
   * </p>
   * <p>
   * Getter method for the COM property "SeqListSize"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(220) //= 0xdc. The runtime will prefer the VTID if present
  @VTID(44)
  int seqListSize();


  /**
   * <p>
   * Total Number of customers in this zone (downline from the EnergyMeter)
   * </p>
   * <p>
   * Getter method for the COM property "TotalCustomers"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(221) //= 0xdd. The runtime will prefer the VTID if present
  @VTID(45)
  int totalCustomers();


  /**
   * <p>
   * SAIDI for this meter's zone. Execute DoReliabilityCalc first.
   * </p>
   * <p>
   * Getter method for the COM property "SAIDI"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(222) //= 0xde. The runtime will prefer the VTID if present
  @VTID(46)
  double saidi();


  /**
   * <p>
   * Total customer interruptions for this Meter zone based on reliability calcs.
   * </p>
   * <p>
   * Getter method for the COM property "CustInterrupts"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(223) //= 0xdf. The runtime will prefer the VTID if present
  @VTID(47)
  double custInterrupts();


  /**
   * <p>
   * Number of feeder sections in this meter's zone
   * </p>
   * <p>
   * Getter method for the COM property "NumSections"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(224) //= 0xe0. The runtime will prefer the VTID if present
  @VTID(48)
  int numSections();


  /**
   * <p>
   * Sets the designated section active if the index is valiid.
   * </p>
   * @param sectIdx Mandatory int parameter.
   */

  @DISPID(225) //= 0xe1. The runtime will prefer the VTID if present
  @VTID(49)
  void setActiveSection(
    int sectIdx);


  /**
   * <p>
   * Type of OCP device. 1=Fuse; 2=Recloser; 3=Relay
   * </p>
   * <p>
   * Getter method for the COM property "OCPDeviceType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(226) //= 0xe2. The runtime will prefer the VTID if present
  @VTID(50)
  int ocpDeviceType();


  /**
   * <p>
   * Number of Customers in the active section.
   * </p>
   * <p>
   * Getter method for the COM property "NumSectionCustomers"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(227) //= 0xe3. The runtime will prefer the VTID if present
  @VTID(51)
  int numSectionCustomers();


  /**
   * <p>
   * Number of branches (lines) in this section
   * </p>
   * <p>
   * Getter method for the COM property "NumSectionBranches"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(228) //= 0xe4. The runtime will prefer the VTID if present
  @VTID(52)
  int numSectionBranches();


  /**
   * <p>
   * Average Repair time in this section of the meter zone
   * </p>
   * <p>
   * Getter method for the COM property "AvgRepairTime"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(229) //= 0xe5. The runtime will prefer the VTID if present
  @VTID(53)
  double avgRepairTime();


  /**
   * <p>
   * Sum of Fault Rate time Repair Hrs in this section of the meter zone
   * </p>
   * <p>
   * Getter method for the COM property "FaultRateXRepairHrs"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(230) //= 0xe6. The runtime will prefer the VTID if present
  @VTID(54)
  double faultRateXRepairHrs();


  /**
   * <p>
   * Sum of the branch fault rates in this section of the meter's zone
   * </p>
   * <p>
   * Getter method for the COM property "SumBranchFltRates"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(231) //= 0xe7. The runtime will prefer the VTID if present
  @VTID(55)
  double sumBranchFltRates();


  /**
   * <p>
   * SequenceIndex of the branch at the head of this section
   * </p>
   * <p>
   * Getter method for the COM property "SectSeqIdx"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(232) //= 0xe8. The runtime will prefer the VTID if present
  @VTID(56)
  int sectSeqIdx();


  /**
   * <p>
   * Total Customers downline from this section
   * </p>
   * <p>
   * Getter method for the COM property "SectTotalCust"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(233) //= 0xe9. The runtime will prefer the VTID if present
  @VTID(57)
  int sectTotalCust();


  /**
   * <p>
   * Returns the list of all PCE within the area covered by the EM
   * </p>
   * <p>
   * Getter method for the COM property "ZonePCE"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(234) //= 0xea. The runtime will prefer the VTID if present
  @VTID(58)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object zonePCE();


  // Properties:
}
