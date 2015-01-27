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
    
    public static void infoMessage(String message){
        JOptionPane.showMessageDialog(null, message,"Atencion", JOptionPane.INFORMATION_MESSAGE, null);
    }
    
    public static void infoMessage(Component Parent, String message){
        JOptionPane.showMessageDialog(Parent, message,"Atencion", JOptionPane.INFORMATION_MESSAGE, null);
    }
    
    public static int questionMessage(String question, Object[] buttonsName){
        return JOptionPane.showOptionDialog(null, question, null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, buttonsName, buttonsName[2]);
    }
    
    public static int questionMessage(Component parent, String question, Object[] buttonsName){
        return JOptionPane.showOptionDialog(parent, question, null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, buttonsName, buttonsName[2]);
    }
    
}
