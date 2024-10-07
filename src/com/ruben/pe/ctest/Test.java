
package com.ruben.pe.ctest;

import com.ruben.pe.cmodelo.Datos_Documento;
import com.ruben.pe.cnegocio.Datos_DocumentoBO;
import java.sql.SQLException;
import java.util.Date;




public class Test {
    Datos_DocumentoBO tdbo = new Datos_DocumentoBO();
    Datos_Documento dd = new Datos_Documento();
    
public void insertar() throws SQLException {
    dd.setNumero(0);
    //dd.setFecha_Emicion(new Date ());
    //dd.setFecha_Vencimiento(new Date ());
    dd.setId_cliente(1);
    dd.setId_Datos_Documento(1);
    
    tdbo.agregarDatosDocumento(dd);
    
}
public static void main (String[]args) throws SQLException{
    Test t = new Test();
    t.insertar();
    
}
}
