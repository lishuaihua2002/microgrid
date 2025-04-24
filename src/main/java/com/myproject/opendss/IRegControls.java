package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for RegControls
 */
@IID("{3F983AD2-B658-4CE8-B4C1-DE0A9EDD47FD}")
public interface IRegControls extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Variant array of strings containing all RegControl names
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
   * Get/set Active RegControl  name
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
   * Get/set Active RegControl  name
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
   * Sets the first RegControl active. Returns 0 if none.
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
   * Sets the next RegControl active. Returns 0 if none.
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
   * Name of a remote regulated bus, in lieu of LDC settings
   * </p>
   * <p>
   * Getter method for the COM property "MonitoredBus"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String monitoredBus();


  /**
   * <p>
   * Name of a remote regulated bus, in lieu of LDC settings
   * </p>
   * <p>
   * Setter method for the COM property "MonitoredBus"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(13)
  void monitoredBus(
    java.lang.String value);


  /**
   * <p>
   * Name of the transformer this regulator controls
   * </p>
   * <p>
   * Getter method for the COM property "Transformer"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String transformer();


  /**
   * <p>
   * Name of the transformer this regulator controls
   * </p>
   * <p>
   * Setter method for the COM property "Transformer"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(15)
  void transformer(
    java.lang.String value);


  /**
   * <p>
   * Tapped winding number
   * </p>
   * <p>
   * Getter method for the COM property "TapWinding"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(16)
  int tapWinding();


  /**
   * <p>
   * Tapped winding number
   * </p>
   * <p>
   * Setter method for the COM property "TapWinding"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(17)
  void tapWinding(
    int value);


  /**
   * <p>
   * Winding number for PT and CT connections
   * </p>
   * <p>
   * Getter method for the COM property "Winding"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(18)
  int winding();


  /**
   * <p>
   * Winding number for PT and CT connections
   * </p>
   * <p>
   * Setter method for the COM property "Winding"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(19)
  void winding(
    int value);


  /**
   * <p>
   * CT primary ampere rating (secondary is 0.2 amperes)
   * </p>
   * <p>
   * Getter method for the COM property "CTPrimary"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(20)
  double ctPrimary();


  /**
   * <p>
   * CT primary ampere rating (secondary is 0.2 amperes)
   * </p>
   * <p>
   * Setter method for the COM property "CTPrimary"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(21)
  void ctPrimary(
    double value);


  /**
   * <p>
   * PT ratio for voltage control settings
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
   * PT ratio for voltage control settings
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
   * LDC R setting in Volts
   * </p>
   * <p>
   * Getter method for the COM property "ForwardR"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(24)
  double forwardR();


  /**
   * <p>
   * LDC R setting in Volts
   * </p>
   * <p>
   * Setter method for the COM property "ForwardR"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(25)
  void forwardR(
    double value);


  /**
   * <p>
   * LDC X setting in Volts
   * </p>
   * <p>
   * Getter method for the COM property "ForwardX"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(26)
  double forwardX();


  /**
   * <p>
   * LDC X setting in Volts
   * </p>
   * <p>
   * Setter method for the COM property "ForwardX"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(27)
  void forwardX(
    double value);


  /**
   * <p>
   * Reverse LDC R setting in Volts.
   * </p>
   * <p>
   * Getter method for the COM property "ReverseR"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(28)
  double reverseR();


  /**
   * <p>
   * Reverse LDC R setting in Volts.
   * </p>
   * <p>
   * Setter method for the COM property "ReverseR"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(29)
  void reverseR(
    double value);


  /**
   * <p>
   * Reverse LDC X setting in volts.
   * </p>
   * <p>
   * Getter method for the COM property "ReverseX"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(30)
  double reverseX();


  /**
   * <p>
   * Reverse LDC X setting in volts.
   * </p>
   * <p>
   * Setter method for the COM property "ReverseX"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(31)
  void reverseX(
    double value);


  /**
   * <p>
   * Regulator can use different settings in the reverse direction.  Usually not applicable to substation transformers.
   * </p>
   * <p>
   * Getter method for the COM property "IsReversible"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(32)
  boolean isReversible();


  /**
   * <p>
   * Regulator can use different settings in the reverse direction.  Usually not applicable to substation transformers.
   * </p>
   * <p>
   * Setter method for the COM property "IsReversible"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(33)
  void isReversible(
    boolean value);


  /**
   * <p>
   * Time delay is inversely adjusted, proportional to the amount of voltage outside the regulating band.
   * </p>
   * <p>
   * Getter method for the COM property "IsInverseTime"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(34)
  boolean isInverseTime();


  /**
   * <p>
   * Time delay is inversely adjusted, proportional to the amount of voltage outside the regulating band.
   * </p>
   * <p>
   * Setter method for the COM property "IsInverseTime"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(35)
  void isInverseTime(
    boolean value);


  /**
   * <p>
   * Time delay [s] after arming before the first tap change. Control may reset before actually changing taps.
   * </p>
   * <p>
   * Getter method for the COM property "Delay"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(36)
  double delay();


  /**
   * <p>
   * Time delay [s] after arming before the first tap change. Control may reset before actually changing taps.
   * </p>
   * <p>
   * Setter method for the COM property "Delay"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(37)
  void delay(
    double value);


  /**
   * <p>
   * Time delay [s] for subsequent tap changes in a set. Control may reset before actually changing taps.
   * </p>
   * <p>
   * Getter method for the COM property "TapDelay"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(38)
  double tapDelay();


  /**
   * <p>
   * Time delay [s] for subsequent tap changes in a set. Control may reset before actually changing taps.
   * </p>
   * <p>
   * Setter method for the COM property "TapDelay"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(39)
  void tapDelay(
    double value);


  /**
   * <p>
   * Maximum tap change per iteration in STATIC solution mode. 1 is more realistic, 16 is the default for a faster soluiton.
   * </p>
   * <p>
   * Getter method for the COM property "MaxTapChange"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(40)
  int maxTapChange();


  /**
   * <p>
   * Maximum tap change per iteration in STATIC solution mode. 1 is more realistic, 16 is the default for a faster soluiton.
   * </p>
   * <p>
   * Setter method for the COM property "MaxTapChange"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(41)
  void maxTapChange(
    int value);


  /**
   * <p>
   * First house voltage limit on PT secondary base.  Setting to 0 disables this function.
   * </p>
   * <p>
   * Getter method for the COM property "VoltageLimit"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(220) //= 0xdc. The runtime will prefer the VTID if present
  @VTID(42)
  double voltageLimit();


  /**
   * <p>
   * First house voltage limit on PT secondary base.  Setting to 0 disables this function.
   * </p>
   * <p>
   * Setter method for the COM property "VoltageLimit"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(220) //= 0xdc. The runtime will prefer the VTID if present
  @VTID(43)
  void voltageLimit(
    double value);


  /**
   * <p>
   * Regulation bandwidth in forward direciton, centered on Vreg
   * </p>
   * <p>
   * Getter method for the COM property "ForwardBand"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(221) //= 0xdd. The runtime will prefer the VTID if present
  @VTID(44)
  double forwardBand();


  /**
   * <p>
   * Regulation bandwidth in forward direciton, centered on Vreg
   * </p>
   * <p>
   * Setter method for the COM property "ForwardBand"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(221) //= 0xdd. The runtime will prefer the VTID if present
  @VTID(45)
  void forwardBand(
    double value);


  /**
   * <p>
   * Target voltage in the forward direction, on PT secondary base.
   * </p>
   * <p>
   * Getter method for the COM property "ForwardVreg"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(222) //= 0xde. The runtime will prefer the VTID if present
  @VTID(46)
  double forwardVreg();


  /**
   * <p>
   * Target voltage in the forward direction, on PT secondary base.
   * </p>
   * <p>
   * Setter method for the COM property "ForwardVreg"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(222) //= 0xde. The runtime will prefer the VTID if present
  @VTID(47)
  void forwardVreg(
    double value);


  /**
   * <p>
   * Bandwidth in reverse direction, centered on reverse Vreg.
   * </p>
   * <p>
   * Getter method for the COM property "ReverseBand"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(223) //= 0xdf. The runtime will prefer the VTID if present
  @VTID(48)
  double reverseBand();


  /**
   * <p>
   * Bandwidth in reverse direction, centered on reverse Vreg.
   * </p>
   * <p>
   * Setter method for the COM property "ReverseBand"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(223) //= 0xdf. The runtime will prefer the VTID if present
  @VTID(49)
  void reverseBand(
    double value);


  /**
   * <p>
   * Target voltage in the revese direction, on PT secondary base.
   * </p>
   * <p>
   * Getter method for the COM property "ReverseVreg"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(224) //= 0xe0. The runtime will prefer the VTID if present
  @VTID(50)
  double reverseVreg();


  /**
   * <p>
   * Target voltage in the revese direction, on PT secondary base.
   * </p>
   * <p>
   * Setter method for the COM property "ReverseVreg"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(224) //= 0xe0. The runtime will prefer the VTID if present
  @VTID(51)
  void reverseVreg(
    double value);


  /**
   * <p>
   * Number of RegControl objects in Active Circuit
   * </p>
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(225) //= 0xe1. The runtime will prefer the VTID if present
  @VTID(52)
  int count();


  /**
   * <p>
   * Getter method for the COM property "TapNumber"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(226) //= 0xe2. The runtime will prefer the VTID if present
  @VTID(53)
  int tapNumber();


  /**
   * <p>
   * Setter method for the COM property "TapNumber"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(226) //= 0xe2. The runtime will prefer the VTID if present
  @VTID(54)
  void tapNumber(
    int value);


  /**
   * <p>
   * Force Reset of this RegControl element
   * </p>
   */

  @DISPID(227) //= 0xe3. The runtime will prefer the VTID if present
  @VTID(55)
  void reset();


  // Properties:
}
