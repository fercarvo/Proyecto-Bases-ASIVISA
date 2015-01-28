/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.InterfaceMethods;

/**
 *
 * @author Clases
 */
public interface InteractDBInterface {
    public boolean enviarQuery(String Query);
    public boolean enviarQuery(String[] Query);
    
}
