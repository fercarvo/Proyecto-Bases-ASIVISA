/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Imagenes;

import Clases.Util.Messages;
import Clases.InterfaceMethods.Validate;
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
 * @author Kevin
 */
public final class imageResource extends ImageIcon{

    imageSize tamano;
    
    
    /*
     * Este metodo permite la extraccion de una imagen del paquete Imagenes.png
     * Siendo recurso el nombre de la carpeta luego de png
     */
    
    public imageResource(String nombreRecurso, String PaquetePng, int tipo){
        tamano = new imageSize();
        String path = null;
        if(PaquetePng != null && nombreRecurso != null)
            path = "/Imagenes/png/" + PaquetePng + "/" + nombreRecurso;
        Image img = obtenerImagen(getClass().getResource(path), tipo); 
        if(img != null)
            setImage(img);
    }
    
    public static final ImageIcon imageFromResourcesPng(String nombreRecurso, String Paquete, int tipo){
        String path = null;
        if(Paquete != null && nombreRecurso != null)
            path = "/Imagenes/png/" + Paquete + "/" + nombreRecurso;
        Dimension d = imageSize.getDimension(tipo);
        return new ImageIcon(obtenerImagen(path, d));
        
    }
    /*
     * Este metodo permite lo mismo que imagefromresourcespng con la diferencia que este permite la eleccion
     * de cualquier paquete
     */
    public imageResource(String nombreRecurso, String tipoArchivo, String Paquete, int tipo){
        tamano = new imageSize();
        String path = null;
        if(Paquete != null || nombreRecurso != null)
            path = "/Imagenes/" + tipoArchivo + "/" + Paquete + "/" + nombreRecurso;
        Image img = obtenerImagen(getClass().getResource(path), tipo); 
        if(img != null)
            setImage(img);
    }
    
    public static ImageIcon imageFromResources(String nombreRecurso, String tipoArchivo, String Paquete, int tipo){
        String path = null;
        if(Paquete != null || nombreRecurso != null)
            path = "/Imagenes/" + tipoArchivo + "/" + Paquete + "/" + nombreRecurso;
        Dimension d = imageSize.getDimension(tipo);
        return new ImageIcon(obtenerImagen(path, d));
        
    }
    
    public imageResource() {
    }
    
    public static BufferedImage cambiarTamano(BufferedImage img, int ancho, int altura) {
        BufferedImage nuevaImagen;
        
        nuevaImagen = new BufferedImage(ancho, altura, BufferedImage.TYPE_INT_ARGB);
        
        Graphics2D g2 = nuevaImagen.createGraphics();
        
        g2.drawImage(img, 0, 0, ancho, altura, null);
        
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.setRenderingHint(RenderingHints.KEY_RENDERING,RenderingHints.VALUE_RENDER_QUALITY);
	g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
 
        g2.dispose();
        return nuevaImagen;
    }

    public BufferedImage cambiarTamano(BufferedImage img, int imageSizeTipe) {
        BufferedImage nuevaImagen;
        
        tamano.setImageSize(imageSizeTipe);
 
        nuevaImagen = new BufferedImage(tamano.getAncho(), tamano.getAlto(), BufferedImage.TYPE_INT_ARGB);
        
        Graphics2D g2 = nuevaImagen.createGraphics();
        
        g2.drawImage(img, 0, 0,tamano.getAncho(), tamano.getAlto(), null);
        
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.setRenderingHint(RenderingHints.KEY_RENDERING,RenderingHints.VALUE_RENDER_QUALITY);
	g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
 
        g2.dispose();
        return nuevaImagen;
    }
    
    public Image obtenerImagen(URL path, int tipo){
        try {
            BufferedImage image = ImageIO.read(path);
            image = cambiarTamano(image, tipo);
            return image;
        } catch (IOException ex) {
            Messages.errorMessage("No se encontro la imagen " + path.getFile());
        } catch (Exception e){
            Messages.errorMessage("No se encontro la imagen " + path.getFile());
        }
        return null;
    }
    
    public static Image obtenerImagen(String path, Dimension d){
        URL pathFile = null;
        try {
            pathFile = imageResource.class.getClass().getResource(path);
            BufferedImage image = ImageIO.read(pathFile);
            int ancho =  (int) d.getWidth();
            int alto = (int) d.getHeight();
            image = cambiarTamano(image, ancho, alto);
            return image;
        } catch (IOException ex) {
            Messages.errorMessage("No se encontro la imagen" + pathFile.getFile());
        } catch (Exception e){
            Messages.errorMessage("No se encontro la imagen" + pathFile.getFile());
        } 
        return null;
    }
    public static void showCheckIcon(JLabel image, URL path, int tipo){
        imageResource tamano = new imageResource();
        tamano.setImage(tamano.obtenerImagen(path, tipo));
        image.setIcon(tamano);
    }
    
    public static void showCheckIcon(JLabel image, String path, Dimension d){
        image.setIcon(new ImageIcon(imageResource.obtenerImagen(path, d)));
    }
    
    public static void showCheckIcon(JLabel image, Dimension d){
        image.setIcon(new ImageIcon(obtenerImagen("/Imagenes/check.png", d)));
    }
    
    public static void showCheckIcon(JLabel image, int tipo){
        imageResource tamano = new imageResource();
        tamano.setImage(tamano.obtenerImagen(imageResource.class.getResource("/Imagenes/check.png"), tipo));
        image.setIcon(tamano);
    }
    
    
    public static void showErrorIcon(JLabel image, URL path, int tipo){
        imageResource tamano = new imageResource();
        tamano.setImage(tamano.obtenerImagen(path, tipo));
        image.setIcon(tamano);
    }
    
    public static void showErrorIcon(JLabel image, String path, Dimension d){
        image.setIcon(new ImageIcon(imageResource.obtenerImagen(path, d)));
    }
    
    public static void showErrorIcon(JLabel image, Dimension d){
        image.setIcon(new ImageIcon(imageResource.obtenerImagen("/Imagenes/Error.png", d)));
    }
    
    public static void showErrorIcon(JLabel image, int tipo){
        imageResource tamano = new imageResource();
        tamano.setImage(tamano.obtenerImagen(imageResource.class.getResource("/Imagenes/Error.png"), tipo));
        image.setIcon(tamano);
    }
}
