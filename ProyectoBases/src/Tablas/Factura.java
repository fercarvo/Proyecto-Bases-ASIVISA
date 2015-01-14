/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

import java.sql.Date;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class Factura {

    private int idFactura;
    private Date fecha;
    private String ciudad;
    private BigDecimal monto;
    private Usuario usuario;
    private ArrayList<Pago> pagos;

    public Factura(int idFactura, Date fecha, String ciudad, BigDecimal monto, Usuario usuario) {
        this.idFactura = idFactura;
        this.fecha = fecha;
        this.ciudad = ciudad;
        this.monto = monto;
        this.usuario = usuario;
        this.pagos= new ArrayList<>();
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ArrayList<Pago> getPagos() {
        return pagos;
    }

    public void setPagos(ArrayList<Pago> pagos) {
        this.pagos = pagos;
    }
    
}
