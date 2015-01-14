/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

/**
 *
 * @author Juan
 */
public class AreaDelCuerpo {

    private int idADC;
    private String nombre;

    public AreaDelCuerpo(int idADC, String nombre) {
        this.idADC = idADC;
        this.nombre = nombre;
    }

    public int getIdADC() {
        return idADC;
    }

    public void setIdADC(int idADC) {
        this.idADC = idADC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
