/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.sql.Date;

/**
 *
 * @author Jaime
 */
public class Factura {
    
    int idFactura;
    double valorFactura;
    String documentoCliente,motivoFactura;
     String  fechaFacturacion;
    Fecha fechaPago;
    

    public Factura(int idFactura, double valorFactura, String documentoCliente, String motivoFactura, String fechaFacturacion) {
        this.idFactura = idFactura;
        this.valorFactura = valorFactura;
        this.documentoCliente = documentoCliente;
        this.motivoFactura = motivoFactura;
        this.fechaFacturacion=fechaFacturacion;
    }

    public String getFechaFacturacion() {
        return fechaFacturacion;
    }

    public void setFechaFacturacion(String fechaFacturacion) {
        this.fechaFacturacion = fechaFacturacion;
    }

  
   

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public double getValorFactura() {
        return valorFactura;
    }

    public void setValorFactura(double valorFactura) {
        this.valorFactura = valorFactura;
    }

    public String getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(String documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public String getMotivoFactura() {
        return motivoFactura;
    }

    public void setMotivoFactura(String motivoFactura) {
        this.motivoFactura = motivoFactura;
    }

    public Fecha getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Fecha fechaPago) {
        this.fechaPago = fechaPago;
    }
    
    
}
