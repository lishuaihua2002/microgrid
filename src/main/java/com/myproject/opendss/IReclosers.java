package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for Reclosers Object
 */
@IID("{21001789-9F46-4323-93B0-8B31395FD6E4}")
public interface IReclosers extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Variant array of strings with names of all Reclosers in Active Circuit
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
   * Number of Reclosers in active circuit.
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
   * Set First Recloser to be Active Ckt Element. Returns 0 if none.
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
   * Iterate to the next recloser in the circuit. Returns zero if no more.
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
   * Get Name of active Recloser or set the active Recloser by name.
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
   * Get Name of active Recloser or set the active Recloser by name.
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
   * Full name of object this Recloser is monitoring.
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
   * Full name of object this Recloser is monitoring.
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
   * Terminal number of Monitored object for the Recloser 
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
   * Terminal number of Monitored object for the Recloser 
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
   * Full name of the circuit element that is being switched by the Recloser.
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
   * Full name of the circuit element that is being switched by the Recloser.
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
   * Terminal number of the controlled device being switched by the Recloser
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
   * Terminal number of the controlled device being switched by the Recloser
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
   * Number of fast shots
   * </p>
   * <p>
   * Getter method for the COM property "NumFast"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(21)
  int numFast();


  /**
   * <p>
   * Number of fast shots
   * </p>
   * <p>
   * Setter method for the COM property "NumFast"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(22)
  void numFast(
    int value);


  /**
   * <p>
   * Number of shots to lockout (fast + delayed)
   * </p>
   * <p>
   * Getter method for the COM property "Shots"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(23)
  int shots();


  /**
   * <p>
   * Number of shots to lockout (fast + delayed)
   * </p>
   * <p>
   * Setter method for the COM property "Shots"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(24)
  void shots(
    int value);


  /**
   * <p>
   * Variant Array of Doubles: reclose intervals, s, between shots.
   * </p>
   * <p>
   * Getter method for the COM property "RecloseIntervals"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(25)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object recloseIntervals();


  /**
   * <p>
   * Phase trip curve multiplier or actual amps
   * </p>
   * <p>
   * Getter method for the COM property "PhaseTrip"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(26)
  double phaseTrip();


  /**
   * <p>
   * Phase trip curve multiplier or actual amps
   * </p>
   * <p>
   * Setter method for the COM property "PhaseTrip"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(27)
  void phaseTrip(
    double value);


  /**
   * <p>
   * Phase instantaneous curve multipler or actual amps
   * </p>
   * <p>
   * Getter method for the COM property "PhaseInst"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(28)
  double phaseInst();


  /**
   * <p>
   * Phase instantaneous curve multipler or actual amps
   * </p>
   * <p>
   * Setter method for the COM property "PhaseInst"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(29)
  void phaseInst(
    double value);


  /**
   * <p>
   * Ground (3I0) trip multiplier or actual amps
   * </p>
   * <p>
   * Getter method for the COM property "GroundTrip"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(30)
  double groundTrip();


  /**
   * <p>
   * Ground (3I0) trip multiplier or actual amps
   * </p>
   * <p>
   * Setter method for the COM property "GroundTrip"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(31)
  void groundTrip(
    double value);


  /**
   * <p>
   * Ground (3I0) instantaneous trip setting - curve multipler or actual amps.
   * </p>
   * <p>
   * Getter method for the COM property "GroundInst"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(32)
  double groundInst();


  /**
   * <p>
   * Ground (3I0) instantaneous trip setting - curve multipler or actual amps.
   * </p>
   * <p>
   * Setter method for the COM property "GroundInst"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(33)
  void groundInst(
    double value);


  /**
   * <p>
   * Open recloser's controlled element and lock out the recloser.
   * </p>
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(34)
  void open();


  /**
   * <p>
   * Close the switched object controlled by the recloser. Resets recloser to first operation.
   * </p>
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(35)
  void close();


  /**
   * <p>
   * Get/Set the active Recloser by index into the recloser list.  1..Count
   * </p>
   * <p>
   * Getter method for the COM property "idx"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(36)
  int idx();


  /**
   * <p>
   * Get/Set the active Recloser by index into the recloser list.  1..Count
   * </p>
   * <p>
   * Setter method for the COM property "idx"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(37)
  void idx(
    int value);


  /**
   * <p>
   * Reset recloser to normal state. If open, lock out the recloser. If closed, resets recloser to first operation.  
   * </p>
   */

  @DISPID(220) //= 0xdc. The runtime will prefer the VTID if present
  @VTID(38)
  void reset();


  /**
   * <p>
   * Get normal state of recloser.
   * </p>
   * <p>
   * Getter method for the COM property "NormalState"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.ActionCodes
   */

  @DISPID(221) //= 0xdd. The runtime will prefer the VTID if present
  @VTID(39)
  com.myproject.opendss.ActionCodes normalState();


  /**
   * <p>
   * Get normal state of recloser.
   * </p>
   * <p>
   * Setter method for the COM property "NormalState"
   * </p>
   * @param value Mandatory com.myproject.opendss.ActionCodes parameter.
   */

  @DISPID(221) //= 0xdd. The runtime will prefer the VTID if present
  @VTID(40)
  void normalState(
    com.myproject.opendss.ActionCodes value);


  /**
   * <p>
   * Get/Set present state of recloser. If set to open, open recloser's controlled element and lock out the recloser. If set to close, close recloser's controlled element and resets recloser to first operation.
   * </p>
   * <p>
   * Getter method for the COM property "State"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.ActionCodes
   */

  @DISPID(222) //= 0xde. The runtime will prefer the VTID if present
  @VTID(41)
  com.myproject.opendss.ActionCodes state();


  /**
   * <p>
   * Get/Set present state of recloser. If set to open, open recloser's controlled element and lock out the recloser. If set to close, close recloser's controlled element and resets recloser to first operation.
   * </p>
   * <p>
   * Setter method for the COM property "State"
   * </p>
   * @param value Mandatory com.myproject.opendss.ActionCodes parameter.
   */

  @DISPID(222) //= 0xde. The runtime will prefer the VTID if present
  @VTID(42)
  void state(
    com.myproject.opendss.ActionCodes value);


  // Properties:
}
