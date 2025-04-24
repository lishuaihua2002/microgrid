package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for Bus Object
 */
@IID("{E5B78C35-88F8-495F-8CD1-EBB5D90ED228}")
public interface IBus extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Name of Bus
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
   * Number of Nodes this bus.
   * </p>
   * <p>
   * Getter method for the COM property "NumNodes"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  int numNodes();


  /**
   * <p>
   * Complex array of voltages at this bus.
   * </p>
   * <p>
   * Getter method for the COM property "Voltages"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object voltages();


  /**
   * <p>
   * Double Array of sequence voltages at this bus.
   * </p>
   * <p>
   * Getter method for the COM property "SeqVoltages"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object seqVoltages();


  /**
   * <p>
   * Integer Array of Node Numbers defined at the bus in same order as the voltages.
   * </p>
   * <p>
   * Getter method for the COM property "Nodes"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object nodes();


  /**
   * <p>
   * Open circuit voltage; Complex array.
   * </p>
   * <p>
   * Getter method for the COM property "Voc"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object voc();


  /**
   * <p>
   * Short circuit currents at bus; Complex Array.
   * </p>
   * <p>
   * Getter method for the COM property "Isc"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object isc();


  /**
   * <p>
   * Complex Array of pu voltages at the bus.
   * </p>
   * <p>
   * Getter method for the COM property "puVoltages"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object puVoltages();


  /**
   * <p>
   * Base voltage at bus in kV
   * </p>
   * <p>
   * Getter method for the COM property "kVBase"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(15)
  double kVBase();


  /**
   * <p>
   * Complex array of Zsc matrix at bus. Column by column.
   * </p>
   * <p>
   * Getter method for the COM property "ZscMatrix"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(16)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object zscMatrix();


  /**
   * <p>
   * Complex Positive-Sequence short circuit impedance at bus..
   * </p>
   * <p>
   * Getter method for the COM property "Zsc1"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(17)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object zsc1();


  /**
   * <p>
   * Complex Zero-Sequence short circuit impedance at bus.
   * </p>
   * <p>
   * Getter method for the COM property "Zsc0"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object zsc0();


  /**
   * <p>
   * Recomputes Zsc for active bus for present circuit configuration.
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(19)
  boolean zscRefresh();


  /**
   * <p>
   * Complex array of Ysc matrix at bus. Column by column.
   * </p>
   * <p>
   * Getter method for the COM property "YscMatrix"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(20)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object yscMatrix();


  /**
   * <p>
   * False=0 else True. Indicates whether a coordinate has been defined for this bus
   * </p>
   * <p>
   * Getter method for the COM property "Coorddefined"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(21)
  boolean coorddefined();


  /**
   * <p>
   * X Coordinate for bus (double)
   * </p>
   * <p>
   * Getter method for the COM property "x"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(22)
  double x();


  /**
   * <p>
   * X Coordinate for bus (double)
   * </p>
   * <p>
   * Setter method for the COM property "x"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(23)
  void x(
    double value);


  /**
   * <p>
   * Y coordinate for bus(double)
   * </p>
   * <p>
   * Getter method for the COM property "y"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(24)
  double y();


  /**
   * <p>
   * Y coordinate for bus(double)
   * </p>
   * <p>
   * Setter method for the COM property "y"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(25)
  void y(
    double value);


  /**
   * <p>
   * Distance from energymeter (if non-zero)
   * </p>
   * <p>
   * Getter method for the COM property "Distance"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(26)
  double distance();


  /**
   * <p>
   * Returns a unique node number at the active bus to avoid node collisions and adds it to the node list for the bus.
   * </p>
   * @param startNumber Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(27)
  int getUniqueNodeNumber(
    int startNumber);


  /**
   * <p>
   * Complex Double array of Sequence Voltages (0, 1, 2) at this Bus.
   * </p>
   * <p>
   * Getter method for the COM property "CplxSeqVoltages"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(28)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object cplxSeqVoltages();


  /**
   * <p>
   * Accumulated failure rate downstream from this bus; faults per year
   * </p>
   * <p>
   * Getter method for the COM property "Lambda"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(29)
  double lambda();


  /**
   * <p>
   * Number of interruptions this bus per year
   * </p>
   * <p>
   * Getter method for the COM property "N_interrupts"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(30)
  double n_interrupts();


  /**
   * <p>
   * Average interruption duration, hr.
   * </p>
   * <p>
   * Getter method for the COM property "Int_Duration"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(31)
  double int_Duration();


  /**
   * <p>
   * Annual number of customer-interruptions from this bus
   * </p>
   * <p>
   * Getter method for the COM property "Cust_Interrupts"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(32)
  double cust_Interrupts();


  /**
   * <p>
   * Accumulated customer outage durations
   * </p>
   * <p>
   * Getter method for the COM property "Cust_Duration"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(33)
  double cust_Duration();


  /**
   * <p>
   * Total numbers of customers served downline from this bus
   * </p>
   * <p>
   * Getter method for the COM property "N_Customers"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(34)
  int n_Customers();


  /**
   * <p>
   * For 2- and 3-phase buses, returns variant array of complex numbers represetin L-L voltages in volts. Returns -1.0 for 1-phase bus. If more than 3 phases, returns only first 3.
   * </p>
   * <p>
   * Getter method for the COM property "VLL"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(35)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object vll();


  /**
   * <p>
   * Returns Complex array of pu L-L voltages for 2- and 3-phase buses. Returns -1.0 for 1-phase bus. If more than 3 phases, returns only 3 phases.
   * </p>
   * <p>
   * Getter method for the COM property "puVLL"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(36)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object puVLL();


  /**
   * <p>
   * Variant Array of doubles containing voltages in Magnitude (VLN), angle (deg) 
   * </p>
   * <p>
   * Getter method for the COM property "VMagAngle"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(37)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object vMagAngle();


  /**
   * <p>
   * Variant array of doubles containig voltage magnitude, angle pairs in per unit
   * </p>
   * <p>
   * Getter method for the COM property "puVmagAngle"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(38)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object puVmagAngle();


  /**
   * <p>
   * Total length of line downline from this bus, in miles. For recloser siting algorithm.
   * </p>
   * <p>
   * Getter method for the COM property "TotalMiles"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(39)
  double totalMiles();


  /**
   * <p>
   * Integer ID of the feeder section in which this bus is located.
   * </p>
   * <p>
   * Getter method for the COM property "SectionID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(40)
  int sectionID();


  /**
   * <p>
   * Variant Array of Strings: List of LINE elements connected to this bus. Complete name Line.xxxx
   * </p>
   * <p>
   * Getter method for the COM property "LineList"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(41)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object lineList();


  /**
   * <p>
   * Variant array of strings: Full Names of LOAD elelments connected to this bus.
   * </p>
   * <p>
   * Getter method for the COM property "LoadList"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(220) //= 0xdc. The runtime will prefer the VTID if present
  @VTID(42)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object loadList();


  /**
   * <p>
   * Variant array of doubles (complex) containing the complete 012 Zsc matrix
   * </p>
   * <p>
   * Getter method for the COM property "ZSC012Matrix"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(221) //= 0xdd. The runtime will prefer the VTID if present
  @VTID(43)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object zsC012Matrix();


  /**
   * <p>
   * Sets the GIS latitude assigned to this bus
   * </p>
   * <p>
   * Getter method for the COM property "Latitude"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(222) //= 0xde. The runtime will prefer the VTID if present
  @VTID(44)
  double latitude();


  /**
   * <p>
   * Sets the GIS latitude assigned to this bus
   * </p>
   * <p>
   * Setter method for the COM property "Latitude"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(222) //= 0xde. The runtime will prefer the VTID if present
  @VTID(45)
  void latitude(
    double value);


  /**
   * <p>
   * Sets the longitude given to the active Bus 
   * </p>
   * <p>
   * Getter method for the COM property "Longitude"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(223) //= 0xdf. The runtime will prefer the VTID if present
  @VTID(46)
  double longitude();


  /**
   * <p>
   * Sets the longitude given to the active Bus 
   * </p>
   * <p>
   * Setter method for the COM property "Longitude"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(223) //= 0xdf. The runtime will prefer the VTID if present
  @VTID(47)
  void longitude(
    double value);


  /**
   * <p>
   * Returns an array with the names of all PCE connected to the active bus
   * </p>
   * <p>
   * Getter method for the COM property "AllPCEatBus"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(224) //= 0xe0. The runtime will prefer the VTID if present
  @VTID(48)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object allPCEatBus();


  /**
   * <p>
   * Returns an array with the names of all PDE connected to the active bus
   * </p>
   * <p>
   * Getter method for the COM property "AllPDEatBus"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(225) //= 0xe1. The runtime will prefer the VTID if present
  @VTID(49)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object allPDEatBus();


  // Properties:
}
