package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for Storages Object
 */
@IID("{36049833-30B6-415A-992A-63CDD6CAE432}")
public interface IStorages extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Vairant array of strings with all Storage element names
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
   * Variant Array of Storage element energy meter register names
   * </p>
   * <p>
   * Getter method for the COM property "RegisterNames"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object registerNames();


  /**
   * <p>
   * Variant array of doubles containing values in Storage Elementregisters.
   * </p>
   * <p>
   * Getter method for the COM property "RegisterValues"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object registerValues();


  /**
   * <p>
   * Set first Storage element active; returns 0 if none.
   * </p>
   * <p>
   * Getter method for the COM property "First"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(10)
  int first();


  /**
   * <p>
   * Sets next Storageelement active; returns 0 if no more.
   * </p>
   * <p>
   * Getter method for the COM property "Next"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(11)
  int next();


  /**
   * <p>
   * Number of Storage Elements
   * </p>
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(12)
  int count();


  /**
   * <p>
   * Get/Set Active Storage element by index:  1.. Count
   * </p>
   * <p>
   * Getter method for the COM property "idx"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(13)
  int idx();


  /**
   * <p>
   * Get/Set Active Storage element by index:  1.. Count
   * </p>
   * <p>
   * Setter method for the COM property "idx"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(14)
  void idx(
    int value);


  /**
   * <p>
   * Name of active Storage element
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String name();


  /**
   * <p>
   * Name of active Storage element
   * </p>
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(16)
  void name(
    java.lang.String value);


  /**
   * <p>
   * Get/set state: 0=Idling; 1=Discharging; -1=Charging;
   * </p>
   * <p>
   * Getter method for the COM property "State"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(17)
  int state();


  /**
   * <p>
   * Get/set state: 0=Idling; 1=Discharging; -1=Charging;
   * </p>
   * <p>
   * Setter method for the COM property "State"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(18)
  void state(
    int value);


  /**
   * <p>
   * Per unit state of charge
   * </p>
   * <p>
   * Getter method for the COM property "puSOC"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(19)
  double puSOC();


  /**
   * <p>
   * Per unit state of charge
   * </p>
   * <p>
   * Setter method for the COM property "puSOC"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(20)
  void puSOC(
    double value);


  /**
   * <p>
   * Percentage efficiency for CHARGING the Storage element. Default = 90.
   * </p>
   * <p>
   * Getter method for the COM property "EffCharge"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(21)
  double effCharge();


  /**
   * <p>
   * Percentage efficiency for CHARGING the Storage element. Default = 90.
   * </p>
   * <p>
   * Setter method for the COM property "EffCharge"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(22)
  void effCharge(
    double value);


  /**
   * <p>
   * Percentage efficiency for DISCHARGING the Storage element. Default = 90.
   * </p>
   * <p>
   * Getter method for the COM property "EffDischarge"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(23)
  double effDischarge();


  /**
   * <p>
   * Percentage efficiency for DISCHARGING the Storage element. Default = 90.
   * </p>
   * <p>
   * Setter method for the COM property "EffDischarge"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(24)
  void effDischarge(
    double value);


  /**
   * <p>
   * kW rating of power output. Base for Loadshapes when DispMode=Follow. Sets kVA property if it has not been specified yet. Defaults to 25.
   * </p>
   * <p>
   * Getter method for the COM property "kWRated"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(25)
  double kWRated();


  /**
   * <p>
   * kW rating of power output. Base for Loadshapes when DispMode=Follow. Sets kVA property if it has not been specified yet. Defaults to 25.
   * </p>
   * <p>
   * Setter method for the COM property "kWRated"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(26)
  void kWRated(
    double value);


  /**
   * <p>
   * Defines the control mode for the inverter. It can be one of {GFM = 1| GFL* = 0}.
   * </p>
   * <p>
   * Getter method for the COM property "ControlMode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(27)
  int controlMode();


  /**
   * <p>
   * Defines the control mode for the inverter. It can be one of {GFM = 1| GFL* = 0}.
   * </p>
   * <p>
   * Setter method for the COM property "ControlMode"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(28)
  void controlMode(
    int value);


  /**
   * <p>
   * It is the proportional gain for the PI controller within the inverter. Use it to modify the controller response in dynamics simulation mode.
   * </p>
   * <p>
   * Getter method for the COM property "Kp"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(29)
  double kp();


  /**
   * <p>
   * It is the proportional gain for the PI controller within the inverter. Use it to modify the controller response in dynamics simulation mode.
   * </p>
   * <p>
   * Setter method for the COM property "Kp"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(30)
  void kp(
    double value);


  /**
   * <p>
   * Nominal rated (1.0 per unit) voltage, kV, for Storage element. 
   * </p>
   * <p>
   * Getter method for the COM property "kV"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(31)
  double kV();


  /**
   * <p>
   * Nominal rated (1.0 per unit) voltage, kV, for Storage element. 
   * </p>
   * <p>
   * Setter method for the COM property "kV"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(32)
  void kV(
    double value);


  /**
   * <p>
   * Indicates the inverter nameplate capability (in kVA). Used as the base for Dynamics mode and Harmonics mode values.
   * </p>
   * <p>
   * Getter method for the COM property "kva"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(33)
  double kva();


  /**
   * <p>
   * Indicates the inverter nameplate capability (in kVA). Used as the base for Dynamics mode and Harmonics mode values.
   * </p>
   * <p>
   * Setter method for the COM property "kva"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(34)
  void kva(
    double value);


  /**
   * <p>
   * Get/set the requested kvar value. Final kvar is subjected to the inverter ratings. Sets inverter to operate in constant kvar mode.
   * </p>
   * <p>
   * Getter method for the COM property "kvar"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(35)
  double kvar();


  /**
   * <p>
   * Get/set the requested kvar value. Final kvar is subjected to the inverter ratings. Sets inverter to operate in constant kvar mode.
   * </p>
   * <p>
   * Setter method for the COM property "kvar"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(36)
  void kvar(
    double value);


  /**
   * <p>
   * Rated Storage capacity in kWh. Default is 50.
   * </p>
   * <p>
   * Getter method for the COM property "kWhRated"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(37)
  double kWhRated();


  /**
   * <p>
   * Rated Storage capacity in kWh. Default is 50.
   * </p>
   * <p>
   * Setter method for the COM property "kWhRated"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(38)
  void kWhRated(
    double value);


  /**
   * <p>
   * Limits current magnitude to Vminpu value for both 1-phase and 3-phase Storage similar to Generator Model 7. For 3-phase, limits the positive-sequence current but not the negative-sequence.
   * </p>
   * <p>
   * Getter method for the COM property "LimitCurrent"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(220) //= 0xdc. The runtime will prefer the VTID if present
  @VTID(39)
  double limitCurrent();


  /**
   * <p>
   * Limits current magnitude to Vminpu value for both 1-phase and 3-phase Storage similar to Generator Model 7. For 3-phase, limits the positive-sequence current but not the negative-sequence.
   * </p>
   * <p>
   * Setter method for the COM property "LimitCurrent"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(220) //= 0xdc. The runtime will prefer the VTID if present
  @VTID(40)
  void limitCurrent(
    double value);


  /**
   * <p>
   * Get/set the requested PF value. 
   * </p>
   * <p>
   * Getter method for the COM property "PF"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(221) //= 0xdd. The runtime will prefer the VTID if present
  @VTID(41)
  double pf();


  /**
   * <p>
   * Get/set the requested PF value. 
   * </p>
   * <p>
   * Setter method for the COM property "PF"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(221) //= 0xdd. The runtime will prefer the VTID if present
  @VTID(42)
  void pf(
    double value);


  /**
   * <p>
   * (Read only) Indicates whether the inverter entered (Yes) or not (No) into Safe Mode.
   * </p>
   * <p>
   * Getter method for the COM property "SafeMode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(222) //= 0xde. The runtime will prefer the VTID if present
  @VTID(43)
  int safeMode();


  /**
   * <p>
   * Indicates the voltage level (%) respect to the base voltage level for which the Inverter will operate.
   * </p>
   * <p>
   * Getter method for the COM property "SafeVoltage"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(223) //= 0xdf. The runtime will prefer the VTID if present
  @VTID(44)
  double safeVoltage();


  /**
   * <p>
   * Indicates the voltage level (%) respect to the base voltage level for which the Inverter will operate.
   * </p>
   * <p>
   * Setter method for the COM property "SafeVoltage"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(223) //= 0xdf. The runtime will prefer the VTID if present
  @VTID(45)
  void safeVoltage(
    double value);


  /**
   * <p>
   * Getter method for the COM property "AmpLimit"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(224) //= 0xe0. The runtime will prefer the VTID if present
  @VTID(46)
  double ampLimit();


  /**
   * <p>
   * Setter method for the COM property "AmpLimit"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(224) //= 0xe0. The runtime will prefer the VTID if present
  @VTID(47)
  void ampLimit(
    double value);


  /**
   * <p>
   * Use it for fine tuning the current limiter when active, by default is 0.8, 
   * </p>
   * <p>
   * Getter method for the COM property "AmpLimitGain"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(225) //= 0xe1. The runtime will prefer the VTID if present
  @VTID(48)
  double ampLimitGain();


  /**
   * <p>
   * Use it for fine tuning the current limiter when active, by default is 0.8, 
   * </p>
   * <p>
   * Setter method for the COM property "AmpLimitGain"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(225) //= 0xe1. The runtime will prefer the VTID if present
  @VTID(49)
  void ampLimitGain(
    double value);


  /**
   * <p>
   * Indicates the rated voltage (kV) at the input of the inverter while the storage is discharging.
   * </p>
   * <p>
   * Getter method for the COM property "kVDC"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(226) //= 0xe2. The runtime will prefer the VTID if present
  @VTID(50)
  double kVDC();


  /**
   * <p>
   * Indicates the rated voltage (kV) at the input of the inverter while the storage is discharging.
   * </p>
   * <p>
   * Setter method for the COM property "kVDC"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(226) //= 0xe2. The runtime will prefer the VTID if present
  @VTID(51)
  void kVDC(
    double value);


  /**
   * <p>
   * Get/set the requested kW value. Final kW is subjected to the inverter ratings.
   * </p>
   * <p>
   * Getter method for the COM property "kW"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(227) //= 0xe3. The runtime will prefer the VTID if present
  @VTID(52)
  double kW();


  /**
   * <p>
   * Get/set the requested kW value. Final kW is subjected to the inverter ratings.
   * </p>
   * <p>
   * Setter method for the COM property "kW"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(227) //= 0xe3. The runtime will prefer the VTID if present
  @VTID(53)
  void kW(
    double value);


  /**
   * <p>
   * It is the tolerance (%) for the closed loop controller of the inverter.
   * </p>
   * <p>
   * Getter method for the COM property "PITol"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(228) //= 0xe4. The runtime will prefer the VTID if present
  @VTID(54)
  double piTol();


  /**
   * <p>
   * It is the tolerance (%) for the closed loop controller of the inverter.
   * </p>
   * <p>
   * Setter method for the COM property "PITol"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(228) //= 0xe4. The runtime will prefer the VTID if present
  @VTID(55)
  void piTol(
    double value);


  /**
   * <p>
   * Dispatch trigger value for charging the Storage. 
   * </p>
   * <p>
   * Getter method for the COM property "ChargeTrigger"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(229) //= 0xe5. The runtime will prefer the VTID if present
  @VTID(56)
  double chargeTrigger();


  /**
   * <p>
   * Dispatch trigger value for charging the Storage. 
   * </p>
   * <p>
   * Setter method for the COM property "ChargeTrigger"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(229) //= 0xe5. The runtime will prefer the VTID if present
  @VTID(57)
  void chargeTrigger(
    double value);


  /**
   * <p>
   * Dispatch trigger value for discharging the Storage. 
   * </p>
   * <p>
   * Getter method for the COM property "DischargeTrigger"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(230) //= 0xe6. The runtime will prefer the VTID if present
  @VTID(58)
  double dischargeTrigger();


  /**
   * <p>
   * Dispatch trigger value for discharging the Storage. 
   * </p>
   * <p>
   * Setter method for the COM property "DischargeTrigger"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(230) //= 0xe6. The runtime will prefer the VTID if present
  @VTID(59)
  void dischargeTrigger(
    double value);


  /**
   * <p>
   * Time of day in fractional hours (0230 = 2.5) at which Storage element will automatically go into charge state. Default is 2.0. 
   * </p>
   * <p>
   * Getter method for the COM property "TimeChargeTrig"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(231) //= 0xe7. The runtime will prefer the VTID if present
  @VTID(60)
  double timeChargeTrig();


  /**
   * <p>
   * Time of day in fractional hours (0230 = 2.5) at which Storage element will automatically go into charge state. Default is 2.0. 
   * </p>
   * <p>
   * Setter method for the COM property "TimeChargeTrig"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(231) //= 0xe7. The runtime will prefer the VTID if present
  @VTID(61)
  void timeChargeTrig(
    double value);


  /**
   * <p>
   * Boolean variable (Yes|No) or (True|False). Defaults to False, which indicates that the reactive power generation/absorption does not respect the inverter status.
   * </p>
   * <p>
   * Getter method for the COM property "VarFollowInverter"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(232) //= 0xe8. The runtime will prefer the VTID if present
  @VTID(62)
  int varFollowInverter();


  /**
   * <p>
   * Boolean variable (Yes|No) or (True|False). Defaults to False, which indicates that the reactive power generation/absorption does not respect the inverter status.
   * </p>
   * <p>
   * Setter method for the COM property "VarFollowInverter"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(232) //= 0xe8. The runtime will prefer the VTID if present
  @VTID(63)
  void varFollowInverter(
    int value);


  // Properties:
}
