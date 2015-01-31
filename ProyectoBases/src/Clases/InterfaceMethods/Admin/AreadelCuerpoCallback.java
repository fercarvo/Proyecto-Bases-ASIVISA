/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.InterfaceMethods.Admin;

import Clases.InterfaceMethods.InternalFrameList;
import InterfacesAdministrador.ingresoDatos.areaDelCuerpoPanel;
import InterfacesAdministrador.vtnNueva;
import javax.swing.JDesktopPane;

/**
 *
 * @author Clases
 */
public class AreadelCuerpoCallback {
    private static int frameCountNuevo = 0;
    
    public void btnToolAgregarADCActionPerformed(java.awt.event.ActionEvent evt, JDesktopPane ventana) {                                                  
        areaDelCuerpoPanel panel = new areaDelCuerpoPanel();
        InternalFrameList listener = new InternalFrameList(panel);
        vtnNueva vtn = vtnNueva.createWindow(panel, "Usuario Nuevo " , (++frameCountNuevo));
        vtn.addInternalFrameListener(listener);
        
        ventana.add(vtn);
        try{
            vtn.setSelected(true);
        }catch (java.beans.PropertyVetoException e){}
        
    }
}
