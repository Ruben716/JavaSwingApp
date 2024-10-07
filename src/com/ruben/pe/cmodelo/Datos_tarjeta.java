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
public class Datos_tarjeta {
    private int id_datos_tarjeta ;
    private String nombre ;
    private int numero;
    private Date fecha_vencimiento;
    private int cvv;

    public Datos_tarjeta(int id_datos_tarjeta, String nombre, int numero, Date fecha_vencimiento, int cvv) {
        this.id_datos_tarjeta = id_datos_tarjeta;
        this.nombre = nombre;
        this.numero = numero;
        this.fecha_vencimiento = fecha_vencimiento;
        this.cvv = cvv;
    }

    public int getId_datos_tarjeta() {
        return id_datos_tarjeta;
    }

    public void setId_datos_tarjeta(int id_datos_tarjeta) {
        this.id_datos_tarjeta = id_datos_tarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
    
    
}
