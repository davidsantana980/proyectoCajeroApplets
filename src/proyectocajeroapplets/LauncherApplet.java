/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocajeroapplets;
import java.applet.Applet;


/**
 *
 * @author david
 */
public class LauncherApplet extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
       new MenuGUI().setVisible(true);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
