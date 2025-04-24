package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for Lines Object
 */
@IID("{E1616BDB-589B-4E5D-A7CE-828ACD73E5D4}")
public interface ILines extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Specify the name of the Line element to set it active.
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String name();


  /**
   * <p>
   * Specify the name of the Line element to set it active.
   * </p>
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(8)
  void name(
    java.lang.String value);


  /**
   * <p>
   * Names of all Line Objects
   * </p>
   * <p>
   * Getter method for the COM property "AllNames"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object allNames();


  /**
   * <p>
   * Invoking this property sets the first element active.  Returns 0 if no lines.  Otherwise, index of the line element.
   * </p>
   * <p>
   * Getter method for the COM property "First"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(10)
  int first();


  /**
   * <p>
   * Invoking this property advances to the next Line element active.  Returns 0 if no more lines.  Otherwise, index of the line element.
   * </p>
   * <p>
   * Getter method for the COM property "Next"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(11)
  int next();


  /**
   * <p>
   * Creates a new Line and makes it the Active Circuit Element.
   * </p>
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(12)
  int _new(
    java.lang.String name);


  /**
   * <p>
   * Name of bus for terminal 1.
   * </p>
   * <p>
   * Getter method for the COM property "Bus1"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String bus1();


  /**
   * <p>
   * Name of bus for terminal 1.
   * </p>
   * <p>
   * Setter method for the COM property "Bus1"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(14)
  void bus1(
    java.lang.String value);


  /**
   * <p>
   * Name of bus for terminal 2.
   * </p>
   * <p>
   * Getter method for the COM property "Bus2"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String bus2();


  /**
   * <p>
   * Name of bus for terminal 2.
   * </p>
   * <p>
   * Setter method for the COM property "Bus2"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(16)
  void bus2(
    java.lang.String value);


  /**
   * <p>
   * Name of LineCode object that defines the impedances.
   * </p>
   * <p>
   * Getter method for the COM property "LineCode"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String lineCode();


  /**
   * <p>
   * Name of LineCode object that defines the impedances.
   * </p>
   * <p>
   * Setter method for the COM property "LineCode"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(18)
  void lineCode(
    java.lang.String value);


  /**
   * <p>
   * Length of line section in units compatible with the LineCode definition.
   * </p>
   * <p>
   * Getter method for the COM property "Length"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(19)
  double length();


  /**
   * <p>
   * Length of line section in units compatible with the LineCode definition.
   * </p>
   * <p>
   * Setter method for the COM property "Length"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(20)
  void length(
    double value);


  /**
   * <p>
   * Number of Phases, this Line element.
   * </p>
   * <p>
   * Getter method for the COM property "Phases"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(21)
  int phases();


  /**
   * <p>
   * Number of Phases, this Line element.
   * </p>
   * <p>
   * Setter method for the COM property "Phases"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(22)
  void phases(
    int value);


  /**
   * <p>
   * Positive Sequence resistance, ohms per unit length.
   * </p>
   * <p>
   * Getter method for the COM property "R1"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(23)
  double r1();


  /**
   * <p>
   * Positive Sequence resistance, ohms per unit length.
   * </p>
   * <p>
   * Setter method for the COM property "R1"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(24)
  void r1(
    double value);


  /**
   * <p>
   * Positive Sequence reactance, ohms per unit length.
   * </p>
   * <p>
   * Getter method for the COM property "X1"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(25)
  double x1();


  /**
   * <p>
   * Positive Sequence reactance, ohms per unit length.
   * </p>
   * <p>
   * Setter method for the COM property "X1"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(26)
  void x1(
    double value);


  /**
   * <p>
   * Zero Sequence resistance, ohms per unit length.
   * </p>
   * <p>
   * Getter method for the COM property "R0"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(27)
  double r0();


  /**
   * <p>
   * Zero Sequence resistance, ohms per unit length.
   * </p>
   * <p>
   * Setter method for the COM property "R0"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(28)
  void r0(
    double value);


  /**
   * <p>
   * Zero Sequence reactance ohms per unit length.
   * </p>
   * <p>
   * Getter method for the COM property "X0"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(29)
  double x0();


  /**
   * <p>
   * Zero Sequence reactance ohms per unit length.
   * </p>
   * <p>
   * Setter method for the COM property "X0"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(30)
  void x0(
    double value);


  /**
   * <p>
   * Positive Sequence capacitance, nanofarads per unit length.
   * </p>
   * <p>
   * Getter method for the COM property "C1"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(31)
  double c1();


  /**
   * <p>
   * Positive Sequence capacitance, nanofarads per unit length.
   * </p>
   * <p>
   * Setter method for the COM property "C1"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(32)
  void c1(
    double value);


  /**
   * <p>
   * Zero Sequence capacitance, nanofarads per unit length.
   * </p>
   * <p>
   * Getter method for the COM property "C0"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(33)
  double c0();


  /**
   * <p>
   * Zero Sequence capacitance, nanofarads per unit length.
   * </p>
   * <p>
   * Setter method for the COM property "C0"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(34)
  void c0(
    double value);


  /**
   * <p>
   * Resistance matrix (full), ohms per unit length. Variant array of doubles.
   * </p>
   * <p>
   * Getter method for the COM property "Rmatrix"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(35)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object rmatrix();


  /**
   * <p>
   * Resistance matrix (full), ohms per unit length. Variant array of doubles.
   * </p>
   * <p>
   * Setter method for the COM property "Rmatrix"
   * </p>
   * @param value Mandatory java.lang.Object parameter.
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(36)
  void rmatrix(
    @MarshalAs(NativeType.VARIANT) java.lang.Object value);


  /**
   * <p>
   * Getter method for the COM property "Xmatrix"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(37)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object xmatrix();


  /**
   * <p>
   * Setter method for the COM property "Xmatrix"
   * </p>
   * @param value Mandatory java.lang.Object parameter.
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(38)
  void xmatrix(
    @MarshalAs(NativeType.VARIANT) java.lang.Object value);


  /**
   * <p>
   * Getter method for the COM property "Cmatrix"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(39)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object cmatrix();


  /**
   * <p>
   * Setter method for the COM property "Cmatrix"
   * </p>
   * @param value Mandatory java.lang.Object parameter.
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(40)
  void cmatrix(
    @MarshalAs(NativeType.VARIANT) java.lang.Object value);


  /**
   * <p>
   * Normal ampere rating of Line.
   * </p>
   * <p>
   * Getter method for the COM property "NormAmps"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(41)
  double normAmps();


  /**
   * <p>
   * Normal ampere rating of Line.
   * </p>
   * <p>
   * Setter method for the COM property "NormAmps"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(42)
  void normAmps(
    double value);


  /**
   * <p>
   * Emergency (maximum) ampere rating of Line.
   * </p>
   * <p>
   * Getter method for the COM property "EmergAmps"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(43)
  double emergAmps();


  /**
   * <p>
   * Emergency (maximum) ampere rating of Line.
   * </p>
   * <p>
   * Setter method for the COM property "EmergAmps"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(44)
  void emergAmps(
    double value);


  /**
   * <p>
   * Line geometry code
   * </p>
   * <p>
   * Getter method for the COM property "Geometry"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(45)
  java.lang.String geometry();


  /**
   * <p>
   * Line geometry code
   * </p>
   * <p>
   * Setter method for the COM property "Geometry"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(46)
  void geometry(
    java.lang.String value);


  /**
   * <p>
   * Earth return resistance value used to compute line impedances at power frequency
   * </p>
   * <p>
   * Getter method for the COM property "Rg"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(47)
  double rg();


  /**
   * <p>
   * Earth return resistance value used to compute line impedances at power frequency
   * </p>
   * <p>
   * Setter method for the COM property "Rg"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(48)
  void rg(
    double value);


  /**
   * <p>
   * Earth return reactance value used to compute line impedances at power frequency
   * </p>
   * <p>
   * Getter method for the COM property "Xg"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(49)
  double xg();


  /**
   * <p>
   * Earth return reactance value used to compute line impedances at power frequency
   * </p>
   * <p>
   * Setter method for the COM property "Xg"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(50)
  void xg(
    double value);


  /**
   * <p>
   * Earth Resistivity, m-ohms
   * </p>
   * <p>
   * Getter method for the COM property "Rho"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(51)
  double rho();


  /**
   * <p>
   * Earth Resistivity, m-ohms
   * </p>
   * <p>
   * Setter method for the COM property "Rho"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(52)
  void rho(
    double value);


  /**
   * <p>
   * Yprimitive: Does Nothing at present on Put; Dangerous
   * </p>
   * <p>
   * Getter method for the COM property "Yprim"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(53)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object yprim();


  /**
   * <p>
   * Yprimitive: Does Nothing at present on Put; Dangerous
   * </p>
   * <p>
   * Setter method for the COM property "Yprim"
   * </p>
   * @param value Mandatory java.lang.Object parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(54)
  void yprim(
    @MarshalAs(NativeType.VARIANT) java.lang.Object value);


  /**
   * <p>
   * Number of customers on this line section.
   * </p>
   * <p>
   * Getter method for the COM property "NumCust"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(55)
  int numCust();


  /**
   * <p>
   * Total Number of customers served from this line section.
   * </p>
   * <p>
   * Getter method for the COM property "TotalCust"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(56)
  int totalCust();


  /**
   * <p>
   * Sets Parent of the active Line to be the active line. Returns 0 if no parent or action fails.
   * </p>
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(57)
  int parent();


  /**
   * <p>
   * Number of Line objects in Active Circuit.
   * </p>
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(58)
  int count();


  /**
   * <p>
   * Line spacing code
   * </p>
   * <p>
   * Getter method for the COM property "Spacing"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(59)
  java.lang.String spacing();


  /**
   * <p>
   * Line spacing code
   * </p>
   * <p>
   * Setter method for the COM property "Spacing"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(60)
  void spacing(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "Units"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(61)
  int units();


  /**
   * <p>
   * Setter method for the COM property "Units"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(62)
  void units(
    int value);


  /**
   * <p>
   * Delivers the rating for the current season (in Amps)  if the SeasonalRatings option is active
   * </p>
   * <p>
   * Getter method for the COM property "SeasonRating"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(63)
  double seasonRating();


  // Properties:
}
