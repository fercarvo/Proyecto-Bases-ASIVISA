/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

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
    
    
    
}
