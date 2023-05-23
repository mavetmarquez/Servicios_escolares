/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Dto.EscuelasProcedencia;
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
public class DaoEscuelasProcedencia {
    private String error;
    private boolean isError;
    
    
    
    //Mostrar tabla
    
    public void buscartabla (JTable tabla){
        clean();
        
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        try{
            Connection con=DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM escuelas_procedencia");
            
            Object row[]=new Object[3];
            
            while(rs.next()){
                row[0]=rs.getString("id_escuela");
                row[1]=rs.getString("nombre_escuela_p");
                
                
                model.addRow(row);
            }
            
            tabla.setModel(model);
            
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "No se pudo mostrar");
            this.error=ex.getMessage();
            this.isError=true;
        }
        
    }
    
    //METODO PARA GUARDAR UN REGISTRO
    
    public int insertar(EscuelasProcedencia p) {
        int resultado = 0;
        clean();
        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            resultado = st.executeUpdate("INSERT INTO escuelas_procedencia VALUE('" + p.getId_escuela()+ "','"
                    + p.getNombre_escuela_p()+ "')");

        } catch (Exception ex) {
            this.error = ex.getMessage();
            this.isError = true;
        }

        return resultado;

    }
    
    //METODO PARA ACTUALIZAR EL REGISTRO 
     public int actualizar(EscuelasProcedencia p) {
        int resultado = 0;
        clean();
        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            resultado = st.executeUpdate("UPDATE escuelas_procedencia SET id_escuela='"+ p.getId_escuela()+"', nombre_escuela_p='"+ p.getNombre_escuela_p()+"' WHERE id_escuela='"+ p.getId_escuela()+"'");

        } catch (Exception ex) {
            this.error = ex.getMessage();
            this.isError = true;
        }

        return resultado;

    }
    
    //METODO PARA BUSCAR UN REGISTRO DE ESCUELAS DE PROCEDENCIA
    
    public EscuelasProcedencia buscar(String id_escuela) {
        EscuelasProcedencia c = null;
        clean();
        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM escuelas_procedencia WHERE id_escuela='" + id_escuela+ "';");
            rs.next();
            c = new EscuelasProcedencia();
            c.setId_escuela(rs.getString("id_escuela"));
            c.setNombre_escuela_p(rs.getString("nombre_escuela_p"));

        } catch (Exception ex) {
            this.error = ex.getMessage();
            this.isError = true;
        }
        return c;
    }
    
    // METODO PARA ELIMINAR UN REGISTRO DE ESCUELAS DE PROCEDENCIA
    
    public int eliminar (String id_escuela){
        int resultado = 0;
        clean();
        try{
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            resultado = st.executeUpdate("DELETE FROM escuelas_procedencia WHERE id_escuela='"+id_escuela+"';");
            
        }catch (Exception ex){
            this.error= ex.getMessage();
            this.isError=true;
        }
        
        
        return resultado;
    }
    
    //Metodo de filtrado de tabla
    
    public void filtrop (JTable tabla, String fp){
        clean();
        
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        try{
            Connection con=DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM escuelas_procedencia WHERE nombre_escuela_p LIKE '%"+ fp+"%'");
            
            Object row[]=new Object[3];
            
            while(rs.next()){
                row[0]=rs.getString("id_escuela");
                row[1]=rs.getString("nombre_escuela_p");
                
                
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
    
    
    
}
