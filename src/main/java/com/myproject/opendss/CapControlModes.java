package com.myproject.opendss  ;

import com4j.*;

/**
 */
public enum CapControlModes implements ComEnum {
  /**
   * <p>
   * voltage control, ON and OFF settings on the PT secondary base
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  dssCapControlVoltage(1),
  /**
   * <p>
   * kVAR control, ON and OFF settings on PT / CT base
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  dssCapControlKVAR(2),
  /**
   * <p>
   * Current control, ON and OFF settings on CT secondary
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  dssCapControlCurrent(0),
  /**
   * <p>
   * ON and OFF settings are power factor, negative for leading
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  dssCapControlPF(4),
  /**
   * <p>
   * Time control, ON and OFF settings are seconds from midnight
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  dssCapControlTime(3),
  ;

  private final int value;
  CapControlModes(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
