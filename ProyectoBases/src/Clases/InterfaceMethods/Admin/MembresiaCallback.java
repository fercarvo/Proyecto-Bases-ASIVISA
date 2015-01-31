/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.InterfaceMethods.Admin;

import Clases.InterfaceMethods.InternalFrameList;
import InterfacesAdministrador.ingresoDatos.membresiaNuevoPanel;
import InterfacesAdministrador.reportes.MembresiaReportPanel;
import InterfacesAdministrador.vtnNueva;
import javax.swing.JDesktopPane;

/**
 *
 * @author Clases
 */
public class MembresiaCallback {
    private static int frameCountNuevo = 0;
    private static int frameCountBusqueda = 0;
    private static int frameCountReporte = 0;
    
     
    public void mnuBtnNuevMembActionPerformed(java.awt.event.ActionEvent evt, JDesktopPane ventana) {                                               
        // TODO add your handling code here:
        membresiaNuevoPanel panel = new membresiaNuevoPanel();
        InternalFrameList listener = new InternalFrameList(panel);
        vtnNueva vtn = vtnNueva.createWindow(panel, "Membresia Nueva ",++frameCountNuevo);
        vtn.addInternalFrameListener(listener);        
        ventana.add(vtn);
        try{
            vtn.setSelected(true);
        }catch (java.beans.PropertyVetoException e){}
        
    }
    public void mnuMembBtnEstadoActionPerformed(java.awt.event.ActionEvent evt, JDesktopPane ventana) {                                                
        // TODO add your handling code here:
        MembresiaReportPanel panel = new MembresiaReportPanel();
        InternalFrameList listener = new InternalFrameList(panel);
        vtnNueva vtn = vtnNueva.createWindow(panel,"Reporte de membresias ",(++frameCountReporte));
        vtn.addInternalFrameListener(listener);
        ventana.add(vtn);
        try{
            vtn.setSelected(true);
        }catch (java.beans.PropertyVetoException e){}
        
    }                                               
}
