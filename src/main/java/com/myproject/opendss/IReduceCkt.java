package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for Reduce Object
 */
@IID("{02386435-8D77-4804-8ADB-89DDFBBE2BC0}")
public interface IReduceCkt extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Zmag for Short Line Reduction Algorithm
   * </p>
   * <p>
   * Getter method for the COM property "Zmag"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  double zmag();


  /**
   * <p>
   * Zmag for Short Line Reduction Algorithm
   * </p>
   * <p>
   * Setter method for the COM property "Zmag"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(8)
  void zmag(
    double value);


  /**
   * <p>
   * Keep load flag (T/F) for Reduction options that remove branches
   * </p>
   * <p>
   * Getter method for the COM property "KeepLoad"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(9)
  boolean keepLoad();


  /**
   * <p>
   * Keep load flag (T/F) for Reduction options that remove branches
   * </p>
   * <p>
   * Setter method for the COM property "KeepLoad"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(10)
  void keepLoad(
    boolean value);


  /**
   * <p>
   * Edit String for Remove Branches function
   * </p>
   * <p>
   * Getter method for the COM property "EditString"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String editString();


  /**
   * <p>
   * Edit String for Remove Branches function
   * </p>
   * <p>
   * Setter method for the COM property "EditString"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(12)
  void editString(
    java.lang.String value);


  /**
   * <p>
   * Start element for Remove Branch functions
   * </p>
   * <p>
   * Getter method for the COM property "StartPDElement"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String startPDElement();


  /**
   * <p>
   * Start element for Remove Branch functions
   * </p>
   * <p>
   * Setter method for the COM property "StartPDElement"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(14)
  void startPDElement(
    java.lang.String value);


  /**
   * <p>
   * Name of Energymeter to use for reduction
   * </p>
   * <p>
   * Getter method for the COM property "EnergyMeter"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String energyMeter();


  /**
   * <p>
   * Name of Energymeter to use for reduction
   * </p>
   * <p>
   * Setter method for the COM property "EnergyMeter"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(16)
  void energyMeter(
    java.lang.String value);


  /**
   * <p>
   * Save present (reduced) circuit
   * </p>
   * @param cktName Mandatory java.lang.String parameter.
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(17)
  void saveCircuit(
    java.lang.String cktName);


  /**
   * <p>
   * Do Default Reduction algorithm
   * </p>
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(18)
  void doDefault();


  /**
   * <p>
   * Do ShortLines algorithm: Set Zmag first if you don't want the default
   * </p>
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(19)
  void doShortLines();


  /**
   * <p>
   * Reduce Dangling Algorithm; branches with nothing connected
   * </p>
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(20)
  void doDangling();


  /**
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(21)
  void doLoopBreak();


  /**
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(22)
  void doParallelLines();


  /**
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(23)
  void doSwitches();


  /**
   * <p>
   * Eliminate all 1-phase laterals in the circuit
   * </p>
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(24)
  void do1phLaterals();


  /**
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(25)
  void doBranchRemove();


  // Properties:
}
