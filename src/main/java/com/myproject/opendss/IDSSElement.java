package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for DSSElement Object
 */
@IID("{C22D4922-6DC2-4283-93AB-4F2138C4B922}")
public interface IDSSElement extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Full Name of Active DSS Object (general element or circuit element).
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
   * Collection of properties for Active DSS object (general element or circuit element).
   * </p>
   * <p>
   * Getter method for the COM property "Properties"
   * </p>
   * @param indx Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com.myproject.opendss.IDSSProperty
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  com.myproject.opendss.IDSSProperty properties(
    @MarshalAs(NativeType.VARIANT) java.lang.Object indx);


  /**
   * <p>
   * Number of Properties for the active DSS object.
   * </p>
   * <p>
   * Getter method for the COM property "NumProperties"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  int numProperties();


  /**
   * <p>
   * Variant array of strings containing the names of all properties for the active DSS object.
   * </p>
   * <p>
   * Getter method for the COM property "AllPropertyNames"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object allPropertyNames();


  // Properties:
}
