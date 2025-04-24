package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for Topology Object
 */
@IID("{03FADB98-4F30-416E-ACD2-9BD987A0CBC3}")
public interface ITopology extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Number of loops
   * </p>
   * <p>
   * Getter method for the COM property "NumLoops"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  int numLoops();


  /**
   * <p>
   * Number of isolated branches (PD elements and capacitors).
   * </p>
   * <p>
   * Getter method for the COM property "NumIsolatedBranches"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  int numIsolatedBranches();


  /**
   * <p>
   * Variant array of all looped element names, by pairs.
   * </p>
   * <p>
   * Getter method for the COM property "AllLoopedPairs"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object allLoopedPairs();


  /**
   * <p>
   * Variant array of all isolated branch names.
   * </p>
   * <p>
   * Getter method for the COM property "AllIsolatedBranches"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object allIsolatedBranches();


  /**
   * <p>
   * Number of isolated loads
   * </p>
   * <p>
   * Getter method for the COM property "NumIsolatedLoads"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(11)
  int numIsolatedLoads();


  /**
   * <p>
   * Variant array of all isolated load names.
   * </p>
   * <p>
   * Getter method for the COM property "AllIsolatedLoads"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object allIsolatedLoads();


  /**
   * <p>
   * Name of the active branch.
   * </p>
   * <p>
   * Getter method for the COM property "BranchName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String branchName();


  /**
   * <p>
   * Name of the active branch.
   * </p>
   * <p>
   * Setter method for the COM property "BranchName"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(14)
  void branchName(
    java.lang.String value);


  /**
   * <p>
   * Sets the first branch active, returns 0 if none.
   * </p>
   * <p>
   * Getter method for the COM property "First"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(15)
  int first();


  /**
   * <p>
   * Sets the next branch active, returns 0 if no more.
   * </p>
   * <p>
   * Getter method for the COM property "Next"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(16)
  int next();


  /**
   * <p>
   * Returns index of the active branch
   * </p>
   * <p>
   * Getter method for the COM property "ActiveBranch"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(17)
  int activeBranch();


  /**
   * <p>
   * Move forward in the tree, return index of new active branch or 0 if no more
   * </p>
   * <p>
   * Getter method for the COM property "ForwardBranch"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(18)
  int forwardBranch();


  /**
   * <p>
   * MOve back toward the source, return index of new active branch, or 0 if no more.
   * </p>
   * <p>
   * Getter method for the COM property "BackwardBranch"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(19)
  int backwardBranch();


  /**
   * <p>
   * Move to looped branch, return index or 0 if none.
   * </p>
   * <p>
   * Getter method for the COM property "LoopedBranch"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(20)
  int loopedBranch();


  /**
   * <p>
   * Move to directly parallel branch, return index or 0 if none.
   * </p>
   * <p>
   * Getter method for the COM property "ParallelBranch"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(21)
  int parallelBranch();


  /**
   * <p>
   * First load at the active branch, return index or 0 if none.
   * </p>
   * <p>
   * Getter method for the COM property "FirstLoad"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(22)
  int firstLoad();


  /**
   * <p>
   * Next load at the active branch, return index or 0 if no more.
   * </p>
   * <p>
   * Getter method for the COM property "NextLoad"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(23)
  int nextLoad();


  /**
   * <p>
   * Topological depth of the active branch
   * </p>
   * <p>
   * Getter method for the COM property "ActiveLevel"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(24)
  int activeLevel();


  /**
   * <p>
   * Getter method for the COM property "BusName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(25)
  java.lang.String busName();


  /**
   * <p>
   * Setter method for the COM property "BusName"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(26)
  void busName(
    java.lang.String value);


  // Properties:
}
