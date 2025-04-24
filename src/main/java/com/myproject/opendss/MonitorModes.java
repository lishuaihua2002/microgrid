package com.myproject.opendss  ;

import com4j.*;

/**
 * <p>
 * Modes for Monitors
 * </p>
 */
public enum MonitorModes implements ComEnum {
  /**
   * <p>
   * Monitor records Voltage and Current at the terminal (Default)
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  dssVI(0),
  /**
   * <p>
   * Monitor records kW, kvar or kVA, angle values, etc. at the terminal to which it is connected.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  dssPower(1),
  /**
   * <p>
   * Reports the monitored quantities as sequence quantities
   * </p>
   * <p>
   * The value of this constant is 16
   * </p>
   */
  dssSequence(16),
  /**
   * <p>
   * Reports the monitored quantities in Magnitude Only
   * </p>
   * <p>
   * The value of this constant is 32
   * </p>
   */
  dssMagnitude(32),
  /**
   * <p>
   * Reports the Positive Seq only or avg of all phases
   * </p>
   * <p>
   * The value of this constant is 64
   * </p>
   */
  dssPosOnly(64),
  /**
   * <p>
   * For monitoring Regulator and Transformer taps
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  dssTaps(2),
  /**
   * <p>
   * For monitoring State Variables (for PC Elements only)
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  dssStates(3),
  ;

  private final int value;
  MonitorModes(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
