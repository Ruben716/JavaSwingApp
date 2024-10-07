/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ruben.pe.cmodelo;

/**
 *
 * @author ACER
 */
public class Documento_Identidad {
    private int id_documento_identidad;
    private String nombre;
    private String siglas;
    private String nacionalidad ;
    private String estado ;

    public Documento_Identidad(int id_documento_identidad, String nombre, String siglas, String nacionalidad, String estado) {
        this.id_documento_identidad = id_documento_identidad;
        this.nombre = nombre;
        this.siglas = siglas;
        this.nacionalidad = nacionalidad;
        this.estado = estado;
    }

    public int getId_documento_identidad() {
        return id_documento_identidad;
    }

    public void setId_documento_identidad(int id_documento_identidad) {
        this.id_documento_identidad = id_documento_identidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
