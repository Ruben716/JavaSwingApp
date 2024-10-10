/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ruben.pe.cnegocio;

import com.pe.ruben.cdatosdao.Datos_DocumentoDao;
import com.ruben.pe.cmodelo.Datos_Documento;
import com.ruben.pe.db.Conexion;
import java.sql.Connection;
import java.sql.SQLException;


/**
 *
 * @author ACER
 */
public class Datos_DocumentoBO {
    private String mensaje ;
    Datos_DocumentoDao dd = new Datos_DocumentoDao();
    
    public String agregarDatosDocumento (Datos_Documento datosDocumento) throws SQLException{
        Connection c = Conexion.getConnection();
        try {
            mensaje = dd.agregarDatosDocumento(c,datosDocumento);
            c.commit();
        } catch (Exception e) {
            c.rollback();
        } finally{
            c.close();
        }
        return mensaje ;
    }
    public String eliminarDatosDocumento (Datos_Documento datosDocumento) throws SQLException{
        Connection c = Conexion.getConnection();
        try {
            mensaje = dd.eliminarDatosDocumento(c,datosDocumento);
            c.commit();
        } catch (Exception e) {
            c.rollback();
        } finally{
            c.close();
        }
        return mensaje ;
    }
    public String modificarDatosDocumento (Datos_Documento datosDocumento) throws SQLException{
        Connection c = Conexion.getConnection();
        try {
            mensaje = dd.modificarDatosDocumento(c,datosDocumento);
            c.commit();
        } catch (Exception e) {
            c.rollback();
        } finally{
            c.close();
        }
        return mensaje ;
    }
}
