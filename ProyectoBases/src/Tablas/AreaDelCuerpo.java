/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

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
    
    public boolean grabarADC(Connection c, boolean nuevo) {
        boolean retorno;
        CallableStatement sp;
        try {
            sp = c.prepareCall("call grabarADC(?,?,?)");
            sp.setString(1, this.nombre);
            sp.setInt(2, this.idADC);
            sp.setBoolean(3, nuevo);
            retorno = true;
            sp.execute();
        } catch (SQLException e) {
            System.out.println("Error:\n" + e.getMessage());
            retorno = false;
        }
        return retorno;
    }
    
    
}
