/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Dto.Pais;
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
public class DaoPais {
    private String error;
    private boolean isError;
    
    /**  AGREGAR REGISTRO
    
    * En esta parte del código estamos creando el metodo para poder agregar valor a la base de datos.
 
    */
    public int insertar (Pais p){
        int resultado = 0;
        clean();
        try{
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            resultado = st.executeUpdate("INSERT INTO pais value('"+p.getId_nacionalidad()+"','"
                    +p.getPais()+"','"
                    +p.getNacionalidad()+"')");                  

        }catch (Exception ex){
            this.error=ex.getMessage();
            this.isError=true;
        }
        return resultado;
    }
    
    /**  Mostrar en tabla
    
    * En esta parte del código buscando en la tabla.
     * 
    */
    
    public void buscartabla (JTable tabla){
        clean();
        
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        try{
            Connection con=DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM pais");
            
            Object row[]=new Object[3];
            
            while(rs.next()){
                row[0]=rs.getString("id_nacionalidad");
                row[1]=rs.getString("pais");
                row[2]=rs.getString("nacionalidad");
                
                model.addRow(row);
            }
            
            tabla.setModel(model);
            
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "No se pudo mostrar");
            this.error=ex.getMessage();
            this.isError=true;
        }
        
    }
    
     /**  eliminar
    
    * En esta parte del código buscando en la tabla.
     * 
    */
    
    public int eliminar (String id_nacionalidad){
        int resultado = 0;
        clean();
        
        try{
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            resultado = st.executeUpdate("DELETE FROM pais WHERE id_nacionalidad='"+id_nacionalidad+"';");
            
        }catch (Exception ex){
            this.error=ex.getMessage();
            this.isError=true;
        }
        return resultado;
        
    }
    
    /// Buscar un registro con la llave primaria
    
    public Pais buscar (String id_nacionalidad){
        Pais p=null;
        clean();
        try{
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM pais WHERE id_nacionalidad='"+id_nacionalidad+"';");
            rs.next();
            p = new Pais();
            p.setId_nacionalidad(rs.getString("id_nacionalidad"));
            p.setPais(rs.getString("pais"));
            p.setNacionalidad(rs.getString("nacionalidad"));            
            
            
        }catch (Exception ex){
            this.error=ex.getMessage();
            this.isError=true;
        }
        return p;
    }
    
    ///// Metodo mostrar datos
    
    public void mostrar (JTable tabla, String p){
        clean();
        
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        try{
            Connection con=DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM pais WHERE pais like'%"+p+"%'");
            //selECT * from pais where pais like 'e%'
            Object row[]=new Object[3];
            
            while(rs.next()){
                row[0]=rs.getString("id_nacionalidad");
                row[1]=rs.getString("pais");
                row[2]=rs.getString("nacionalidad");
                
                model.addRow(row);
            }
            
            tabla.setModel(model);
            
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "No se pudo mostrar");
            this.error=ex.getMessage();
            this.isError=true;
        }
        
    }
    
    // Metodo para actualizar el registro
     public int actualizar (Pais p){
        int resultado = 0;
        clean();
        try{
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            resultado = st.executeUpdate("UPDATE pais SET id_nacionalidad='"+p.getId_nacionalidad()+"', pais='"+p.getPais()+"', nacionalidad='" +p.getNacionalidad()+"' WHERE id_nacionalidad='"+ p.getId_nacionalidad()+"'");                  

        }catch (Exception ex){
            this.error=ex.getMessage();
            this.isError=true;
        }
        return resultado;
    }
    
    //Metodo para filtrar el registro 
     public void filtropais (JTable tabla, String pa){
        clean();
        
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        try{
            Connection con=DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM pais WHERE pais LIKE '%"+ pa+"%'");
            
            Object row[]=new Object[3];
            
            while(rs.next()){
                row[0]=rs.getString("id_nacionalidad");
                row[1]=rs.getString("pais");
                row[2]=rs.getString("nacionalidad");
                
                model.addRow(row);
            }
            
            tabla.setModel(model);
            
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "No se pudo mostrar");
            this.error=ex.getMessage();
            this.isError=true;
        }
        
    }
    

    
   
    
    /// Clean LIMPIANDO REGISTROS
    
    public void clean (){
        this.error="";
        this.isError=false;
    }
    
    ///// SET y GET DE LOS ATRIBUTOS.

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

    public void mostrar(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
 

}
