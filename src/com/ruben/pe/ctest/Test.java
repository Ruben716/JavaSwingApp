
package com.ruben.pe.ctest;

import com.ruben.pe.cmodelo.Datos_Documento;
import com.ruben.pe.cnegocio.Datos_DocumentoBO;
import com.ruben.pe.cprecentacion.jpDatos_Documento;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;




public class Test {
    Datos_DocumentoBO tdbo = new Datos_DocumentoBO();
    Datos_Documento dd = new Datos_Documento();
    
public void insertar() throws SQLException, ParseException {
    dd.setNumero(Integer.parseInt(jpForm.getTextNumero()));
    dd.setFecha_Emicion(jpForm.getTextFechaEmicion());
    dd.setFecha_Vencimiento(jpForm.getTextFechaVencimiento());
    dd.setId_cliente(Integer.parseInt(jpForm.getTextIDcliente()));
    dd.setID_DOCUMENTO_IDENTIDAD(Integer.parseInt(jpForm.getTextIDDocumentoIdentidad()));
    
    tdbo.agregarDatosDocumento(dd);
    
    
}
public void eliminar() throws SQLException, ParseException {
    dd.setId_Datos_Documento(15);
    
    tdbo.eliminarDatosDocumento(dd);
    
    
}


public void editar() throws SQLException, ParseException {
    dd.setNumero(9);
    dd.setFecha_Emicion("24-12-2200");
    dd.setFecha_Vencimiento("30-12-2777");
    dd.setId_cliente(1);
    dd.setID_DOCUMENTO_IDENTIDAD(1);
    dd.setId_Datos_Documento(1);
    tdbo.modificarDatosDocumento(dd);
    
    
}
public static void main (String[]args) throws SQLException, ParseException{
    Test t = new Test();
    t.insertar();
    
}

    public void insertar(jpDatos_Documento aThis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
