/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesUsuario;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.IconUIResource;

/**
 *
 * @author Clases
 */
public class vtnUserPrinc extends javax.swing.JFrame {
    /**
     * Creates new form VtnUsuarioPrincipal
     */
    private JPanel panel;
    private JButton home;
    private JLabel nombText;
    
    public vtnUserPrinc() {
        ToolBar = new javax.swing.JToolBar();
        GridBagConstraints c = new GridBagConstraints();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        home = new JButton();
        home.setIcon(new ImageIcon(getClass().getResource("/Imagenes/")));
        ToolBar.setFloatable(false);
        ToolBar.setRollover(true);
        
        GridBagLayout layout = new GridBagLayout();
        getContentPane().setLayout(layout);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0; 
        add(home, c);
        
        pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VtnUsuarioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnUsuarioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnUsuarioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnUsuarioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnUsuarioPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JToolBar ToolBar;
    // End of variables declaration                   
}
