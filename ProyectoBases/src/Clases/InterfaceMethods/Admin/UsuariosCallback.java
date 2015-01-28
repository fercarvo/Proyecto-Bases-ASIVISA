/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.InterfaceMethods.Admin;

import Clases.InterfaceMethods.InternalFrameList;
import InterfacesAdministrador.userNewPanel;
import InterfacesAdministrador.vtnNueva;
import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author Clases
 */
public class UsuariosCallback {
    private static int frameCountNuevo = 0;
    private static int frameCountBusqueda = 0;
    private static int frameCountEjercicio = 0;
    
    private static final int xOffset = 30, yOffset = 30;
    
    public void mnuBtnNuevUsuaActionPerformed(java.awt.event.ActionEvent evt, JDesktopPane ventana) {                                               
        // TODO add your handling code here:
        userNewPanel panel = new userNewPanel(ventana);
        InternalFrameList listener = new InternalFrameList(panel);
        vtnNueva vtn = new vtnNueva(panel, "Usuario Nuevo " + (++frameCountNuevo));
        vtn.addInternalFrameListener(listener);
        
        vtn.setDefaultCloseOperation(JInternalFrame.DO_NOTHING_ON_CLOSE);
        Dimension d = panel.getLayout().preferredLayoutSize(panel);
        vtn.setSize(d);
        vtn.setLocation(xOffset*frameCountNuevo, yOffset*frameCountNuevo);
        vtn.setVisible(true);
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
