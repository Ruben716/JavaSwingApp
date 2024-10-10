/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pe.ruben.cdatosdao;
import com.ruben.pe.cmodelo.Datos_Documento;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Date;
/**
 *
 * @author ACER
 */
public class Datos_DocumentoDao {
    private String mensaje;
    
    //primer metodo insertar date e  datos_documentos a DB 
    
    public String agregarDatosDocumento (Connection conn, Datos_Documento datosDocumento){
        
        PreparedStatement ps = null ;
        String sql = "INSERT INTO DATOS_DOCUMENTO (NUMERO,FECHA_EMICION,FECHA_VENCIMIENTO,ID_CLIENTE,ID_DOCUMENTO_IDENTIDAD)"
                    + "VALUES (?,?,?,?,?)";  
        
        
        try {
            ps= conn.prepareStatement(sql);
            ps.setInt(1,datosDocumento.getNumero());
            ps.setString(2,  datosDocumento.getFecha_Emicion());
            ps.setString(3,  datosDocumento.getFecha_Vencimiento());
            ps.setInt(4, datosDocumento.getId_cliente());
            ps.setInt(5, datosDocumento.getId_Datos_Documento());
            
            ps.execute();
            ps.close();
            mensaje ="el tipo de documento fue agregado correctamente";
        } catch (Exception e) {
            mensaje ="Error al agregar los datos"+e.getMessage();
            System.out.println(e.getMessage());
        }
        return mensaje ;
    }
    //segundo metodo eliminar o  
    
    public String eliminarDatosDocumento (Connection conn, Datos_Documento datosDocumento){
        
        PreparedStatement ps = null ;
        String sql = "DELETE FROM DATOS_DOCUMENTO WHERE ID_DATOS_DOCUMENTO = ?";  
        
        
        try {
            ps= conn.prepareStatement(sql);
            ps.setInt(1,datosDocumento.getId_Datos_Documento());
            
            
            ps.execute();
            ps.close();
            mensaje ="el tipo de documento fue eliminado";
        } catch (Exception e) {
            mensaje ="Error al eliminar los datos"+e.getMessage();
            System.out.println(e.getMessage());
        }
        return mensaje ;
    }
    //tercero modificar 
    public String modificarDatosDocumento (Connection conn, Datos_Documento datosDocumento){
        
        PreparedStatement ps = null ;
        String sql = "UPDATE DATOS_DOCUMENTO SET  NUMERO=?,FECHA_EMICION =? ,FECHA_VENCIMIENTO=?,ID_CLIENTE=?,ID_DOCUMENTO_IDENTIDAD=? "
                    + "  WHERE ID_DATOS_DOCUMENTO =?";  
        
        
        try {
            ps= conn.prepareStatement(sql);
            
            
            ps.setInt(1,datosDocumento.getNumero());
            ps.setString(2,  datosDocumento.getFecha_Emicion());
            ps.setString(3,  datosDocumento.getFecha_Vencimiento());
            ps.setInt(4, datosDocumento.getId_cliente());
            ps.setInt(5, datosDocumento.getID_DOCUMENTO_IDENTIDAD());
            ps.setInt(6,datosDocumento.getId_Datos_Documento());
            
            ps.execute();
            ps.close();
            mensaje ="el tipo de documento fue modificado";
        } catch (Exception e) {
            mensaje ="Error al modificar los datos"+e.getMessage();
            System.out.println(e.getMessage());
        }
        return mensaje ;
    }
}
