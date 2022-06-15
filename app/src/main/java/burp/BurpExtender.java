package burp;

import java.awt.Component;
import java.io.PrintWriter;

/**
 *
 * @author malvik
 */
public class BurpExtender implements IBurpExtender, IExtensionStateListener, ITab  {
   
    
    @Override
    public void registerExtenderCallbacks(IBurpExtenderCallbacks callbacks) {
        
        Demo.callbacks = callbacks;
        Demo.helpers = callbacks.getHelpers();
        Demo.stdout = new PrintWriter(callbacks.getStdout(), true); //for normal console output
        Demo.stderr = new PrintWriter(callbacks.getStderr(), true); // for error console output
        Demo.burpGui = new Gui();
        //Set name for extension
        callbacks.setExtensionName("Custom Burp");
        callbacks.addSuiteTab(this);
        callbacks.registerExtensionStateListener(BurpExtender.this);
        
        Demo.stdout.println("Extension Loaded");
    }

    @Override
    public void extensionUnloaded() {
        //action to perform when extension is unloaded  
        Demo.stdout.println("Extension Unloaded");
        
    }

    @Override
    public String getTabCaption() {
        return Demo.caption ;
    }

    @Override
    public Component getUiComponent() {
        return Demo.burpGui;
    }
  
    
}
