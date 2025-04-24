package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch to control parallel computations on OpenDSS
 */
@IID("{A0351633-A988-4A5B-B551-A7E2ADDD4984}")
public interface IParallel extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Delivers the number of CPUs on the current PC
   * </p>
   * <p>
   * Getter method for the COM property "NumCPUs"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  int numCPUs();


  /**
   * <p>
   * Delivers the number of Cores of the local PC
   * </p>
   * <p>
   * Getter method for the COM property "NumCores"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  int numCores();


  /**
   * <p>
   * Gets the ID of the Active Actor
   * </p>
   * <p>
   * Getter method for the COM property "ActiveActor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  int activeActor();


  /**
   * <p>
   * Gets the ID of the Active Actor
   * </p>
   * <p>
   * Setter method for the COM property "ActiveActor"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(10)
  void activeActor(
    int value);


  /**
   * <p>
   * Creates a New Actor
   * </p>
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(11)
  void createActor();


  /**
   * <p>
   * Gets the CPU of the Active Actor
   * </p>
   * <p>
   * Getter method for the COM property "ActorCPU"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(12)
  int actorCPU();


  /**
   * <p>
   * Gets the CPU of the Active Actor
   * </p>
   * <p>
   * Setter method for the COM property "ActorCPU"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(13)
  void actorCPU(
    int value);


  /**
   * <p>
   * Gets the number of Actors created
   * </p>
   * <p>
   * Getter method for the COM property "NumOfActors"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(14)
  int numOfActors();


  /**
   * <p>
   * Waits until all actors have finised their tasks
   * </p>
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(15)
  void wait_();


  /**
   * <p>
   * Gets the progress of all existing actors in pct
   * </p>
   * <p>
   * Getter method for the COM property "ActorProgress"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(16)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object actorProgress();


  /**
   * <p>
   * Gets the status of each actor
   * </p>
   * <p>
   * Getter method for the COM property "ActorStatus"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(17)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object actorStatus();


  /**
   * <p>
   * Sets ON/OFF (1/0) Parallel features of the Engine
   * </p>
   * <p>
   * Getter method for the COM property "ActiveParallel"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(18)
  int activeParallel();


  /**
   * <p>
   * Sets ON/OFF (1/0) Parallel features of the Engine
   * </p>
   * <p>
   * Setter method for the COM property "ActiveParallel"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(19)
  void activeParallel(
    int value);


  /**
   * <p>
   * Reads the values of the ConcatenateReports option (1=enabled, 0=disabled)
   * </p>
   * <p>
   * Getter method for the COM property "ConcatenateReports"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(20)
  int concatenateReports();


  /**
   * <p>
   * Reads the values of the ConcatenateReports option (1=enabled, 0=disabled)
   * </p>
   * <p>
   * Setter method for the COM property "ConcatenateReports"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(21)
  void concatenateReports(
    int value);


  // Properties:
}
