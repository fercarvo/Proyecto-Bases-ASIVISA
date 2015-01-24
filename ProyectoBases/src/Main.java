
import Clases.Util.ConectorBDD;
import InterfacesAdministrador.VtnAreaDelCuerpo;
import InterfacesAdministrador.VtnComida;
import InterfacesUsuario.*;
import java.sql.SQLException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Clases
 */
//
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConectorBDD conector = new ConectorBDD();
        try {
            conector.conectar();
        } catch (SQLException ex) {
            System.out.println("Error:\n" + ex.getMessage());
        }        
        VtnBienvenido vtn = new VtnBienvenido();
        vtn.setVisible(false);
        vtnAgregarComida vtn2 = new vtnAgregarComida();
        vtn2.setVisible(false);
        vtnCrearUsuario user = new vtnCrearUsuario(vtn2);
        user.setVisible(false);
        VtnAreaDelCuerpo adc = new VtnAreaDelCuerpo(null, conector);
        
        adc.setVisible(false);
        VtnComida com = new VtnComida(conector, null);
        com.setVisible(true);
    }
}
