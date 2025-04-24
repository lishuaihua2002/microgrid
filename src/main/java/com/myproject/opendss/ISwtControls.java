package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for SwtControls
 */
@IID("{112AB9E6-C112-46BE-A8A3-F72C5FA3A657}")
public interface ISwtControls extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Variant array of strings with all SwtControl names in the active circuit.
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
   * Sets a SwtControl active by Name.
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String name();


  /**
   * <p>
   * Sets a SwtControl active by Name.
   * </p>
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(9)
  void name(
    java.lang.String value);


  /**
   * <p>
   * Sets the first SwtControl active. Returns 0 if no more.
   * </p>
   * <p>
   * Getter method for the COM property "First"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(10)
  int first();


  /**
   * <p>
   * Sets the next SwtControl active. Returns 0 if no more.
   * </p>
   * <p>
   * Getter method for the COM property "Next"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(11)
  int next();


  /**
   * <p>
   * Open or Close the switch. No effect if switch is locked.  However, Reset removes any lock and then closes the switch (shelf state).
   * </p>
   * <p>
   * Getter method for the COM property "Action"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.ActionCodes
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(12)
  com.myproject.opendss.ActionCodes action();


  /**
   * <p>
   * Open or Close the switch. No effect if switch is locked.  However, Reset removes any lock and then closes the switch (shelf state).
   * </p>
   * <p>
   * Setter method for the COM property "Action"
   * </p>
   * @param value Mandatory com.myproject.opendss.ActionCodes parameter.
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(13)
  void action(
    com.myproject.opendss.ActionCodes value);


  /**
   * <p>
   * The lock prevents both manual and automatic switch operation.
   * </p>
   * <p>
   * Getter method for the COM property "IsLocked"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(14)
  boolean isLocked();


  /**
   * <p>
   * The lock prevents both manual and automatic switch operation.
   * </p>
   * <p>
   * Setter method for the COM property "IsLocked"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(15)
  void isLocked(
    boolean value);


  /**
   * <p>
   * Time delay [s] betwen arming and opening or closing the switch.  Control may reset before actually operating the switch.
   * </p>
   * <p>
   * Getter method for the COM property "Delay"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(16)
  double delay();


  /**
   * <p>
   * Time delay [s] betwen arming and opening or closing the switch.  Control may reset before actually operating the switch.
   * </p>
   * <p>
   * Setter method for the COM property "Delay"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(17)
  void delay(
    double value);


  /**
   * <p>
   * Full name of the switched element.
   * </p>
   * <p>
   * Getter method for the COM property "SwitchedObj"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String switchedObj();


  /**
   * <p>
   * Full name of the switched element.
   * </p>
   * <p>
   * Setter method for the COM property "SwitchedObj"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(19)
  void switchedObj(
    java.lang.String value);


  /**
   * <p>
   * Terminal number where the switch is located on the SwitchedObj
   * </p>
   * <p>
   * Getter method for the COM property "SwitchedTerm"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(20)
  int switchedTerm();


  /**
   * <p>
   * Terminal number where the switch is located on the SwitchedObj
   * </p>
   * <p>
   * Setter method for the COM property "SwitchedTerm"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(21)
  void switchedTerm(
    int value);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(22)
  int count();


  /**
   * <p>
   * Get Normal state of switch
   * </p>
   * <p>
   * Getter method for the COM property "NormalState"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.ActionCodes
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(23)
  com.myproject.opendss.ActionCodes normalState();


  /**
   * <p>
   * Get Normal state of switch
   * </p>
   * <p>
   * Setter method for the COM property "NormalState"
   * </p>
   * @param value Mandatory com.myproject.opendss.ActionCodes parameter.
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(24)
  void normalState(
    com.myproject.opendss.ActionCodes value);


  /**
   * <p>
   * Force switch to specified state
   * </p>
   * <p>
   * Getter method for the COM property "State"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.ActionCodes
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(25)
  com.myproject.opendss.ActionCodes state();


  /**
   * <p>
   * Force switch to specified state
   * </p>
   * <p>
   * Setter method for the COM property "State"
   * </p>
   * @param value Mandatory com.myproject.opendss.ActionCodes parameter.
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(26)
  void state(
    com.myproject.opendss.ActionCodes value);


  /**
   * <p>
   * Force a reset of this switch to NormalState, unlocked. Unlocks switch and calls Reset function.
   * </p>
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(27)
  void reset();


  // Properties:
}
