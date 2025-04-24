package com.myproject.opendss  ;

import com4j.*;

/**
 */
public enum ActionCodes {
  /**
   * <p>
   * No action
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  dssActionNone, // 0
  /**
   * <p>
   * Open a switch
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  dssActionOpen, // 1
  /**
   * <p>
   * Close a switch
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  dssActionClose, // 2
  /**
   * <p>
   * Reset to the shelf state (unlocked, closed for a switch)
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  dssActionReset, // 3
  /**
   * <p>
   * Lock a switch, prventing both manual and automatic operation
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  dssActionLock, // 4
  /**
   * <p>
   * Unlock a switch, permitting both manual and automatic operation
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  dssActionUnlock, // 5
  /**
   * <p>
   * Move a regulator tap up
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  dssActionTapUp, // 6
  /**
   * <p>
   * Move a regulator tap down
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  dssActionTapDown, // 7
}
