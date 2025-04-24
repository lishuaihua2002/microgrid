package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for LineCodes Object
 */
@IID("{43140E77-9EA6-4156-A686-ABFAFFE8A059}")
public interface ILineCodes extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Number of LineCodes
   * </p>
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  int count();


  /**
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
   * Getter method for the COM property "Next"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  int next();


  /**
   * <p>
   * Name of active LineCode
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
   * Name of active LineCode
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
   * Flag denoting whether impedance data were entered in symmetrical components
   * </p>
   * <p>
   * Getter method for the COM property "IsZ1Z0"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(12)
  boolean isZ1Z0();


  /**
   * <p>
   * Getter method for the COM property "Units"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(13)
  int units();


  /**
   * <p>
   * Setter method for the COM property "Units"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(14)
  void units(
    int value);


  /**
   * <p>
   * Number of Phases
   * </p>
   * <p>
   * Getter method for the COM property "Phases"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(15)
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

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(16)
  void phases(
    int value);


  /**
   * <p>
   * Positive-sequence resistance ohms per unit length
   * </p>
   * <p>
   * Getter method for the COM property "R1"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(17)
  double r1();


  /**
   * <p>
   * Positive-sequence resistance ohms per unit length
   * </p>
   * <p>
   * Setter method for the COM property "R1"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(18)
  void r1(
    double value);


  /**
   * <p>
   * Posiive-sequence reactance, ohms per unit length
   * </p>
   * <p>
   * Getter method for the COM property "X1"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(19)
  double x1();


  /**
   * <p>
   * Posiive-sequence reactance, ohms per unit length
   * </p>
   * <p>
   * Setter method for the COM property "X1"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(20)
  void x1(
    double value);


  /**
   * <p>
   * Zero-Sequence Resistance, ohms per unit length
   * </p>
   * <p>
   * Getter method for the COM property "R0"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(21)
  double r0();


  /**
   * <p>
   * Zero-Sequence Resistance, ohms per unit length
   * </p>
   * <p>
   * Setter method for the COM property "R0"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(22)
  void r0(
    double value);


  /**
   * <p>
   * Zero Sequence Reactance, Ohms per unit length
   * </p>
   * <p>
   * Getter method for the COM property "X0"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(23)
  double x0();


  /**
   * <p>
   * Zero Sequence Reactance, Ohms per unit length
   * </p>
   * <p>
   * Setter method for the COM property "X0"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(24)
  void x0(
    double value);


  /**
   * <p>
   * Positive-sequence capacitance, nF per unit length
   * </p>
   * <p>
   * Getter method for the COM property "C1"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(25)
  double c1();


  /**
   * <p>
   * Positive-sequence capacitance, nF per unit length
   * </p>
   * <p>
   * Setter method for the COM property "C1"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(26)
  void c1(
    double value);


  /**
   * <p>
   * Zero-sequence capacitance, nF per unit length
   * </p>
   * <p>
   * Getter method for the COM property "C0"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(27)
  double c0();


  /**
   * <p>
   * Zero-sequence capacitance, nF per unit length
   * </p>
   * <p>
   * Setter method for the COM property "C0"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(28)
  void c0(
    double value);


  /**
   * <p>
   * Resistance matrix, ohms per unit length
   * </p>
   * <p>
   * Getter method for the COM property "Rmatrix"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(29)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object rmatrix();


  /**
   * <p>
   * Resistance matrix, ohms per unit length
   * </p>
   * <p>
   * Setter method for the COM property "Rmatrix"
   * </p>
   * @param value Mandatory java.lang.Object parameter.
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(30)
  void rmatrix(
    @MarshalAs(NativeType.VARIANT) java.lang.Object value);


  /**
   * <p>
   * Reactance matrix, ohms per unit length
   * </p>
   * <p>
   * Getter method for the COM property "Xmatrix"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(31)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object xmatrix();


  /**
   * <p>
   * Reactance matrix, ohms per unit length
   * </p>
   * <p>
   * Setter method for the COM property "Xmatrix"
   * </p>
   * @param value Mandatory java.lang.Object parameter.
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(32)
  void xmatrix(
    @MarshalAs(NativeType.VARIANT) java.lang.Object value);


  /**
   * <p>
   * Capacitance matrix, nF per unit length
   * </p>
   * <p>
   * Getter method for the COM property "Cmatrix"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(33)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object cmatrix();


  /**
   * <p>
   * Capacitance matrix, nF per unit length
   * </p>
   * <p>
   * Setter method for the COM property "Cmatrix"
   * </p>
   * @param value Mandatory java.lang.Object parameter.
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(34)
  void cmatrix(
    @MarshalAs(NativeType.VARIANT) java.lang.Object value);


  /**
   * <p>
   * Normal Ampere rating
   * </p>
   * <p>
   * Getter method for the COM property "NormAmps"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(35)
  double normAmps();


  /**
   * <p>
   * Normal Ampere rating
   * </p>
   * <p>
   * Setter method for the COM property "NormAmps"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(36)
  void normAmps(
    double value);


  /**
   * <p>
   * Emergency ampere rating
   * </p>
   * <p>
   * Getter method for the COM property "EmergAmps"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(37)
  double emergAmps();


  /**
   * <p>
   * Emergency ampere rating
   * </p>
   * <p>
   * Setter method for the COM property "EmergAmps"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(38)
  void emergAmps(
    double value);


  /**
   * <p>
   * Variant array of strings with names of all devices
   * </p>
   * <p>
   * Getter method for the COM property "AllNames"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(39)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object allNames();


  // Properties:
}
