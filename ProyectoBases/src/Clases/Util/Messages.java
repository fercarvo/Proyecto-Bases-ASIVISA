/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.Util;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Clases
 */
public class Messages {

    public Messages() {
    }
    
    public static void errorMessage(String message){
        JOptionPane.showMessageDialog(null, message, "Error",JOptionPane.ERROR_MESSAGE);
    }
    public static void errorMessage(Component Parent, String message){
        JOptionPane.showMessageDialog(Parent, message, "Error",JOptionPane.ERROR_MESSAGE);
    }
    
}
