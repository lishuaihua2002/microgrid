package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for Parser Object
 */
@IID("{9714FED4-9D39-4692-B76B-9A18F206A934}")
public interface IParser extends Com4jObject {
  // Methods:
  /**
   * <p>
   * String to be parsed. Loading this string resets the Parser to the beginning of the line. Then parse off the tokens in sequence.
   * </p>
   * <p>
   * Getter method for the COM property "CmdString"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String cmdString();


  /**
   * <p>
   * String to be parsed. Loading this string resets the Parser to the beginning of the line. Then parse off the tokens in sequence.
   * </p>
   * <p>
   * Setter method for the COM property "CmdString"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(8)
  void cmdString(
    java.lang.String value);


  /**
   * <p>
   * Get next token and return tag name (before = sign) if any. See AutoIncrement.
   * </p>
   * <p>
   * Getter method for the COM property "NextParam"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String nextParam();


  /**
   * <p>
   * Default is FALSE. If TRUE parser automatically advances to next token after DblValue, IntValue, or StrValue. Simpler when you don't need to check for parameter names.
   * </p>
   * <p>
   * Getter method for the COM property "AutoIncrement"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(10)
  boolean autoIncrement();


  /**
   * <p>
   * Default is FALSE. If TRUE parser automatically advances to next token after DblValue, IntValue, or StrValue. Simpler when you don't need to check for parameter names.
   * </p>
   * <p>
   * Setter method for the COM property "AutoIncrement"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(11)
  void autoIncrement(
    boolean value);


  /**
   * <p>
   * Return next parameter as a double.
   * </p>
   * <p>
   * Getter method for the COM property "DblValue"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(12)
  double dblValue();


  /**
   * <p>
   * Return next parameter as a long integer.
   * </p>
   * <p>
   * Getter method for the COM property "IntValue"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(13)
  int intValue();


  /**
   * <p>
   * Return next parameter as a string
   * </p>
   * <p>
   * Getter method for the COM property "StrValue"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String strValue();


  /**
   * <p>
   * Get the characters used for White space in the command string.  Default is blank and Tab.
   * </p>
   * <p>
   * Getter method for the COM property "WhiteSpace"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String whiteSpace();


  /**
   * <p>
   * Get the characters used for White space in the command string.  Default is blank and Tab.
   * </p>
   * <p>
   * Setter method for the COM property "WhiteSpace"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(16)
  void whiteSpace(
    java.lang.String value);


  /**
   * <p>
   * Get String containing the the characters for Quoting in OpenDSS scripts. Matching pairs defined in EndQuote. Default is "'([{.
   * </p>
   * <p>
   * Getter method for the COM property "BeginQuote"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String beginQuote();


  /**
   * <p>
   * Get String containing the the characters for Quoting in OpenDSS scripts. Matching pairs defined in EndQuote. Default is "'([{.
   * </p>
   * <p>
   * Setter method for the COM property "BeginQuote"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(18)
  void beginQuote(
    java.lang.String value);


  /**
   * <p>
   * String containing characters, in order, that match the beginning quote characters in BeginQuote. Default is "')]}
   * </p>
   * <p>
   * Getter method for the COM property "EndQuote"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(19)
  java.lang.String endQuote();


  /**
   * <p>
   * String containing characters, in order, that match the beginning quote characters in BeginQuote. Default is "')]}
   * </p>
   * <p>
   * Setter method for the COM property "EndQuote"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(20)
  void endQuote(
    java.lang.String value);


  /**
   * <p>
   * String defining hard delimiters used to separate token on the command string. Default is , and =. The = separates token name from token value. These override whitesspace to separate tokens.
   * </p>
   * <p>
   * Getter method for the COM property "Delimiters"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String delimiters();


  /**
   * <p>
   * String defining hard delimiters used to separate token on the command string. Default is , and =. The = separates token name from token value. These override whitesspace to separate tokens.
   * </p>
   * <p>
   * Setter method for the COM property "Delimiters"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(22)
  void delimiters(
    java.lang.String value);


  /**
   * <p>
   * Reset delimiters to their default values.
   * </p>
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(23)
  void resetDelimiters();


  /**
   * <p>
   * Returns token as variant array of doubles. For parsing quoted array syntax.
   * </p>
   * <p>
   * Getter method for the COM property "Vector"
   * </p>
   * @param expectedSize Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(24)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object vector(
    int expectedSize);


  /**
   * <p>
   * Use this property to parse a Matrix token in OpenDSS format.  Returns square matrix of order specified. Order same as default Fortran order: column by column.
   * </p>
   * <p>
   * Getter method for the COM property "Matrix"
   * </p>
   * @param expectedOrder Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(25)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object matrix(
    int expectedOrder);


  /**
   * <p>
   * Use this property to parse a matrix token specified in lower triangle form. Symmetry is forced.
   * </p>
   * <p>
   * Getter method for the COM property "SymMatrix"
   * </p>
   * @param expectedOrder Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(26)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object symMatrix(
    int expectedOrder);


  // Properties:
}
