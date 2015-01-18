/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class Usuario {

    private int idUsuario;
    private String nombre;
    private String email;
    private String residencia;
    private float pesoInicial;
    private float estatura;
    private boolean perfilPublico;
    private String dificultadFísica;
    private ArrayList<Rutina> rutinas;
    private ArrayList<Factura> facturas;

    public Usuario(int idUsuario, String nombre, String email, String residencia, float pesoInicial, float estatura, boolean perfilPublico, String dificultadFísica) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.email = email;
        this.residencia = residencia;
        this.pesoInicial = pesoInicial;
        this.estatura = estatura;
        this.perfilPublico = perfilPublico;
        this.dificultadFísica = dificultadFísica;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public float getPesoInicial() {
        return pesoInicial;
    }

    public void setPesoInicial(float pesoInicial) {
        this.pesoInicial = pesoInicial;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public boolean isPerfilPublico() {
        return perfilPublico;
    }

    public void setPerfilPublico(boolean perfilPublico) {
        this.perfilPublico = perfilPublico;
    }

    public String getDificultadFísica() {
        return dificultadFísica;
    }

    public void setDificultadFísica(String dificultadFísica) {
        this.dificultadFísica = dificultadFísica;
    }

    public static boolean verificarUser(Connection c, String userName) {
        boolean retorno;
        CallableStatement sp;
        try {
            sp = c.prepareCall("verificarUser");
            sp.setString("userName", userName);
            sp.registerOutParameter("disponible", Types.BOOLEAN);
            sp.executeQuery();
            retorno = sp.getBoolean("disponible");
        } catch (SQLException e) {
            System.out.println("Error:\n" + e.getMessage());
            retorno = false;
        }
        return retorno;
    }

    public boolean grabarUsuario(Connection c, boolean nuevo) {
        boolean retorno;
        CallableStatement sp;
        try {
            sp = c.prepareCall("grabarUsuario");
            sp.setString("nombre", this.nombre);
            sp.setString("email", this.email);
            sp.setString("residencia", this.residencia);
            sp.setFloat("pesoInicial", this.pesoInicial);
            sp.setFloat("estatura", this.estatura);
            sp.setString("dificultadFísica", this.dificultadFísica);
            sp.setBoolean("perfilPublico", this.perfilPublico);
            sp.setBoolean("nuevo", nuevo);
            retorno = true;
            sp.execute();
        } catch (SQLException e) {
            System.out.println("Error:\n" + e.getMessage());
            retorno = false;
        }

        return retorno;
    }

    public static ArrayList<Usuario> buscarUsuario(Connection c, String nombre, String email) {
        ArrayList<Usuario> retorno = new ArrayList();
        CallableStatement sp;
        ResultSet rs;
        try {
            sp = c.prepareCall("buscarUsuario");
            if (nombre != null) {
                sp.setString("nombre", nombre);
            }
            if (email != null) {
                sp.setString("email", email);
            }
            rs = sp.executeQuery();
            while(rs.next()){
                Usuario usuario= new Usuario(rs.getInt("idUsuario"),
                        rs.getString("nombre"),
                        rs.getString("email"),
                        rs.getString("residencia"),
                        rs.getFloat("pesoinicial"),
                        rs.getFloat("estatura"),
                        rs.getBoolean("perfilpublico"),
                        rs.getString("dificultadFisica"));
                retorno.add(usuario);
            }
            sp.close();
        } catch (SQLException e) {
            System.out.println("Error:\n" + e.getMessage());
        }
        return retorno;
    }
}
