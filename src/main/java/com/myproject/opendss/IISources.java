package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for ISources Object
 */
@IID("{CB2C7310-1717-4C6E-A7B8-DA54CF1722CD}")
public interface IISources extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Variant array of strings containing names of all ISOURCE elements.
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
   * Count: Number of ISOURCE elements.
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
   * Set the First ISOURCE to be active; returns Zero if none.
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
   * Sets the next ISOURCE element to be the active one. Returns Zero if no more.
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
   * Get name of active ISOURCE
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
   * Get name of active ISOURCE
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
   * Get the magnitude of the ISOURCE in amps
   * </p>
   * <p>
   * Getter method for the COM property "Amps"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(13)
  double amps();


  /**
   * <p>
   * Get the magnitude of the ISOURCE in amps
   * </p>
   * <p>
   * Setter method for the COM property "Amps"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(14)
  void amps(
    double value);


  /**
   * <p>
   * Phase angle for ISOURCE, degrees
   * </p>
   * <p>
   * Getter method for the COM property "AngleDeg"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(15)
  double angleDeg();


  /**
   * <p>
   * Phase angle for ISOURCE, degrees
   * </p>
   * <p>
   * Setter method for the COM property "AngleDeg"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(16)
  void angleDeg(
    double value);


  /**
   * <p>
   * The present frequency of the ISOURCE, Hz
   * </p>
   * <p>
   * Getter method for the COM property "Frequency"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(17)
  double frequency();


  /**
   * <p>
   * The present frequency of the ISOURCE, Hz
   * </p>
   * <p>
   * Setter method for the COM property "Frequency"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(18)
  void frequency(
    double value);


  // Properties:
}
