package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for DSSProgress Object
 */
@IID("{315C0C38-929C-4942-BDF8-6DA12D001B47}")
public interface IDSSProgress extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Percent progress to indicate [0..100]
   * </p>
   * <p>
   * Setter method for the COM property "PctProgress"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void pctProgress(
    int rhs);


  /**
   * <p>
   * Caption to appear on the bottom of the DSS Progress form.
   * </p>
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  void caption(
    java.lang.String rhs);


  /**
   * <p>
   * Shows progress form with null caption and progress set to zero.
   * </p>
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  void show();


  /**
   * <p>
   * Closes (hides) DSS Progress form.
   * </p>
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  void close();


  // Properties:
}
