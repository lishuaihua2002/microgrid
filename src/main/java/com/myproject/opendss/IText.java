package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for Text Object
 */
@IID("{0513A8DC-2C0D-4648-8BD7-2130B82C05FA}")
public interface IText extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Input command string for the DSS.
   * </p>
   * <p>
   * Getter method for the COM property "Command"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String command();


  /**
   * <p>
   * Input command string for the DSS.
   * </p>
   * <p>
   * Setter method for the COM property "Command"
   * </p>
   * @param command Mandatory java.lang.String parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(8)
  void command(
    java.lang.String command);


  /**
   * <p>
   * Result string for the last command.
   * </p>
   * <p>
   * Getter method for the COM property "Result"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String result();


  // Properties:
}
