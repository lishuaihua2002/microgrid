package com.myproject.opendss  ;

import com4j.*;

/**
 * Dispatch interface for Monitors Object
 */
@IID("{5C339E44-C583-445C-91D1-3B1E49CAD6B0}")
public interface IMonitors extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Array of all Monitor Names
   * </p>
   * <p>
   * Getter method for the COM property "AllNames"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object allNames();


  /**
   * <p>
   * Sets the first Monitor active.  Returns 0 if no monitors.
   * </p>
   * <p>
   * Getter method for the COM property "First"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(8)
  int first();


  /**
   * <p>
   * Sets next monitor active.  Returns 0 if no more.
   * </p>
   * <p>
   * Getter method for the COM property "Next"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(9)
  int next();


  /**
   * <p>
   * Resets active Monitor object.
   * </p>
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(10)
  void reset();


  /**
   * <p>
   * Resets all Monitor Objects
   * </p>
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(11)
  void resetAll();


  /**
   * <p>
   * Causes active Monitor to take a sample.
   * </p>
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(12)
  void sample();


  /**
   * <p>
   * Causes active monitor to save its current sample buffer to its monitor stream. Then you can access the Bytestream or channel data. Most standard solution modes do this automatically.
   * </p>
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(13)
  void save();


  /**
   * <p>
   * Converts monitor file to text and displays with text editor
   * </p>
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(14)
  void show();


  /**
   * <p>
   * Name of CSV file associated with active Monitor.
   * </p>
   * <p>
   * Getter method for the COM property "FileName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String fileName();


  /**
   * <p>
   * Set Monitor mode (bitmask integer - see DSS Help)
   * </p>
   * <p>
   * Getter method for the COM property "Mode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(16)
  int mode();


  /**
   * <p>
   * Set Monitor mode (bitmask integer - see DSS Help)
   * </p>
   * <p>
   * Setter method for the COM property "Mode"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(17)
  void mode(
    int value);


  /**
   * <p>
   * Sets the active Monitor object by name
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String name();


  /**
   * <p>
   * Sets the active Monitor object by name
   * </p>
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(19)
  void name(
    java.lang.String value);


  /**
   * <p>
   * Byte Array containing monitor stream values. Make sure a "save" is done first (standard solution modes do this automatically)
   * </p>
   * <p>
   * Getter method for the COM property "ByteStream"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(20)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object byteStream();


  /**
   * <p>
   * Number of Samples in Monitor at Present
   * </p>
   * <p>
   * Getter method for the COM property "SampleCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(21)
  int sampleCount();


  /**
   * <p>
   * Causes all Monitors to take a sample of the present state
   * </p>
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(22)
  void sampleAll();


  /**
   * <p>
   * Save all Monitor buffers to their respective file streams.
   * </p>
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(23)
  void saveAll();


  /**
   * <p>
   * Number of Monitors
   * </p>
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(24)
  int count();


  /**
   * <p>
   * Post-process monitor samples taken so far, e.g., Pst for mode=4
   * </p>
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(25)
  void process();


  /**
   * <p>
   * All monitors post-process the data taken so far.
   * </p>
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(26)
  void processAll();


  /**
   * <p>
   * Monitor File Version (integer)
   * </p>
   * <p>
   * Getter method for the COM property "FileVersion"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(27)
  int fileVersion();


  /**
   * <p>
   * Size of each record in ByteStream (Integer). Same as NumChannels.
   * </p>
   * <p>
   * Getter method for the COM property "RecordSize"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(28)
  int recordSize();


  /**
   * <p>
   * Header string;  Variant array of strings containing Channel names
   * </p>
   * <p>
   * Getter method for the COM property "Header"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(29)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object header();


  /**
   * <p>
   * Variant array of doubles containgin time value in hours for time-sampled monitor values; Empty if frequency-sampled values for harmonics solution  (see dblFreq)
   * </p>
   * <p>
   * Getter method for the COM property "dblHour"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(30)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object dblHour();


  /**
   * <p>
   * Variant array of doubles containing frequency values for harmonics mode solutions; Empty for time mode solutions (use dblHour)
   * </p>
   * <p>
   * Getter method for the COM property "dblFreq"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(31)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object dblFreq();


  /**
   * <p>
   * Variant array of doubles for the specified channel  (usage: MyArray = DSSMonitor.Channel(i)) A Save or SaveAll  should be executed first. Done automatically by most standard solution modes.
   * </p>
   * <p>
   * Getter method for the COM property "Channel"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(32)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object channel(
    int index);


  /**
   * <p>
   * Number of Channels in the active Monitor
   * </p>
   * <p>
   * Getter method for the COM property "NumChannels"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(33)
  int numChannels();


  /**
   * <p>
   * Full object name of element being monitored.
   * </p>
   * <p>
   * Getter method for the COM property "Element"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(34)
  java.lang.String element();


  /**
   * <p>
   * Full object name of element being monitored.
   * </p>
   * <p>
   * Setter method for the COM property "Element"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(35)
  void element(
    java.lang.String value);


  /**
   * <p>
   * Terminal number of element being monitored
   * </p>
   * <p>
   * Getter method for the COM property "Terminal"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(36)
  int terminal();


  /**
   * <p>
   * Terminal number of element being monitored
   * </p>
   * <p>
   * Setter method for the COM property "Terminal"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(37)
  void terminal(
    int value);


  // Properties:
}
