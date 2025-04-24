package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for Vsources Object
 */
@IID("{8DCD1962-268B-40E1-B49E-B7C01C3E07CD}")
public interface IVsources extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Names of all Vsource objects in the circuit
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
   * Number of Vsource Object
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
   * Sets the first VSOURCE to be active; Returns 0 if none
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
   * Sets the next VSOURCE object to be active; returns zero if no more
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
   * Get Active VSOURCE name
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
   * Get Active VSOURCE name
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
   * Source Voltage in kV
   * </p>
   * <p>
   * Getter method for the COM property "BasekV"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(13)
  double basekV();


  /**
   * <p>
   * Source Voltage in kV
   * </p>
   * <p>
   * Setter method for the COM property "BasekV"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(14)
  void basekV(
    double value);


  /**
   * <p>
   * Source pu voltage.
   * </p>
   * <p>
   * Getter method for the COM property "pu"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(15)
  double pu();


  /**
   * <p>
   * Source pu voltage.
   * </p>
   * <p>
   * Setter method for the COM property "pu"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(16)
  void pu(
    double value);


  /**
   * <p>
   * Phase angle of first phase in degrees
   * </p>
   * <p>
   * Getter method for the COM property "AngleDeg"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(17)
  double angleDeg();


  /**
   * <p>
   * Phase angle of first phase in degrees
   * </p>
   * <p>
   * Setter method for the COM property "AngleDeg"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(18)
  void angleDeg(
    double value);


  /**
   * <p>
   * Source Frequency in Hz
   * </p>
   * <p>
   * Getter method for the COM property "Frequency"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(19)
  double frequency();


  /**
   * <p>
   * Source Frequency in Hz
   * </p>
   * <p>
   * Setter method for the COM property "Frequency"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(20)
  void frequency(
    double value);


  /**
   * <p>
   * Number of Phases
   * </p>
   * <p>
   * Getter method for the COM property "Phases"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(21)
  int phases();


  /**
   * <p>
   * Number of Phases
   * </p>
   * <p>
   * Setter method for the COM property "Phases"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(22)
  void phases(
    int value);


  // Properties:
}
