
import Clases.Util.ConectorBDD;
import InterfacesUsuario.*;

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
        VtnBienvenido vtn = new VtnBienvenido();
        vtn.setVisible(false);
        vtnAgregarComida vtn2 = new vtnAgregarComida();
        vtn2.setVisible(false);
        vtnCrearUsuario user = new vtnCrearUsuario(vtn2);
        user.setVisible(true);
    }
}
