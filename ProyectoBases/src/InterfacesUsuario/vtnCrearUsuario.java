/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesUsuario;

import Clases.InterfaceMethods.User.PreferUser;
import Clases.InterfaceMethods.User.CrearUser;
import Clases.InterfaceMethods.*;
import Clases.InterfaceMethods.Validate;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Kevin
 */
public class vtnCrearUsuario extends javax.swing.JFrame {

    private JFrame anterior;
    private int estado;
    private CrearUser userNew;
    private PreferUser prefer;
    private CardLayout c1;
    JPanel buttonBoxPane;
    
    /**
     * Creates new form vtnCrearUsuario
     */
    public vtnCrearUsuario(JFrame ant) {
        anterior = ant;
        anterior.setVisible(false);
        estado = 0;
        
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    
    private void initComponents() {

        btnSiguiente = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        buttonBoxPane = new JPanel();
        userNew = new CrearUser();
        prefer = new PreferUser();
        c1 = new CardLayout();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setSize(new Dimension(400, 400));
        jPanel1.setPreferredSize(new Dimension(400, 400));
                
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnAnterior.setText("Anterior");
        btnAnterior.setEnabled(false);
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        buttonBoxPane.add(btnCancelar);
        buttonBoxPane.add(btnAnterior);
        buttonBoxPane.add(btnSiguiente);
        
        jPanel1.setLayout(c1);
        
        jPanel1.add(userNew, "usuarioNuevo");
        jPanel1.add(prefer, "preferenciasNuevo");
        
        getContentPane().add(jPanel1, BorderLayout.CENTER);
        getContentPane().add(buttonBoxPane, BorderLayout.PAGE_END);
        
        pack();
    
    }

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        c1.last(jPanel1);
    }                                           

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        switch(estado){
            case 0:{
                if(userNew.verificarDatos()){
                    btnAnterior.setEnabled(true);
                    estado++;
                    c1.next(jPanel1);
                }
            }break;
            case 1:{
                if(prefer.verificarDatos()){
                    estado++;
                    c1.next(jPanel1);
                }
            }break;
            default:{

            }
        }
    }                                            

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
            java.util.logging.Logger.getLogger(vtnCrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vtnCrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vtnCrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vtnCrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vtnCrearUsuario(new JFrame()).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   
}
