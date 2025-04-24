package com.myproject.opendss  ;

import com4j.*;

/**
 * Used for communicating directly with DSSim and to extract some specific info
 */
@IID("{25C5373D-5888-4A0C-974B-77EBD57ED0D1}")
public interface IDSSimComs extends Com4jObject {
  // Methods:
  /**
   * <p>
   * This method delivers the voltage pu of the specified bus, this specification must be with a number (index)
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object busVoltagepu(
    int index);


  /**
   * <p>
   * This method delivers the voltage (complex) of the specified bus, this specification must be with a number (index)
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object busVoltage(
    int index);


  // Properties:
}
