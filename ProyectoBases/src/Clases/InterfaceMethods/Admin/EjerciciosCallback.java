/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.InterfaceMethods.Admin;

import InterfacesAdministrador.Busquedas.EjercicioBusqueda;
import InterfacesAdministrador.ingresoDatos.EjercicioNuevoPanel;
import Clases.InterfaceMethods.InternalFrameList;
import InterfacesAdministrador.vtnNueva;
import java.awt.Dimension;
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
    
    public void mnuBtnNuevEjerActionPerformed(java.awt.event.ActionEvent evt, JDesktopPane ventana) {                                               
        // TODO add your handling code here:
        EjercicioNuevoPanel panel = new EjercicioNuevoPanel();
        InternalFrameList listener = new InternalFrameList(panel);
        vtnNueva vtn = vtnNueva.createWindow(panel, "Ejercicio Nuevo ",(++frameCountNuevo));
        vtn.addInternalFrameListener(listener);
        
        ventana.add(vtn);
        
    }
    
    public void mnuBtnBusEjerciciosActionPerformed(java.awt.event.ActionEvent evt, JDesktopPane ventana) {                                                    
        // TODO add your handling code here:
        EjercicioBusqueda buspanel = new EjercicioBusqueda();
        InternalFrameList listener = new InternalFrameList(buspanel);
        vtnNueva vtn = vtnNueva.createWindow(buspanel, "Busqueda de ejercicios" , (++frameCountBusqueda));
        
        vtn.addInternalFrameListener(listener);
        
        ventana.add(vtn);
        try{
            vtn.setSelected(true);
        }catch (java.beans.PropertyVetoException e){}
        
    }
    
    public void mnuBtnMostrarEjerActionPerformed(java.awt.event.ActionEvent evt, JDesktopPane ventana) {                                                  
        // TODO add your handling code here:
    }
    
}
