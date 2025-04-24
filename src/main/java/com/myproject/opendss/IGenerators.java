package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for Generators Object
 */
@IID("{2D9B7548-D03E-478A-9FEA-9FC4033C793E}")
public interface IGenerators extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Array of names of all Generator objects.
   * </p>
   * <p>
   * Getter method for the COM property "AllNames"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object allNames();


  /**
   * <p>
   * Array of Names of all generator energy meter registers
   * </p>
   * <p>
   * Getter method for the COM property "RegisterNames"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object registerNames();


  /**
   * <p>
   * Array of valus in generator energy meter registers.
   * </p>
   * <p>
   * Getter method for the COM property "RegisterValues"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object registerValues();


  /**
   * <p>
   * Sets first Generator to be active.  Returns 0 if none.
   * </p>
   * <p>
   * Getter method for the COM property "First"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(10)
  int first();


  /**
   * <p>
   * Sets next Generator to be active.  Returns 0 if no more.
   * </p>
   * <p>
   * Getter method for the COM property "Next"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(11)
  int next();


  /**
   * <p>
   * Indicates whether the generator is forced ON regardles of other dispatch criteria.
   * </p>
   * <p>
   * Getter method for the COM property "ForcedON"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(12)
  boolean forcedON();


  /**
   * <p>
   * Indicates whether the generator is forced ON regardles of other dispatch criteria.
   * </p>
   * <p>
   * Setter method for the COM property "ForcedON"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(13)
  void forcedON(
    boolean value);


  /**
   * <p>
   * Sets a generator active by name.
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String name();


  /**
   * <p>
   * Sets a generator active by name.
   * </p>
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(15)
  void name(
    java.lang.String value);


  /**
   * <p>
   * Voltage base for the active generator, kV
   * </p>
   * <p>
   * Getter method for the COM property "kV"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(16)
  double kV();


  /**
   * <p>
   * Voltage base for the active generator, kV
   * </p>
   * <p>
   * Setter method for the COM property "kV"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(17)
  void kV(
    double value);


  /**
   * <p>
   * kW output for the active generator. kvar is updated for current power factor.
   * </p>
   * <p>
   * Getter method for the COM property "kW"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(18)
  double kW();


  /**
   * <p>
   * kW output for the active generator. kvar is updated for current power factor.
   * </p>
   * <p>
   * Setter method for the COM property "kW"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(19)
  void kW(
    double value);


  /**
   * <p>
   * kvar output for the active generator. Updates power factor based on present kW value.
   * </p>
   * <p>
   * Getter method for the COM property "kvar"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(20)
  double kvar();


  /**
   * <p>
   * kvar output for the active generator. Updates power factor based on present kW value.
   * </p>
   * <p>
   * Setter method for the COM property "kvar"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(21)
  void kvar(
    double value);


  /**
   * <p>
   * Power factor (pos. = producing vars). Updates kvar based on present kW value.
   * </p>
   * <p>
   * Getter method for the COM property "PF"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(22)
  double pf();


  /**
   * <p>
   * Power factor (pos. = producing vars). Updates kvar based on present kW value.
   * </p>
   * <p>
   * Setter method for the COM property "PF"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(23)
  void pf(
    double value);


  /**
   * <p>
   * Number of phases
   * </p>
   * <p>
   * Getter method for the COM property "Phases"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(24)
  int phases();


  /**
   * <p>
   * Number of phases
   * </p>
   * <p>
   * Setter method for the COM property "Phases"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(25)
  void phases(
    int value);


  /**
   * <p>
   * Number of Generator Objects in Active Circuit
   * </p>
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(26)
  int count();


  /**
   * <p>
   * Get/Set active Generator by index into generators list.  1..Count
   * </p>
   * <p>
   * Getter method for the COM property "idx"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(27)
  int idx();


  /**
   * <p>
   * Get/Set active Generator by index into generators list.  1..Count
   * </p>
   * <p>
   * Setter method for the COM property "idx"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(28)
  void idx(
    int value);


  /**
   * <p>
   * Generator Model
   * </p>
   * <p>
   * Getter method for the COM property "Model"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(29)
  int model();


  /**
   * <p>
   * Generator Model
   * </p>
   * <p>
   * Setter method for the COM property "Model"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(30)
  void model(
    int value);


  /**
   * <p>
   * kVA rating of the generator
   * </p>
   * <p>
   * Getter method for the COM property "kVArated"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(31)
  double kVArated();


  /**
   * <p>
   * kVA rating of the generator
   * </p>
   * <p>
   * Setter method for the COM property "kVArated"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(32)
  void kVArated(
    double value);


  /**
   * <p>
   * vmaxpu for Generator model
   * </p>
   * <p>
   * Getter method for the COM property "Vmaxpu"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(33)
  double vmaxpu();


  /**
   * <p>
   * vmaxpu for Generator model
   * </p>
   * <p>
   * Setter method for the COM property "Vmaxpu"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(34)
  void vmaxpu(
    double value);


  /**
   * <p>
   * Vminpu for Generator model
   * </p>
   * <p>
   * Getter method for the COM property "Vminpu"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(35)
  double vminpu();


  /**
   * <p>
   * Vminpu for Generator model
   * </p>
   * <p>
   * Setter method for the COM property "Vminpu"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(36)
  void vminpu(
    double value);


  // Properties:
}
