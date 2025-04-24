package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for Sensors Object
 */
@IID("{E7444ECD-B491-4D8E-A1E3-E5804BD571E2}")
public interface ISensors extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Name of the active sensor.
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String name();


  /**
   * <p>
   * Name of the active sensor.
   * </p>
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(8)
  void name(
    java.lang.String value);


  /**
   * <p>
   * Number of Sensors in Active Circuit.
   * </p>
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(9)
  int count();


  /**
   * <p>
   * Sets the first sensor active. Returns 0 if none.
   * </p>
   * <p>
   * Getter method for the COM property "First"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(10)
  int first();


  /**
   * <p>
   * Sets the next Sensor active. Returns 0 if no more.
   * </p>
   * <p>
   * Getter method for the COM property "Next"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(11)
  int next();


  /**
   * <p>
   * Variant array of Sensor names.
   * </p>
   * <p>
   * Getter method for the COM property "AllNames"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object allNames();


  /**
   * <p>
   * True if measured voltages are line-line. Currents are always line currents.
   * </p>
   * <p>
   * Getter method for the COM property "IsDelta"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(13)
  boolean isDelta();


  /**
   * <p>
   * True if measured voltages are line-line. Currents are always line currents.
   * </p>
   * <p>
   * Setter method for the COM property "IsDelta"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(14)
  void isDelta(
    boolean value);


  /**
   * <p>
   * True if voltage measurements are 1-3, 3-2, 2-1.
   * </p>
   * <p>
   * Getter method for the COM property "ReverseDelta"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(15)
  boolean reverseDelta();


  /**
   * <p>
   * True if voltage measurements are 1-3, 3-2, 2-1.
   * </p>
   * <p>
   * Setter method for the COM property "ReverseDelta"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(16)
  void reverseDelta(
    boolean value);


  /**
   * <p>
   * Assumed percent error in the Sensor measurement. Default is 1.
   * </p>
   * <p>
   * Getter method for the COM property "PctError"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(17)
  double pctError();


  /**
   * <p>
   * Assumed percent error in the Sensor measurement. Default is 1.
   * </p>
   * <p>
   * Setter method for the COM property "PctError"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(18)
  void pctError(
    double value);


  /**
   * <p>
   * Weighting factor for this Sensor measurement with respect to other Sensors. Default is 1.
   * </p>
   * <p>
   * Getter method for the COM property "Weight"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(19)
  double weight();


  /**
   * <p>
   * Weighting factor for this Sensor measurement with respect to other Sensors. Default is 1.
   * </p>
   * <p>
   * Setter method for the COM property "Weight"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(20)
  void weight(
    double value);


  /**
   * <p>
   * Full Name of the measured element
   * </p>
   * <p>
   * Getter method for the COM property "MeteredElement"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String meteredElement();


  /**
   * <p>
   * Full Name of the measured element
   * </p>
   * <p>
   * Setter method for the COM property "MeteredElement"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(22)
  void meteredElement(
    java.lang.String value);


  /**
   * <p>
   * Number of the measured terminal in the measured element.
   * </p>
   * <p>
   * Getter method for the COM property "MeteredTerminal"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(23)
  int meteredTerminal();


  /**
   * <p>
   * Number of the measured terminal in the measured element.
   * </p>
   * <p>
   * Setter method for the COM property "MeteredTerminal"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(24)
  void meteredTerminal(
    int value);


  /**
   * <p>
   * Clear the active Sensor.
   * </p>
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(25)
  void reset();


  /**
   * <p>
   * Clear all Sensors in the Active Circuit.
   * </p>
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(26)
  void resetAll();


  /**
   * <p>
   * Voltage base for the sensor measurements. LL for 2 and 3-phase sensors, LN for 1-phase sensors.
   * </p>
   * <p>
   * Getter method for the COM property "kVBase"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(27)
  double kVBase();


  /**
   * <p>
   * Voltage base for the sensor measurements. LL for 2 and 3-phase sensors, LN for 1-phase sensors.
   * </p>
   * <p>
   * Setter method for the COM property "kVBase"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(28)
  void kVBase(
    double value);


  /**
   * <p>
   * Array of doubles for the line current measurements; don't use with kWS and kVARS.
   * </p>
   * <p>
   * Getter method for the COM property "Currents"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(29)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object currents();


  /**
   * <p>
   * Array of doubles for the line current measurements; don't use with kWS and kVARS.
   * </p>
   * <p>
   * Setter method for the COM property "Currents"
   * </p>
   * @param value Mandatory java.lang.Object parameter.
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(30)
  void currents(
    @MarshalAs(NativeType.VARIANT) java.lang.Object value);


  /**
   * <p>
   * Array of doubles for the LL or LN (depending on Delta connection) voltage measurements.
   * </p>
   * <p>
   * Getter method for the COM property "kVS"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(31)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object kVS();


  /**
   * <p>
   * Array of doubles for the LL or LN (depending on Delta connection) voltage measurements.
   * </p>
   * <p>
   * Setter method for the COM property "kVS"
   * </p>
   * @param value Mandatory java.lang.Object parameter.
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(32)
  void kVS(
    @MarshalAs(NativeType.VARIANT) java.lang.Object value);


  /**
   * <p>
   * Array of doubles for Q measurements. Overwrites Currents with a new estimate using kWS.
   * </p>
   * <p>
   * Getter method for the COM property "kVARS"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(33)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object kVARS();


  /**
   * <p>
   * Array of doubles for Q measurements. Overwrites Currents with a new estimate using kWS.
   * </p>
   * <p>
   * Setter method for the COM property "kVARS"
   * </p>
   * @param value Mandatory java.lang.Object parameter.
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(34)
  void kVARS(
    @MarshalAs(NativeType.VARIANT) java.lang.Object value);


  /**
   * <p>
   * Array of doubles for P measurements. Overwrites Currents with a new estimate using kVARS.
   * </p>
   * <p>
   * Getter method for the COM property "kWS"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(35)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object kWS();


  /**
   * <p>
   * Array of doubles for P measurements. Overwrites Currents with a new estimate using kVARS.
   * </p>
   * <p>
   * Setter method for the COM property "kWS"
   * </p>
   * @param value Mandatory java.lang.Object parameter.
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(36)
  void kWS(
    @MarshalAs(NativeType.VARIANT) java.lang.Object value);


  /**
   * <p>
   * Array of doubles for the allocation factors for each phase. 
   * </p>
   * <p>
   * Getter method for the COM property "AllocationFactor"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(37)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object allocationFactor();


  // Properties:
}
