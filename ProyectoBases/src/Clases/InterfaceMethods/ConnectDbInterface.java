/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.InterfaceMethods;

/**
 *
 * @author Kevin
 */
public interface ConnectDbInterface {
    public boolean verificarEscrituraDB();
    public boolean escribirDatosDB();
    public boolean verificarLecturaDB();
    public boolean leerDatosDB();
}
