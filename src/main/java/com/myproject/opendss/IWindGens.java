package com.myproject.opendss  ;

import com4j.*;

/**
 * Interface for exposing the properties of WindGen objects
 */
@IID("{6DACB971-F9EE-4E4E-B0B9-7C16913BC83A}")
public interface IWindGens extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Variant with the names of all the WindGen elements int he active model
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
   * Variant array containing the names of all the registers within the active windgen obj
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
   * Variant array containing the values for all the registers within the active windgen obj
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
   * Set Next Storage element active; returns 0 if none.
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
   * Returns the number of WindGen objects defined in the active model
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
   * Gearbox ratio (Default 1/90).
   * </p>
   * <p>
   * Getter method for the COM property "Ag"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(13)
  double ag();


  /**
   * <p>
   * Gearbox ratio (Default 1/90).
   * </p>
   * <p>
   * Setter method for the COM property "Ag"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(14)
  void ag(
    double value);


  /**
   * <p>
   * Get/Set Active WindGen element by index:  1.. Count
   * </p>
   * <p>
   * Getter method for the COM property "idx"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(15)
  int idx();


  /**
   * <p>
   * Get/Set Active WindGen element by index:  1.. Count
   * </p>
   * <p>
   * Setter method for the COM property "idx"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(16)
  void idx(
    int value);


  /**
   * <p>
   * Getter method for the COM property "Cp"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(17)
  double cp();


  /**
   * <p>
   * Setter method for the COM property "Cp"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(18)
  void cp(
    double value);


  /**
   * <p>
   * Nominal rated (1.0 per unit) voltage, kV, for WindGen
   * </p>
   * <p>
   * Getter method for the COM property "kV"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(19)
  double kV();


  /**
   * <p>
   * Nominal rated (1.0 per unit) voltage, kV, for WindGen
   * </p>
   * <p>
   * Setter method for the COM property "kV"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(20)
  void kV(
    double value);


  /**
   * <p>
   * kVA rating of electrical machine. Defaults to 1.2* kW if not specified
   * </p>
   * <p>
   * Getter method for the COM property "kva"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(21)
  double kva();


  /**
   * <p>
   * kVA rating of electrical machine. Defaults to 1.2* kW if not specified
   * </p>
   * <p>
   * Setter method for the COM property "kva"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(22)
  void kva(
    double value);


  /**
   * <p>
   * Specify the base kvar.  Alternative to specifying the power factor.
   * </p>
   * <p>
   * Getter method for the COM property "kvar"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(23)
  double kvar();


  /**
   * <p>
   * Specify the base kvar.  Alternative to specifying the power factor.
   * </p>
   * <p>
   * Setter method for the COM property "kvar"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(24)
  void kvar(
    double value);


  /**
   * <p>
   * Total base kW for the WindGen
   * </p>
   * <p>
   * Getter method for the COM property "kW"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(25)
  double kW();


  /**
   * <p>
   * Total base kW for the WindGen
   * </p>
   * <p>
   * Setter method for the COM property "kW"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(26)
  void kW(
    double value);


  /**
   * <p>
   * Tip speed ratio (Default 7.95).
   * </p>
   * <p>
   * Getter method for the COM property "Lamda"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(27)
  double lamda();


  /**
   * <p>
   * Tip speed ratio (Default 7.95).
   * </p>
   * <p>
   * Setter method for the COM property "Lamda"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(28)
  void lamda(
    double value);


  /**
   * <p>
   * Number of WTG in aggregation.
   * </p>
   * <p>
   * Getter method for the COM property "N_WTG"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(29)
  int n_WTG();


  /**
   * <p>
   * Number of WTG in aggregation.
   * </p>
   * <p>
   * Setter method for the COM property "N_WTG"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(30)
  void n_WTG(
    int value);


  /**
   * <p>
   * Number of pole pairs of the induction generator (Default 2).
   * </p>
   * <p>
   * Getter method for the COM property "NPoles"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(31)
  int nPoles();


  /**
   * <p>
   * Number of pole pairs of the induction generator (Default 2).
   * </p>
   * <p>
   * Setter method for the COM property "NPoles"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(32)
  void nPoles(
    int value);


  /**
   * <p>
   * Air density in kg/m3 (Default 1.225).
   * </p>
   * <p>
   * Getter method for the COM property "pd"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(33)
  double pd();


  /**
   * <p>
   * Air density in kg/m3 (Default 1.225).
   * </p>
   * <p>
   * Setter method for the COM property "pd"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(34)
  void pd(
    double value);


  /**
   * <p>
   * WindGen power factor. Default is 0.80.
   * </p>
   * <p>
   * Getter method for the COM property "PF"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(35)
  double pf();


  /**
   * <p>
   * WindGen power factor. Default is 0.80.
   * </p>
   * <p>
   * Setter method for the COM property "PF"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(36)
  void pf(
    double value);


  /**
   * <p>
   * Steady state output real power.
   * </p>
   * <p>
   * Getter method for the COM property "PSS"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(220) //= 0xdc. The runtime will prefer the VTID if present
  @VTID(37)
  double pss();


  /**
   * <p>
   * Steady state output real power.
   * </p>
   * <p>
   * Setter method for the COM property "PSS"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(220) //= 0xdc. The runtime will prefer the VTID if present
  @VTID(38)
  void pss(
    double value);


  /**
   * <p>
   * Getter method for the COM property "QFlag"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(221) //= 0xdd. The runtime will prefer the VTID if present
  @VTID(39)
  int qFlag();


  /**
   * <p>
   * Setter method for the COM property "QFlag"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(221) //= 0xdd. The runtime will prefer the VTID if present
  @VTID(40)
  void qFlag(
    int value);


  /**
   * <p>
   * Q control mode (0:Q, 1:PF, 2:VV).
   * </p>
   * <p>
   * Getter method for the COM property "QMode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(222) //= 0xde. The runtime will prefer the VTID if present
  @VTID(41)
  int qMode();


  /**
   * <p>
   * Q control mode (0:Q, 1:PF, 2:VV).
   * </p>
   * <p>
   * Setter method for the COM property "QMode"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(222) //= 0xde. The runtime will prefer the VTID if present
  @VTID(42)
  void qMode(
    int value);


  /**
   * <p>
   * Steady state output reactive power.
   * </p>
   * <p>
   * Getter method for the COM property "QSS"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(223) //= 0xdf. The runtime will prefer the VTID if present
  @VTID(43)
  double qss();


  /**
   * <p>
   * Steady state output reactive power.
   * </p>
   * <p>
   * Setter method for the COM property "QSS"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(223) //= 0xdf. The runtime will prefer the VTID if present
  @VTID(44)
  void qss(
    double value);


  /**
   * <p>
   * Rotor radius in meters (Default 40).
   * </p>
   * <p>
   * Getter method for the COM property "Rad"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(224) //= 0xe0. The runtime will prefer the VTID if present
  @VTID(45)
  double rad();


  /**
   * <p>
   * Rotor radius in meters (Default 40).
   * </p>
   * <p>
   * Setter method for the COM property "Rad"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(224) //= 0xe0. The runtime will prefer the VTID if present
  @VTID(46)
  void rad(
    double value);


  /**
   * <p>
   * per unit Thevenin equivalent R.
   * </p>
   * <p>
   * Getter method for the COM property "RThev"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(225) //= 0xe1. The runtime will prefer the VTID if present
  @VTID(47)
  double rThev();


  /**
   * <p>
   * per unit Thevenin equivalent R.
   * </p>
   * <p>
   * Setter method for the COM property "RThev"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(225) //= 0xe1. The runtime will prefer the VTID if present
  @VTID(48)
  void rThev(
    double value);


  /**
   * <p>
   * Cut-in speed for the wind generator (m/s - default 5).
   * </p>
   * <p>
   * Getter method for the COM property "VCutIn"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(226) //= 0xe2. The runtime will prefer the VTID if present
  @VTID(49)
  double vCutIn();


  /**
   * <p>
   * Cut-in speed for the wind generator (m/s - default 5).
   * </p>
   * <p>
   * Setter method for the COM property "VCutIn"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(226) //= 0xe2. The runtime will prefer the VTID if present
  @VTID(50)
  void vCutIn(
    double value);


  /**
   * <p>
   * Cut-out speed for the wind generator (m/s - default 23).
   * </p>
   * <p>
   * Getter method for the COM property "VCutOut"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(227) //= 0xe3. The runtime will prefer the VTID if present
  @VTID(51)
  double vCutOut();


  /**
   * <p>
   * Cut-out speed for the wind generator (m/s - default 23).
   * </p>
   * <p>
   * Setter method for the COM property "VCutOut"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(227) //= 0xe3. The runtime will prefer the VTID if present
  @VTID(52)
  void vCutOut(
    double value);


  /**
   * <p>
   * Steady state voltage magnitude.
   * </p>
   * <p>
   * Getter method for the COM property "Vss"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(228) //= 0xe4. The runtime will prefer the VTID if present
  @VTID(53)
  double vss();


  /**
   * <p>
   * Steady state voltage magnitude.
   * </p>
   * <p>
   * Setter method for the COM property "Vss"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(228) //= 0xe4. The runtime will prefer the VTID if present
  @VTID(54)
  void vss(
    double value);


  /**
   * <p>
   * Wind speed in m/s
   * </p>
   * <p>
   * Getter method for the COM property "WindSpeed"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(229) //= 0xe5. The runtime will prefer the VTID if present
  @VTID(55)
  double windSpeed();


  /**
   * <p>
   * Wind speed in m/s
   * </p>
   * <p>
   * Setter method for the COM property "WindSpeed"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(229) //= 0xe5. The runtime will prefer the VTID if present
  @VTID(56)
  void windSpeed(
    double value);


  /**
   * <p>
   * per unit Thevenin equivalent X.
   * </p>
   * <p>
   * Getter method for the COM property "XThev"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(230) //= 0xe6. The runtime will prefer the VTID if present
  @VTID(57)
  double xThev();


  /**
   * <p>
   * per unit Thevenin equivalent X.
   * </p>
   * <p>
   * Setter method for the COM property "XThev"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(230) //= 0xe6. The runtime will prefer the VTID if present
  @VTID(58)
  void xThev(
    double value);


  /**
   * <p>
   * Get/Set the active windgen obj by name
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(59)
  java.lang.String name();


  /**
   * <p>
   * Get/Set the active windgen obj by name
   * </p>
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(60)
  void name(
    java.lang.String value);


  // Properties:
}
