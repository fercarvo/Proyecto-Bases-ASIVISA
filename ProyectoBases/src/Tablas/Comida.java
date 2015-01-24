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
public class Comida {

    private int idComida;
    private int calorias;
    private String nombre;

    public Comida(int idComida, int calorias, String nombre) {
        this.idComida = idComida;
        this.calorias = calorias;
        this.nombre = nombre;
    }

    public int getIdComida() {
        return idComida;
    }

    public void setIdComida(int idComida) {
        this.idComida = idComida;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean grabarComida(Connection con, boolean nuevo) {
        boolean retorno;
        CallableStatement sp;
        try {
            sp = con.prepareCall("call grabarComida(?,?,?,?)");
            sp.setInt(1, this.idComida);
            sp.setString(2, this.nombre);
            sp.setInt(3, this.calorias);
            sp.setBoolean(4, nuevo);
            retorno = true;
            sp.execute();
        } catch (SQLException e) {
            System.out.println("Error:\n" + e.getMessage());
            retorno = false;
        }
        return retorno;
    }

}
