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
public class Ejercicio {

    private int idEjercicio;
    private String nombre;
    private String descripcion;
    private String intensidad;
    private int calorias;
    private ArrayList<AreaDelCuerpo> areasCuerpo;

    public Ejercicio(int idEjercicio, String nombre, String descripcion, String intensidad, int calorias) {
        this.idEjercicio = idEjercicio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.intensidad = intensidad;
        this.calorias = calorias;
        areasCuerpo= new ArrayList<>();
    }

    public int getIdEjercicio() {
        return idEjercicio;
    }

    public void setIdEjercicio(int idEjercicio) {
        this.idEjercicio = idEjercicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(String intensidad) {
        this.intensidad = intensidad;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public ArrayList<AreaDelCuerpo> getAreasCuerpo() {
        return areasCuerpo;
    }

    public void setAreasCuerpo(ArrayList<AreaDelCuerpo> areasCuerpo) {
        this.areasCuerpo = areasCuerpo;
    }


}
