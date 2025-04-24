package com.myproject.opendss  ;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  /**
   * Text Object
   */
  public static com.myproject.opendss.IText createText() {
    return COM4J.createInstance( com.myproject.opendss.IText.class, "{6E20BC4C-67C0-4AD3-9E12-BF90C478A1CC}" );
  }

  /**
   * DSSProperty Object
   */
  public static com.myproject.opendss.IDSSProperty createDSSProperty() {
    return COM4J.createInstance( com.myproject.opendss.IDSSProperty.class, "{F8410F14-7E85-44A9-B42F-F900DF5F596E}" );
  }

  /**
   * CktElementObject
   */
  public static com.myproject.opendss.ICktElement createCktElement() {
    return COM4J.createInstance( com.myproject.opendss.ICktElement.class, "{BC5F55A3-7A0F-4923-B218-098A91F482D8}" );
  }

  /**
   * Error Object
   */
  public static com.myproject.opendss.IError createError() {
    return COM4J.createInstance( com.myproject.opendss.IError.class, "{0038D0EB-28ED-42B0-A247-E212E05ADF4B}" );
  }

  /**
   * Circuit Object
   */
  public static com.myproject.opendss.ICircuit createCircuit() {
    return COM4J.createInstance( com.myproject.opendss.ICircuit.class, "{B5B695B1-A1F5-444F-ABC5-836B7EF1DF0D}" );
  }

  /**
   * Bus Object
   */
  public static com.myproject.opendss.IBus createBus() {
    return COM4J.createInstance( com.myproject.opendss.IBus.class, "{A14C32E4-846B-444D-9070-F7A31E9F5FF9}" );
  }

  /**
   * DSS Main Object
   */
  public static com.myproject.opendss.IDSS createDSS() {
    return COM4J.createInstance( com.myproject.opendss.IDSS.class, "{6FE9D1B8-C064-4877-94C0-F13882ADBDB6}" );
  }

  /**
   * Solution Object
   */
  public static com.myproject.opendss.ISolution createSolution() {
    return COM4J.createInstance( com.myproject.opendss.ISolution.class, "{F799E1DE-E7BF-4F86-BCED-6DD01FD00419}" );
  }

  /**
   * Monitors Object
   */
  public static com.myproject.opendss.IMonitors createMonitors() {
    return COM4J.createInstance( com.myproject.opendss.IMonitors.class, "{7FF93D6F-4258-40CB-9558-0792422309F3}" );
  }

  /**
   * Meters Object
   */
  public static com.myproject.opendss.IMeters createMeters() {
    return COM4J.createInstance( com.myproject.opendss.IMeters.class, "{F869D5BB-A023-48AB-A459-01444585B7C1}" );
  }

  /**
   * Generators Object
   */
  public static com.myproject.opendss.IGenerators createGenerators() {
    return COM4J.createInstance( com.myproject.opendss.IGenerators.class, "{65F232C9-7D95-4E45-B9FA-40F518CFBB64}" );
  }

  /**
   * DSSProgress Object
   */
  public static com.myproject.opendss.IDSSProgress createDSSProgress() {
    return COM4J.createInstance( com.myproject.opendss.IDSSProgress.class, "{4CB900D9-DD2F-41AF-9E48-B999E0AED0A7}" );
  }

  /**
   * Settings Object
   */
  public static com.myproject.opendss.ISettings createSettings() {
    return COM4J.createInstance( com.myproject.opendss.ISettings.class, "{9D910AA4-0CB3-4907-AEEF-8DD79A58C0AD}" );
  }

  /**
   * Lines Object
   */
  public static com.myproject.opendss.ILines createLines() {
    return COM4J.createInstance( com.myproject.opendss.ILines.class, "{A1352870-9D53-4E48-B83A-6DB0C8FED65B}" );
  }

  /**
   * CtrlQueue
   */
  public static com.myproject.opendss.ICtrlQueue createCtrlQueue() {
    return COM4J.createInstance( com.myproject.opendss.ICtrlQueue.class, "{19DD7174-7FEE-4E59-97ED-C54F16EDC3F0}" );
  }

  /**
   * Loads Object
   */
  public static com.myproject.opendss.ILoads createLoads() {
    return COM4J.createInstance( com.myproject.opendss.ILoads.class, "{1302A34B-A554-4C32-BCED-4AF0A94FF114}" );
  }

  /**
   * DSSElement Object
   */
  public static com.myproject.opendss.IDSSElement createDSSElement() {
    return COM4J.createInstance( com.myproject.opendss.IDSSElement.class, "{09D4B4AB-DF58-4F8F-A3F0-72F32830B337}" );
  }

  /**
   * ActiveClass Object
   */
  public static com.myproject.opendss.IActiveClass createActiveClass() {
    return COM4J.createInstance( com.myproject.opendss.IActiveClass.class, "{2A02BB33-50A4-4C87-86E0-59EF7738F86C}" );
  }

  public static com.myproject.opendss.ICapacitors createCapacitors() {
    return COM4J.createInstance( com.myproject.opendss.ICapacitors.class, "{F733F571-4CEC-45CC-922D-16C2BEEBA5BC}" );
  }

  public static com.myproject.opendss.ITransformers createTransformers() {
    return COM4J.createInstance( com.myproject.opendss.ITransformers.class, "{3A3E2154-1249-4DBB-AEDC-C4C14300D332}" );
  }

  public static com.myproject.opendss.ISwtControls createSwtControls() {
    return COM4J.createInstance( com.myproject.opendss.ISwtControls.class, "{7D8F53AE-0D61-4B87-9BEE-12D54052F689}" );
  }

  public static com.myproject.opendss.ICapControls createCapControls() {
    return COM4J.createInstance( com.myproject.opendss.ICapControls.class, "{7D95304E-B0A8-4531-8D1B-F438287EEA6E}" );
  }

  public static com.myproject.opendss.IRegControls createRegControls() {
    return COM4J.createInstance( com.myproject.opendss.IRegControls.class, "{D3DBDE53-6397-4C36-8C87-9BEA061FBC78}" );
  }

  /**
   * Topology Object
   */
  public static com.myproject.opendss.ITopology createTopology() {
    return COM4J.createInstance( com.myproject.opendss.ITopology.class, "{5B1B5AB3-0595-4E46-B64B-CF8877ED0857}" );
  }

  /**
   * DSS_Executive Object
   */
  public static com.myproject.opendss.IDSS_Executive createDSS_Executive() {
    return COM4J.createInstance( com.myproject.opendss.IDSS_Executive.class, "{D00898D0-6CC7-4A3B-BF89-DED9593579E7}" );
  }

  /**
   * DSSEvents Object
   */
  public static com.myproject.opendss.IDSSEvents createDSSEvents() {
    return COM4J.createInstance( com.myproject.opendss.IDSSEvents.class, "{B734843A-08E4-42D3-9E24-C0D5F7BF6487}" );
  }

  /**
   * Sensors Object
   */
  public static com.myproject.opendss.ISensors createSensors() {
    return COM4J.createInstance( com.myproject.opendss.ISensors.class, "{FC54E9AA-1C6A-4CF8-837D-82B257D98E5A}" );
  }

  /**
   * XYCurves Object
   */
  public static com.myproject.opendss.IXYCurves createXYCurves() {
    return COM4J.createInstance( com.myproject.opendss.IXYCurves.class, "{9594F37D-E47E-4701-892B-52BE7E576E87}" );
  }

  /**
   * PDElements Object
   */
  public static com.myproject.opendss.IPDElements createPDElements() {
    return COM4J.createInstance( com.myproject.opendss.IPDElements.class, "{4DDCDADD-A1D3-40BB-98E7-B023BD3947BE}" );
  }

  /**
   * Reclosers Object
   */
  public static com.myproject.opendss.IReclosers createReclosers() {
    return COM4J.createInstance( com.myproject.opendss.IReclosers.class, "{B92B059F-FEFD-4554-8F07-AFDCEFBBEA7B}" );
  }

  /**
   * Relays Object
   */
  public static com.myproject.opendss.IRelays createRelays() {
    return COM4J.createInstance( com.myproject.opendss.IRelays.class, "{9D887EEA-7454-4214-BC56-AC42F5A3318E}" );
  }

  /**
   * CmathLib Object
   */
  public static com.myproject.opendss.ICmathLib createCmathLib() {
    return COM4J.createInstance( com.myproject.opendss.ICmathLib.class, "{76847D49-B650-4850-9486-E08B48F87E39}" );
  }

  /**
   * Parser Object
   */
  public static com.myproject.opendss.IParser createParser() {
    return COM4J.createInstance( com.myproject.opendss.IParser.class, "{2245AD88-CB0E-4426-9DF2-5B2F89B2A08D}" );
  }

  /**
   * LoadShapes Object
   */
  public static com.myproject.opendss.ILoadShapes createLoadShapes() {
    return COM4J.createInstance( com.myproject.opendss.ILoadShapes.class, "{4FCBE090-AA15-4E31-A8C7-E5F42D41C90C}" );
  }

  /**
   * Fuses Object
   */
  public static com.myproject.opendss.IFuses createFuses() {
    return COM4J.createInstance( com.myproject.opendss.IFuses.class, "{ABED90F5-3908-408A-87EF-D0582FD2FFD5}" );
  }

  /**
   * ISource Object
   */
  public static com.myproject.opendss.IISources createISources() {
    return COM4J.createInstance( com.myproject.opendss.IISources.class, "{CE35EBD2-BDD4-4B01-AE88-1D90DC82F619}" );
  }

  /**
   * DSSimComs Object
   */
  public static com.myproject.opendss.IDSSimComs createDSSimComs() {
    return COM4J.createInstance( com.myproject.opendss.IDSSimComs.class, "{2104B607-8D58-4BBD-85B8-4E5F1C8BD6BE}" );
  }

  /**
   * PVSystems Object
   */
  public static com.myproject.opendss.IPVSystems createPVSystems() {
    return COM4J.createInstance( com.myproject.opendss.IPVSystems.class, "{D8D7592D-D5CD-4E27-870D-00D654DF2D3C}" );
  }

  /**
   * Vsources Object
   */
  public static com.myproject.opendss.IVsources createVsources() {
    return COM4J.createInstance( com.myproject.opendss.IVsources.class, "{0823B8BD-AD34-452B-974A-F46BA25D49EA}" );
  }

  public static com.myproject.opendss.IParallel createParallel() {
    return COM4J.createInstance( com.myproject.opendss.IParallel.class, "{D967764D-CD38-41ED-B1FD-7D79DC78EFCD}" );
  }

  /**
   * LineCodes Object
   */
  public static com.myproject.opendss.ILineCodes createLineCodes() {
    return COM4J.createInstance( com.myproject.opendss.ILineCodes.class, "{B6120B3A-7958-4650-AC18-2A53E89209A8}" );
  }

  /**
   * GICSources Object
   */
  public static com.myproject.opendss.IGICSources createGICSources() {
    return COM4J.createInstance( com.myproject.opendss.IGICSources.class, "{D0D4455C-A5CA-4B26-ABB4-2CC3798D260E}" );
  }

  /**
   * Reduce Object
   */
  public static com.myproject.opendss.IReduceCkt createReduceCkt() {
    return COM4J.createInstance( com.myproject.opendss.IReduceCkt.class, "{553148EA-97CB-4559-933A-A734250E95C6}" );
  }

  /**
   * Storages Object
   */
  public static com.myproject.opendss.IStorages createStorages() {
    return COM4J.createInstance( com.myproject.opendss.IStorages.class, "{E9322B91-C7CA-4573-803E-90AC4B4B1AA0}" );
  }

  /**
   * WindGens Class interface
   */
  public static com.myproject.opendss.IWindGens createWindGens() {
    return COM4J.createInstance( com.myproject.opendss.IWindGens.class, "{347418F7-928D-458D-B32D-681C00F33DF0}" );
  }
}
