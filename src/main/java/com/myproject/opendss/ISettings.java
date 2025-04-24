package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for Settings Object
 */
@IID("{4E3928A0-8B75-4127-885F-F4AD6B3F4323}")
public interface ISettings extends Com4jObject {
  // Methods:
  /**
   * <p>
   * {True | False*} Designates whether to allow duplicate names of objects
   * </p>
   * <p>
   * Getter method for the COM property "AllowDuplicates"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  boolean allowDuplicates();


  /**
   * <p>
   * {True | False*} Designates whether to allow duplicate names of objects
   * </p>
   * <p>
   * Setter method for the COM property "AllowDuplicates"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(8)
  void allowDuplicates(
    boolean value);


  /**
   * <p>
   * {True | False*}  Locks Zones on energy meters to prevent rebuilding if a circuit change occurs.
   * </p>
   * <p>
   * Getter method for the COM property "ZoneLock"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  boolean zoneLock();


  /**
   * <p>
   * {True | False*}  Locks Zones on energy meters to prevent rebuilding if a circuit change occurs.
   * </p>
   * <p>
   * Setter method for the COM property "ZoneLock"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  void zoneLock(
    boolean value);


  /**
   * <p>
   * Sets all load allocation factors for all loads defined by XFKVA property to this value.
   * </p>
   * <p>
   * Setter method for the COM property "AllocationFactors"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  void allocationFactors(
    double rhs);


  /**
   * <p>
   * List of Buses or (File=xxxx) syntax for the AutoAdd solution mode.
   * </p>
   * <p>
   * Getter method for the COM property "AutoBusList"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String autoBusList();


  /**
   * <p>
   * List of Buses or (File=xxxx) syntax for the AutoAdd solution mode.
   * </p>
   * <p>
   * Setter method for the COM property "AutoBusList"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  void autoBusList(
    java.lang.String value);


  /**
   * <p>
   * {dssMultiphase * | dssPositiveSeq} IIndicate if the circuit model is positive sequence.
   * </p>
   * <p>
   * Getter method for the COM property "CktModel"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(14)
  int cktModel();


  /**
   * <p>
   * {dssMultiphase * | dssPositiveSeq} IIndicate if the circuit model is positive sequence.
   * </p>
   * <p>
   * Setter method for the COM property "CktModel"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  void cktModel(
    int value);


  /**
   * <p>
   * Per Unit minimum voltage for Normal conditions.
   * </p>
   * <p>
   * Getter method for the COM property "NormVminpu"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(16)
  double normVminpu();


  /**
   * <p>
   * Per Unit minimum voltage for Normal conditions.
   * </p>
   * <p>
   * Setter method for the COM property "NormVminpu"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(17)
  void normVminpu(
    double value);


  /**
   * <p>
   * Per Unit maximum voltage for Normal conditions.
   * </p>
   * <p>
   * Getter method for the COM property "NormVmaxpu"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(18)
  double normVmaxpu();


  /**
   * <p>
   * Per Unit maximum voltage for Normal conditions.
   * </p>
   * <p>
   * Setter method for the COM property "NormVmaxpu"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(19)
  void normVmaxpu(
    double value);


  /**
   * <p>
   * Per Unit minimum voltage for Emergency conditions.
   * </p>
   * <p>
   * Getter method for the COM property "EmergVminpu"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(20)
  double emergVminpu();


  /**
   * <p>
   * Per Unit minimum voltage for Emergency conditions.
   * </p>
   * <p>
   * Setter method for the COM property "EmergVminpu"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(21)
  void emergVminpu(
    double value);


  /**
   * <p>
   * Per Unit maximum voltage for Emergency conditions.
   * </p>
   * <p>
   * Getter method for the COM property "EmergVmaxpu"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(22)
  double emergVmaxpu();


  /**
   * <p>
   * Per Unit maximum voltage for Emergency conditions.
   * </p>
   * <p>
   * Setter method for the COM property "EmergVmaxpu"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(23)
  void emergVmaxpu(
    double value);


  /**
   * <p>
   * Weighting factor applied to UE register values.
   * </p>
   * <p>
   * Getter method for the COM property "UEweight"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(24)
  double uEweight();


  /**
   * <p>
   * Weighting factor applied to UE register values.
   * </p>
   * <p>
   * Setter method for the COM property "UEweight"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(25)
  void uEweight(
    double value);


  /**
   * <p>
   * Weighting factor applied to Loss register values.
   * </p>
   * <p>
   * Getter method for the COM property "LossWeight"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(26)
  double lossWeight();


  /**
   * <p>
   * Weighting factor applied to Loss register values.
   * </p>
   * <p>
   * Setter method for the COM property "LossWeight"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(27)
  void lossWeight(
    double value);


  /**
   * <p>
   * Array of Integers defining energy meter registers to use for computing UE
   * </p>
   * <p>
   * Getter method for the COM property "UEregs"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(28)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object uEregs();


  /**
   * <p>
   * Array of Integers defining energy meter registers to use for computing UE
   * </p>
   * <p>
   * Setter method for the COM property "UEregs"
   * </p>
   * @param value Mandatory java.lang.Object parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(29)
  void uEregs(
    @MarshalAs(NativeType.VARIANT) java.lang.Object value);


  /**
   * <p>
   * Integer array defining which energy meter registers to use for computing losses
   * </p>
   * <p>
   * Getter method for the COM property "LossRegs"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(30)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object lossRegs();


  /**
   * <p>
   * Integer array defining which energy meter registers to use for computing losses
   * </p>
   * <p>
   * Setter method for the COM property "LossRegs"
   * </p>
   * @param value Mandatory java.lang.Object parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(31)
  void lossRegs(
    @MarshalAs(NativeType.VARIANT) java.lang.Object value);


  /**
   * <p>
   * {True | False *} Gets value of trapezoidal integration flag in energy meters.
   * </p>
   * <p>
   * Getter method for the COM property "Trapezoidal"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(32)
  boolean trapezoidal();


  /**
   * <p>
   * {True | False *} Gets value of trapezoidal integration flag in energy meters.
   * </p>
   * <p>
   * Setter method for the COM property "Trapezoidal"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(33)
  void trapezoidal(
    boolean value);


  /**
   * <p>
   * Array of doubles defining the legal voltage bases in kV L-L
   * </p>
   * <p>
   * Getter method for the COM property "VoltageBases"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(34)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object voltageBases();


  /**
   * <p>
   * Array of doubles defining the legal voltage bases in kV L-L
   * </p>
   * <p>
   * Setter method for the COM property "VoltageBases"
   * </p>
   * @param value Mandatory java.lang.Object parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(35)
  void voltageBases(
    @MarshalAs(NativeType.VARIANT) java.lang.Object value);


  /**
   * <p>
   * {True | False*} Denotes whether to trace the control actions to a file.
   * </p>
   * <p>
   * Getter method for the COM property "ControlTrace"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(36)
  boolean controlTrace();


  /**
   * <p>
   * {True | False*} Denotes whether to trace the control actions to a file.
   * </p>
   * <p>
   * Setter method for the COM property "ControlTrace"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(37)
  void controlTrace(
    boolean value);


  /**
   * <p>
   * Price Signal for the Circuit
   * </p>
   * <p>
   * Getter method for the COM property "PriceSignal"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(38)
  double priceSignal();


  /**
   * <p>
   * Price Signal for the Circuit
   * </p>
   * <p>
   * Setter method for the COM property "PriceSignal"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(39)
  void priceSignal(
    double value);


  /**
   * <p>
   * Name of LoadShape object that serves as the source of price signal data for yearly simulations, etc.
   * </p>
   * <p>
   * Getter method for the COM property "PriceCurve"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(40)
  java.lang.String priceCurve();


  /**
   * <p>
   * Name of LoadShape object that serves as the source of price signal data for yearly simulations, etc.
   * </p>
   * <p>
   * Setter method for the COM property "PriceCurve"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(41)
  void priceCurve(
    java.lang.String value);


  // Properties:
}
