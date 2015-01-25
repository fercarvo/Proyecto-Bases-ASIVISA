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
    
    public NumbValidateTxt(){
    }
    
    public NumbValidateTxt(JTextField text){
        //super(text, FocusEvent.FOCUS_LOST);
        this.text = text;
    }
    
    @Override
    public void focusLost(FocusEvent fe) {
        if ( text == null)
            text = (JTextField) fe.getSource();
        
        String textstr = this.text.getText();
        try {
            int i = Integer.parseInt(textstr);
        } catch (NumberFormatException nfe) {
            Messages.errorMessage("Ingrese solo numeros");
            text.setText("");
            text.requestFocus();
        }     
    }
   
}
