/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.Util;

import java.awt.Component;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Clases
 */
public class StringValidateTxt extends FocusAdapter{
    
    private JTextField text;
    
    public StringValidateTxt(){
    }
    
    public StringValidateTxt(JTextField text){
        this.text = text;
    }
    @Override
    public void focusLost(FocusEvent fe) {
        if ( text == null)
            text = (JTextField) fe.getSource();
        
        String textstr = this.text.getText();
        try {
            int i = Integer.parseInt(textstr);
            Messages.errorMessage("Ingrese solo texto sin numeros");
            this.text.setText("");
            this.text.requestFocus();
        } catch (NumberFormatException nfe) {
        }     
    }
}
