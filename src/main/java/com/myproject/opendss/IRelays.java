package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for Relays Object
 */
@IID("{76956697-6055-4E8E-B4D6-650805D3F90D}")
public interface IRelays extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Variant array of strings containing names of all Relay elements
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
   * Number of Relays in circuit
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
   * Set First Relay active. If none, returns 0.
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
   * Advance to next Relay object. Returns 0 when no more relays.
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
   * Get name of active relay.
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
   * Get name of active relay.
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
   * Full name of object this Relay is monitoring.
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
   * Full name of object this Relay is monitoring.
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
   * Number of terminal of monitored element that this Relay is monitoring.
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
   * Number of terminal of monitored element that this Relay is monitoring.
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
   * Full name of element that will be switched when relay trips.
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
   * Full name of element that will be switched when relay trips.
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
   * Getter method for the COM property "SwitchedTerm"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(19)
  int switchedTerm();


  /**
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
   * Get/Set active Relay by index into the Relay list. 1..Count
   * </p>
   * <p>
   * Getter method for the COM property "idx"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(21)
  int idx();


  /**
   * <p>
   * Get/Set active Relay by index into the Relay list. 1..Count
   * </p>
   * <p>
   * Setter method for the COM property "idx"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(22)
  void idx(
    int value);


  /**
   * <p>
   * Open relay's controlled element and lock out the relay.
   * </p>
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(23)
  void open();


  /**
   * <p>
   * Close the switched object controlled by the relay. Resets relay to first operation.
   * </p>
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(24)
  void close();


  /**
   * <p>
   * Reset relay to normal state. If open, lock out the relay. If closed, resets relay to first operation.  
   * </p>
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(25)
  void reset();


  /**
   * <p>
   * Get/Set present state of relay. If set to open, open relay's controlled element and lock out the relay. If set to close, close relay's controlled element and resets relay to first operation.
   * </p>
   * <p>
   * Getter method for the COM property "State"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.ActionCodes
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(26)
  com.myproject.opendss.ActionCodes state();


  /**
   * <p>
   * Get/Set present state of relay. If set to open, open relay's controlled element and lock out the relay. If set to close, close relay's controlled element and resets relay to first operation.
   * </p>
   * <p>
   * Setter method for the COM property "State"
   * </p>
   * @param value Mandatory com.myproject.opendss.ActionCodes parameter.
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(27)
  void state(
    com.myproject.opendss.ActionCodes value);


  /**
   * <p>
   * Get normal state of relay.
   * </p>
   * <p>
   * Getter method for the COM property "NormalState"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.ActionCodes
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(28)
  com.myproject.opendss.ActionCodes normalState();


  /**
   * <p>
   * Get normal state of relay.
   * </p>
   * <p>
   * Setter method for the COM property "NormalState"
   * </p>
   * @param value Mandatory com.myproject.opendss.ActionCodes parameter.
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(29)
  void normalState(
    com.myproject.opendss.ActionCodes value);


  // Properties:
}
