package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for PVSystems Object
 */
@IID("{FAF19717-5887-43F6-8DC3-D0337E1081AD}")
public interface IPVSystems extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Vairant array of strings with all PVSystem names
   * </p>
   * <p>
   * Getter method for the COM property "AllNames"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object allNames();


  /**
   * <p>
   * Variant Array of PVSYSTEM energy meter register names
   * </p>
   * <p>
   * Getter method for the COM property "RegisterNames"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object registerNames();


  /**
   * <p>
   * Variant array of doubles containing values in PVSystem registers.
   * </p>
   * <p>
   * Getter method for the COM property "RegisterValues"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object registerValues();


  /**
   * <p>
   * Set first PVSystem active; returns 0 if none.
   * </p>
   * <p>
   * Getter method for the COM property "First"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(10)
  int first();


  /**
   * <p>
   * Sets next PVSystem active; returns 0 if no more.
   * </p>
   * <p>
   * Getter method for the COM property "Next"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(11)
  int next();


  /**
   * <p>
   * Number of PVSystems
   * </p>
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(12)
  int count();


  /**
   * <p>
   * Get/set active PVSystem by index;  1..Count
   * </p>
   * <p>
   * Getter method for the COM property "idx"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(13)
  int idx();


  /**
   * <p>
   * Get/set active PVSystem by index;  1..Count
   * </p>
   * <p>
   * Setter method for the COM property "idx"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(14)
  void idx(
    int value);


  /**
   * <p>
   * Get the name of the active PVSystem
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String name();


  /**
   * <p>
   * Get the name of the active PVSystem
   * </p>
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(16)
  void name(
    java.lang.String value);


  /**
   * <p>
   * Get the present value of the Irradiance property in W/sq-m
   * </p>
   * <p>
   * Getter method for the COM property "Irradiance"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(17)
  double irradiance();


  /**
   * <p>
   * Get the present value of the Irradiance property in W/sq-m
   * </p>
   * <p>
   * Setter method for the COM property "Irradiance"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(18)
  void irradiance(
    double value);


  /**
   * <p>
   * get kW output
   * </p>
   * <p>
   * Getter method for the COM property "kW"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(19)
  double kW();


  /**
   * <p>
   * Get kvar value
   * </p>
   * <p>
   * Getter method for the COM property "kvar"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(20)
  double kvar();


  /**
   * <p>
   * Get kvar value
   * </p>
   * <p>
   * Setter method for the COM property "kvar"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(21)
  void kvar(
    double value);


  /**
   * <p>
   * Get Power factor 
   * </p>
   * <p>
   * Getter method for the COM property "PF"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(22)
  double pf();


  /**
   * <p>
   * Get Power factor 
   * </p>
   * <p>
   * Setter method for the COM property "PF"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(23)
  void pf(
    double value);


  /**
   * <p>
   * Get Rated kVA of the PVSystem
   * </p>
   * <p>
   * Getter method for the COM property "kVArated"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(24)
  double kVArated();


  /**
   * <p>
   * Get Rated kVA of the PVSystem
   * </p>
   * <p>
   * Setter method for the COM property "kVArated"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(25)
  void kVArated(
    double value);


  /**
   * <p>
   * Gets the rated max power of the PV array for 1.0 kW/sq-m irradiance and a user-selected array temperature of the active PVSystem.
   * </p>
   * <p>
   * Getter method for the COM property "Pmpp"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(26)
  double pmpp();


  /**
   * <p>
   * Gets the rated max power of the PV array for 1.0 kW/sq-m irradiance and a user-selected array temperature of the active PVSystem.
   * </p>
   * <p>
   * Setter method for the COM property "Pmpp"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(27)
  void pmpp(
    double value);


  /**
   * <p>
   * Returns the current irradiance value for the active PVSystem. Use it to know what's the current irradiance value for the PV during a simulation.
   * </p>
   * <p>
   * Getter method for the COM property "IrradianceNow"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(28)
  double irradianceNow();


  /**
   * <p>
   * Name of the sensor monitoring this element.
   * </p>
   * <p>
   * Getter method for the COM property "Sensor"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(29)
  java.lang.String sensor();


  // Properties:
}
