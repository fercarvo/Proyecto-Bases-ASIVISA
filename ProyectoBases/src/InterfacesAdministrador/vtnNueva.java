/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesAdministrador;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

/**
 *
 * @author Kevin
 */
public class vtnNueva extends javax.swing.JInternalFrame {

    private static final int xOffset = 30, yOffset = 30;
    /**
     * Creates new form vtnNueva
     */
    public vtnNueva(JPanel contenido) {
        super("", true, true, true, true);
        initComponents();
        add(contenido, BorderLayout.CENTER);
    }

    public vtnNueva(JPanel contenido, String Title) {
        super(Title, true, true, true);
        initComponents();
        add(contenido, BorderLayout.CENTER);
    }

    /*
     * 
     */
    public static vtnNueva createWindow(JPanel contenido, String title, int frameCount){
        vtnNueva vtn = new vtnNueva(contenido, title + (frameCount));
        vtn.setDefaultCloseOperation(JInternalFrame.DO_NOTHING_ON_CLOSE);
        Dimension d = contenido.getLayout().preferredLayoutSize(contenido);
        vtn.setSize(d);
        vtn.setLocation(xOffset*frameCount, yOffset*frameCount);
        vtn.setVisible(true);
        
        return vtn;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    
    
}

