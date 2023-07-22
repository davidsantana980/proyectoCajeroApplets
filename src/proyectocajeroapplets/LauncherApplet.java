/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocajeroapplets;
import java.applet.Applet;

import javax.swing.JOptionPane;


/**
 *
 * @author david
 */
public class LauncherApplet extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */

    MenuGUI ATM = new MenuGUI();

    public void init() {
        JOptionPane.showMessageDialog(null, "Bienvenido usuario, introduzca su usuario y clave:");
        try {
            for(int intentos = 0; intentos < 3; intentos++){
                String usuario = JOptionPane.showInputDialog("Usuario:");
                String clave = JOptionPane.showInputDialog("Clave:");
                
                if (usuario.isEmpty() || clave.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No se han ingresado datos, por favor vuelva a intentarlo");
                } else {
                    if (usuario.equals("papu")  && clave.equals("mortadela")) {
                        ATM.ejecutar();
                        break;
                    } else {
                         JOptionPane.showMessageDialog(null, "Lo siento, parece ser que los datos introducidos no son correctos");
                    }
                    if (intentos == 2) throw new Exception("Ha superado el numero maximo de intentos permitidos");
                }
            } 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }

    }

    // TODO overwrite start(), stop() and destroy() methods
}
