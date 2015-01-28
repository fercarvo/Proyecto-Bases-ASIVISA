/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.InterfaceMethods;

import Clases.Util.Messages;
import javax.swing.JInternalFrame;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

/**
 *
 * @author Kevin
 */
public class InternalFrameList implements InternalFrameListener{

    private ConnectDbInterface container;
    private final String[] opciones = {"Si", "No", "Cancelar"};
    private final String pregunta = "Desea guardar los cambios?";
    public InternalFrameList(ConnectDbInterface cont) {
        container = cont;
    }

    @Override
    public void internalFrameOpened(InternalFrameEvent e) {
        
    }

    @Override
    public void internalFrameClosing(InternalFrameEvent e) {
        int op = Messages.questionMessage(pregunta, opciones);
        JInternalFrame frame = e.getInternalFrame();
        switch(op){
            case 0:{
                boolean escribirDatosDB = container.escribirDatosDB();
                if(escribirDatosDB)
                    Messages.infoMessage("Se han guardado los cambios correctamente");
                else 
                    Messages.errorMessage("No se pueden escribir los datos, revise su conexion a internet");
                frame.dispose();
            }break;
            case 1:{
                frame.dispose();
            }break;
            case 2:{
            }
        }
    }

    @Override
    public void internalFrameClosed(InternalFrameEvent e) {
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
