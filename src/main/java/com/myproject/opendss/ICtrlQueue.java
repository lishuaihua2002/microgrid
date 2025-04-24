package com.myproject.opendss  ;

import com4j.*;

/**
 * Interface for CtrlQueue Object
 */
@IID("{55055001-5EEC-4667-9CCA-63F3A60F31F3}")
public interface ICtrlQueue extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Clear control queue
   * </p>
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(7)
  void clearQueue();


  /**
   * <p>
   * Delete a control action from the DSS control queue by referencing the handle of the action
   * </p>
   * @param actionHandle Mandatory int parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(8)
  void delete(
    int actionHandle);


  /**
   * <p>
   * Number of Actions on the current actionlist (that have been popped off the control queue by CheckControlActions)
   * </p>
   * <p>
   * Getter method for the COM property "NumActions"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(9)
  int numActions();


  /**
   * <p>
   * Set the active action by index
   * </p>
   * <p>
   * Setter method for the COM property "Action"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(10)
  void action(
    int rhs);


  /**
   * <p>
   * Code for the active action. Long integer code to tell the control device what to do
   * </p>
   * <p>
   * Getter method for the COM property "ActionCode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(11)
  int actionCode();


  /**
   * <p>
   * Handle (User defined) to device that must act on the pending action.
   * </p>
   * <p>
   * Getter method for the COM property "DeviceHandle"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(12)
  int deviceHandle();


  /**
   * <p>
   * Push a control action onto the DSS control queue by time, action code, and device handle (user defined). Returns Control Queue handle.
   * </p>
   * @param hour Mandatory int parameter.
   * @param seconds Mandatory double parameter.
   * @param actionCode Mandatory int parameter.
   * @param deviceHandle Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(13)
  int push(
    int hour,
    double seconds,
    int actionCode,
    int deviceHandle);


  /**
   * <p>
   * Show entire control queue in CSV format
   * </p>
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(14)
  void show();


  /**
   * <p>
   * Clear the Action list.
   * </p>
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(15)
  void clearActions();


  /**
   * <p>
   * Pops next action off the action list and makes it the active action. Returns zero if none.
   * </p>
   * <p>
   * Getter method for the COM property "PopAction"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(16)
  int popAction();


  /**
   * <p>
   * Number of items on the OpenDSS control Queue
   * </p>
   * <p>
   * Getter method for the COM property "QueueSize"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(17)
  int queueSize();


  /**
   * <p>
   * Do All Actions currently on the Control queue. Side effect: clears the queue
   * </p>
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(18)
  void doAllQueue();


  /**
   * <p>
   * Variant array of strings containing the entire queue in CSV format
   * </p>
   * <p>
   * Getter method for the COM property "Queue"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(19)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object queue();


  // Properties:
}
