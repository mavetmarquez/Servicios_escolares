/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import Dto.Empleados;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jotruvel
 */
public final class DaoEmpleados {
    private String error;
    private boolean isError;
    
    
    // Metodo para insertar valores a la base de datos
    
    public int insertar (Empleados e){
        int resultado=0;
        clean();
        
        try{
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            resultado = st.executeUpdate("INSERT INTO empleados VALUE('"+e.getId_empleado()+"','"
                    +e.getNombre()+"','"
                    +e.getPuesto()+"','"
                    +e.getContraseña()+"')");
            
        }catch (Exception ex){
            this.error=ex.getMessage();
            this.isError=true;
        }
        return resultado;
    }
    // METODO PARA BUSCAR UN REGISTRO
    
    public Empleados buscar (String id_empleado){
        Empleados p=null;
        clean();
        try{
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM empleados WHERE id_empleado='"+id_empleado+"';");
            rs.next();
            p = new Empleados();
            p.setId_empleado(rs.getString("id_empleado"));
            p.setNombre(rs.getString("nombre"));
            p.setPuesto(rs.getString("puesto"));
            p.setContraseña(rs.getString("contraseña"));            
            
            
        }catch (Exception ex){
            this.error=ex.getMessage();
            this.isError=true;
        }
        return p;
    }
    // METODO PARA ACTUALIZAR UN REGISTRO
    
    public int actualizar (Empleados e){
        int resultado=0;
        clean();
        
        try{
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            resultado = st.executeUpdate("UPDATE empleados SET id_empleado='" +e.getId_empleado()+"', nombre='"+ e.getNombre()+"', puesto='"+ e.getPuesto()+"', contraseña='" +e.getContraseña()+"' WHERE id_empleado='"+ e.getId_empleado()+"'");
            
        }catch (Exception ex){
            this.error=ex.getMessage();
            this.isError=true;
        }
        return resultado;
    }
    
    
    // METODO PARA ELIMINAR UN REGISTRO
    
   
    
    public int eliminar (String id_empleado){
        int resultado = 0;
        clean();
        try{
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            resultado = st.executeUpdate("DELETE FROM empleados WHERE id_empleado='"+id_empleado+"';");
            
        }catch (Exception ex){
            this.error= ex.getMessage();
            this.isError=true;
        }
        
        
        return resultado;
    }
    
    // METODO PARA EL INICIO DE SESION
    
    public int iniciarSesion (String id_empleado, String contraseña){
        int resultado = 0;
        clean();
        
        try{
            
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs= st.executeQuery("SELECT count(*) as login FROM empleados where id_empleado='"+id_empleado+"'and contraseña='"+contraseña+"';");
            rs.next();
            resultado=rs.getInt("login");
            
        }catch (Exception ex){
            this.error=ex.getMessage();
            this.isError=true;
        }
        
        return resultado;
    }
    
    /// Tabla
    
    public void buscartabla (JTable tabla_empleados){
        
        clean();
        
        DefaultTableModel model= (DefaultTableModel) tabla_empleados.getModel();
        
       try{
            Connection con=DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM empleados");
            
            Object row[]=new Object[4];
            
            while(rs.next()){
                row[0]=rs.getString("id_empleado");
                row[1]=rs.getString("nombre");
                row[2]=rs.getString("puesto");
                
                model.addRow(row);
            }
            
            tabla_empleados.setModel(model);
            
        }catch (Exception ex){
            
           JOptionPane.showMessageDialog(null, "No se pudo mostrar");
            this.error=ex.getMessage();
            this.isError=true;
        }
        
    }
    
    
    //Metodo para filtrar busqueda 
    public void filtro (JTable tabla_empleados, String f){
        
        clean();
        
        DefaultTableModel model= (DefaultTableModel) tabla_empleados.getModel();
        
       try{
            Connection con=DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM empleados WHERE nombre LIKE '%"+ f+"%'");
            
            Object row[]=new Object[4];
            
            while(rs.next()){
                row[0]=rs.getString("id_empleado");
                row[1]=rs.getString("nombre");
                row[2]=rs.getString("puesto");
                
                model.addRow(row);
            }
            
            tabla_empleados.setModel(model);
            
        }catch (Exception ex){
            
           JOptionPane.showMessageDialog(null, "No se pudo mostrar");
            this.error=ex.getMessage();
            this.isError=true;
        }
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
