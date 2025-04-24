package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for Errror Object
 */
@IID("{B521E339-8ED2-4BD6-9AEB-FD349CA8D8E3}")
public interface IError extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Error Number
   * </p>
   * <p>
   * Getter method for the COM property "Number"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  int number();


  /**
   * <p>
   * Description of error for last operation
   * </p>
   * <p>
   * Getter method for the COM property "Description"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String description();


  // Properties:
}
