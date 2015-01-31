/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.InterfaceMethods.Admin;

import Clases.InterfaceMethods.InternalFrameList;
import InterfacesAdministrador.ingresoDatos.facturaNewPanel;
import InterfacesAdministrador.vtnNueva;
import javax.swing.JDesktopPane;

/**
 *
 * @author Clases
 */
public class FacturaCallback {
    private static int frameCountNuevo = 0;
    private static int frameCountBusqueda = 0;
    private static int frameCountEjercicio = 0;
    
    public void mnuBtnNuevFacturaActionPerformed(java.awt.event.ActionEvent evt, JDesktopPane ventana) {                                               
        // TODO add your handling code here:
        facturaNewPanel panel = new facturaNewPanel();
        InternalFrameList listener = new InternalFrameList(panel);
        vtnNueva vtn = vtnNueva.createWindow(panel, "Factura Nueva  " , (++frameCountNuevo));
        vtn.addInternalFrameListener(listener);
        
        ventana.add(vtn);
        try{
            vtn.setSelected(true);
        }catch (java.beans.PropertyVetoException e){}
        
    }
}
