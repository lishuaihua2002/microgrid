package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for DSS_Executive Object
 */
@IID("{DD7B80E9-5EFB-4E79-96CA-9C88F5A8A11C}")
public interface IDSS_Executive extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Number of DSS Executive Commands
   * </p>
   * <p>
   * Getter method for the COM property "NumCommands"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  int numCommands();


  /**
   * <p>
   * Number of DSS Executive Options
   * </p>
   * <p>
   * Getter method for the COM property "NumOptions"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  int numOptions();


  /**
   * <p>
   * Get i-th command
   * </p>
   * <p>
   * Getter method for the COM property "Command"
   * </p>
   * @param i Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String command(
    int i);


  /**
   * <p>
   * Get i-th option
   * </p>
   * <p>
   * Getter method for the COM property "Option"
   * </p>
   * @param i Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String option(
    int i);


  /**
   * <p>
   * Get help string for i-th command
   * </p>
   * <p>
   * Getter method for the COM property "CommandHelp"
   * </p>
   * @param i Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String commandHelp(
    int i);


  /**
   * <p>
   * Get help string for i-th option
   * </p>
   * <p>
   * Getter method for the COM property "OptionHelp"
   * </p>
   * @param i Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String optionHelp(
    int i);


  /**
   * <p>
   * Get present value of i-th option
   * </p>
   * <p>
   * Getter method for the COM property "OptionValue"
   * </p>
   * @param i Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String optionValue(
    int i);


  // Properties:
}
