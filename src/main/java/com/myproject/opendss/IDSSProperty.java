package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for DSSProperty Object
 */
@IID("{1298D126-0750-4B2A-8462-62EFE7310DF2}")
public interface IDSSProperty extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Name of Property
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String name();


  /**
   * <p>
   * Description of the property.
   * </p>
   * <p>
   * Getter method for the COM property "Description"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String description();


  /**
   * <p>
   * Getter method for the COM property "Val"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String val();


  /**
   * <p>
   * Setter method for the COM property "Val"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  void val(
    java.lang.String value);


  // Properties:
}
