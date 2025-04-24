package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for Capacitors
 */
@IID("{3C171A69-40AB-46AA-B037-9C4EBB9FBFCD}")
public interface ICapacitors extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Bank kV rating. Use LL for 2 or 3 phases, or actual can rating for 1 phase.
   * </p>
   * <p>
   * Getter method for the COM property "kV"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  double kV();


  /**
   * <p>
   * Bank kV rating. Use LL for 2 or 3 phases, or actual can rating for 1 phase.
   * </p>
   * <p>
   * Setter method for the COM property "kV"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(8)
  void kV(
    double value);


  /**
   * <p>
   * Total bank KVAR, distributed equally among phases and steps.
   * </p>
   * <p>
   * Getter method for the COM property "kvar"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(9)
  double kvar();


  /**
   * <p>
   * Total bank KVAR, distributed equally among phases and steps.
   * </p>
   * <p>
   * Setter method for the COM property "kvar"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(10)
  void kvar(
    double value);


  /**
   * <p>
   * Number of steps (default 1) for distributing and switching the total bank kVAR.
   * </p>
   * <p>
   * Getter method for the COM property "NumSteps"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(11)
  int numSteps();


  /**
   * <p>
   * Number of steps (default 1) for distributing and switching the total bank kVAR.
   * </p>
   * <p>
   * Setter method for the COM property "NumSteps"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(12)
  void numSteps(
    int value);


  /**
   * <p>
   * Delta connection or wye?) for distributing and switching the total bank kVAR.
   * </p>
   * <p>
   * Getter method for the COM property "IsDelta"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(13)
  boolean isDelta();


  /**
   * <p>
   * Delta connection or wye?) for distributing and switching the total bank kVAR.
   * </p>
   * <p>
   * Setter method for the COM property "IsDelta"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(14)
  void isDelta(
    boolean value);


  /**
   * <p>
   * Variant array of strings with all Capacitor names in the circuit.
   * </p>
   * <p>
   * Getter method for the COM property "AllNames"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(15)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object allNames();


  /**
   * <p>
   * Sets the first Capacitor active. Returns 0 if no more.
   * </p>
   * <p>
   * Getter method for the COM property "First"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(16)
  int first();


  /**
   * <p>
   * Sets the next Capacitor active. Returns 0 if no more.
   * </p>
   * <p>
   * Getter method for the COM property "Next"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(17)
  int next();


  /**
   * <p>
   * Sets the acitve Capacitor by Name.
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String name();


  /**
   * <p>
   * Sets the acitve Capacitor by Name.
   * </p>
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(19)
  void name(
    java.lang.String value);


  /**
   * <p>
   * Number of Capacitor objects in active circuit.
   * </p>
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(20)
  int count();


  /**
   * <p>
   * Adds one step of the capacitor if available. If successful returns TRUE.
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(21)
  boolean addStep();


  /**
   * <p>
   * Subtract one capacitor step.  Returns False if no more steps.
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(22)
  boolean subtractStep();


  /**
   * <p>
   * Number of Steps available in cap bank to be switched ON.
   * </p>
   * <p>
   * Getter method for the COM property "AvailableSteps"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(23)
  int availableSteps();


  /**
   * <p>
   * A variant array of  integer [0..numsteps-1] indicating state of each step. If value is -1 an error has occurred.
   * </p>
   * <p>
   * Getter method for the COM property "States"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(24)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object states();


  /**
   * <p>
   * A variant array of  integer [0..numsteps-1] indicating state of each step. If value is -1 an error has occurred.
   * </p>
   * <p>
   * Setter method for the COM property "States"
   * </p>
   * @param value Mandatory java.lang.Object parameter.
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(25)
  void states(
    @MarshalAs(NativeType.VARIANT) java.lang.Object value);


  /**
   * <p>
   * Open all steps, all phases of the Capacitor 
   * </p>
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(26)
  void open();


  /**
   * <p>
   * Close all phases of all steps of the Capacitor
   * </p>
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(27)
  void close();


  // Properties:
}
