package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for DSSMain Object
 */
@IID("{14644AD0-4909-48FF-B624-24E8C38D1AED}")
public interface IDSS extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Number of Circuits currently defined
   * </p>
   * <p>
   * Getter method for the COM property "NumCircuits"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  int numCircuits();


  /**
   * <p>
   * Collection of Circuit objects
   * </p>
   * <p>
   * Getter method for the COM property "Circuits"
   * </p>
   * @param idx Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com.myproject.opendss.ICircuit
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  com.myproject.opendss.ICircuit circuits(
    @MarshalAs(NativeType.VARIANT) java.lang.Object idx);


  /**
   * <p>
   * Returns interface to the active circuit.
   * </p>
   * <p>
   * Getter method for the COM property "ActiveCircuit"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.ICircuit
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  com.myproject.opendss.ICircuit activeCircuit();


  /**
   * <p>
   * Returns the DSS Text (command-result) interface.
   * </p>
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.IText
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  com.myproject.opendss.IText text();


  /**
   * <p>
   * Returns Error interface.
   * </p>
   * <p>
   * Getter method for the COM property "Error"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.IError
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  com.myproject.opendss.IError error();


  /**
   * <p>
   * Make a new circuit and return interface to active circuit.
   * </p>
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type com.myproject.opendss.ICircuit
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(12)
  com.myproject.opendss.ICircuit newCircuit(
    java.lang.String name);


  /**
   * <p>
   * Clears all circuit definitions.
   * </p>
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(13)
  void clearAll();


  /**
   * <p>
   * Shows non-MDI child form of the Main DSS Edit Form
   * </p>
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(14)
  void showPanel();


  /**
   * <p>
   * Validate the user and start the DSS. Returns TRUE if successful.
   * </p>
   * @param code Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(15)
  boolean start(
    int code);


  /**
   * <p>
   * Get version string for the DSS.
   * </p>
   * <p>
   * Getter method for the COM property "Version"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String version();


  /**
   * <p>
   * Gets interface to the DSS Progress Meter
   * </p>
   * <p>
   * Getter method for the COM property "DSSProgress"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.IDSSProgress
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(17)
  com.myproject.opendss.IDSSProgress dssProgress();


  /**
   * <p>
   * List of DSS intrinsic classes (names of the classes)
   * </p>
   * <p>
   * Getter method for the COM property "Classes"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object classes();


  /**
   * <p>
   * List of user-defined classes
   * </p>
   * <p>
   * Getter method for the COM property "UserClasses"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(19)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object userClasses();


  /**
   * <p>
   * Number of DSS intrinsic classes
   * </p>
   * <p>
   * Getter method for the COM property "NumClasses"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(20)
  int numClasses();


  /**
   * <p>
   * Number of user-defined classes
   * </p>
   * <p>
   * Getter method for the COM property "NumUserClasses"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(21)
  int numUserClasses();


  /**
   * <p>
   * DSS Data File Path.  Default path for reports, etc. from DSS
   * </p>
   * <p>
   * Getter method for the COM property "DataPath"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(22)
  java.lang.String dataPath();


  /**
   * <p>
   * DSS Data File Path.  Default path for reports, etc. from DSS
   * </p>
   * <p>
   * Setter method for the COM property "DataPath"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(23)
  void dataPath(
    java.lang.String value);


  /**
   * <p>
   * Resets DSS Initialization for restarts, etc from applets
   * </p>
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(24)
  void reset();


  /**
   * <p>
   * Default is TRUE. Use this to set to FALSE; Cannot reset to TRUE;
   * </p>
   * <p>
   * Getter method for the COM property "AllowForms"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(25)
  boolean allowForms();


  /**
   * <p>
   * Default is TRUE. Use this to set to FALSE; Cannot reset to TRUE;
   * </p>
   * <p>
   * Setter method for the COM property "AllowForms"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(26)
  void allowForms(
    boolean value);


  /**
   * <p>
   * Returns the path name for the default text editor.
   * </p>
   * <p>
   * Getter method for the COM property "DefaultEditor"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(27)
  java.lang.String defaultEditor();


  /**
   * <p>
   * Returns interface to the active class.
   * </p>
   * <p>
   * Getter method for the COM property "ActiveClass"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.IActiveClass
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(28)
  com.myproject.opendss.IActiveClass activeClass();


  /**
   * <p>
   * Sets the Active DSS Class for use with ActiveClass interface. Same as SetActiveClass in Circuit interface.
   * </p>
   * @param className Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(29)
  int setActiveClass(
    java.lang.String className);


  /**
   * <p>
   * Interface to DSS Executive commands and options
   * </p>
   * <p>
   * Getter method for the COM property "Executive"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.IDSS_Executive
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(30)
  com.myproject.opendss.IDSS_Executive executive();


  /**
   * <p>
   * Interface to the DSS Events
   * </p>
   * <p>
   * Getter method for the COM property "Events"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.IDSSEvents
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(31)
  com.myproject.opendss.IDSSEvents events();


  /**
   * <p>
   * Returns an interface to the complex math library.
   * </p>
   * <p>
   * Getter method for the COM property "CmathLib"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.ICmathLib
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(32)
  com.myproject.opendss.ICmathLib cmathLib();


  /**
   * <p>
   * Returns interface to the OpenDSS Parser library for use by user-written programs.
   * </p>
   * <p>
   * Getter method for the COM property "Parser"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.IParser
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(33)
  com.myproject.opendss.IParser parser();


  /**
   * <p>
   * Getter method for the COM property "DSSim_Coms"
   * </p>
   * @return  Returns a value of type com.myproject.opendss.IDSSimComs
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(34)
  com.myproject.opendss.IDSSimComs dsSim_Coms();


  // Properties:
}
