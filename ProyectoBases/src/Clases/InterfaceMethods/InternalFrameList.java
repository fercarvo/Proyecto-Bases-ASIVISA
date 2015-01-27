/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.InterfaceMethods;

import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

/**
 *
 * @author Kevin
 */
public class InternalFrameList implements InternalFrameListener{

    private ConnectDbInterface container;
    
    public InternalFrameList(ConnectDbInterface cont) {
        container = cont;
    }

    @Override
    public void internalFrameOpened(InternalFrameEvent e) {
        
    }

    @Override
    public void internalFrameClosing(InternalFrameEvent e) {
        int a;
    }

    @Override
    public void internalFrameClosed(InternalFrameEvent e) {
        boolean escribirDatosDB;
        escribirDatosDB = container.escribirDatosDB();
        
    }

    @Override
    public void internalFrameIconified(InternalFrameEvent e) {
        
    }

    @Override
    public void internalFrameDeiconified(InternalFrameEvent e) {
        
    }

    @Override
    public void internalFrameActivated(InternalFrameEvent e) {
        
    }

    @Override
    public void internalFrameDeactivated(InternalFrameEvent e) {
        
    }
    
}
