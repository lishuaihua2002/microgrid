package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for Solution Object
 */
@IID("{F2332365-962A-4DF4-9D1E-218E0B0F2CEF}")
public interface ISolution extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Execute solution for present solution mode.
   * </p>
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void solve();


  /**
   * <p>
   * Set present solution mode (by a text code - see DSS Help)
   * </p>
   * <p>
   * Getter method for the COM property "Mode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  int mode();


  /**
   * <p>
   * Set present solution mode (by a text code - see DSS Help)
   * </p>
   * <p>
   * Setter method for the COM property "Mode"
   * </p>
   * @param mode Mandatory int parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  void mode(
    int mode);


  /**
   * <p>
   * Set the Frequency for next solution
   * </p>
   * <p>
   * Getter method for the COM property "Frequency"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(10)
  double frequency();


  /**
   * <p>
   * Set the Frequency for next solution
   * </p>
   * <p>
   * Setter method for the COM property "Frequency"
   * </p>
   * @param frequency Mandatory double parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  void frequency(
    double frequency);


  /**
   * <p>
   * Set Hour for time series solutions.
   * </p>
   * <p>
   * Getter method for the COM property "Hour"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(12)
  int hour();


  /**
   * <p>
   * Set Hour for time series solutions.
   * </p>
   * <p>
   * Setter method for the COM property "Hour"
   * </p>
   * @param hour Mandatory int parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  void hour(
    int hour);


  /**
   * <p>
   * Seconds from top of the hour.
   * </p>
   * <p>
   * Getter method for the COM property "Seconds"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(14)
  double seconds();


  /**
   * <p>
   * Seconds from top of the hour.
   * </p>
   * <p>
   * Setter method for the COM property "Seconds"
   * </p>
   * @param seconds Mandatory double parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  void seconds(
    double seconds);


  /**
   * <p>
   * Time step size in sec
   * </p>
   * <p>
   * Getter method for the COM property "StepSize"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(16)
  double stepSize();


  /**
   * <p>
   * Time step size in sec
   * </p>
   * <p>
   * Setter method for the COM property "StepSize"
   * </p>
   * @param stepSize Mandatory double parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(17)
  void stepSize(
    double stepSize);


  /**
   * <p>
   * Set year for planning studies
   * </p>
   * <p>
   * Getter method for the COM property "Year"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(18)
  int year();


  /**
   * <p>
   * Set year for planning studies
   * </p>
   * <p>
   * Setter method for the COM property "Year"
   * </p>
   * @param year Mandatory int parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(19)
  void year(
    int year);


  /**
   * <p>
   * Default load multiplier applied to all non-fixed loads
   * </p>
   * <p>
   * Getter method for the COM property "LoadMult"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(20)
  double loadMult();


  /**
   * <p>
   * Default load multiplier applied to all non-fixed loads
   * </p>
   * <p>
   * Setter method for the COM property "LoadMult"
   * </p>
   * @param loadMult Mandatory double parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(21)
  void loadMult(
    double loadMult);


  /**
   * <p>
   * Number of iterations taken for last solution. (Same as TotalIterations)
   * </p>
   * <p>
   * Getter method for the COM property "Iterations"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(22)
  int iterations();


  /**
   * <p>
   * Max allowable iterations.
   * </p>
   * <p>
   * Getter method for the COM property "MaxIterations"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(23)
  int maxIterations();


  /**
   * <p>
   * Max allowable iterations.
   * </p>
   * <p>
   * Setter method for the COM property "MaxIterations"
   * </p>
   * @param maxIterations Mandatory int parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(24)
  void maxIterations(
    int maxIterations);


  /**
   * <p>
   * Solution convergence tolerance.
   * </p>
   * <p>
   * Getter method for the COM property "Tolerance"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(25)
  double tolerance();


  /**
   * <p>
   * Solution convergence tolerance.
   * </p>
   * <p>
   * Setter method for the COM property "Tolerance"
   * </p>
   * @param tolerance Mandatory double parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(26)
  void tolerance(
    double tolerance);


  /**
   * <p>
   * Number of solutions to perform for Monte Carlo and time series simulations
   * </p>
   * <p>
   * Getter method for the COM property "Number"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(27)
  int number();


  /**
   * <p>
   * Number of solutions to perform for Monte Carlo and time series simulations
   * </p>
   * <p>
   * Setter method for the COM property "Number"
   * </p>
   * @param number Mandatory int parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(28)
  void number(
    int number);


  /**
   * <p>
   * Randomization mode for random variables "Gaussian" or "Uniform"
   * </p>
   * <p>
   * Getter method for the COM property "Random"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(29)
  int random();


  /**
   * <p>
   * Randomization mode for random variables "Gaussian" or "Uniform"
   * </p>
   * <p>
   * Setter method for the COM property "Random"
   * </p>
   * @param random Mandatory int parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(30)
  void random(
    int random);


  /**
   * <p>
   * ID (text) of the present solution mode
   * </p>
   * <p>
   * Getter method for the COM property "ModeID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(31)
  java.lang.String modeID();


  /**
   * <p>
   * Load Model: {dssPowerFlow (default) | dssAdmittance}
   * </p>
   * <p>
   * Getter method for the COM property "LoadModel"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(32)
  int loadModel();


  /**
   * <p>
   * Load Model: {dssPowerFlow (default) | dssAdmittance}
   * </p>
   * <p>
   * Setter method for the COM property "LoadModel"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(33)
  void loadModel(
    int value);


  /**
   * <p>
   * Load-Duration Curve name for LD modes
   * </p>
   * <p>
   * Getter method for the COM property "LDCurve"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(34)
  java.lang.String ldCurve();


  /**
   * <p>
   * Load-Duration Curve name for LD modes
   * </p>
   * <p>
   * Setter method for the COM property "LDCurve"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(35)
  void ldCurve(
    java.lang.String value);


  /**
   * <p>
   * Percent default  annual load growth rate
   * </p>
   * <p>
   * Getter method for the COM property "pctGrowth"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(36)
  double pctGrowth();


  /**
   * <p>
   * Percent default  annual load growth rate
   * </p>
   * <p>
   * Setter method for the COM property "pctGrowth"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(37)
  void pctGrowth(
    double value);


  /**
   * <p>
   * Type of device to add in AutoAdd Mode: {dssGen (Default) | dssCap}
   * </p>
   * <p>
   * Getter method for the COM property "AddType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(38)
  int addType();


  /**
   * <p>
   * Type of device to add in AutoAdd Mode: {dssGen (Default) | dssCap}
   * </p>
   * <p>
   * Setter method for the COM property "AddType"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(39)
  void addType(
    int value);


  /**
   * <p>
   * Generator kW for AutoAdd mode
   * </p>
   * <p>
   * Getter method for the COM property "GenkW"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(40)
  double genkW();


  /**
   * <p>
   * Generator kW for AutoAdd mode
   * </p>
   * <p>
   * Setter method for the COM property "GenkW"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(41)
  void genkW(
    double value);


  /**
   * <p>
   * PF for generators in AutoAdd mode
   * </p>
   * <p>
   * Getter method for the COM property "GenPF"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(42)
  double genPF();


  /**
   * <p>
   * PF for generators in AutoAdd mode
   * </p>
   * <p>
   * Setter method for the COM property "GenPF"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(43)
  void genPF(
    double value);


  /**
   * <p>
   * Capacitor kvar for adding capacitors in AutoAdd mode
   * </p>
   * <p>
   * Getter method for the COM property "Capkvar"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(44)
  double capkvar();


  /**
   * <p>
   * Capacitor kvar for adding capacitors in AutoAdd mode
   * </p>
   * <p>
   * Setter method for the COM property "Capkvar"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(45)
  void capkvar(
    double value);


  /**
   * <p>
   * Base Solution algorithm: {dssNormalSolve | dssNewtonSolve}
   * </p>
   * <p>
   * Getter method for the COM property "Algorithm"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(46)
  int algorithm();


  /**
   * <p>
   * Base Solution algorithm: {dssNormalSolve | dssNewtonSolve}
   * </p>
   * <p>
   * Setter method for the COM property "Algorithm"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(47)
  void algorithm(
    int value);


  /**
   * <p>
   * {dssStatic* | dssEvent | dssTime}  Modes for control devices
   * </p>
   * <p>
   * Getter method for the COM property "ControlMode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(48)
  int controlMode();


  /**
   * <p>
   * {dssStatic* | dssEvent | dssTime}  Modes for control devices
   * </p>
   * <p>
   * Setter method for the COM property "ControlMode"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(49)
  void controlMode(
    int value);


  /**
   * <p>
   * Default Multiplier applied to generators (like LoadMult)
   * </p>
   * <p>
   * Getter method for the COM property "GenMult"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(50)
  double genMult();


  /**
   * <p>
   * Default Multiplier applied to generators (like LoadMult)
   * </p>
   * <p>
   * Setter method for the COM property "GenMult"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(51)
  void genMult(
    double value);


  /**
   * <p>
   * Default daily load shape (defaults to "Default")
   * </p>
   * <p>
   * Getter method for the COM property "DefaultDaily"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(52)
  java.lang.String defaultDaily();


  /**
   * <p>
   * Default daily load shape (defaults to "Default")
   * </p>
   * <p>
   * Setter method for the COM property "DefaultDaily"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(53)
  void defaultDaily(
    java.lang.String value);


  /**
   * <p>
   * Default Yearly load shape (defaults to "Default")
   * </p>
   * <p>
   * Getter method for the COM property "DefaultYearly"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(54)
  java.lang.String defaultYearly();


  /**
   * <p>
   * Default Yearly load shape (defaults to "Default")
   * </p>
   * <p>
   * Setter method for the COM property "DefaultYearly"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(55)
  void defaultYearly(
    java.lang.String value);


  /**
   * <p>
   * Array of strings containing the Event Log
   * </p>
   * <p>
   * Getter method for the COM property "EventLog"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(56)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object eventLog();


  /**
   * <p>
   * Hour as a double, including fractional part
   * </p>
   * <p>
   * Getter method for the COM property "dblHour"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(57)
  double dblHour();


  /**
   * <p>
   * Hour as a double, including fractional part
   * </p>
   * <p>
   * Setter method for the COM property "dblHour"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(58)
  void dblHour(
    double value);


  /**
   * <p>
   * Set Stepsize in minutes
   * </p>
   * <p>
   * Setter method for the COM property "StepsizeMin"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(59)
  void stepsizeMin(
    double rhs);


  /**
   * <p>
   * Set Stepsize in Hr
   * </p>
   * <p>
   * Setter method for the COM property "StepsizeHr"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(60)
  void stepsizeHr(
    double rhs);


  /**
   * <p>
   * Value of the control iteration counter
   * </p>
   * <p>
   * Getter method for the COM property "ControlIterations"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(61)
  int controlIterations();


  /**
   * <p>
   * Value of the control iteration counter
   * </p>
   * <p>
   * Setter method for the COM property "ControlIterations"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(62)
  void controlIterations(
    int value);


  /**
   * <p>
   * Maximum allowable control iterations
   * </p>
   * <p>
   * Getter method for the COM property "MaxControlIterations"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(63)
  int maxControlIterations();


  /**
   * <p>
   * Maximum allowable control iterations
   * </p>
   * <p>
   * Setter method for the COM property "MaxControlIterations"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(64)
  void maxControlIterations(
    int value);


  /**
   * <p>
   * Sample controls and then process the control queue for present control mode and dispatch control actions
   * </p>
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(65)
  void sample_DoControlActions();


  /**
   * <p>
   * Executes status check on all fault objects defined in the circuit.
   * </p>
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(66)
  void checkFaultStatus();


  /**
   * <p>
   * Execute the snapshot power flow routine in the DSS that solves at the present state with control actions
   * </p>
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(67)
  void solveSnap();


  /**
   * <p>
   * Executes a direct solution from the system Y matrix, ignoring compensation currents of loads, generators (includes Yprim only)
   * </p>
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(68)
  void solveDirect();


  /**
   * <p>
   * Solves using present power flow method. Iterative solution rather than direct solution.
   * </p>
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(69)
  void solvePflow();


  /**
   * <p>
   * Similar to SolveSnap except no control actions are checked or executed
   * </p>
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(70)
  void solveNoControl();


  /**
   * <p>
   * Executes a power flow solution (SolveNoControl) plus executes a CheckControlActions that executes any pending control actions.
   * </p>
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(71)
  void solvePlusControl();


  /**
   * <p>
   * Initializes some variables for snap shot power flow. SolveSnap does this automatically.
   * </p>
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(72)
  void initSnap();


  /**
   * <p>
   * The normal process for sampling and executing Control Actions and Fault Status and rebuilds Y if necessary.
   * </p>
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(73)
  void checkControls();


  /**
   * <p>
   * Executes a sampling of all intrinsic control devices, which push control actions onto the control queue.
   * </p>
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(74)
  void sampleControlDevices();


  /**
   * <p>
   * Pops control actions off the control queue and dispatches to the proper control element
   * </p>
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(75)
  void doControlActions();


  /**
   * <p>
   * Force building of the System Y matrix
   * </p>
   * @param buildOption Mandatory int parameter.
   * @param allocateVI Mandatory int parameter.
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(76)
  void buildYMatrix(
    int buildOption,
    int allocateVI);


  /**
   * <p>
   * Flag that indicates if elements of the System Y have been changed by recent activity.
   * </p>
   * <p>
   * Getter method for the COM property "SystemYChanged"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(77)
  boolean systemYChanged();


  /**
   * <p>
   * Flag to indicate whether the circuit solution converged
   * </p>
   * <p>
   * Getter method for the COM property "Converged"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(78)
  boolean converged();


  /**
   * <p>
   * Flag to indicate whether the circuit solution converged
   * </p>
   * <p>
   * Setter method for the COM property "Converged"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(79)
  void converged(
    boolean value);


  /**
   * <p>
   * Total iterations including control iterations for most recent solution.
   * </p>
   * <p>
   * Getter method for the COM property "Totaliterations"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(220) //= 0xdc. The runtime will prefer the VTID if present
  @VTID(80)
  int totaliterations();


  /**
   * <p>
   * Max number of iterations required to converge at any control iteration of the most recent solution.
   * </p>
   * <p>
   * Getter method for the COM property "MostIterationsDone"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(221) //= 0xdd. The runtime will prefer the VTID if present
  @VTID(81)
  int mostIterationsDone();


  /**
   * <p>
   * Flag indicating the control actions are done.
   * </p>
   * <p>
   * Getter method for the COM property "ControlActionsDone"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(222) //= 0xde. The runtime will prefer the VTID if present
  @VTID(82)
  boolean controlActionsDone();


  /**
   * <p>
   * Flag indicating the control actions are done.
   * </p>
   * <p>
   * Setter method for the COM property "ControlActionsDone"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(222) //= 0xde. The runtime will prefer the VTID if present
  @VTID(83)
  void controlActionsDone(
    boolean value);


  /**
   * <p>
   * Call Cleanup, sample monitors, and increment time at end of time step.
   * </p>
   */

  @DISPID(223) //= 0xdf. The runtime will prefer the VTID if present
  @VTID(84)
  void finishTimeStep();


  /**
   * <p>
   * Update storage, invcontrol, etc at end of time step
   * </p>
   */

  @DISPID(224) //= 0xe0. The runtime will prefer the VTID if present
  @VTID(85)
  void cleanup();


  /**
   * <p>
   * Gets the accumulated time of the simulation
   * </p>
   * <p>
   * Getter method for the COM property "Total_Time"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(225) //= 0xe1. The runtime will prefer the VTID if present
  @VTID(86)
  double total_Time();


  /**
   * <p>
   * Gets the accumulated time of the simulation
   * </p>
   * <p>
   * Setter method for the COM property "Total_Time"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(225) //= 0xe1. The runtime will prefer the VTID if present
  @VTID(87)
  void total_Time(
    double value);


  /**
   * <p>
   * Gets the time required to perform the latest solution (Read only)
   * </p>
   * <p>
   * Getter method for the COM property "Process_Time"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(226) //= 0xe2. The runtime will prefer the VTID if present
  @VTID(88)
  double process_Time();


  /**
   * <p>
   * Get the solution process time + sample time for time step
   * </p>
   * <p>
   * Getter method for the COM property "Time_of_Step"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(227) //= 0xe3. The runtime will prefer the VTID if present
  @VTID(89)
  double time_of_Step();


  /**
   * <p>
   * Get/Set the Solution.IntervalHrs variable used for devices that integrate
   * </p>
   * <p>
   * Getter method for the COM property "IntervalHrs"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(228) //= 0xe4. The runtime will prefer the VTID if present
  @VTID(90)
  double intervalHrs();


  /**
   * <p>
   * Get/Set the Solution.IntervalHrs variable used for devices that integrate
   * </p>
   * <p>
   * Setter method for the COM property "IntervalHrs"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(228) //= 0xe4. The runtime will prefer the VTID if present
  @VTID(91)
  void intervalHrs(
    double value);


  /**
   * <p>
   * Solves the circuits for all the Actors created
   * </p>
   */

  @DISPID(229) //= 0xe5. The runtime will prefer the VTID if present
  @VTID(92)
  void solveAll();


  /**
   * <p>
   * Getter method for the COM property "IncMatrix"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(230) //= 0xe6. The runtime will prefer the VTID if present
  @VTID(93)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object incMatrix();


  /**
   * <p>
   * Getter method for the COM property "IncMatrixRows"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(231) //= 0xe7. The runtime will prefer the VTID if present
  @VTID(94)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object incMatrixRows();


  /**
   * <p>
   * Getter method for the COM property "IncMatrixCols"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(232) //= 0xe8. The runtime will prefer the VTID if present
  @VTID(95)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object incMatrixCols();


  /**
   * <p>
   * Getter method for the COM property "BusLevels"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(233) //= 0xe9. The runtime will prefer the VTID if present
  @VTID(96)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object busLevels();


  /**
   * <p>
   * Getter method for the COM property "Laplacian"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(234) //= 0xea. The runtime will prefer the VTID if present
  @VTID(97)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object laplacian();


  /**
   * <p>
   * Minimum number of iterations required for a power flow solution.
   * </p>
   * <p>
   * Getter method for the COM property "MinIterations"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(235) //= 0xeb. The runtime will prefer the VTID if present
  @VTID(98)
  int minIterations();


  /**
   * <p>
   * Minimum number of iterations required for a power flow solution.
   * </p>
   * <p>
   * Setter method for the COM property "MinIterations"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(235) //= 0xeb. The runtime will prefer the VTID if present
  @VTID(99)
  void minIterations(
    int value);


  // Properties:
}
