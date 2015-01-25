/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Imagenes;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Clases
 */
public class imageSize {
    public static final int icon = 0;
    
    public static final int small = 1;
    public static final int medium = 2;
    public static final int large = 3;
    
    public static final int icon_toolbar = 4;
    public static final int icon_menu = 5;
    
    private static int ICON_MENU_HEIGHT = 12;
    private static int ICON_MENU_WEIGHT = 12;
    
    private static int ICON_TOOLBAR_HEIGHT = 36;
    private static int ICON_TOOLBAR_WEIGHT = 36;
    
    private static int ICON_HEIGHT = 25;
    private static int ICON_WEIGHT = 25;
    
    private static int SMALL_HEIGHT = 300;
    private static int SMALL_WEIGHT = 300;
    
    private static int MEDIUM_HEIGHT = 450;
    private static int MEDIUM_WEIGHT = 450;
    
    private static int LARGE_HEIGHT = 600;
    private static int LARGE_WEIGHT = 600;
    
    private int ancho;
    private int alto;

    public imageSize() {
        ancho = 0;
        alto = 0;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    
    public  void setImageSize(int imageSizeTipe){
        
        switch(imageSizeTipe){
            case 0:{
                alto = ICON_HEIGHT;
                ancho = ICON_WEIGHT; 
           }break;
            case 1:{
                alto = SMALL_HEIGHT;
                ancho = SMALL_WEIGHT;
            }break;
            case 2:{
                alto = MEDIUM_HEIGHT;
                ancho = MEDIUM_WEIGHT;
            }break;
            case 3:{
                alto = LARGE_HEIGHT;
                ancho = LARGE_WEIGHT;
            }break;
            case 4:{
                ancho = ICON_TOOLBAR_WEIGHT;
                alto = ICON_TOOLBAR_HEIGHT;
                
            }break;
            case 5:{
                ancho = ICON_MENU_WEIGHT;
                alto = ICON_MENU_HEIGHT;
            }break;
            default:{
            }
        }
        
    }
    
    
}
