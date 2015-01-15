/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.Util;

import java.awt.Component;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Clases
 */
public class NumbValidateTxt extends FocusAdapter{
    private JTextField text;
    private Component ventana;
    
    public NumbValidateTxt(JTextField text,Component Ventana){
        //super(text, FocusEvent.FOCUS_LOST);
        this.text = text;
        this.ventana = Ventana;
    }
    
    @Override
    public void focusLost(FocusEvent fe) {
        String textstr = this.text.getText();
        try {
            int i = Integer.parseInt(textstr);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(ventana, "Ingrese solo numeros");
            text.setText("");
            text.requestFocus();
        }     
    }
   
}
