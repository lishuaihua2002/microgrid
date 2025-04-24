package com.myproject.opendss  ;

import com4j.*;

/**
 */
public enum SolveModes implements ComEnum {
  /**
   * <p>
   * Solve a single snapshot power flow
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  dssSnapShot(0),
  /**
   * <p>
   * Solve following Duty Cycle load shapes
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  dssDutyCycle(6),
  /**
   * <p>
   * Solve direct (forced admittance model)
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  dssDirect(7),
  /**
   * <p>
   * Solve following Daily load shapes
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  dssDaily(1),
  /**
   * <p>
   * Monte Carlo Mode 1
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  dssMonte1(3),
  /**
   * <p>
   * Monte Carlo Mode 2
   * </p>
   * <p>
   * The value of this constant is 10
   * </p>
   */
  dssMonte2(10),
  /**
   * <p>
   * Monte Carlo Mode 3
   * </p>
   * <p>
   * The value of this constant is 11
   * </p>
   */
  dssMonte3(11),
  /**
   * <p>
   * Fault study at all buses
   * </p>
   * <p>
   * The value of this constant is 9
   * </p>
   */
  dssFaultStudy(9),
  /**
   * <p>
   * Solve following Yearly load shapes
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  dssYearly(2),
  /**
   * <p>
   * Monte carlo Fault Study
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  dssMonteFault(8),
  /**
   * <p>
   * Solves for Peak Day using Daily load curve
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  dssPeakDay(5),
  /**
   * <p>
   * Load-duration Mode 1
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  dssLD1(4),
  /**
   * <p>
   * Load-Duration Mode 2
   * </p>
   * <p>
   * The value of this constant is 12
   * </p>
   */
  dssLD2(12),
  /**
   * <p>
   * Auto add generators or capacitors
   * </p>
   * <p>
   * The value of this constant is 13
   * </p>
   */
  dssAutoAdd(13),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  dssHarmonic(15),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  dssDynamic(14),
  ;

  private final int value;
  SolveModes(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
