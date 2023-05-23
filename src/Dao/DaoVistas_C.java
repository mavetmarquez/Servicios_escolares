/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Dto.Vista_C;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


/**
 *
 * @author jotruvel
 */
public class DaoVistas_C {
    private String error;
    private boolean isError;
    
    // METODO PARA BUSCAR EN VISTA
    
   public Vista_C buscar (String id_matricula){
        Vista_C p=null;
        clean();
        try{
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM servicios_escolares.datos_vista WHERE matricula='"+id_matricula+"';");
            rs.next();
            p = new Vista_C();
            p.setMatricula(rs.getString("matricula"));
            p.setNombre(rs.getString("nombre"));
            p.setNombre_escuela(rs.getString("nombre_escuela"));
            p.setNombre_carrera(rs.getString("nombre_carrera")); 
            p.setEstatus(rs.getString("estatus"));
            p.setTipo_ingreso(rs.getString("tipo_ingreso"));
            p.setNombre_escuela_p(rs.getString("nombre_escuela_p"));
            p.setTelefono_part(rs.getString("telefono_part"));
            p.setCelular(rs.getString("celular"));
            p.setTel_emergencia(rs.getString("tel_emergencia"));
            p.setCorreo_p(rs.getString("correo_p"));
            p.setCorreo_i(rs.getString("correo_i"));
            p.setCiclo_ingreso(rs.getString("ciclo_ingreso"));
            p.setCurp(rs.getString("curp"));
            p.setDomicilio(rs.getString("domicilio"));
            
            
        }catch (Exception ex){
            this.error=ex.getMessage();
            this.isError=true;
        }
        return p;
    }
   
    
    // Metodo para limpiar 
    
    public void clean (){
        this.error="";
        this.isError=false;
    }

    public String getError() {
        return error;
    }

    public boolean isIsError() {
        return isError;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setIsError(boolean isError) {
        this.isError = isError;
    }
    
    
    
}
