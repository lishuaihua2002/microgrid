package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for PDElements Object
 */
@IID("{05D4E15E-1588-4ABB-8339-3527420C668B}")
public interface IPDElements extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Number of PD elements (including disabled elements)
   * </p>
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  int count();


  /**
   * <p>
   * Set the first enabled PD element to be the active element.  Returns 0 if none found.
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
   * Advance to the next PD element in the circuit. Enabled elements only. Returns 0 when no more elements.
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
   * Variant boolean indicating of PD element should be treated as a shunt element rather than a series element. Applies to Capacitor and Reactor elements in particular.
   * </p>
   * <p>
   * Getter method for the COM property "IsShunt"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(10)
  boolean isShunt();


  /**
   * <p>
   * Get/Set Number of failures per year. For LINE elements: Number of failures per unit length per year. 
   * </p>
   * <p>
   * Getter method for the COM property "FaultRate"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(11)
  double faultRate();


  /**
   * <p>
   * Get/Set Number of failures per year. For LINE elements: Number of failures per unit length per year. 
   * </p>
   * <p>
   * Setter method for the COM property "FaultRate"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(12)
  void faultRate(
    double value);


  /**
   * <p>
   * Get/Set percent of faults that are permanent (require repair). Otherwise, fault is assumed to be transient/temporary.
   * </p>
   * <p>
   * Getter method for the COM property "pctPermanent"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(13)
  double pctPermanent();


  /**
   * <p>
   * Get/Set percent of faults that are permanent (require repair). Otherwise, fault is assumed to be transient/temporary.
   * </p>
   * <p>
   * Setter method for the COM property "pctPermanent"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(14)
  void pctPermanent(
    double value);


  /**
   * <p>
   * Get/Set name of active PD Element. Returns null string if active element is not PDElement type.
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String name();


  /**
   * <p>
   * Get/Set name of active PD Element. Returns null string if active element is not PDElement type.
   * </p>
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(16)
  void name(
    java.lang.String value);


  /**
   * <p>
   * Failure rate for this branch. Faults per year including length of line.
   * </p>
   * <p>
   * Getter method for the COM property "Lambda"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(17)
  double lambda();


  /**
   * <p>
   * accummulated failure rate for this branch on downline
   * </p>
   * <p>
   * Getter method for the COM property "AccumulatedL"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(18)
  double accumulatedL();


  /**
   * <p>
   * Number of customers, this branch
   * </p>
   * <p>
   * Getter method for the COM property "Numcustomers"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(19)
  int numcustomers();


  /**
   * <p>
   * Total number of customers from this branch to the end of the zone
   * </p>
   * <p>
   * Getter method for the COM property "TotalCustomers"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(20)
  int totalCustomers();


  /**
   * <p>
   * Sets the parent PD element to be the active circuit element.  Returns 0 if no more elements upline.
   * </p>
   * <p>
   * Getter method for the COM property "ParentPDElement"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(21)
  int parentPDElement();


  /**
   * <p>
   * Number of the terminal of active PD element that is on the "from" side. This is set after the meter zone is determined.
   * </p>
   * <p>
   * Getter method for the COM property "FromTerminal"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(22)
  int fromTerminal();


  /**
   * <p>
   * Total miles of line from this element to the end of the zone. For recloser siting algorithm.
   * </p>
   * <p>
   * Getter method for the COM property "TotalMiles"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(23)
  double totalMiles();


  /**
   * <p>
   * Integer ID of the feeder section that this PDElement branch is part of
   * </p>
   * <p>
   * Getter method for the COM property "SectionID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(24)
  int sectionID();


  /**
   * <p>
   * Average repair time for this element in hours
   * </p>
   * <p>
   * Getter method for the COM property "RepairTime"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(25)
  double repairTime();


  /**
   * <p>
   * Average repair time for this element in hours
   * </p>
   * <p>
   * Setter method for the COM property "RepairTime"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(26)
  void repairTime(
    double value);


  // Properties:
}
