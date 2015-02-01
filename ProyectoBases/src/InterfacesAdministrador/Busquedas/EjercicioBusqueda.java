/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesAdministrador.Busquedas;

import Clases.InterfaceMethods.ConnectDbInterface;
import Clases.InterfaceMethods.InteractDBInterface;
import Clases.Util.Messages;
import InterfacesAdministrador.vtnDatosTabla;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;
import javax.swing.JButton;

/**
 *
 * @author Clases
 */
public class EjercicioBusqueda extends vtnDatosTabla implements ConnectDbInterface,ActionListener, InteractDBInterface{

    public EjercicioBusqueda() {
        initNewComponents();
    }

    public void initNewComponents(){
        btnOpcion4 = new JButton();
        btnOpcion5 = new JButton();
        
        btnOpcion1.setText("Busqueda por nombre:");
        btnOpcion1.setToolTipText("Permite realizar busquedas por nombre");
        btnOpcion1.setActionCommand("Opcion1");
        btnOpcion1.addActionListener(this);
        
        btnOpcion2.setText("Busqueda por Descripcion");
        btnOpcion2.setToolTipText("Permite realizar busquedas por descripcion");
        btnOpcion2.setActionCommand("Opcion2");
        btnOpcion2.addActionListener(this);
        
        btnOpcion3.setText("Busqueda por area del cuerpo");
        btnOpcion3.setToolTipText("Permite realizar busquedas por areas del cuerpo");
        btnOpcion3.setActionCommand("Opcion3");
        btnOpcion3.addActionListener(this);
        
        btnOpcion4.setText("Busqueda por Intensidad");
        btnOpcion4.setToolTipText("Permite realizar busquedas dada una intensidad");
        btnOpcion4.setActionCommand("Opcion4");
        btnOpcion4.addActionListener(this);
        OptionPanel.add(btnOpcion4);
        
        btnOpcion5.setText("Busqueda general");
        btnOpcion5.setToolTipText("Aqui se puede agregar un query de manera directa para consultar a la base de datos");
        btnOpcion5.setActionCommand("Opcion5");
        btnOpcion5.addActionListener(this);
        OptionPanel.add(btnOpcion5);
    }
    
    private JButton btnOpcion4;
    private JButton btnOpcion5;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        StringTokenizer token;
        String actionComand = e.getActionCommand();
        switch(actionComand){
            case "Opcion1":{
                String busNom = Messages.inputMessage("Ingrese el nombre del o los ejercicios a buscar");
                if(!busNom.isEmpty()){
                    token = new StringTokenizer(busNom,"|");

                    String[] nombres = new String[token.countTokens()];
                    int i = 0;
                    while(token.hasMoreElements()){
                        nombres[i]=token.nextToken();
                        i++;
                    }
                }
            }break;
            case "Opcion2":{
                
            }break;
            case "Opcion3":{
                String busNom = Messages.inputMessage("Ingrese el nombre del o las areas del cuerpo a buscar");
                if(!busNom.isEmpty()){
                    token = new StringTokenizer(busNom,"|");
                    String[] nombres = new String[token.countTokens()];
                    int i = 0;
                    while(token.hasMoreElements()){
                        nombres[i]=token.nextToken();
                        i++;
                    }
                }
            }break;
            case "Opcion4":{
                String busNom = Messages.inputMessage("Ingrese el nivel de intensidad de los ejercicios a buscar");
                if(!busNom.isEmpty()){
                    token = new StringTokenizer(busNom,"|");
                    String[] nombres = new String[token.countTokens()];
                    int i = 0;
                    while(token.hasMoreElements()){
                        nombres[i]=token.nextToken();
                        i++;
                    }
                }
            }break;
            case "Opcion5":{
                String busNom = Messages.inputMessage("Ingrese el nombre del o los ejercicios a buscar");
                if(!busNom.isEmpty())
                    ;
            }break;
        }
    }
    @Override
    public boolean escribirDatosDB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public boolean verificarEscrituraDB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean verificarLecturaDB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean leerDatosDB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean enviarQuery(String Query) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean enviarQuery(String[] Query) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
