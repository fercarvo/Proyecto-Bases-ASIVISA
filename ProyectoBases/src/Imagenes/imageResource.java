/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Imagenes;

import Clases.Util.Validate;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Clases
 */
public class imageResource extends ImageIcon{

    imageSize tamano;
    
    public imageResource(String filenameResource, String description) {
        super(filenameResource, description);
        
    }

    public imageResource(String filenameResource) {
        super(filenameResource);
    }

    public imageResource(URL location, String description) {
        super(location, description);
    }

    public imageResource(URL location) {
        super(location);
    }

    public imageResource() {
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

    public BufferedImage cambiarTamano(BufferedImage img, int imageSizeTipe) {
        BufferedImage nuevaImagen;
        
        this.tamano.setImageSize(imageSizeTipe);
 
        int type = img.getType() == 0? BufferedImage.TYPE_INT_ARGB : img.getType();
        
        if (type == 0)
            nuevaImagen = new BufferedImage(tamano.getAncho(), tamano.getAlto(), BufferedImage.TYPE_INT_ARGB);
        else
            nuevaImagen = new BufferedImage(tamano.getAncho(),tamano.getAlto(), type);
        
        Graphics2D g2 = nuevaImagen.createGraphics();
        
        g2.drawImage(img, 0, 0,tamano.getAncho(), tamano.getAlto(), null);
        
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        //g2.setRenderingHint(RenderingHints.KEY_RENDERING,RenderingHints.VALUE_RENDER_QUALITY);
	//g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
 
        g2.dispose();
        return nuevaImagen;
    }
    
    public ImageIcon obtenerImagen(URL path, int tipo){
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
    
    
    public static void showCheckIcon(JLabel image, URL path, int tipo){
        imageResource tamano = new imageResource();
        image.setIcon(tamano.obtenerImagen(path, tipo));
    }
    
    public static void showCheckIcon(JLabel image, URL path, Dimension d){
        image.setIcon(imageResource.obtenerImagen(path, d));
    }
    
    public static void showCheckIcon(JLabel image, Dimension d){
        image.setIcon(obtenerImagen(imageResource.class.getResource("/Imagenes/check.png"), d));
    }
    
    public static void showCheckIcon(JLabel image, int tipo){
        imageResource tamano = new imageResource();
        image.setIcon(tamano.obtenerImagen(imageResource.class.getResource("/Imagenes/check.png"), tipo));
    }
    
    
    public static void showErrorIcon(JLabel image, URL path, int tipo){
        imageResource tamano = new imageResource();
        image.setIcon(tamano.obtenerImagen(path, tipo));
    }
    
    public static void showErrorIcon(JLabel image, URL path, Dimension d){
        image.setIcon(imageResource.obtenerImagen(path, d));
    }
    
    public static void showErrorIcon(JLabel image, Dimension d){
        image.setIcon(imageResource.obtenerImagen(imageResource.class.getResource("/Imagenes/Error.png"), d));
    }
    
    public static void showErrorIcon(JLabel image, int tipo){
        imageResource tamano = new imageResource();
        image.setIcon(tamano.obtenerImagen(imageResource.class.getResource("/Imagenes/Error.png"), tipo));
    }
}
