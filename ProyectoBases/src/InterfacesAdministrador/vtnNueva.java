/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesAdministrador;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Clases
 */
public class vtnNueva extends javax.swing.JInternalFrame {

    private final String Title = "";
    private final boolean Resizable = true;
    private final boolean Closable = true;
    private final boolean Maximizable = true;
    private final boolean Iconable = true;
    
    /**
     * Creates new form vtnNueva
     */
    public vtnNueva(JPanel contenido) {
        super("", true, true, true, true);
        initComponents();
        add(contenido, BorderLayout.CENTER);
    }

    public vtnNueva(JPanel contenido, String Title) {
        super(Title);
        initComponents();
        add(contenido, BorderLayout.CENTER);
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
