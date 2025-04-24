package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for Fuses Object
 */
@IID("{AABE4DA8-3D5A-447F-AFFB-78946BA68DA5}")
public interface IFuses extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Variant array of strings containing names of all Fuses in the circuit
   * </p>
   * <p>
   * Getter method for the COM property "AllNames"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object allNames();


  /**
   * <p>
   * Number of Fuse elements in the circuit
   * </p>
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  int count();


  /**
   * <p>
   * Set the first Fuse to be the active fuse. Returns 0 if none.
   * </p>
   * <p>
   * Getter method for the COM property "First"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  int first();


  /**
   * <p>
   * Advance the active Fuse element pointer to the next fuse. Returns 0 if no more fuses.
   * </p>
   * <p>
   * Getter method for the COM property "Next"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(10)
  int next();


  /**
   * <p>
   * Get the name of the active Fuse element
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String name();


  /**
   * <p>
   * Get the name of the active Fuse element
   * </p>
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(12)
  void name(
    java.lang.String value);


  /**
   * <p>
   * Full name of the circuit element to which the fuse is connected.
   * </p>
   * <p>
   * Getter method for the COM property "MonitoredObj"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String monitoredObj();


  /**
   * <p>
   * Full name of the circuit element to which the fuse is connected.
   * </p>
   * <p>
   * Setter method for the COM property "MonitoredObj"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(14)
  void monitoredObj(
    java.lang.String value);


  /**
   * <p>
   * Terminal number to which the fuse is connected.
   * </p>
   * <p>
   * Getter method for the COM property "MonitoredTerm"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(15)
  int monitoredTerm();


  /**
   * <p>
   * Terminal number to which the fuse is connected.
   * </p>
   * <p>
   * Setter method for the COM property "MonitoredTerm"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(16)
  void monitoredTerm(
    int value);


  /**
   * <p>
   * Full name of the circuit element switch that the fuse controls. Defaults to the MonitoredObj.
   * </p>
   * <p>
   * Getter method for the COM property "SwitchedObj"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String switchedObj();


  /**
   * <p>
   * Full name of the circuit element switch that the fuse controls. Defaults to the MonitoredObj.
   * </p>
   * <p>
   * Setter method for the COM property "SwitchedObj"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(18)
  void switchedObj(
    java.lang.String value);


  /**
   * <p>
   * Number of the terminal containing the switch controlled by the fuse.
   * </p>
   * <p>
   * Getter method for the COM property "SwitchedTerm"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(19)
  int switchedTerm();


  /**
   * <p>
   * Number of the terminal containing the switch controlled by the fuse.
   * </p>
   * <p>
   * Setter method for the COM property "SwitchedTerm"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(20)
  void switchedTerm(
    int value);


  /**
   * <p>
   * Name of the TCCcurve object that determines fuse blowing.
   * </p>
   * <p>
   * Getter method for the COM property "TCCcurve"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String tcCcurve();


  /**
   * <p>
   * Name of the TCCcurve object that determines fuse blowing.
   * </p>
   * <p>
   * Setter method for the COM property "TCCcurve"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(22)
  void tcCcurve(
    java.lang.String value);


  /**
   * <p>
   * Multiplier or actual amps for the TCCcurve object. Defaults to 1.0.  Multipliy current values of TCC curve by this to get actual amps.
   * </p>
   * <p>
   * Getter method for the COM property "RatedCurrent"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(23)
  double ratedCurrent();


  /**
   * <p>
   * Multiplier or actual amps for the TCCcurve object. Defaults to 1.0.  Multipliy current values of TCC curve by this to get actual amps.
   * </p>
   * <p>
   * Setter method for the COM property "RatedCurrent"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(24)
  void ratedCurrent(
    double value);


  /**
   * <p>
   * A fixed delay time in seconds added to the fuse blowing time determined by the TCC curve. Default is 0.
   * </p>
   * <p>
   * Getter method for the COM property "Delay"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(25)
  double delay();


  /**
   * <p>
   * A fixed delay time in seconds added to the fuse blowing time determined by the TCC curve. Default is 0.
   * </p>
   * <p>
   * Setter method for the COM property "Delay"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(26)
  void delay(
    double value);


  /**
   * <p>
   * Manual opening of all phases of the fuse.
   * </p>
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(27)
  void open();


  /**
   * <p>
   * Close all phases of the fuse.
   * </p>
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(28)
  void close();


  /**
   * <p>
   * Current state of the fuses. TRUE if any fuse on any phase is blown. Else FALSE.
   * </p>
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(29)
  void isBlown();


  /**
   * <p>
   * Get/set active fuse by index into the list of fuses. 1 based: 1..count
   * </p>
   * <p>
   * Getter method for the COM property "idx"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(30)
  int idx();


  /**
   * <p>
   * Get/set active fuse by index into the list of fuses. 1 based: 1..count
   * </p>
   * <p>
   * Setter method for the COM property "idx"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(31)
  void idx(
    int value);


  /**
   * <p>
   * Number of phases, this fuse. 
   * </p>
   * <p>
   * Getter method for the COM property "NumPhases"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(32)
  int numPhases();


  /**
   * <p>
   * Reset fuse to normal state.
   * </p>
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(33)
  void reset();


  /**
   * <p>
   * Variant array of strings indicating the state of each phase of the fuse. 0-based array.
   * </p>
   * <p>
   * Getter method for the COM property "State"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(34)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object state();


  /**
   * <p>
   * Variant array of strings indicating the state of each phase of the fuse. 0-based array.
   * </p>
   * <p>
   * Setter method for the COM property "State"
   * </p>
   * @param value Mandatory java.lang.Object parameter.
   */

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(35)
  void state(
    @MarshalAs(NativeType.VARIANT) java.lang.Object value);


  /**
   * <p>
   * Variant array of strings indicating the normal state of each phase of the fuse. 0-based array.
   * </p>
   * <p>
   * Getter method for the COM property "NormalState"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(220) //= 0xdc. The runtime will prefer the VTID if present
  @VTID(36)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object normalState();


  /**
   * <p>
   * Variant array of strings indicating the normal state of each phase of the fuse. 0-based array.
   * </p>
   * <p>
   * Setter method for the COM property "NormalState"
   * </p>
   * @param value Mandatory java.lang.Object parameter.
   */

  @DISPID(220) //= 0xdc. The runtime will prefer the VTID if present
  @VTID(37)
  void normalState(
    @MarshalAs(NativeType.VARIANT) java.lang.Object value);


  // Properties:
}
