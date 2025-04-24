package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for ActiveClass Object
 */
@IID("{8E73B64C-0D99-4D19-AB90-170DBBD06FA0}")
public interface IActiveClass extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Variant array of strings consisting of all element names in the active class.
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
   * Sets first element in the active class to be the active DSS object. If object is a CktElement, ActiveCktELment also points to this element. Returns 0 if none.
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
   * Sets next element in active class to be the active DSS object. If object is a CktElement, ActiveCktElement also points to this element.  Returns 0 if no more.
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
   * Name of the Active Element of the Active Class
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
   * Name of the Active Element of the Active Class
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
   * Number of elements in this class. Same as Count property.
   * </p>
   * <p>
   * Getter method for the COM property "NumElements"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(12)
  int numElements();


  /**
   * <p>
   * Returns name of active class.
   * </p>
   * <p>
   * Getter method for the COM property "ActiveClassName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String activeClassName();


  /**
   * <p>
   * Number of elements in Active Class. Same as NumElements Property.
   * </p>
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(14)
  int count();


  /**
   * <p>
   * Use this property (Read only) for getting the name of the parent class' name of the active class
   * </p>
   * <p>
   * Getter method for the COM property "ActiveClassParent"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String activeClassParent();


  // Properties:
}
