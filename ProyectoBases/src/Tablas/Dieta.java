/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

import java.sql.Time;
import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class Dieta {

    private int ingestaCalorica;
    private int idDieta;
    private Time horaDia;
    private ArrayList<Comida> comidas;

    public Dieta(int ingestaCalorica, int idDieta, Time horaDia) {
        this.ingestaCalorica = ingestaCalorica;
        this.idDieta = idDieta;
        this.horaDia = horaDia;
        this.comidas= new ArrayList<>();
    }

    public int getIngestaCalorica() {
        return ingestaCalorica;
    }

    public void setIngestaCalorica(int ingestaCalorica) {
        this.ingestaCalorica = ingestaCalorica;
    }

    public int getIdDieta() {
        return idDieta;
    }

    public void setIdDieta(int idDieta) {
        this.idDieta = idDieta;
    }

    public Time getHoraDia() {
        return horaDia;
    }

    public void setHoraDia(Time horaDia) {
        this.horaDia = horaDia;
    }

    public ArrayList<Comida> getComidas() {
        return comidas;
    }

    public void setComidas(ArrayList<Comida> comidas) {
        this.comidas = comidas;
    }
     

}
