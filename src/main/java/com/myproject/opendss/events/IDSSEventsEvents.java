package com.myproject.opendss.events;

import com4j.*;

/**
 * Events interface for DSSEvents Object
 */
@IID("{AE501F77-F7F0-4201-A9AD-6AB385262203}")
public abstract class IDSSEventsEvents {
  // Methods:
  /**
   * <p>
   * Notification to initialize the control model.
   * </p>
   */

  @DISPID(201)
  public void initControls() {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Notification that a time step solution is complete, and the control should update itself.
   * </p>
   */

  @DISPID(202)
  public void stepControls() {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Notification that a system solution has been performed, and controls should check and possibly create new events.
   * </p>
   */

  @DISPID(203)
  public void checkControls() {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
