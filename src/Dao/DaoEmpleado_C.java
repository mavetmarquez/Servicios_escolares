/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Dto.Empleado_C;
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
public class DaoEmpleado_C {
    private String error;
    private boolean isError;
    
    //Metodo para insertar valores a la BD.
    public int insertarA (Empleado_C ea){
        int resultado=0;
        clean();
        
        try{
            Connection con =DBConnection.getConexion();
            Statement st= con.createStatement();
            resultado = st.executeUpdate("INSERT INTO empleado_c VALUE('"+ea.getId_empleadoa()+"','"+ ea.getNombrea()+"','"+ ea.getPuestoa()+"','"+ea.getContraseñaa()+"')");
        
        }catch(Exception ex){
            this.error=ex.getMessage();
            this.isError=true;
        }
        return resultado;
        
    }
    
    //Metodo para buscar el registro de acceso.
    
    public Empleado_C buscar (String id_empleadoa){
        Empleado_C ea=null;
        clean();
        
        try{
            Connection con=DBConnection.getConexion();
            Statement st= con.createStatement();
            ResultSet rs =st.executeQuery("SELECT * FROM empleado_c WHERE id_empleado_c='"+id_empleadoa+"';");
            rs.next();
            ea=new Empleado_C();
            ea.setId_empleadoa(rs.getNString("id_empleado_c"));
            ea.setNombrea(rs.getNString("nombre_c"));
            ea.setPuestoa(rs.getString("puesto_c"));
            ea.setContraseñaa(rs.getNString("contraseña"));
            
        }catch (Exception ex){
            this.error=ex.getMessage();
            this.isError=true;
        }
        return ea;
    }
    
    //Metodo para actualizar el regisro de acceso
    public int actualizar (Empleado_C e){
        int resultado=0;
        clean();
        
        try{
            Connection con =DBConnection.getConexion();
            Statement st= con.createStatement();
            resultado = st.executeUpdate("UPDATE empleado_c SET id_empleado_c='"+e.getId_empleadoa()+"', nombre_c='"+ e.getNombrea()+"', puesto_c='" +e.getPuestoa()+"', contraseña='" + e.getContraseñaa()+"' WHERE id_empleado_c='"+e.getId_empleadoa()+"'" );
        
        }catch (Exception ex){
            this.error=ex.getMessage();
            this.isError=true;
        }
        return resultado;
    }
    
    //Metodo para eliminar un registro de acceso
    public int eliminar (String id_empleadoa){
        int resultado=0;
        clean ();
        try{
            Connection con =DBConnection.getConexion();
            Statement st=con.createStatement();
            resultado=st.executeUpdate("DELETE FROM empleado_c WHERE id_empleado_c='"+id_empleadoa+"';");
            
        }catch (Exception ex){
            this.error=ex.getMessage();
            this.isError=true;
        }
        return resultado;
    }
    
    //Metodo para el inicio de sesión 
    
    public int iniciarS (String id_empleadoa, String contraseña){
        int resultado=0;
        clean();
        
        try{
            Connection con =DBConnection.getConexion();
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery("SELECT count(*) as login FROM empleado_c where id_empleado_c='"+id_empleadoa+"'and contraseña='"+contraseña+"';");
            rs.next();
            resultado=rs.getInt("login");
            
        }catch (Exception ex){
            this.error=ex.getMessage();
            this.isError=true;
        
        }
        return resultado;
    }
    
    //Tabla de acceso
    public void buscartabla (JTable tabla_empleadoa){
        
        clean();
        
        DefaultTableModel model= (DefaultTableModel) tabla_empleadoa.getModel();
        
       try{
            Connection con=DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM empleado_c");
            
            Object row[]=new Object[4];
            
            while(rs.next()){
                row[0]=rs.getString("id_empleado_c");
                row[1]=rs.getString("nombre_c");
                row[2]=rs.getString("puesto_c");
                
                model.addRow(row);
            }
            
            tabla_empleadoa.setModel(model);
            
        }catch (Exception ex){
            
           JOptionPane.showMessageDialog(null, "No se pudo mostrar");
            this.error=ex.getMessage();
            this.isError=true;
        }
        
    }
    
    //Metodo para filtrar la busqueda
    public void filtro (JTable tabla_empleadoa, String f){
        
        clean();
        
        DefaultTableModel model= (DefaultTableModel) tabla_empleadoa.getModel();
        
       try{
            Connection con=DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM empleado_c WHERE nombre_c LIKE '%"+ f+"%'");
            
            Object row[]=new Object[4];
            
            while(rs.next()){
                row[0]=rs.getString("id_empleado_c");
                row[1]=rs.getString("nombre_c");
                row[2]=rs.getString("puesto_c");
                
                model.addRow(row);
            }
            
            tabla_empleadoa.setModel(model);
            
        }catch (Exception ex){
            
           JOptionPane.showMessageDialog(null, "No se pudo mostrar");
            this.error=ex.getMessage();
            this.isError=true;
        }
    }
    
    
    //Metodo para limpiar 
    
   public void clean(){
       this.error="";
       this.isError=false;
   }
   
   public String getError (){
       return error;
   }
   
   public boolean isIsError(){
       return isError;
   }
   
   public void setError(String error){
       this.error=error;
   }
   
   public void setIsError(boolean isError){
       this.isError=isError;
   }
    
    
    
    
    
    
    
    
    
}
