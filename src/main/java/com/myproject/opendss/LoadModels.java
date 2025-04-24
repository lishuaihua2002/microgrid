package com.myproject.opendss  ;

import com4j.*;

/**
 */
public enum LoadModels implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  dssLoadConstPQ(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  dssLoadConstZ(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  dssLoadMotor(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  dssLoadCVR(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  dssLoadConstI(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  dssLoadConstPFixedQ(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  dssLoadConstPFixedX(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  dssLoadZIPV(8),
  ;

  private final int value;
  LoadModels(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
