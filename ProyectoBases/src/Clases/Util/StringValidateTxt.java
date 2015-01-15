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
    private Component ventana;
    
    public StringValidateTxt(JTextField text,Component Ventana){
        this.text = text;
        this.ventana = Ventana;
    }
    
    @Override
    public void focusLost(FocusEvent fe) {
        String textstr = this.text.getText();
        try {
            int i = Integer.parseInt(textstr);
            JOptionPane.showMessageDialog(ventana, "Ingrese solo cadenas");
            this.text.setText("");
            this.text.requestFocus();
        } catch (NumberFormatException nfe) {
        }     
    }
}
