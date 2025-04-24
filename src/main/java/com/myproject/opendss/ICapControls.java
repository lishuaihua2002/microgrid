package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for CapControls
 */
@IID("{4C132096-4161-4D9B-A701-E6CCCFF1D5AE}")
public interface ICapControls extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Variant array of strings with all CapControl names.
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
   * Sets a CapControl active by name.
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
   * Sets a CapControl active by name.
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
   * Sets the first CapControl as active. Return 0 if none.
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
   * Gets the next CapControl in the circut. Returns 0 if none.
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
   * Type of automatic controller.
   * </p>
   * <p>
   * Getter method for the COM property "Mode"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.CapControlModes
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(12)
  com.myproject.opendss.CapControlModes mode();


  /**
   * <p>
   * Type of automatic controller.
   * </p>
   * <p>
   * Setter method for the COM property "Mode"
   * </p>
   * @param value Mandatory com.myproject.opendss.CapControlModes parameter.
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(13)
  void mode(
    com.myproject.opendss.CapControlModes value);


  /**
   * <p>
   * Name of the Capacitor that is controlled.
   * </p>
   * <p>
   * Getter method for the COM property "Capacitor"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String capacitor();


  /**
   * <p>
   * Name of the Capacitor that is controlled.
   * </p>
   * <p>
   * Setter method for the COM property "Capacitor"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(15)
  void capacitor(
    java.lang.String value);


  /**
   * <p>
   * Full name of the element that PT and CT are connected to.
   * </p>
   * <p>
   * Getter method for the COM property "MonitoredObj"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String monitoredObj();


  /**
   * <p>
   * Full name of the element that PT and CT are connected to.
   * </p>
   * <p>
   * Setter method for the COM property "MonitoredObj"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(17)
  void monitoredObj(
    java.lang.String value);


  /**
   * <p>
   * Terminal number on the element that PT and CT are connected to.
   * </p>
   * <p>
   * Getter method for the COM property "MonitoredTerm"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(18)
  int monitoredTerm();


  /**
   * <p>
   * Terminal number on the element that PT and CT are connected to.
   * </p>
   * <p>
   * Setter method for the COM property "MonitoredTerm"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(19)
  void monitoredTerm(
    int value);


  /**
   * <p>
   * Transducer ratio from pirmary current to control current.
   * </p>
   * <p>
   * Getter method for the COM property "CTratio"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(20)
  double cTratio();


  /**
   * <p>
   * Transducer ratio from pirmary current to control current.
   * </p>
   * <p>
   * Setter method for the COM property "CTratio"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(21)
  void cTratio(
    double value);


  /**
   * <p>
   * Transducer ratio from primary feeder to control voltage.
   * </p>
   * <p>
   * Getter method for the COM property "PTratio"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(22)
  double pTratio();


  /**
   * <p>
   * Transducer ratio from primary feeder to control voltage.
   * </p>
   * <p>
   * Setter method for the COM property "PTratio"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(23)
  void pTratio(
    double value);


  /**
   * <p>
   * Threshold to arm or switch on a step.  See Mode for units.
   * </p>
   * <p>
   * Getter method for the COM property "ONSetting"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(24)
  double onSetting();


  /**
   * <p>
   * Threshold to arm or switch on a step.  See Mode for units.
   * </p>
   * <p>
   * Setter method for the COM property "ONSetting"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(25)
  void onSetting(
    double value);


  /**
   * <p>
   * Threshold to switch off a step. See Mode for units.
   * </p>
   * <p>
   * Getter method for the COM property "OFFSetting"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(26)
  double offSetting();


  /**
   * <p>
   * Threshold to switch off a step. See Mode for units.
   * </p>
   * <p>
   * Setter method for the COM property "OFFSetting"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(27)
  void offSetting(
    double value);


  /**
   * <p>
   * With VoltOverride, swtich off whenever PT voltage exceeds this level.
   * </p>
   * <p>
   * Getter method for the COM property "Vmax"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(28)
  double vmax();


  /**
   * <p>
   * With VoltOverride, swtich off whenever PT voltage exceeds this level.
   * </p>
   * <p>
   * Setter method for the COM property "Vmax"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(29)
  void vmax(
    double value);


  /**
   * <p>
   * With VoltOverride, switch ON whenever PT voltage drops below this level.
   * </p>
   * <p>
   * Getter method for the COM property "Vmin"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(30)
  double vmin();


  /**
   * <p>
   * With VoltOverride, switch ON whenever PT voltage drops below this level.
   * </p>
   * <p>
   * Setter method for the COM property "Vmin"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(31)
  void vmin(
    double value);


  /**
   * <p>
   * Enables Vmin and Vmax to override the control Mode
   * </p>
   * <p>
   * Getter method for the COM property "UseVoltOverride"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(32)
  boolean useVoltOverride();


  /**
   * <p>
   * Enables Vmin and Vmax to override the control Mode
   * </p>
   * <p>
   * Setter method for the COM property "UseVoltOverride"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(33)
  void useVoltOverride(
    boolean value);


  /**
   * <p>
   * Time delay [s] to switch on after arming.  Control may reset before actually switching.
   * </p>
   * <p>
   * Getter method for the COM property "Delay"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(34)
  double delay();


  /**
   * <p>
   * Time delay [s] to switch on after arming.  Control may reset before actually switching.
   * </p>
   * <p>
   * Setter method for the COM property "Delay"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(35)
  void delay(
    double value);


  /**
   * <p>
   * Time delay [s] before swithcing off a step. Control may reset before actually switching.
   * </p>
   * <p>
   * Getter method for the COM property "DelayOff"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(36)
  double delayOff();


  /**
   * <p>
   * Time delay [s] before swithcing off a step. Control may reset before actually switching.
   * </p>
   * <p>
   * Setter method for the COM property "DelayOff"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(37)
  void delayOff(
    double value);


  /**
   * <p>
   * Getter method for the COM property "DeadTime"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(38)
  double deadTime();


  /**
   * <p>
   * Setter method for the COM property "DeadTime"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(39)
  void deadTime(
    double value);


  /**
   * <p>
   * Number of CapControls in Active Circuit
   * </p>
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(40)
  int count();


  /**
   * <p>
   * Force a Reset of this CapControl
   * </p>
   */

  @DISPID(220) //= 0xdc. The runtime will prefer the VTID if present
  @VTID(41)
  void reset();


  // Properties:
}
