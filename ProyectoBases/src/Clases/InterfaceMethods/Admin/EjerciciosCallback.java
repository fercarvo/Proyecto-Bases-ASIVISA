/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.InterfaceMethods.Admin;

import Clases.InterfaceMethods.InternalFrameList;
import InterfacesAdministrador.vtnNueva;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author Kevin
 */
public class EjerciciosCallback {
    
    private static int frameCountNuevo = 0;
    private static int frameCountBusqueda = 0;
    private static int frameCountEjercicio = 0;
    
    private static final int xOffset = 30, yOffset = 30;
    
    public void mnuBtnNuevEjerActionPerformed(java.awt.event.ActionEvent evt, JDesktopPane ventana) {                                               
        // TODO add your handling code here:
        EjercicioPanel panel = new EjercicioPanel();
        InternalFrameList listener = new InternalFrameList(panel);
        vtnNueva vtn = new vtnNueva(panel, "Ejercicio Nuevo " + (++frameCountNuevo));
        vtn.addInternalFrameListener(listener);
        
        vtn.setDefaultCloseOperation(JInternalFrame.DO_NOTHING_ON_CLOSE);
        vtn.setSize(300, 300);
        vtn.setLocation(xOffset*frameCountNuevo, yOffset*frameCountNuevo);
        vtn.setVisible(true);
        ventana.add(vtn);
        try{
            vtn.setSelected(true);
        }catch (java.beans.PropertyVetoException e){}
        
        
    }
    
    public void mnuBtnBusEjerciciosActionPerformed(java.awt.event.ActionEvent evt, JDesktopPane ventana) {                                                    
        // TODO add your handling code here:
        
    }
    
    public void mnuBtnMostrarEjerActionPerformed(java.awt.event.ActionEvent evt, JDesktopPane ventana) {                                                  
        // TODO add your handling code here:
    }
    
}
