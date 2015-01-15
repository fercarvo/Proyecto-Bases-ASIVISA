/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.Util;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

/**
 *
 * @author Clases
 */
public class imageSize {
    public static final int icon = 0;
    public static final int small = 1;
    public static final int medium = 2;
    public static final int large = 3;
    
    private static int ICON_HEIGHT = 50;
    private static int ICON_WEIGHT = 50;
    private static int SMALL_HEIGHT = 300;
    private static int SMALL_WEIGHT = 300;
    private static int MEDIUM_HEIGHT = 450;
    private static int MEDIUM_WEIGHT = 450;
    private static int LARGE_HEIGHT = 600;
    private static int LARGE_WEIGHT = 600;
    
    public static void setImageSize(int imageSizeTipe, Integer alto , Integer ancho){
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
                alto = LARGE_WEIGHT;
            }break;
            default:{

            }
        }
    }
    
    public static Image cambiarTamano(Image img, int ancho, int altura) {
        BufferedImage nuevaImagen = new BufferedImage(ancho, altura, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = nuevaImagen.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(img, 0, 0, ancho, altura, null);
        g2.dispose();
        return nuevaImagen;
    }

    public static Image cambiarTamano(Image img, int imageSizeTipe) {
        Integer alto, ancho;
        ancho = new Integer(0);
        alto = new Integer(0);
        
        setImageSize(imageSizeTipe, alto, ancho);
 
        BufferedImage nuevaImagen = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = nuevaImagen.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(img, 0, 0, ancho, alto, null);
        g2.dispose();
        return nuevaImagen;
    }
}
