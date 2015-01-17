/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.Util;

import java.awt.Dimension;
import java.net.URL;
import javax.swing.JLabel;

/**
 *
 * @author Clases
 */
public class Validate {
    public static boolean isOnlyAlfa(String name){
        if(name.isEmpty())
            return false;
                    
        char[] chars = name.toCharArray();

        for (char c : chars) {
            if(!Character.isLetter(c)) {
                return false;
            }
        }
        return true;        
    }

    public static boolean isOnlyAlfa(String name, int validLength){
        if(name.isEmpty())
            return false;
        
        char[] chars = name.toCharArray();

        if(chars.length != validLength)
            return false;
        
        for (char c : chars) {
            if(!Character.isLetter(c)) {
                return false;
            }
        }
        return true;        
    }   
    
    public static boolean isOnlyNum(String name){
        char[] chars = name.toCharArray();

        if(name.isEmpty())
            return false;
        
        for (char c : chars) {
            if(!Character.isDigit(c)) {
                return false;
            }
        }
        return true;        
    }
    
    public static boolean isOnlyNum(String name, int validLength){
        char[] chars = name.toCharArray();

        if(name.isEmpty())
            return false;
        
        if(chars.length != validLength)
            return false;
        
        for (char c : chars) {
            if(!Character.isDigit(c)) {
                return false;
            }
        }
        return true;        
    }
    
    public static boolean isOnlyAlfaNum(String name){
        char[] chars = name.toCharArray();

        if(name.isEmpty())
            return false;
        
        for (char c : chars) {
            if(!Character.isLetterOrDigit(c)) {
                return false;
            }
        }
        return true;        
    }
    
    public static boolean isOnlyAlfaNum(String name, int validLength){
        char[] chars = name.toCharArray();

        if(name.isEmpty())
            return false;
        
        if(chars.length != validLength)
            return false;
        
        for (char c : chars) {
            if(!Character.isLetterOrDigit(c)) {
                return false;
            }
        }
        return true;        
    }
    
    public static void showCheckIcon(JLabel image, URL path, int tipo){
        image.setIcon(imageSize.obtenerImagen(path, tipo));
    }
    
    public static void showCheckIcon(JLabel image, URL path, Dimension d){
        image.setIcon(imageSize.obtenerImagen(path, d));
    }
    
    public static void showCheckIcon(JLabel image, Dimension d){
        image.setIcon(imageSize.obtenerImagen(Validate.class.getResource("/Imagenes/check.png"), d));
    }
    
    public static void showCheckIcon(JLabel image, int tipo){
        image.setIcon(imageSize.obtenerImagen(Validate.class.getResource("/Imagenes/check.png"), tipo));
    }
    
    
    public static void showErrorIcon(JLabel image, URL path, int tipo){
        image.setIcon(imageSize.obtenerImagen(path, tipo));
    }
    
    public static void showErrorIcon(JLabel image, URL path, Dimension d){
        image.setIcon(imageSize.obtenerImagen(path, d));
    }
    
    public static void showErrorIcon(JLabel image, Dimension d){
        image.setIcon(imageSize.obtenerImagen(Validate.class.getResource("/Imagenes/Error.png"), d));
    }
    
    public static void showErrorIcon(JLabel image, int tipo){
        image.setIcon(imageSize.obtenerImagen(Validate.class.getResource("/Imagenes/Error.png"), tipo));
    }
}
