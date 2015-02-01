/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.InterfaceMethods.Admin;

import Clases.InterfaceMethods.InternalFrameList;
import InterfacesAdministrador.ingresoDatos.ComidaNuevoPanel;
import InterfacesAdministrador.vtnNueva;
import javax.swing.JDesktopPane;

/**
 *
 * @author Clases
 */
public class ComidasCallback {
    private static int frameCountNuevo = 0;
    private static int frameCountBusqueda = 0;
    private static int frameCountEjercicio = 0;
    private static int frameCountReporte = 0;
    
    public void mnuBtnNuevComActionPerformed(java.awt.event.ActionEvent evt, JDesktopPane ventana) {                                              
        // TODO add your handling code here:
        ComidaNuevoPanel panel = new ComidaNuevoPanel();
        InternalFrameList listener = new InternalFrameList(panel);
        vtnNueva vtn = vtnNueva.createWindow(panel, "Comida Nueva " , (++frameCountNuevo));
        vtn.addInternalFrameListener(listener);
        
        ventana.add(vtn);
        try{
            vtn.setSelected(true);
        }catch (java.beans.PropertyVetoException e){}
    }
    
    public void mnuBtnBusComidasActionPerformed(java.awt.event.ActionEvent evt, JDesktopPane ventana) {                                                 
        // TODO add your handling code here:
    }
    
    public void mnuBtnMostrarComActionPerformed(java.awt.event.ActionEvent evt, JDesktopPane ventana) {                                                 
        // TODO add your handling code here:
    }
}
