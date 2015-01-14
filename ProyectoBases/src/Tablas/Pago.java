/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

import java.math.BigDecimal;
import java.sql.Date;

/**
 *
 * @author Juan
 */
public class Pago {

    private String idPago;
    private Date fecha;
    private int usuario;
    private int factura;
    private String descripcion;
    private BigDecimal monto;

    public Pago(String idPago, Date fecha, int usuario, int factura, String descripcion, BigDecimal monto) {
        this.idPago = idPago;
        this.fecha = fecha;
        this.usuario = usuario;
        this.factura = factura;
        this.descripcion = descripcion;
        this.monto = monto;
    }

    public String getIdPago() {
        return idPago;
    }

    public void setIdPago(String idPago) {
        this.idPago = idPago;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getFactura() {
        return factura;
    }

    public void setFactura(int factura) {
        this.factura = factura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

}
