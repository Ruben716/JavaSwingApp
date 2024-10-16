/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pe.ruben.cdatosdao;
import com.ruben.pe.cmodelo.Datos_Documento;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JTable;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
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
            ps.setInt(5, datosDocumento.getID_DOCUMENTO_IDENTIDAD());
            
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
    
    
    public void listarDatosDOcumento(Connection conn, JTable table ){
                System.out.println("llego aqui");

        DefaultTableModel model;
        Statement statement = null;
        ResultSet resultSet = null;
        String [] columnas = {"ID_DATOS_DOCUMENTO","numero","FECHA_EMICION","FECHA_VENCIMIENTO","ID_CLIENTE","ID_DOCUMENTO_IDENTIDAD"};
                        System.out.println("llego aqui3");

        model = new DefaultTableModel (null,columnas);
        
        String sql = "SELECT * FROM Datos_Documento";
        String [] datosTP = new String [6];
        
        try {
            statement = conn.createStatement();
            resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()){
                Datos_Documento DD = new Datos_Documento();
                DD.setId_Datos_Documento(resultSet.getInt("ID_DATOS_DOCUMENTO"));
                DD.setNumero(resultSet.getInt("NUMERO"));
                DD.setFecha_Emicion(resultSet.getString("FECHA_EMICION"));
                DD.setFecha_Vencimiento(resultSet.getString("FECHA_VENCIMIENTO"));
                DD.setID_DOCUMENTO_IDENTIDAD(resultSet.getInt("ID_CLIENTE"));
                DD.setId_cliente(resultSet.getInt("ID_DOCUMENTO_IDENTIDAD"));
                
                datosTP[0] = DD.getId_Datos_Documento()+"";
                datosTP[1] = DD.getNumero()+"";
                datosTP[2] = DD.getFecha_Emicion()+"";
                datosTP[3] = DD.getFecha_Vencimiento()+"";
                datosTP[4] = DD.getID_DOCUMENTO_IDENTIDAD()+"";
                datosTP[5] = DD.getId_cliente()+"";
                
                model.addRow(datosTP);
                
            }
            table.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error"+e.getMessage());
            System.out.println(e.getMessage());
        }
        
        
    }


}
