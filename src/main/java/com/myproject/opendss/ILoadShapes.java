package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for LoadShapes Object
 */
@IID("{196861FB-38C6-4FB4-B8A5-B2DDA3DDA663}")
public interface ILoadShapes extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Get the Name of the active Loadshape
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String name();


  /**
   * <p>
   * Get the Name of the active Loadshape
   * </p>
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(8)
  void name(
    java.lang.String value);


  /**
   * <p>
   * Number of Loadshape objects currently defined in Loadshape collection
   * </p>
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(9)
  int count();


  /**
   * <p>
   * Set the first loadshape active and return integer index of the loadshape. Returns 0 if none.
   * </p>
   * <p>
   * Getter method for the COM property "First"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(10)
  int first();


  /**
   * <p>
   * Advance active Loadshape to the next on in the collection. Returns 0 if no more loadshapes.
   * </p>
   * <p>
   * Getter method for the COM property "Next"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(11)
  int next();


  /**
   * <p>
   * Variant array of strings containing names of all Loadshape objects currently defined.
   * </p>
   * <p>
   * Getter method for the COM property "AllNames"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object allNames();


  /**
   * <p>
   * Get Number of points in active Loadshape.
   * </p>
   * <p>
   * Getter method for the COM property "Npts"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(13)
  int npts();


  /**
   * <p>
   * Get Number of points in active Loadshape.
   * </p>
   * <p>
   * Setter method for the COM property "Npts"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(14)
  void npts(
    int value);


  /**
   * <p>
   * Variant array of Doubles for the P multiplier in the Loadshape.
   * </p>
   * <p>
   * Getter method for the COM property "Pmult"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(15)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object pmult();


  /**
   * <p>
   * Variant array of Doubles for the P multiplier in the Loadshape.
   * </p>
   * <p>
   * Setter method for the COM property "Pmult"
   * </p>
   * @param value Mandatory java.lang.Object parameter.
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(16)
  void pmult(
    @MarshalAs(NativeType.VARIANT) java.lang.Object value);


  /**
   * <p>
   * Variant array of doubles containing the Q multipliers.
   * </p>
   * <p>
   * Getter method for the COM property "Qmult"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(17)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object qmult();


  /**
   * <p>
   * Variant array of doubles containing the Q multipliers.
   * </p>
   * <p>
   * Setter method for the COM property "Qmult"
   * </p>
   * @param value Mandatory java.lang.Object parameter.
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(18)
  void qmult(
    @MarshalAs(NativeType.VARIANT) java.lang.Object value);


  /**
   * <p>
   * Normalize the P and Q curves based on either Pbase, Qbase or simply the peak value of the curve.
   * </p>
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(19)
  void normalize();


  /**
   * <p>
   * Time array in hours correscponding to P and Q multipliers when the Interval=0.
   * </p>
   * <p>
   * Getter method for the COM property "TimeArray"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(20)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object timeArray();


  /**
   * <p>
   * Time array in hours correscponding to P and Q multipliers when the Interval=0.
   * </p>
   * <p>
   * Setter method for the COM property "TimeArray"
   * </p>
   * @param value Mandatory java.lang.Object parameter.
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(21)
  void timeArray(
    @MarshalAs(NativeType.VARIANT) java.lang.Object value);


  /**
   * <p>
   * Fixed interval time value, hours
   * </p>
   * <p>
   * Getter method for the COM property "HrInterval"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(22)
  double hrInterval();


  /**
   * <p>
   * Fixed interval time value, hours
   * </p>
   * <p>
   * Setter method for the COM property "HrInterval"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(23)
  void hrInterval(
    double value);


  /**
   * <p>
   * Fixed Interval time value, in minutes
   * </p>
   * <p>
   * Getter method for the COM property "MinInterval"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(24)
  double minInterval();


  /**
   * <p>
   * Fixed Interval time value, in minutes
   * </p>
   * <p>
   * Setter method for the COM property "MinInterval"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(25)
  void minInterval(
    double value);


  /**
   * <p>
   * Make a new Loadshape
   * </p>
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(26)
  void _new(
    java.lang.String name);


  /**
   * <p>
   * Base for normalizing P curve. If left at zero, the peak value is used.
   * </p>
   * <p>
   * Getter method for the COM property "Pbase"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(27)
  double pbase();


  /**
   * <p>
   * Base for normalizing P curve. If left at zero, the peak value is used.
   * </p>
   * <p>
   * Setter method for the COM property "Pbase"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(28)
  void pbase(
    double value);


  /**
   * <p>
   * Base for normalizing Q curve. If left at zero, the peak value is used.
   * </p>
   * <p>
   * Getter method for the COM property "Qbase"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(29)
  double qbase();


  /**
   * <p>
   * Base for normalizing Q curve. If left at zero, the peak value is used.
   * </p>
   * <p>
   * Setter method for the COM property "Qbase"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(30)
  void qbase(
    double value);


  /**
   * <p>
   * T/F flag to let Loads know to use the actual value in the curve rather than use the value as a multiplier.
   * </p>
   * <p>
   * Getter method for the COM property "UseActual"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(31)
  boolean useActual();


  /**
   * <p>
   * T/F flag to let Loads know to use the actual value in the curve rather than use the value as a multiplier.
   * </p>
   * <p>
   * Setter method for the COM property "UseActual"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(32)
  void useActual(
    boolean value);


  /**
   * <p>
   * Fixed interval data time interval, seconds
   * </p>
   * <p>
   * Getter method for the COM property "Sinterval"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(33)
  double sinterval();


  /**
   * <p>
   * Fixed interval data time interval, seconds
   * </p>
   * <p>
   * Setter method for the COM property "Sinterval"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(34)
  void sinterval(
    double value);


  // Properties:
}
