package burp;

import java.io.PrintWriter;

/**
 *
 * @author malvik
 */
public class Demo {
    public static BurpExtender burpExtender ;
    public static Gui burpGui;
    public static String extensionName = "GUI Demo";
    public static String caption = "Gui Demo";
    public static PrintWriter stdout ;
    public static PrintWriter stderr ;
    public static IBurpExtenderCallbacks callbacks ;
    public static IExtensionHelpers helpers;
    public static boolean extensionStatus = false ;
    
}
