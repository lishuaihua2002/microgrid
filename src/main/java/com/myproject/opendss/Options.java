package com.myproject.opendss  ;

import com4j.*;

/**
 */
public enum Options implements ComEnum {
  /**
   * <p>
   * Power Flow load model option
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  dssPowerFlow(1),
  /**
   * <p>
   * Admittance load model option
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  dssAdmittance(2),
  /**
   * <p>
   * Solution algorithm option - Normal solution mode
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  dssNormalSolve(0),
  /**
   * <p>
   * Solution algorithm option - Newton solution
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  dssNewtonSolve(1),
  /**
   * <p>
   * Control Mode option - Static
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  dssStatic(0),
  /**
   * <p>
   * Control Mode Option - Event driven solution mode
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  dssEvent(1),
  /**
   * <p>
   * Control mode option - Time driven mode
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  dssTime(2),
  /**
   * <p>
   * Circuit model is multiphase (default)
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  dssMultiphase(0),
  /**
   * <p>
   * Circuit model is positive sequence model only
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  dssPositiveSeq(1),
  /**
   * <p>
   * Random mode = Gaussian
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  dssGaussian(1),
  /**
   * <p>
   * Random mode = Uniform
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  dssUniform(2),
  /**
   * <p>
   * Random Mode = Log normal
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  dssLogNormal(3),
  /**
   * <p>
   * Add generators in AutoAdd mode (AddType)
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  dssAddGen(1),
  /**
   * <p>
   * Add capacitors in AutoAdd mode (Addtype)
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  dssAddCap(2),
  /**
   * <p>
   * Control Mode OFF = -1
   * </p>
   * <p>
   * The value of this constant is -1
   * </p>
   */
  dssControlOFF(-1),
  ;

  private final int value;
  Options(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
