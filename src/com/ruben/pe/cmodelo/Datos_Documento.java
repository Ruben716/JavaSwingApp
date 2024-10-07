/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ruben.pe.cmodelo;

import java.util.Date;

/**
 *
 * @author ACER
 */
public class Datos_Documento {
    private int id_Datos_Documento;
    private int numero ;
    private Date Fecha_Emicion;
    private Date Fecha_Vencimiento;
    private int id_cliente;
    private int ID_DOCUMENTO_IDENTIDAD;

    public Datos_Documento(int id_Datos_Documento, int numero, Date Fecha_Emicion, Date Fecha_Vencimiento, int id_cliente, int id_tipo_documento) {
        this.id_Datos_Documento = id_Datos_Documento;
        this.numero = numero;
        this.Fecha_Emicion = Fecha_Emicion;
        this.Fecha_Vencimiento = Fecha_Vencimiento;
        this.id_cliente = id_cliente;
        this.ID_DOCUMENTO_IDENTIDAD = id_tipo_documento;
    }

    public int getId_Datos_Documento() {
        return id_Datos_Documento;
    }

    public void setId_Datos_Documento(int id_Datos_Documento) {
        this.id_Datos_Documento = id_Datos_Documento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFecha_Emicion() {
        return Fecha_Emicion;
    }

    public void setFecha_Emicion(Date Fecha_Emicion) {
        this.Fecha_Emicion = Fecha_Emicion;
    }

    public Date getFecha_Vencimiento() {
        return Fecha_Vencimiento;
    }

    public void setFecha_Vencimiento(Date Fecha_Vencimiento) {
        this.Fecha_Vencimiento = Fecha_Vencimiento;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_tipo_documento() {
        return ID_DOCUMENTO_IDENTIDAD;
    }

    public void setId_tipo_documento(int id_tipo_documento) {
        this.ID_DOCUMENTO_IDENTIDAD = id_tipo_documento;
    }
    
    
}
