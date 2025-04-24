package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for CktElement Object
 */
@IID("{F20E8327-5B60-478E-8DBD-5EFC75EB929B}")
public interface ICktElement extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Full Name of Active Circuit Element
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
   * Number of Terminals this Circuit Element
   * </p>
   * <p>
   * Getter method for the COM property "NumTerminals"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  int numTerminals();


  /**
   * <p>
   * Number of Conductors per Terminal
   * </p>
   * <p>
   * Getter method for the COM property "NumConductors"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  int numConductors();


  /**
   * <p>
   * Number of Phases
   * </p>
   * <p>
   * Getter method for the COM property "NumPhases"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  int numPhases();


  /**
   * <p>
   * Variant array of strings. Get  Bus definitions to which each terminal is connected. 0-based array.
   * </p>
   * <p>
   * Getter method for the COM property "BusNames"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object busNames();


  /**
   * <p>
   * Variant array of strings. Get  Bus definitions to which each terminal is connected. 0-based array.
   * </p>
   * <p>
   * Setter method for the COM property "BusNames"
   * </p>
   * @param value Mandatory java.lang.Object parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(12)
  void busNames(
    @MarshalAs(NativeType.VARIANT) java.lang.Object value);


  /**
   * <p>
   * Collection of Properties for this Circuit Element (0 based index, if numeric)
   * </p>
   * <p>
   * Getter method for the COM property "Properties"
   * </p>
   * @param indx Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com.myproject.opendss.IDSSProperty
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(13)
  com.myproject.opendss.IDSSProperty properties(
    @MarshalAs(NativeType.VARIANT) java.lang.Object indx);


  /**
   * <p>
   * Complex array of voltages at terminals
   * </p>
   * <p>
   * Getter method for the COM property "Voltages"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object voltages();


  /**
   * <p>
   * Complex array of currents into each conductor of each terminal
   * </p>
   * <p>
   * Getter method for the COM property "Currents"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(15)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object currents();


  /**
   * <p>
   * Complex array of powers into each conductor of each terminal
   * </p>
   * <p>
   * Getter method for the COM property "Powers"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(16)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object powers();


  /**
   * <p>
   * Total losses in the element: two-element complex array
   * </p>
   * <p>
   * Getter method for the COM property "Losses"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(17)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object losses();


  /**
   * <p>
   * Complex array of losses by phase
   * </p>
   * <p>
   * Getter method for the COM property "PhaseLosses"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object phaseLosses();


  /**
   * <p>
   * Double array of symmetrical component voltages at each 3-phase terminal
   * </p>
   * <p>
   * Getter method for the COM property "SeqVoltages"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(19)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object seqVoltages();


  /**
   * <p>
   * Double array of symmetrical component currents into each 3-phase terminal
   * </p>
   * <p>
   * Getter method for the COM property "SeqCurrents"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(20)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object seqCurrents();


  /**
   * <p>
   * Double array of sequence powers into each 3-phase teminal
   * </p>
   * <p>
   * Getter method for the COM property "SeqPowers"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(21)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object seqPowers();


  /**
   * <p>
   * Boolean indicating that element is currently in the circuit.
   * </p>
   * <p>
   * Getter method for the COM property "Enabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(22)
  boolean enabled();


  /**
   * <p>
   * Boolean indicating that element is currently in the circuit.
   * </p>
   * <p>
   * Setter method for the COM property "Enabled"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(23)
  void enabled(
    boolean value);


  /**
   * <p>
   * Normal ampere rating for PD Elements
   * </p>
   * <p>
   * Getter method for the COM property "NormalAmps"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(24)
  double normalAmps();


  /**
   * <p>
   * Normal ampere rating for PD Elements
   * </p>
   * <p>
   * Setter method for the COM property "NormalAmps"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(25)
  void normalAmps(
    double value);


  /**
   * <p>
   * Emergency Ampere Rating for PD elements
   * </p>
   * <p>
   * Getter method for the COM property "EmergAmps"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(26)
  double emergAmps();


  /**
   * <p>
   * Emergency Ampere Rating for PD elements
   * </p>
   * <p>
   * Setter method for the COM property "EmergAmps"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(27)
  void emergAmps(
    double value);


  /**
   * <p>
   * Open the specified terminal and phase, if non-zero.  Else all conductors at terminal.
   * </p>
   * @param term Mandatory int parameter.
   * @param phs Mandatory int parameter.
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(28)
  void open(
    int term,
    int phs);


  /**
   * <p>
   * Close the specified terminal and phase, if non-zero.  Else all conductors at terminal.
   * </p>
   * @param term Mandatory int parameter.
   * @param phs Mandatory int parameter.
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(29)
  void close(
    int term,
    int phs);


  /**
   * <p>
   * Boolean indicating if the specified terminal and, optionally, phase is open.
   * </p>
   * @param term Mandatory int parameter.
   * @param phs Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(30)
  boolean isOpen(
    int term,
    int phs);


  /**
   * <p>
   * Number of Properties this Circuit Element.
   * </p>
   * <p>
   * Getter method for the COM property "NumProperties"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(31)
  int numProperties();


  /**
   * <p>
   * Variant array containing all property names of the active device.
   * </p>
   * <p>
   * Getter method for the COM property "AllPropertyNames"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(32)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object allPropertyNames();


  /**
   * <p>
   * Residual currents for each terminal: (mag, angle)
   * </p>
   * <p>
   * Getter method for the COM property "Residuals"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(33)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object residuals();


  /**
   * <p>
   * YPrim matrix, column order, complex numbers (paired)
   * </p>
   * <p>
   * Getter method for the COM property "Yprim"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(34)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object yprim();


  /**
   * <p>
   * Display name of the object (not necessarily unique)
   * </p>
   * <p>
   * Getter method for the COM property "DisplayName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(35)
  java.lang.String displayName();


  /**
   * <p>
   * Display name of the object (not necessarily unique)
   * </p>
   * <p>
   * Setter method for the COM property "DisplayName"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(36)
  void displayName(
    java.lang.String value);


  /**
   * <p>
   * Pointer to this object
   * </p>
   * <p>
   * Getter method for the COM property "Handle"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(37)
  int handle();


  /**
   * <p>
   * globally unique identifier for this object
   * </p>
   * <p>
   * Getter method for the COM property "GUID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(38)
  java.lang.String guid();


  /**
   * <p>
   * This element has a SwtControl attached.
   * </p>
   * <p>
   * Getter method for the COM property "HasSwitchControl"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(39)
  boolean hasSwitchControl();


  /**
   * <p>
   * This element has a CapControl or RegControl attached.
   * </p>
   * <p>
   * Getter method for the COM property "HasVoltControl"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(40)
  boolean hasVoltControl();


  /**
   * <p>
   * Name of the Energy Meter this element is assigned to.
   * </p>
   * <p>
   * Getter method for the COM property "EnergyMeter"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(41)
  java.lang.String energyMeter();


  /**
   * <p>
   * Full name of the i-th controller attached to this element. Ex: str = Controller(2).  See NumControls to determine valid index range
   * </p>
   * <p>
   * Getter method for the COM property "Controller"
   * </p>
   * @param idx Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(42)
  java.lang.String controller(
    int idx);


  /**
   * <p>
   * Complex double array of Sequence Voltage for all terminals of active circuit element.
   * </p>
   * <p>
   * Getter method for the COM property "CplxSeqVoltages"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(43)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object cplxSeqVoltages();


  /**
   * <p>
   * Complex double array of Sequence Currents for all conductors of all terminals of active circuit element.
   * </p>
   * <p>
   * Getter method for the COM property "CplxSeqCurrents"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(44)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object cplxSeqCurrents();


  /**
   * <p>
   * Variant array of strings listing all the published variable names, if a PCElement. Otherwise, null string.
   * </p>
   * <p>
   * Getter method for the COM property "AllVariableNames"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(45)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object allVariableNames();


  /**
   * <p>
   * Variant array of doubles. Values of state variables of active element if PC element.
   * </p>
   * <p>
   * Getter method for the COM property "AllVariableValues"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(46)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object allVariableValues();


  /**
   * <p>
   * For PCElement, get the value of a variable by name. If Code>0 Then no variable by this name or not a PCelement.
   * </p>
   * <p>
   * Getter method for the COM property "Variable"
   * </p>
   * @param myVarName Mandatory java.lang.String parameter.
   * @param code Mandatory Holder<Integer> parameter.
   * @return  Returns a value of type double
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(47)
  double variable(
    java.lang.String myVarName,
    Holder<Integer> code);


  /**
   * <p>
   * For PCElement, get the value of a variable by integer index.
   * </p>
   * <p>
   * Getter method for the COM property "Variablei"
   * </p>
   * @param idx Mandatory int parameter.
   * @param code Mandatory Holder<Integer> parameter.
   * @return  Returns a value of type double
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(48)
  double variablei(
    int idx,
    Holder<Integer> code);


  /**
   * <p>
   * Variant array of integer containing the node numbers (representing phases, for example) for each conductor of each terminal. 
   * </p>
   * <p>
   * Getter method for the COM property "NodeOrder"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(49)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object nodeOrder();


  /**
   * <p>
   * True if a recloser, relay, or fuse controlling this ckt element. OCP = Overcurrent Protection 
   * </p>
   * <p>
   * Getter method for the COM property "HasOCPDevice"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(50)
  boolean hasOCPDevice();


  /**
   * <p>
   * Number of controls connected to this device. Use to determine valid range for index into Controller array.
   * </p>
   * <p>
   * Getter method for the COM property "NumControls"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(51)
  int numControls();


  /**
   * <p>
   * Index into Controller list of OCP Device controlling this CktElement
   * </p>
   * <p>
   * Getter method for the COM property "OCPDevIndex"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(52)
  int ocpDevIndex();


  /**
   * <p>
   * 0=None; 1=Fuse; 2=Recloser; 3=Relay;  Type of OCP controller device
   * </p>
   * <p>
   * Getter method for the COM property "OCPDevType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(53)
  int ocpDevType();


  /**
   * <p>
   * Currents in magnitude, angle format as a variant array of doubles.
   * </p>
   * <p>
   * Getter method for the COM property "CurrentsMagAng"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(54)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object currentsMagAng();


  /**
   * <p>
   * Voltages at each conductor in magnitude, angle form as variant array of doubles.
   * </p>
   * <p>
   * Getter method for the COM property "VoltagesMagAng"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(220) //= 0xdc. The runtime will prefer the VTID if present
  @VTID(55)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object voltagesMagAng();


  /**
   * <p>
   * Returns the total powers (complex) at ALL terminals of the active circuit element.
   * </p>
   * <p>
   * Getter method for the COM property "TotalPowers"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(221) //= 0xdd. The runtime will prefer the VTID if present
  @VTID(56)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object totalPowers();


  /**
   * <p>
   * For PCElement, get the value of a variable by name. If Code>0 Then no variable by this name or not a PCelement.
   * </p>
   * <p>
   * Getter method for the COM property "VariableByName"
   * </p>
   * @param myVarName Mandatory java.lang.String parameter.
   * @param code Mandatory Holder<Integer> parameter.
   * @return  Returns a value of type double
   */

  @DISPID(222) //= 0xde. The runtime will prefer the VTID if present
  @VTID(57)
  double variableByName(
    java.lang.String myVarName,
    Holder<Integer> code);


  /**
   * <p>
   * For PCElement, get the value of a variable by name. If Code>0 Then no variable by this name or not a PCelement.
   * </p>
   * <p>
   * Setter method for the COM property "VariableByName"
   * </p>
   * @param myVarName Mandatory java.lang.String parameter.
   * @param value Mandatory double parameter.
   * @return  Returns a value of type int
   */

  @DISPID(222) //= 0xde. The runtime will prefer the VTID if present
  @VTID(58)
  @ReturnValue(index=1)
  int variableByName(
    java.lang.String myVarName,
    double value);


  /**
   * <p>
   * For PCElement, get the value of a variable by Index. If Code>0 Then no variable by this name or not a PCelement.
   * </p>
   * <p>
   * Getter method for the COM property "VariableByIndex"
   * </p>
   * @param idx Mandatory int parameter.
   * @param code Mandatory Holder<Integer> parameter.
   * @return  Returns a value of type double
   */

  @DISPID(223) //= 0xdf. The runtime will prefer the VTID if present
  @VTID(59)
  double variableByIndex(
    int idx,
    Holder<Integer> code);


  /**
   * <p>
   * For PCElement, get the value of a variable by Index. If Code>0 Then no variable by this name or not a PCelement.
   * </p>
   * <p>
   * Setter method for the COM property "VariableByIndex"
   * </p>
   * @param idx Mandatory int parameter.
   * @param value Mandatory double parameter.
   * @return  Returns a value of type int
   */

  @DISPID(223) //= 0xdf. The runtime will prefer the VTID if present
  @VTID(60)
  @ReturnValue(index=1)
  int variableByIndex(
    int idx,
    double value);


  /**
   * <p>
   * Gets the name of the active state variable if any, otherwise, returns and empty string
   * </p>
   * <p>
   * Getter method for the COM property "VariableName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(224) //= 0xe0. The runtime will prefer the VTID if present
  @VTID(61)
  java.lang.String variableName();


  /**
   * <p>
   * Gets the name of the active state variable if any, otherwise, returns and empty string
   * </p>
   * <p>
   * Setter method for the COM property "VariableName"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(224) //= 0xe0. The runtime will prefer the VTID if present
  @VTID(62)
  void variableName(
    java.lang.String value);


  /**
   * <p>
   * Gets the  present value for the active state variable. If there no active variable, returns a error message.
   * </p>
   * <p>
   * Getter method for the COM property "VariableValue"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(225) //= 0xe1. The runtime will prefer the VTID if present
  @VTID(63)
  double variableValue();


  /**
   * <p>
   * Gets the  present value for the active state variable. If there no active variable, returns a error message.
   * </p>
   * <p>
   * Setter method for the COM property "VariableValue"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(225) //= 0xe1. The runtime will prefer the VTID if present
  @VTID(64)
  void variableValue(
    double value);


  /**
   * <p>
   * Gets the index of the active state variable if any, otherwise, returns -1
   * </p>
   * <p>
   * Getter method for the COM property "VariableIdx"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(226) //= 0xe2. The runtime will prefer the VTID if present
  @VTID(65)
  int variableIdx();


  /**
   * <p>
   * Gets the index of the active state variable if any, otherwise, returns -1
   * </p>
   * <p>
   * Setter method for the COM property "VariableIdx"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(226) //= 0xe2. The runtime will prefer the VTID if present
  @VTID(66)
  void variableIdx(
    int value);


  // Properties:
}
