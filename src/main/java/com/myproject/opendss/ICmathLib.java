package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for CmathLib Object
 */
@IID("{2B649EC0-FA89-45ED-A937-E7CB47806A3A}")
public interface ICmathLib extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Convert real and imaginary doubles to Variant array of doubles
   * </p>
   * <p>
   * Getter method for the COM property "cmplx"
   * </p>
   * @param realPart Mandatory double parameter.
   * @param imagPart Mandatory double parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object cmplx(
    double realPart,
    double imagPart);


  /**
   * <p>
   * Return abs value of complex number given in real and imag doubles
   * </p>
   * <p>
   * Getter method for the COM property "cabs"
   * </p>
   * @param realPart Mandatory double parameter.
   * @param imagPart Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  double cabs(
    double realPart,
    double imagPart);


  /**
   * <p>
   * Returns the angle, in degrees, of a complex number specified as two doubles: Realpart and imagpart.
   * </p>
   * <p>
   * Getter method for the COM property "cdang"
   * </p>
   * @param realPart Mandatory double parameter.
   * @param imagPart Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  double cdang(
    double realPart,
    double imagPart);


  /**
   * <p>
   * Convert complex number to magnitude and angle, degrees. Returns variant array of two doubles.
   * </p>
   * <p>
   * Getter method for the COM property "ctopolardeg"
   * </p>
   * @param realPart Mandatory double parameter.
   * @param imagPart Mandatory double parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ctopolardeg(
    double realPart,
    double imagPart);


  /**
   * <p>
   * Convert magnitude, angle in degrees to a complex number. Returns Variant array of two doubles.
   * </p>
   * <p>
   * Getter method for the COM property "pdegtocomplex"
   * </p>
   * @param magnitude Mandatory double parameter.
   * @param angle Mandatory double parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object pdegtocomplex(
    double magnitude,
    double angle);


  /**
   * <p>
   * Multiply two complex numbers: (a1, b1) * (a2, b2). Returns result as a variant array of two doubles.
   * </p>
   * <p>
   * Getter method for the COM property "cmul"
   * </p>
   * @param a1 Mandatory double parameter.
   * @param b1 Mandatory double parameter.
   * @param a2 Mandatory double parameter.
   * @param b2 Mandatory double parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object cmul(
    double a1,
    double b1,
    double a2,
    double b2);


  /**
   * <p>
   * Divide two complex number: (a1, b1)/(a2, b2). Returns variant array of two doubles representing complex result.
   * </p>
   * <p>
   * Getter method for the COM property "cdiv"
   * </p>
   * @param a1 Mandatory double parameter.
   * @param b1 Mandatory double parameter.
   * @param a2 Mandatory double parameter.
   * @param b2 Mandatory double parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object cdiv(
    double a1,
    double b1,
    double a2,
    double b2);


  // Properties:
}
