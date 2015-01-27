/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.InterfaceMethods.Admin;

import Clases.InterfaceMethods.ConnectDbInterface;
import InterfacesAdministrador.vtnDatosTabla;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

/**
 *
 * @author Clases
 */
public class EjercicioBusqueda extends vtnDatosTabla implements ConnectDbInterface,ActionListener{

    public EjercicioBusqueda() {
        
    }

    public void initComponents(){
        btnOpcion1.setText("");
        btnOpcion1.setToolTipText("Permite ...");
        btnOpcion1.setActionCommand("Opcion1");
        btnOpcion1.addActionListener(this);
        
        btnOpcion2.setText("");
        btnOpcion2.setToolTipText("");
        btnOpcion2.setActionCommand("Opcion2");
        btnOpcion2.addActionListener(this);
        
        btnOpcion3.setText("");
        btnOpcion3.setToolTipText("");
        btnOpcion3.setActionCommand("Opcion3");
        btnOpcion3.addActionListener(this);
        
        btnOpcion4 = new JRadioButton();
        btnOpcion4.setText("");
        btnOpcion4.setToolTipText("");
        btnOpcion4.setActionCommand("Opcion4");
        btnOpcion4.addActionListener(this);
        OptionPanel.add(btnOpcion4);
    }
    @Override
    public boolean escribirDatosDB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private JToggleButton btnOpcion4;

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
