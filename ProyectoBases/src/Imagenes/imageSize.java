/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Imagenes;

import java.awt.Dimension;

/**
 *
 * @author Kevin
 */
public class imageSize {
    public static final int icon = 0;
    
    public static final int small = 1;
    public static final int medium = 2;
    public static final int large = 3;
    
    public static final int icon_toolbar = 4;
    public static final int icon_menu = 5;
    
    private static int ICON_MENU_HEIGHT = 20;
    private static int ICON_MENU_WEIGHT = 20;
    
    private static int ICON_TOOLBAR_HEIGHT = 40;
    private static int ICON_TOOLBAR_WEIGHT = 40;
    
    private static int ICON_HEIGHT = 150;
    private static int ICON_WEIGHT = 150;
    
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
    
    
    public void setImageSize(int imageSizeTipe){
        switch(imageSizeTipe){
            case 0:{
                this.alto = ICON_HEIGHT;
                this.ancho = ICON_WEIGHT; 
           }break;
            case 1:{
                this.alto = SMALL_HEIGHT;
                this.ancho = SMALL_WEIGHT;
            }break;
            case 2:{
                this.alto = MEDIUM_HEIGHT;
                this.ancho = MEDIUM_WEIGHT;
            }break;
            case 3:{
                this.alto = LARGE_HEIGHT;
                this.ancho = LARGE_WEIGHT;
            }break;
            case 4:{
                this.ancho = ICON_TOOLBAR_WEIGHT;
                this.alto = ICON_TOOLBAR_HEIGHT;
                
            }break;
            case 5:{
                this.ancho = ICON_MENU_WEIGHT;
                this.alto = ICON_MENU_HEIGHT;
            }break;
            default:{
            }
        }
        
    }
    
    public static Dimension getDimension(int tipo){
        imageSize tam = new imageSize();
        tam.setImageSize(tipo);
        Dimension d = new Dimension(tam.getAncho(), tam.getAlto());
        
        tam = null;
        return d;
    }
}
