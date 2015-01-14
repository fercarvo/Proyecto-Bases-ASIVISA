/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class Rutina {

    private int idRutina;
    private Date fechaInicio;
    private String descripcion;
    private ArrayList<Ejercicio> ejercicios;

    public Rutina(int idRutina, Date fechaInicio, String descripcion) {
        this.idRutina = idRutina;
        this.fechaInicio = fechaInicio;
        this.descripcion = descripcion;
        this.ejercicios = new ArrayList();
    }

    public int getIdRutina() {
        return idRutina;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ArrayList<Ejercicio> getEjercicios() {
        return ejercicios;
    }

    public void setIdRutina(int idRutina) {
        this.idRutina = idRutina;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEjercicios(ArrayList<Ejercicio> ejercicios) {
        this.ejercicios = ejercicios;
    }

}
