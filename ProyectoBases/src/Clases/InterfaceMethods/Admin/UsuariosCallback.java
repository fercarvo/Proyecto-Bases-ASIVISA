/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.InterfaceMethods.Admin;

import Clases.InterfaceMethods.InternalFrameList;
import InterfacesAdministrador.ingresoDatos.userNewPanel;
import InterfacesAdministrador.vtnNueva;
import javax.swing.JDesktopPane;

/**
 *
 * @author Clases
 */
public class UsuariosCallback {
    private static int frameCountNuevo = 0;
    private static int frameCountBusqueda = 0;
    private static int frameCountEjercicio = 0;
    
    public void mnuBtnNuevUsuaActionPerformed(java.awt.event.ActionEvent evt, JDesktopPane ventana) {                                               
        // TODO add your handling code here:
        userNewPanel panel = new userNewPanel(ventana);
        InternalFrameList listener = new InternalFrameList(panel);
        vtnNueva vtn = vtnNueva.createWindow(panel, "Usuario Nuevo " , (++frameCountNuevo));
        vtn.addInternalFrameListener(listener);
        
        ventana.add(vtn);
        try{
            vtn.setSelected(true);
        }catch (java.beans.PropertyVetoException e){}
        
    }
    public void mnuBtnBusPersonasActionPerformed(java.awt.event.ActionEvent evt, JDesktopPane ventana) {                                                  
        // TODO add your handling code here:
    }
    public void mnuBtnMostrarPerActionPerformed(java.awt.event.ActionEvent evt, JDesktopPane ventana) {                                                 
        // TODO add your handling code here:
    }
}
