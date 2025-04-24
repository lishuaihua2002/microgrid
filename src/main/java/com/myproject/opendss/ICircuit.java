package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for Circuit Object
 */
@IID("{32441C6D-7A27-4164-B5B0-FA054300C217}")
public interface ICircuit extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Name of the active circuit.
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String name();


  /**
   * <p>
   * Number of CktElements in the circuit.
   * </p>
   * <p>
   * Getter method for the COM property "NumCktElements"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  int numCktElements();


  /**
   * <p>
   * Total number of Buses in the circuit.
   * </p>
   * <p>
   * Getter method for the COM property "NumBuses"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  int numBuses();


  /**
   * <p>
   * Total number of nodes in the circuit.
   * </p>
   * <p>
   * Getter method for the COM property "NumNodes"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  int numNodes();


  /**
   * <p>
   * Collection of Buses in the circuit. Index may be string or integer index (0 based).
   * </p>
   * <p>
   * Getter method for the COM property "Buses"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com.myproject.opendss.IBus
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  com.myproject.opendss.IBus buses(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Collection of CktElements in Circuit
   * </p>
   * <p>
   * Getter method for the COM property "CktElements"
   * </p>
   * @param idx Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com.myproject.opendss.ICktElement
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(12)
  com.myproject.opendss.ICktElement cktElements(
    @MarshalAs(NativeType.VARIANT) java.lang.Object idx);


  /**
   * <p>
   * Total losses in active circuit, complex number (two-element array of double).
   * </p>
   * <p>
   * Getter method for the COM property "Losses"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object losses();


  /**
   * <p>
   * Complex total line losses in the circuit
   * </p>
   * <p>
   * Getter method for the COM property "LineLosses"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object lineLosses();


  /**
   * <p>
   * Complex losses in all transformers designated to substations.
   * </p>
   * <p>
   * Getter method for the COM property "SubstationLosses"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(15)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object substationLosses();


  /**
   * <p>
   * Total power, watts delivered to the circuit
   * </p>
   * <p>
   * Getter method for the COM property "TotalPower"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(16)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object totalPower();


  /**
   * <p>
   * Complex array of all bus, node voltages from most recent solution
   * </p>
   * <p>
   * Getter method for the COM property "AllBusVolts"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(17)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object allBusVolts();


  /**
   * <p>
   * Array of magnitudes (doubles) of voltages at all buses
   * </p>
   * <p>
   * Getter method for the COM property "AllBusVmag"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object allBusVmag();


  /**
   * <p>
   * Vaiant array of strings containing Full Name of all elements.
   * </p>
   * <p>
   * Getter method for the COM property "AllElementNames"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(19)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object allElementNames();


  /**
   * <p>
   * Return an interface to the active circuit element
   * </p>
   * <p>
   * Getter method for the COM property "ActiveElement"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.ICktElement
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(20)
  com.myproject.opendss.ICktElement activeElement();


  /**
   * <p>
   * Disable a circuit element by name (removes from circuit but leave in database)
   * </p>
   * @param myName Mandatory java.lang.String parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(21)
  void disable(
    java.lang.String myName);


  /**
   * <p>
   * Activate (enable) a disabled device.
   * </p>
   * @param myName Mandatory java.lang.String parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(22)
  void enable(
    java.lang.String myName);


  /**
   * <p>
   * Return an interface to the Solution object.
   * </p>
   * <p>
   * Getter method for the COM property "Solution"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.ISolution
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(23)
  com.myproject.opendss.ISolution solution();


  /**
   * <p>
   * Return an interface to the active bus.
   * </p>
   * <p>
   * Getter method for the COM property "ActiveBus"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.IBus
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(24)
  com.myproject.opendss.IBus activeBus();


  /**
   * <p>
   * Sets the first Power Conversion (PC) element to be the active element.
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(25)
  int firstPCElement();


  /**
   * <p>
   * Gets next PC Element.  Returns 0 if no more.
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(26)
  int nextPCElement();


  /**
   * <p>
   * Sets the first Power Delivery (PD) element to be the active element.
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(27)
  int firstPDElement();


  /**
   * <p>
   * Gets next PD Element. Returns 0 if no more.
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(28)
  int nextPDElement();


  /**
   * <p>
   * Array of strings containing names of all buses in circuit (see AllNodeNames).
   * </p>
   * <p>
   * Getter method for the COM property "AllBusNames"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(29)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object allBusNames();


  /**
   * <p>
   * Array of total losses (complex) in each circuit element
   * </p>
   * <p>
   * Getter method for the COM property "AllElementLosses"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(30)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object allElementLosses();


  /**
   * <p>
   * Force all Meters and Monitors to take a sample.
   * </p>
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(31)
  void sample();


  /**
   * <p>
   * Force all meters and monitors to save their current buffers.
   * </p>
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(32)
  void saveSample();


  /**
   * <p>
   * Returns interface to Monitors collection.
   * </p>
   * <p>
   * Getter method for the COM property "Monitors"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.IMonitors
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(33)
  com.myproject.opendss.IMonitors monitors();


  /**
   * <p>
   * Returns interface to Meters (EnergyMeter) collection.
   * </p>
   * <p>
   * Getter method for the COM property "Meters"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.IMeters
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(34)
  com.myproject.opendss.IMeters meters();


  /**
   * <p>
   * Returns a Generators Object interface
   * </p>
   * <p>
   * Getter method for the COM property "Generators"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.IGenerators
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(35)
  com.myproject.opendss.IGenerators generators();


  /**
   * <p>
   * Returns interface to Settings interface.
   * </p>
   * <p>
   * Getter method for the COM property "Settings"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.ISettings
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(36)
  com.myproject.opendss.ISettings settings();


  /**
   * <p>
   * Returns Interface to Lines collection.
   * </p>
   * <p>
   * Getter method for the COM property "Lines"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.ILines
   */

  @DISPID(31) //= 0x1f. The runtime will prefer the VTID if present
  @VTID(37)
  com.myproject.opendss.ILines lines();


  /**
   * <p>
   * Sets the Active Circuit Element using the full object name (e.g. "generator.g1"). Returns -1 if not found. Else index to be used in CktElements collection or AllElementNames.
   * </p>
   * @param fullName Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(32) //= 0x20. The runtime will prefer the VTID if present
  @VTID(38)
  int setActiveElement(
    java.lang.String fullName);


  /**
   * @param start Mandatory double parameter.
   * @param increment Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @DISPID(33) //= 0x21. The runtime will prefer the VTID if present
  @VTID(39)
  double capacity(
    double start,
    double increment);


  /**
   * <p>
   * Sets Active bus by name. Ignores node list.  Returns bus index (zero based) compatible with AllBusNames and Buses collection.
   * </p>
   * @param busName Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(34) //= 0x22. The runtime will prefer the VTID if present
  @VTID(40)
  int setActiveBus(
    java.lang.String busName);


  /**
   * <p>
   * Sets ActiveBus by Integer value.  0-based index compatible with SetActiveBus return value and AllBusNames indexing. Returns 0 if OK.
   * </p>
   * @param busIndex Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(36) //= 0x24. The runtime will prefer the VTID if present
  @VTID(41)
  int setActiveBusi(
    int busIndex);


  /**
   * <p>
   * Double Array of all bus voltages (each node) magnitudes in Per unit
   * </p>
   * <p>
   * Getter method for the COM property "AllBusVmagPu"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(35) //= 0x23. The runtime will prefer the VTID if present
  @VTID(42)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object allBusVmagPu();


  /**
   * <p>
   * Variant array of strings containing full name of each node in system in same order as returned by AllBusVolts, etc.
   * </p>
   * <p>
   * Getter method for the COM property "AllNodeNames"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(37) //= 0x25. The runtime will prefer the VTID if present
  @VTID(43)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object allNodeNames();


  /**
   * <p>
   * System Y matrix (after a solution has been performed)
   * </p>
   * <p>
   * Getter method for the COM property "SystemY"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(38) //= 0x26. The runtime will prefer the VTID if present
  @VTID(44)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object systemY();


  /**
   * <p>
   * Interface to the main Control Queue
   * </p>
   * <p>
   * Getter method for the COM property "CtrlQueue"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.ICtrlQueue
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(45)
  com.myproject.opendss.ICtrlQueue ctrlQueue();


  /**
   * <p>
   * Returns distance from each bus to parent EnergyMeter. Corresponds to sequence in AllBusNames.
   * </p>
   * <p>
   * Getter method for the COM property "AllBusDistances"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(46)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object allBusDistances();


  /**
   * <p>
   * Returns an array of distances from parent EnergyMeter for each Node. Corresponds to AllBusVMag sequence.
   * </p>
   * <p>
   * Getter method for the COM property "AllNodeDistances"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(47)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object allNodeDistances();


  /**
   * <p>
   * Returns Array of doubles represent voltage magnitudes for nodes on the specified phase.
   * </p>
   * <p>
   * Getter method for the COM property "AllNodeVmagByPhase"
   * </p>
   * @param phase Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(48)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object allNodeVmagByPhase(
    int phase);


  /**
   * <p>
   * Returns array of per unit voltage magnitudes for each node by phase
   * </p>
   * <p>
   * Getter method for the COM property "AllNodeVmagPUByPhase"
   * </p>
   * @param phase Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(49)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object allNodeVmagPUByPhase(
    int phase);


  /**
   * <p>
   * Returns an array of doubles representing the distances to parent EnergyMeter. Sequence of array corresponds to other node ByPhase properties.
   * </p>
   * <p>
   * Getter method for the COM property "AllNodeDistancesByPhase"
   * </p>
   * @param phase Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(50)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object allNodeDistancesByPhase(
    int phase);


  /**
   * <p>
   * Return variant array of strings of the node names for the By Phase criteria. Sequence corresponds to other ByPhase properties.
   * </p>
   * <p>
   * Getter method for the COM property "AllNodeNamesByPhase"
   * </p>
   * @param phase Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(51)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object allNodeNamesByPhase(
    int phase);


  /**
   * <p>
   * Returns interface to Load element interface
   * </p>
   * <p>
   * Getter method for the COM property "Loads"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.ILoads
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(52)
  com.myproject.opendss.ILoads loads();


  /**
   * <p>
   * Sets First element of active class to be the Active element in the active circuit. Returns 0 if none.
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(53)
  int firstElement();


  /**
   * <p>
   * Sets the next element of the active class to be the active element in the active circuit. Returns 0 if no more elements.
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(54)
  int nextElement();


  /**
   * <p>
   * Sets the active class by name.  Use FirstElement, NextElement to iterate through the class. Returns -1 if fails.
   * </p>
   * @param className Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(55)
  int setActiveClass(
    java.lang.String className);


  /**
   * <p>
   * Returns Interface to the Active DSS object, which could be either a circuit element or a general DSS element.
   * </p>
   * <p>
   * Getter method for the COM property "ActiveDSSElement"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.IDSSElement
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(56)
  com.myproject.opendss.IDSSElement activeDSSElement();


  /**
   * <p>
   * Returns interface to the Active Circuit element (same as ActiveElement).
   * </p>
   * <p>
   * Getter method for the COM property "ActiveCktElement"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.ICktElement
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(57)
  com.myproject.opendss.ICktElement activeCktElement();


  /**
   * <p>
   * Returns interface to active class.
   * </p>
   * <p>
   * Getter method for the COM property "ActiveClass"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.IActiveClass
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(58)
  com.myproject.opendss.IActiveClass activeClass();


  /**
   * <p>
   * Returns interface to Transformers collection
   * </p>
   * <p>
   * Getter method for the COM property "Transformers"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.ITransformers
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(59)
  com.myproject.opendss.ITransformers transformers();


  /**
   * <p>
   * Returns interface to SwtControls collection.
   * </p>
   * <p>
   * Getter method for the COM property "SwtControls"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.ISwtControls
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(60)
  com.myproject.opendss.ISwtControls swtControls();


  /**
   * <p>
   * Returns interface to CapControls collection
   * </p>
   * <p>
   * Getter method for the COM property "CapControls"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.ICapControls
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(61)
  com.myproject.opendss.ICapControls capControls();


  /**
   * <p>
   * Returns interfact to RegControls collection
   * </p>
   * <p>
   * Getter method for the COM property "RegControls"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.IRegControls
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(62)
  com.myproject.opendss.IRegControls regControls();


  /**
   * <p>
   * Interface to the active circuit's Capacitors collection.
   * </p>
   * <p>
   * Getter method for the COM property "Capacitors"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.ICapacitors
   */

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(63)
  com.myproject.opendss.ICapacitors capacitors();


  /**
   * <p>
   * Interface to the active circuit's topology object.
   * </p>
   * <p>
   * Getter method for the COM property "Topology"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.ITopology
   */

  @DISPID(220) //= 0xdc. The runtime will prefer the VTID if present
  @VTID(64)
  com.myproject.opendss.ITopology topology();


  /**
   * <p>
   * Interface to Sensors in the Active Circuit.
   * </p>
   * <p>
   * Getter method for the COM property "Sensors"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.ISensors
   */

  @DISPID(221) //= 0xdd. The runtime will prefer the VTID if present
  @VTID(65)
  com.myproject.opendss.ISensors sensors();


  /**
   * <p>
   * Forces update to all storage classes. Typically done after a solution. Done automatically in intrinsic solution modes.
   * </p>
   */

  @DISPID(222) //= 0xde. The runtime will prefer the VTID if present
  @VTID(66)
  void updateStorage();


  /**
   * <p>
   * Sets Parent PD element, if any, to be the active circuit element and returns index>0; Returns 0 if it fails or not applicable.
   * </p>
   * <p>
   * Getter method for the COM property "ParentPDElement"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(223) //= 0xdf. The runtime will prefer the VTID if present
  @VTID(67)
  int parentPDElement();


  /**
   * <p>
   * Interface to XYCurves in active circuit.
   * </p>
   * <p>
   * Getter method for the COM property "XYCurves"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.IXYCurves
   */

  @DISPID(224) //= 0xe0. The runtime will prefer the VTID if present
  @VTID(68)
  com.myproject.opendss.IXYCurves xyCurves();


  /**
   * <p>
   * Interface to PDElements collection
   * </p>
   * <p>
   * Getter method for the COM property "PDElements"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.IPDElements
   */

  @DISPID(225) //= 0xe1. The runtime will prefer the VTID if present
  @VTID(69)
  com.myproject.opendss.IPDElements pdElements();


  /**
   * <p>
   * Getter method for the COM property "Reclosers"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.IReclosers
   */

  @DISPID(226) //= 0xe2. The runtime will prefer the VTID if present
  @VTID(70)
  com.myproject.opendss.IReclosers reclosers();


  /**
   * <p>
   * Getter method for the COM property "Relays"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.IRelays
   */

  @DISPID(227) //= 0xe3. The runtime will prefer the VTID if present
  @VTID(71)
  com.myproject.opendss.IRelays relays();


  /**
   * <p>
   * Interface to OpenDSS Load shapes currently defined.
   * </p>
   * <p>
   * Getter method for the COM property "LoadShapes"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.ILoadShapes
   */

  @DISPID(228) //= 0xe4. The runtime will prefer the VTID if present
  @VTID(72)
  com.myproject.opendss.ILoadShapes loadShapes();


  /**
   * <p>
   * Return interface to Fuses 
   * </p>
   * <p>
   * Getter method for the COM property "Fuses"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.IFuses
   */

  @DISPID(229) //= 0xe5. The runtime will prefer the VTID if present
  @VTID(73)
  com.myproject.opendss.IFuses fuses();


  /**
   * <p>
   * Interface to ISOURCE devices
   * </p>
   * <p>
   * Getter method for the COM property "ISources"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.IISources
   */

  @DISPID(230) //= 0xe6. The runtime will prefer the VTID if present
  @VTID(74)
  com.myproject.opendss.IISources iSources();


  /**
   * <p>
   * Complex array of actual node voltages in same order as SystemY matrix.
   * </p>
   * <p>
   * Getter method for the COM property "YNodeVarray"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(231) //= 0xe7. The runtime will prefer the VTID if present
  @VTID(75)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object yNodeVarray();


  /**
   * <p>
   * Calls EndOfTimeStepCleanup in SolutionAlgs
   * </p>
   */

  @DISPID(232) //= 0xe8. The runtime will prefer the VTID if present
  @VTID(76)
  void endOfTimeStepUpdate();


  /**
   * <p>
   * Getter method for the COM property "DSSim_Coms"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.IDSSimComs
   */

  @DISPID(233) //= 0xe9. The runtime will prefer the VTID if present
  @VTID(77)
  com.myproject.opendss.IDSSimComs dsSim_Coms();


  /**
   * <p>
   * Variant array of strings containing the names of the nodes in the same order as the Y matrix
   * </p>
   * <p>
   * Getter method for the COM property "YNodeOrder"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(234) //= 0xea. The runtime will prefer the VTID if present
  @VTID(78)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object yNodeOrder();


  /**
   * <p>
   * Variant array of doubles containing complex injection currents for the present solution. Is is the "I" vector of I=YV
   * </p>
   * <p>
   * Getter method for the COM property "YCurrents"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(235) //= 0xeb. The runtime will prefer the VTID if present
  @VTID(79)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object yCurrents();


  /**
   * <p>
   * Interface to PVSystems collection
   * </p>
   * <p>
   * Getter method for the COM property "PVSystems"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.IPVSystems
   */

  @DISPID(236) //= 0xec. The runtime will prefer the VTID if present
  @VTID(80)
  com.myproject.opendss.IPVSystems pvSystems();


  /**
   * <p>
   * Vsources object collection
   * </p>
   * <p>
   * Getter method for the COM property "Vsources"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.IVsources
   */

  @DISPID(237) //= 0xed. The runtime will prefer the VTID if present
  @VTID(81)
  com.myproject.opendss.IVsources vsources();


  /**
   * <p>
   * Delivers a handler for the Parallel Dispatch interface
   * </p>
   * <p>
   * Getter method for the COM property "Parallel"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.IParallel
   */

  @DISPID(238) //= 0xee. The runtime will prefer the VTID if present
  @VTID(82)
  com.myproject.opendss.IParallel parallel();


  /**
   * <p>
   * Access the Linecodes library in this circuit
   * </p>
   * <p>
   * Getter method for the COM property "LineCodes"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.ILineCodes
   */

  @DISPID(239) //= 0xef. The runtime will prefer the VTID if present
  @VTID(83)
  com.myproject.opendss.ILineCodes lineCodes();


  /**
   * <p>
   * Connect to GICSources Interface
   * </p>
   * <p>
   * Getter method for the COM property "GICSources"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.IGICSources
   */

  @DISPID(240) //= 0xf0. The runtime will prefer the VTID if present
  @VTID(84)
  com.myproject.opendss.IGICSources gicSources();


  /**
   * <p>
   * Connect to the Circuit Reduction Interface
   * </p>
   * <p>
   * Getter method for the COM property "ReduceCkt"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.IReduceCkt
   */

  @DISPID(241) //= 0xf1. The runtime will prefer the VTID if present
  @VTID(85)
  com.myproject.opendss.IReduceCkt reduceCkt();


  /**
   * <p>
   * Connect to Storages Interface
   * </p>
   * <p>
   * Getter method for the COM property "Storages"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.IStorages
   */

  @DISPID(242) //= 0xf2. The runtime will prefer the VTID if present
  @VTID(86)
  com.myproject.opendss.IStorages storages();


  /**
   * <p>
   * Connect to WindGens Interface
   * </p>
   * <p>
   * Getter method for the COM property "WindGens"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.IWindGens
   */

  @DISPID(243) //= 0xf3. The runtime will prefer the VTID if present
  @VTID(87)
  com.myproject.opendss.IWindGens windGens();


  // Properties:
}
