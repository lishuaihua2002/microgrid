package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for GICSources Object
 */
@IID("{F76B5BDE-9132-44FB-8115-70BF1B065FA4}")
public interface IGICSources extends Com4jObject {
  // Methods:
  /**
   * <p>
   * All GICSourceNames
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
   * First bus name of GICSource (Created name)
   * </p>
   * <p>
   * Getter method for the COM property "Bus1"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String bus1();


  /**
   * <p>
   * Second bus name
   * </p>
   * <p>
   * Getter method for the COM property "Bus2"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String bus2();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(11)
  void name(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "Phases"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(12)
  int phases();


  /**
   * <p>
   * Setter method for the COM property "Phases"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(13)
  void phases(
    int value);


  /**
   * <p>
   * Northward E Field V/km
   * </p>
   * <p>
   * Getter method for the COM property "EN"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(14)
  double en();


  /**
   * <p>
   * Northward E Field V/km
   * </p>
   * <p>
   * Setter method for the COM property "EN"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(15)
  void en(
    double value);


  /**
   * <p>
   * Eastward E Field, V/km
   * </p>
   * <p>
   * Getter method for the COM property "EE"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(16)
  double ee();


  /**
   * <p>
   * Eastward E Field, V/km
   * </p>
   * <p>
   * Setter method for the COM property "EE"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(17)
  void ee(
    double value);


  /**
   * <p>
   * Latitude of Bus1 (degrees)
   * </p>
   * <p>
   * Getter method for the COM property "Lat1"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(18)
  double lat1();


  /**
   * <p>
   * Latitude of Bus1 (degrees)
   * </p>
   * <p>
   * Setter method for the COM property "Lat1"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(19)
  void lat1(
    double value);


  /**
   * <p>
   * Latitude of Bus2 (degrees)
   * </p>
   * <p>
   * Getter method for the COM property "Lat2"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(20)
  double lat2();


  /**
   * <p>
   * Latitude of Bus2 (degrees)
   * </p>
   * <p>
   * Setter method for the COM property "Lat2"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(21)
  void lat2(
    double value);


  /**
   * <p>
   * Longitude of Bus1
   * </p>
   * <p>
   * Getter method for the COM property "Lon1"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(22)
  double lon1();


  /**
   * <p>
   * Longitude of Bus1
   * </p>
   * <p>
   * Setter method for the COM property "Lon1"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(23)
  void lon1(
    double value);


  /**
   * <p>
   * Longitude of Bus2 (Degrees)
   * </p>
   * <p>
   * Getter method for the COM property "Lon2"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(24)
  double lon2();


  /**
   * <p>
   * Longitude of Bus2 (Degrees)
   * </p>
   * <p>
   * Setter method for the COM property "Lon2"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(25)
  void lon2(
    double value);


  /**
   * <p>
   * Specify dc voltage directly
   * </p>
   * <p>
   * Getter method for the COM property "Volts"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(26)
  double volts();


  /**
   * <p>
   * Specify dc voltage directly
   * </p>
   * <p>
   * Setter method for the COM property "Volts"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(27)
  void volts(
    double value);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(28)
  int count();


  /**
   * <p>
   * Set first GIC Source Active
   * </p>
   * <p>
   * Getter method for the COM property "First"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(29)
  int first();


  /**
   * <p>
   * Set Next GICSource Active
   * </p>
   * <p>
   * Getter method for the COM property "Next"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(30)
  int next();


  // Properties:
}
