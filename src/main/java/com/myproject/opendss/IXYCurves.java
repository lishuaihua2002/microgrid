package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for XYCurves Object
 */
@IID("{97AA7680-E994-4A0C-BAC3-9B67BA49825C}")
public interface IXYCurves extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Number of XYCurve Objects
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
   * Sets first XYcurve object active; returns 0 if none.
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
   * Advances to next XYCurve object; returns 0 if no more objects of this class
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
   * Name of active XYCurve Object
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
   * Name of active XYCurve Object
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
   * Get/Set Number of points in X-Y curve
   * </p>
   * <p>
   * Getter method for the COM property "Npts"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(12)
  int npts();


  /**
   * <p>
   * Get/Set Number of points in X-Y curve
   * </p>
   * <p>
   * Setter method for the COM property "Npts"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(13)
  void npts(
    int value);


  /**
   * <p>
   * Get/Set X values as a Variant array of doubles. Set Npts to max number expected if setting
   * </p>
   * <p>
   * Getter method for the COM property "Xarray"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object xarray();


  /**
   * <p>
   * Get/Set X values as a Variant array of doubles. Set Npts to max number expected if setting
   * </p>
   * <p>
   * Setter method for the COM property "Xarray"
   * </p>
   * @param value Mandatory java.lang.Object parameter.
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(15)
  void xarray(
    @MarshalAs(NativeType.VARIANT) java.lang.Object value);


  /**
   * <p>
   * Get/Set Y values in curve; Set Npts to max number expected if setting
   * </p>
   * <p>
   * Getter method for the COM property "Yarray"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(16)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object yarray();


  /**
   * <p>
   * Get/Set Y values in curve; Set Npts to max number expected if setting
   * </p>
   * <p>
   * Setter method for the COM property "Yarray"
   * </p>
   * @param value Mandatory java.lang.Object parameter.
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(17)
  void yarray(
    @MarshalAs(NativeType.VARIANT) java.lang.Object value);


  /**
   * <p>
   * Set X value or get interpolated value after setting Y
   * </p>
   * <p>
   * Getter method for the COM property "x"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(18)
  double x();


  /**
   * <p>
   * Set X value or get interpolated value after setting Y
   * </p>
   * <p>
   * Setter method for the COM property "x"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(19)
  void x(
    double value);


  /**
   * <p>
   * Y value for present X or set this value then get corresponding X
   * </p>
   * <p>
   * Getter method for the COM property "y"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(20)
  double y();


  /**
   * <p>
   * Y value for present X or set this value then get corresponding X
   * </p>
   * <p>
   * Setter method for the COM property "y"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(21)
  void y(
    double value);


  /**
   * <p>
   * Amount to shift X value from original curve
   * </p>
   * <p>
   * Getter method for the COM property "Xshift"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(22)
  double xshift();


  /**
   * <p>
   * Amount to shift X value from original curve
   * </p>
   * <p>
   * Setter method for the COM property "Xshift"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(23)
  void xshift(
    double value);


  /**
   * <p>
   * amount to shift Y valiue from original curve
   * </p>
   * <p>
   * Getter method for the COM property "Yshift"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(24)
  double yshift();


  /**
   * <p>
   * amount to shift Y valiue from original curve
   * </p>
   * <p>
   * Setter method for the COM property "Yshift"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(25)
  void yshift(
    double value);


  /**
   * <p>
   * Factor to scale X values from original curve
   * </p>
   * <p>
   * Getter method for the COM property "Xscale"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(26)
  double xscale();


  /**
   * <p>
   * Factor to scale X values from original curve
   * </p>
   * <p>
   * Setter method for the COM property "Xscale"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(27)
  void xscale(
    double value);


  /**
   * <p>
   * Factor to scale Y values from original curve
   * </p>
   * <p>
   * Getter method for the COM property "Yscale"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(28)
  double yscale();


  /**
   * <p>
   * Factor to scale Y values from original curve
   * </p>
   * <p>
   * Setter method for the COM property "Yscale"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(29)
  void yscale(
    double value);


  // Properties:
}
