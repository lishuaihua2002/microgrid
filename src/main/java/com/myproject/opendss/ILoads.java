package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for Loads Object
 */
@IID("{9A3FFA05-5B82-488C-B08D-FCA2FDB23101}")
public interface ILoads extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Variant array of strings containing all Load names
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
   * Set first Load element to be active; returns 0 if none.
   * </p>
   * <p>
   * Getter method for the COM property "First"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  int first();


  /**
   * <p>
   * Sets next Load element to be active; returns 0 of none else index of active load.
   * </p>
   * <p>
   * Getter method for the COM property "Next"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  int next();


  /**
   * <p>
   * Set active load by name.
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String name();


  /**
   * <p>
   * Set active load by name.
   * </p>
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(11)
  void name(
    java.lang.String value);


  /**
   * <p>
   * Sets active load by index into load list. 1..Count
   * </p>
   * <p>
   * Getter method for the COM property "idx"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(12)
  int idx();


  /**
   * <p>
   * Sets active load by index into load list. 1..Count
   * </p>
   * <p>
   * Setter method for the COM property "idx"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(13)
  void idx(
    int value);


  /**
   * <p>
   * Set kW for active Load. Updates kvar based on present PF.
   * </p>
   * <p>
   * Getter method for the COM property "kW"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(14)
  double kW();


  /**
   * <p>
   * Set kW for active Load. Updates kvar based on present PF.
   * </p>
   * <p>
   * Setter method for the COM property "kW"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(15)
  void kW(
    double value);


  /**
   * <p>
   * Set kV rating for active Load. For 2 or more phases set Line-Line kV. Else actual kV across terminals.
   * </p>
   * <p>
   * Getter method for the COM property "kV"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(16)
  double kV();


  /**
   * <p>
   * Set kV rating for active Load. For 2 or more phases set Line-Line kV. Else actual kV across terminals.
   * </p>
   * <p>
   * Setter method for the COM property "kV"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(17)
  void kV(
    double value);


  /**
   * <p>
   * Set kvar for active Load. Updates PF based in present kW.
   * </p>
   * <p>
   * Getter method for the COM property "kvar"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(18)
  double kvar();


  /**
   * <p>
   * Set kvar for active Load. Updates PF based in present kW.
   * </p>
   * <p>
   * Setter method for the COM property "kvar"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(19)
  void kvar(
    double value);


  /**
   * <p>
   * Set Power Factor for Active Load. Specify leading PF as negative. Updates kvar based on kW value
   * </p>
   * <p>
   * Getter method for the COM property "PF"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(20)
  double pf();


  /**
   * <p>
   * Set Power Factor for Active Load. Specify leading PF as negative. Updates kvar based on kW value
   * </p>
   * <p>
   * Setter method for the COM property "PF"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(21)
  void pf(
    double value);


  /**
   * <p>
   * Number of Load objects in active circuit.
   * </p>
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
   * Average percent of nominal load in Monte Carlo studies; only if no loadshape defined for this load.
   * </p>
   * <p>
   * Getter method for the COM property "PctMean"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(23)
  double pctMean();


  /**
   * <p>
   * Average percent of nominal load in Monte Carlo studies; only if no loadshape defined for this load.
   * </p>
   * <p>
   * Setter method for the COM property "PctMean"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(24)
  void pctMean(
    double value);


  /**
   * <p>
   * Percent standard deviation for Monte Carlo load studies; if there is no loadshape assigned to this load.
   * </p>
   * <p>
   * Getter method for the COM property "PctStdDev"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(25)
  double pctStdDev();


  /**
   * <p>
   * Percent standard deviation for Monte Carlo load studies; if there is no loadshape assigned to this load.
   * </p>
   * <p>
   * Setter method for the COM property "PctStdDev"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(26)
  void pctStdDev(
    double value);


  /**
   * <p>
   * Factor for allocating loads by connected xfkva
   * </p>
   * <p>
   * Getter method for the COM property "AllocationFactor"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(27)
  double allocationFactor();


  /**
   * <p>
   * Factor for allocating loads by connected xfkva
   * </p>
   * <p>
   * Setter method for the COM property "AllocationFactor"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(28)
  void allocationFactor(
    double value);


  /**
   * <p>
   * Factor relates average to peak kw.  Used for allocation with kwh and kwhdays/
   * </p>
   * <p>
   * Getter method for the COM property "Cfactor"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(29)
  double cfactor();


  /**
   * <p>
   * Factor relates average to peak kw.  Used for allocation with kwh and kwhdays/
   * </p>
   * <p>
   * Setter method for the COM property "Cfactor"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(30)
  void cfactor(
    double value);


  /**
   * <p>
   * A code number used to separate loads by class or group. No effect on the solution.
   * </p>
   * <p>
   * Getter method for the COM property "Class"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(31)
  int _class();


  /**
   * <p>
   * A code number used to separate loads by class or group. No effect on the solution.
   * </p>
   * <p>
   * Setter method for the COM property "Class"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(32)
  void _class(
    int value);


  /**
   * <p>
   * Delta loads are connected line-to-line.
   * </p>
   * <p>
   * Getter method for the COM property "IsDelta"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(33)
  boolean isDelta();


  /**
   * <p>
   * Delta loads are connected line-to-line.
   * </p>
   * <p>
   * Setter method for the COM property "IsDelta"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(34)
  void isDelta(
    boolean value);


  /**
   * <p>
   * Name of a loadshape with both Mult and Qmult, for CVR factors as a function of time.
   * </p>
   * <p>
   * Getter method for the COM property "CVRcurve"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(35)
  java.lang.String cvRcurve();


  /**
   * <p>
   * Name of a loadshape with both Mult and Qmult, for CVR factors as a function of time.
   * </p>
   * <p>
   * Setter method for the COM property "CVRcurve"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(36)
  void cvRcurve(
    java.lang.String value);


  /**
   * <p>
   * Percent reduction in P for percent reduction in V. Must be used with dssLoadModelCVR.
   * </p>
   * <p>
   * Getter method for the COM property "CVRwatts"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(37)
  double cvRwatts();


  /**
   * <p>
   * Percent reduction in P for percent reduction in V. Must be used with dssLoadModelCVR.
   * </p>
   * <p>
   * Setter method for the COM property "CVRwatts"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(38)
  void cvRwatts(
    double value);


  /**
   * <p>
   * Percent reduction in Q for percent reduction in V. Must be used with dssLoadModelCVR.
   * </p>
   * <p>
   * Getter method for the COM property "CVRvars"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(39)
  double cvRvars();


  /**
   * <p>
   * Percent reduction in Q for percent reduction in V. Must be used with dssLoadModelCVR.
   * </p>
   * <p>
   * Setter method for the COM property "CVRvars"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(40)
  void cvRvars(
    double value);


  /**
   * <p>
   * Name of the loadshape for a daily load profile.
   * </p>
   * <p>
   * Getter method for the COM property "daily"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(220) //= 0xdc. The runtime will prefer the VTID if present
  @VTID(41)
  java.lang.String daily();


  /**
   * <p>
   * Name of the loadshape for a daily load profile.
   * </p>
   * <p>
   * Setter method for the COM property "daily"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(220) //= 0xdc. The runtime will prefer the VTID if present
  @VTID(42)
  void daily(
    java.lang.String value);


  /**
   * <p>
   * Name of the loadshape for a duty cycle simulation.
   * </p>
   * <p>
   * Getter method for the COM property "duty"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(221) //= 0xdd. The runtime will prefer the VTID if present
  @VTID(43)
  java.lang.String duty();


  /**
   * <p>
   * Name of the loadshape for a duty cycle simulation.
   * </p>
   * <p>
   * Setter method for the COM property "duty"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(221) //= 0xdd. The runtime will prefer the VTID if present
  @VTID(44)
  void duty(
    java.lang.String value);


  /**
   * <p>
   * Base load kva. Also defined kw and kvar or pf input, or load allocation by kwh or xfkva.
   * </p>
   * <p>
   * Getter method for the COM property "kva"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(223) //= 0xdf. The runtime will prefer the VTID if present
  @VTID(45)
  double kva();


  /**
   * <p>
   * Base load kva. Also defined kw and kvar or pf input, or load allocation by kwh or xfkva.
   * </p>
   * <p>
   * Setter method for the COM property "kva"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(223) //= 0xdf. The runtime will prefer the VTID if present
  @VTID(46)
  void kva(
    double value);


  /**
   * <p>
   * kwh billed for this period. Can be used with Cfactor for load allocation.
   * </p>
   * <p>
   * Getter method for the COM property "kwh"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(224) //= 0xe0. The runtime will prefer the VTID if present
  @VTID(47)
  double kwh();


  /**
   * <p>
   * kwh billed for this period. Can be used with Cfactor for load allocation.
   * </p>
   * <p>
   * Setter method for the COM property "kwh"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(224) //= 0xe0. The runtime will prefer the VTID if present
  @VTID(48)
  void kwh(
    double value);


  /**
   * <p>
   * Length of kwh billing period for average demand calculation. Default 30.
   * </p>
   * <p>
   * Getter method for the COM property "kwhdays"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(225) //= 0xe1. The runtime will prefer the VTID if present
  @VTID(49)
  double kwhdays();


  /**
   * <p>
   * Length of kwh billing period for average demand calculation. Default 30.
   * </p>
   * <p>
   * Setter method for the COM property "kwhdays"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(225) //= 0xe1. The runtime will prefer the VTID if present
  @VTID(50)
  void kwhdays(
    double value);


  /**
   * <p>
   * The Load Model defines variation of P and Q with voltage.
   * </p>
   * <p>
   * Getter method for the COM property "Model"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.LoadModels
   */

  @DISPID(226) //= 0xe2. The runtime will prefer the VTID if present
  @VTID(51)
  com.myproject.opendss.LoadModels model();


  /**
   * <p>
   * The Load Model defines variation of P and Q with voltage.
   * </p>
   * <p>
   * Setter method for the COM property "Model"
   * </p>
   * @param value Mandatory com.myproject.opendss.LoadModels parameter.
   */

  @DISPID(226) //= 0xe2. The runtime will prefer the VTID if present
  @VTID(52)
  void model(
    com.myproject.opendss.LoadModels value);


  /**
   * <p>
   * Number of customers in this load, defaults to one.
   * </p>
   * <p>
   * Getter method for the COM property "NumCust"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(227) //= 0xe3. The runtime will prefer the VTID if present
  @VTID(53)
  int numCust();


  /**
   * <p>
   * Number of customers in this load, defaults to one.
   * </p>
   * <p>
   * Setter method for the COM property "NumCust"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(227) //= 0xe3. The runtime will prefer the VTID if present
  @VTID(54)
  void numCust(
    int value);


  /**
   * <p>
   * Neutral resistance for wye-connected loads.
   * </p>
   * <p>
   * Getter method for the COM property "Rneut"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(228) //= 0xe4. The runtime will prefer the VTID if present
  @VTID(55)
  double rneut();


  /**
   * <p>
   * Neutral resistance for wye-connected loads.
   * </p>
   * <p>
   * Setter method for the COM property "Rneut"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(228) //= 0xe4. The runtime will prefer the VTID if present
  @VTID(56)
  void rneut(
    double value);


  /**
   * <p>
   * Name of harmonic current spectrrum shape.
   * </p>
   * <p>
   * Getter method for the COM property "Spectrum"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(229) //= 0xe5. The runtime will prefer the VTID if present
  @VTID(57)
  java.lang.String spectrum();


  /**
   * <p>
   * Name of harmonic current spectrrum shape.
   * </p>
   * <p>
   * Setter method for the COM property "Spectrum"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(229) //= 0xe5. The runtime will prefer the VTID if present
  @VTID(58)
  void spectrum(
    java.lang.String value);


  /**
   * <p>
   * Maximum per-unit voltage to use the load model. Above this, constant Z applies.
   * </p>
   * <p>
   * Getter method for the COM property "Vmaxpu"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(230) //= 0xe6. The runtime will prefer the VTID if present
  @VTID(59)
  double vmaxpu();


  /**
   * <p>
   * Maximum per-unit voltage to use the load model. Above this, constant Z applies.
   * </p>
   * <p>
   * Setter method for the COM property "Vmaxpu"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(230) //= 0xe6. The runtime will prefer the VTID if present
  @VTID(60)
  void vmaxpu(
    double value);


  /**
   * <p>
   * Minimum voltage for unserved energy (UE) evaluation.
   * </p>
   * <p>
   * Getter method for the COM property "Vminemerg"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(231) //= 0xe7. The runtime will prefer the VTID if present
  @VTID(61)
  double vminemerg();


  /**
   * <p>
   * Minimum voltage for unserved energy (UE) evaluation.
   * </p>
   * <p>
   * Setter method for the COM property "Vminemerg"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(231) //= 0xe7. The runtime will prefer the VTID if present
  @VTID(62)
  void vminemerg(
    double value);


  /**
   * <p>
   * Minimum voltage for energy exceeding normal (EEN) evaluations.
   * </p>
   * <p>
   * Getter method for the COM property "Vminnorm"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(232) //= 0xe8. The runtime will prefer the VTID if present
  @VTID(63)
  double vminnorm();


  /**
   * <p>
   * Minimum voltage for energy exceeding normal (EEN) evaluations.
   * </p>
   * <p>
   * Setter method for the COM property "Vminnorm"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(232) //= 0xe8. The runtime will prefer the VTID if present
  @VTID(64)
  void vminnorm(
    double value);


  /**
   * <p>
   * Minimum voltage to apply the load model. Below this, constant Z is used.
   * </p>
   * <p>
   * Getter method for the COM property "Vminpu"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(233) //= 0xe9. The runtime will prefer the VTID if present
  @VTID(65)
  double vminpu();


  /**
   * <p>
   * Minimum voltage to apply the load model. Below this, constant Z is used.
   * </p>
   * <p>
   * Setter method for the COM property "Vminpu"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(233) //= 0xe9. The runtime will prefer the VTID if present
  @VTID(66)
  void vminpu(
    double value);


  /**
   * <p>
   * Rated service transformer kVA for load allocation, using AllocationFactor. Affects kW, kvar, and pf.
   * </p>
   * <p>
   * Getter method for the COM property "xfkVA"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(234) //= 0xea. The runtime will prefer the VTID if present
  @VTID(67)
  double xfkVA();


  /**
   * <p>
   * Rated service transformer kVA for load allocation, using AllocationFactor. Affects kW, kvar, and pf.
   * </p>
   * <p>
   * Setter method for the COM property "xfkVA"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(234) //= 0xea. The runtime will prefer the VTID if present
  @VTID(68)
  void xfkVA(
    double value);


  /**
   * <p>
   * Neutral reactance for wye-connected loads.
   * </p>
   * <p>
   * Getter method for the COM property "Xneut"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(235) //= 0xeb. The runtime will prefer the VTID if present
  @VTID(69)
  double xneut();


  /**
   * <p>
   * Neutral reactance for wye-connected loads.
   * </p>
   * <p>
   * Setter method for the COM property "Xneut"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(235) //= 0xeb. The runtime will prefer the VTID if present
  @VTID(70)
  void xneut(
    double value);


  /**
   * <p>
   * Name of yearly duration loadshape
   * </p>
   * <p>
   * Getter method for the COM property "Yearly"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(236) //= 0xec. The runtime will prefer the VTID if present
  @VTID(71)
  java.lang.String yearly();


  /**
   * <p>
   * Name of yearly duration loadshape
   * </p>
   * <p>
   * Setter method for the COM property "Yearly"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(236) //= 0xec. The runtime will prefer the VTID if present
  @VTID(72)
  void yearly(
    java.lang.String value);


  /**
   * <p>
   * Response to load multipliers: Fixed (growth only), Exempt (no LD curve), Variable (all).
   * </p>
   * <p>
   * Getter method for the COM property "Status"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.LoadStatus
   */

  @DISPID(237) //= 0xed. The runtime will prefer the VTID if present
  @VTID(73)
  com.myproject.opendss.LoadStatus status();


  /**
   * <p>
   * Response to load multipliers: Fixed (growth only), Exempt (no LD curve), Variable (all).
   * </p>
   * <p>
   * Setter method for the COM property "Status"
   * </p>
   * @param value Mandatory com.myproject.opendss.LoadStatus parameter.
   */

  @DISPID(237) //= 0xed. The runtime will prefer the VTID if present
  @VTID(74)
  void status(
    com.myproject.opendss.LoadStatus value);


  /**
   * <p>
   * Name of the growthshape curve for yearly load growth factors.
   * </p>
   * <p>
   * Getter method for the COM property "Growth"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(222) //= 0xde. The runtime will prefer the VTID if present
  @VTID(75)
  java.lang.String growth();


  /**
   * <p>
   * Name of the growthshape curve for yearly load growth factors.
   * </p>
   * <p>
   * Setter method for the COM property "Growth"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(222) //= 0xde. The runtime will prefer the VTID if present
  @VTID(76)
  void growth(
    java.lang.String value);


  /**
   * <p>
   * Array of 7  doubles with values for ZIPV property of the LOAD object
   * </p>
   * <p>
   * Getter method for the COM property "ZIPV"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(238) //= 0xee. The runtime will prefer the VTID if present
  @VTID(77)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object zipv();


  /**
   * <p>
   * Array of 7  doubles with values for ZIPV property of the LOAD object
   * </p>
   * <p>
   * Setter method for the COM property "ZIPV"
   * </p>
   * @param value Mandatory java.lang.Object parameter.
   */

  @DISPID(238) //= 0xee. The runtime will prefer the VTID if present
  @VTID(78)
  void zipv(
    @MarshalAs(NativeType.VARIANT) java.lang.Object value);


  /**
   * <p>
   * Getter method for the COM property "pctSeriesRL"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(239) //= 0xef. The runtime will prefer the VTID if present
  @VTID(79)
  double pctSeriesRL();


  /**
   * <p>
   * Setter method for the COM property "pctSeriesRL"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(239) //= 0xef. The runtime will prefer the VTID if present
  @VTID(80)
  void pctSeriesRL(
    double value);


  /**
   * <p>
   * Relative Weighting factor for the active LOAD
   * </p>
   * <p>
   * Getter method for the COM property "RelWeight"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(240) //= 0xf0. The runtime will prefer the VTID if present
  @VTID(81)
  double relWeight();


  /**
   * <p>
   * Relative Weighting factor for the active LOAD
   * </p>
   * <p>
   * Setter method for the COM property "RelWeight"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(240) //= 0xf0. The runtime will prefer the VTID if present
  @VTID(82)
  void relWeight(
    double value);


  /**
   * <p>
   * Name of the sensor monitoring this load.
   * </p>
   * <p>
   * Getter method for the COM property "Sensor"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(241) //= 0xf1. The runtime will prefer the VTID if present
  @VTID(83)
  java.lang.String sensor();


  // Properties:
}
