package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for Transformers
 */
@IID("{94E9CACF-A548-4DC2-B460-E2642B501387}")
public interface ITransformers extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Number of windings on this transformer. Allocates memory; set or change this property first.
   * </p>
   * <p>
   * Getter method for the COM property "NumWindings"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  int numWindings();


  /**
   * <p>
   * Number of windings on this transformer. Allocates memory; set or change this property first.
   * </p>
   * <p>
   * Setter method for the COM property "NumWindings"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(8)
  void numWindings(
    int value);


  /**
   * <p>
   * Name of an XfrmCode that supplies electircal parameters for this Transformer.
   * </p>
   * <p>
   * Getter method for the COM property "XfmrCode"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String xfmrCode();


  /**
   * <p>
   * Name of an XfrmCode that supplies electircal parameters for this Transformer.
   * </p>
   * <p>
   * Setter method for the COM property "XfmrCode"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(10)
  void xfmrCode(
    java.lang.String value);


  /**
   * <p>
   * Active Winding Number from 1..NumWindings. Update this before reading or setting a sequence of winding properties (R, Tap, kV, kVA, etc.)
   * </p>
   * <p>
   * Getter method for the COM property "Wdg"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(11)
  int wdg();


  /**
   * <p>
   * Active Winding Number from 1..NumWindings. Update this before reading or setting a sequence of winding properties (R, Tap, kV, kVA, etc.)
   * </p>
   * <p>
   * Setter method for the COM property "Wdg"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(12)
  void wdg(
    int value);


  /**
   * <p>
   * Active Winding resistance in %
   * </p>
   * <p>
   * Getter method for the COM property "R"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(13)
  double r();


  /**
   * <p>
   * Active Winding resistance in %
   * </p>
   * <p>
   * Setter method for the COM property "R"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(14)
  void r(
    double value);


  /**
   * <p>
   * Active Winding tap in per-unit.
   * </p>
   * <p>
   * Getter method for the COM property "Tap"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(15)
  double tap();


  /**
   * <p>
   * Active Winding tap in per-unit.
   * </p>
   * <p>
   * Setter method for the COM property "Tap"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(16)
  void tap(
    double value);


  /**
   * <p>
   * Active Winding minimum tap in per-unit.
   * </p>
   * <p>
   * Getter method for the COM property "MinTap"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(17)
  double minTap();


  /**
   * <p>
   * Active Winding minimum tap in per-unit.
   * </p>
   * <p>
   * Setter method for the COM property "MinTap"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(18)
  void minTap(
    double value);


  /**
   * <p>
   * Active Winding maximum tap in per-unit.
   * </p>
   * <p>
   * Getter method for the COM property "MaxTap"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(19)
  double maxTap();


  /**
   * <p>
   * Active Winding maximum tap in per-unit.
   * </p>
   * <p>
   * Setter method for the COM property "MaxTap"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(20)
  void maxTap(
    double value);


  /**
   * <p>
   * Active Winding number of tap steps betwein MinTap and MaxTap.
   * </p>
   * <p>
   * Getter method for the COM property "NumTaps"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(21)
  int numTaps();


  /**
   * <p>
   * Active Winding number of tap steps betwein MinTap and MaxTap.
   * </p>
   * <p>
   * Setter method for the COM property "NumTaps"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(22)
  void numTaps(
    int value);


  /**
   * <p>
   * Active Winding kV rating.  Phase-phase for 2 or 3 phases, actual winding kV for 1 phase transformer.
   * </p>
   * <p>
   * Getter method for the COM property "kV"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(23)
  double kV();


  /**
   * <p>
   * Active Winding kV rating.  Phase-phase for 2 or 3 phases, actual winding kV for 1 phase transformer.
   * </p>
   * <p>
   * Setter method for the COM property "kV"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(24)
  void kV(
    double value);


  /**
   * <p>
   * Active Winding kVA rating. On winding 1, this also determines normal and emergency current ratings for all windings.
   * </p>
   * <p>
   * Getter method for the COM property "kva"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(25)
  double kva();


  /**
   * <p>
   * Active Winding kVA rating. On winding 1, this also determines normal and emergency current ratings for all windings.
   * </p>
   * <p>
   * Setter method for the COM property "kva"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(26)
  void kva(
    double value);


  /**
   * <p>
   * Active Winding neutral reactance [ohms] for wye connections.
   * </p>
   * <p>
   * Getter method for the COM property "Xneut"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(27)
  double xneut();


  /**
   * <p>
   * Active Winding neutral reactance [ohms] for wye connections.
   * </p>
   * <p>
   * Setter method for the COM property "Xneut"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(28)
  void xneut(
    double value);


  /**
   * <p>
   * Active Winding neutral resistance [ohms] for wye connections. Set less than zero for ungrounded wye.
   * </p>
   * <p>
   * Getter method for the COM property "Rneut"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(29)
  double rneut();


  /**
   * <p>
   * Active Winding neutral resistance [ohms] for wye connections. Set less than zero for ungrounded wye.
   * </p>
   * <p>
   * Setter method for the COM property "Rneut"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(30)
  void rneut(
    double value);


  /**
   * <p>
   * Active Winding delta or wye connection?
   * </p>
   * <p>
   * Getter method for the COM property "IsDelta"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(31)
  boolean isDelta();


  /**
   * <p>
   * Active Winding delta or wye connection?
   * </p>
   * <p>
   * Setter method for the COM property "IsDelta"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(32)
  void isDelta(
    boolean value);


  /**
   * <p>
   * Percent reactance between windings 1 and 2, on winding 1 kVA base. Use for 2-winding or 3-winding transformers.
   * </p>
   * <p>
   * Getter method for the COM property "Xhl"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(33)
  double xhl();


  /**
   * <p>
   * Percent reactance between windings 1 and 2, on winding 1 kVA base. Use for 2-winding or 3-winding transformers.
   * </p>
   * <p>
   * Setter method for the COM property "Xhl"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(34)
  void xhl(
    double value);


  /**
   * <p>
   * Percent reactance between windigns 1 and 3, on winding 1 kVA base.  Use for 3-winding transformers only.
   * </p>
   * <p>
   * Getter method for the COM property "Xht"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(35)
  double xht();


  /**
   * <p>
   * Percent reactance between windigns 1 and 3, on winding 1 kVA base.  Use for 3-winding transformers only.
   * </p>
   * <p>
   * Setter method for the COM property "Xht"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(36)
  void xht(
    double value);


  /**
   * <p>
   * Percent reactance between windings 2 and 3, on winding 1 kVA base. Use for 3-winding transformers only.
   * </p>
   * <p>
   * Getter method for the COM property "Xlt"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(37)
  double xlt();


  /**
   * <p>
   * Percent reactance between windings 2 and 3, on winding 1 kVA base. Use for 3-winding transformers only.
   * </p>
   * <p>
   * Setter method for the COM property "Xlt"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(38)
  void xlt(
    double value);


  /**
   * <p>
   * Sets a Transformer active by Name.
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(39)
  java.lang.String name();


  /**
   * <p>
   * Sets a Transformer active by Name.
   * </p>
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(40)
  void name(
    java.lang.String value);


  /**
   * <p>
   * Sets the first Transformer active. Returns 0 if no more.
   * </p>
   * <p>
   * Getter method for the COM property "First"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(41)
  int first();


  /**
   * <p>
   * Sets the next Transformer active. Returns 0 if no more.
   * </p>
   * <p>
   * Getter method for the COM property "Next"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(42)
  int next();


  /**
   * <p>
   * Variant array of strings with all Transformer names in the active circuit.
   * </p>
   * <p>
   * Getter method for the COM property "AllNames"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(220) //= 0xdc. The runtime will prefer the VTID if present
  @VTID(43)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object allNames();


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(221) //= 0xdd. The runtime will prefer the VTID if present
  @VTID(44)
  int count();


  /**
   * <p>
   * Complex array of voltages for active winding
   * </p>
   * <p>
   * Getter method for the COM property "WdgVoltages"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(222) //= 0xde. The runtime will prefer the VTID if present
  @VTID(45)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object wdgVoltages();


  /**
   * <p>
   * All Winding currents (ph1, wdg1, wdg2,... ph2, wdg1, wdg2 ...)
   * </p>
   * <p>
   * Getter method for the COM property "WdgCurrents"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(223) //= 0xdf. The runtime will prefer the VTID if present
  @VTID(46)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object wdgCurrents();


  /**
   * <p>
   * All winding currents in CSV string form like the WdgCurrents property
   * </p>
   * <p>
   * Getter method for the COM property "strWdgCurrents"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(224) //= 0xe0. The runtime will prefer the VTID if present
  @VTID(47)
  java.lang.String strWdgCurrents();


  /**
   * <p>
   * Transformer Core Type: 0=shell;1 = 1-phase; 3= 3-leg; 5= 5-leg
   * </p>
   * <p>
   * Getter method for the COM property "CoreType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(225) //= 0xe1. The runtime will prefer the VTID if present
  @VTID(48)
  int coreType();


  /**
   * <p>
   * Transformer Core Type: 0=shell;1 = 1-phase; 3= 3-leg; 5= 5-leg
   * </p>
   * <p>
   * Setter method for the COM property "CoreType"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(225) //= 0xe1. The runtime will prefer the VTID if present
  @VTID(49)
  void coreType(
    int value);


  /**
   * <p>
   * Getter method for the COM property "RdcOhms"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(226) //= 0xe2. The runtime will prefer the VTID if present
  @VTID(50)
  double rdcOhms();


  /**
   * <p>
   * Setter method for the COM property "RdcOhms"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(226) //= 0xe2. The runtime will prefer the VTID if present
  @VTID(51)
  void rdcOhms(
    double value);


  // Properties:
}
