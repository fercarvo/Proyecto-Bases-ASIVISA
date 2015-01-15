/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.Util;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
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
    
    private static int ICON_HEIGHT = 25;
    private static int ICON_WEIGHT = 25;
    private static int SMALL_HEIGHT = 300;
    private static int SMALL_WEIGHT = 300;
    private static int MEDIUM_HEIGHT = 450;
    private static int MEDIUM_WEIGHT = 450;
    private static int LARGE_HEIGHT = 600;
    private static int LARGE_WEIGHT = 600;
    
    public static int[] setImageSize(int imageSizeTipe){
        int[] valores = new int[2];
        switch(imageSizeTipe){
            case 0:{
                valores[0] = ICON_HEIGHT;
                valores[1] = ICON_WEIGHT; 
           }break;
            case 1:{
                valores[0] = SMALL_HEIGHT;
                valores[1] = SMALL_WEIGHT;
            }break;
            case 2:{
                valores[0] = MEDIUM_HEIGHT;
                valores[1] = MEDIUM_WEIGHT;
            }break;
            case 3:{
                valores[0] = LARGE_HEIGHT;
                valores[1] = LARGE_WEIGHT;
            }break;
            default:{

            }
        }
        return valores;
    }
    
    public static BufferedImage cambiarTamano(BufferedImage img, int ancho, int altura) {
        BufferedImage nuevaImagen;
        
        int type = img.getType() == 0? BufferedImage.TYPE_INT_ARGB : img.getType();
        
        if (type == 0)
            nuevaImagen = new BufferedImage(ancho, altura, BufferedImage.TYPE_INT_ARGB);
        else
            nuevaImagen = new BufferedImage(ancho, altura, type);
        
        Graphics2D g2 = nuevaImagen.createGraphics();
        
        g2.drawImage(img, 0, 0, ancho, altura, null);
        
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        //g2.setRenderingHint(RenderingHints.KEY_RENDERING,RenderingHints.VALUE_RENDER_QUALITY);
	//g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
 
        g2.dispose();
        return nuevaImagen;
    }

    public static BufferedImage cambiarTamano(BufferedImage img, int imageSizeTipe) {
        int[] anchoAlto;
        BufferedImage nuevaImagen;
        
        anchoAlto = setImageSize(imageSizeTipe);
 
        int type = img.getType() == 0? BufferedImage.TYPE_INT_ARGB : img.getType();
        
        if (type == 0)
            nuevaImagen = new BufferedImage(anchoAlto[1], anchoAlto[0], BufferedImage.TYPE_INT_ARGB);
        else
            nuevaImagen = new BufferedImage(anchoAlto[1], anchoAlto[0], type);
        
        Graphics2D g2 = nuevaImagen.createGraphics();
        
        g2.drawImage(img, 0, 0, anchoAlto[1], anchoAlto[0], null);
        
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        //g2.setRenderingHint(RenderingHints.KEY_RENDERING,RenderingHints.VALUE_RENDER_QUALITY);
	//g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
 
        g2.dispose();
        return nuevaImagen;
    }
    
    public static ImageIcon obtenerImagen(URL path, int tipo){
        try {
            BufferedImage image = ImageIO.read(path);
            image = cambiarTamano(image, tipo);
            return new ImageIcon(image);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Mensaje", "No se encontro la foto", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    
    public static ImageIcon obtenerImagen(URL path, Dimension d){
        try {
            BufferedImage image = ImageIO.read(path);
            int ancho =  (int) d.getWidth();
            int alto = (int) d.getHeight();
            image = cambiarTamano(image, ancho, alto);
            return new ImageIcon(image);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"No se encontro la foto","Mensaje",JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
}
