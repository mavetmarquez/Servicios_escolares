/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Dto.IngresoGeneral;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jotruvel
 */
public class DaoIngresoGral {
    private String error;
    private boolean isError;
    
    //Mostrar la tabla de ingreso 
    
    public void buscartabla (JTable tabla){
        clean();
        
        DefaultTableModel model= (DefaultTableModel)tabla.getModel();
        try{
            Connection con = DBConnection.getConexion();
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery("SELECT * FROM ingreso_general");
            
            Object row[]= new Object [3];
            
            while (rs.next()){
                row[0]=rs.getString("id_ingreso_general");
                row[1]=rs.getString("ingreso_general");
                
                 model.addRow(row);
            }
            tabla.setModel(model);
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "No se pudo mostrar");
            this.error=ex.getMessage();
            this.isError=true;
        }
    }
    
    //Metodo para guaradar el registro 
    
    public int insertar(IngresoGeneral ig){
        int resultado=0;
        clean();
        try{
            Connection con =DBConnection.getConexion();
            Statement st=con.createStatement();
            resultado= st.executeUpdate("INSERT INTO ingreso_general VALUE('"+ ig.getId_ingreso_gral()+"','" + ig.getIngreso_gral()+"')");
            
        }catch (Exception ex){
            this.error=ex.getMessage();
            this.isError=true;
        }
        return resultado;
    }
    
    //Metodo para actualizar el registro 
    public int actualizar (IngresoGeneral ig){
        int resultado=0;
        clean();
        try{
            Connection con =DBConnection.getConexion();
            Statement st=con.createStatement();
            resultado=st.executeUpdate("UPDATE ingreso_general SET id_ingreso_general='"+ ig.getId_ingreso_gral()+"', ingreso_general='" + ig.getIngreso_gral()+"' WHERE id_ingreso_general='" + ig.getId_ingreso_gral()+"'");
          
        }catch (Exception ex){
            this.error=ex.getMessage();
            this.isError=true;
        }
        return resultado;
    }
    
    //Metodo para eliminar un registro
    public int eliminar (String id_ingreso_general){
        int resultado =0;
        clean();
        try{
            Connection con= DBConnection.getConexion();
            Statement st=con.createStatement();
            resultado=st.executeUpdate("DELETE FROM ingreso_general WHERE id_ingreso_general='"+id_ingreso_general+"';");
            
        }catch (Exception ex){
            this.error=ex.getMessage();
            this.isError=true;
        }
        return resultado;
    }
    
    //metodo para buscar el registro 
    public IngresoGeneral buscar(String id_ingreso_general){
        IngresoGeneral p=null;
        clean();
        try{
            Connection con=DBConnection.getConexion();
            Statement at=con.createStatement();
            ResultSet rs=at.executeQuery("SELECT * FROM ingreso_general WHERE id_ingreso_general='"+id_ingreso_general+"';");
            rs.next();
            p= new IngresoGeneral();
            p.setId_ingreso_gral(rs.getString("id_ingreso_general"));
            p.setIngreso_gral(rs.getString("ingreso_general"));
            
        }catch(Exception ex){
            this.error=ex.getMessage();
            this.isError=true;
        }
        return p;
    }
    
    //Metodo para filtar la busqueda
    public void filtroig(JTable tabla_ingreso_general, String ingl){
        clean();
        DefaultTableModel model=(DefaultTableModel) tabla_ingreso_general.getModel();
        
        try{
            Connection con=DBConnection.getConexion();
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery("SELECT * FROM ingreso_general WHERE ingreso_general LIKE '%"+ingl+"%'");
            Object row[] = new Object [2];
            
            while (rs.next()){
                row[0]=rs.getString("id_ingreso_general");
                row[1]=rs.getString("ingreso_general");
                model.addRow(row);
            }
            tabla_ingreso_general.setModel(model);
        }catch (Exception ex){
            this.error=ex.getMessage();
            this.isError=true;
        }
       
    }
    
    
    //Limpiado del registro
    public void clean (){
        this.error= " ";
        this.isError= false;
    }
    
    //Set y Get de los atributos 
    public String getError(){
        return error;
    }
    
    public boolean isIsError(){
        return isError;
    }
    
    public void setError (String error){
        this.error=error;
    }
    
    public void setIsError(boolean isError){
        this.isError=isError;
    }
}
