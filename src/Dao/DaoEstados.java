/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Dto.Estados;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

/**
 *
 * @author jotruvel
 */
public final class DaoEstados {

    private String error;
    private boolean isError;

    //Metodo para buscar tabla
    public void buscartabla(JTable tabla_estados) {
        clean();
        DefaultTableModel model=(DefaultTableModel) tabla_estados.getModel();

        try {

            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM estados");
            Object row[] = new Object[4];

            while (rs.next()) {
                row[0] = rs.getString("id_estado");
                row[1] = rs.getString("estado");
                model.addRow(row);

            }
            
            tabla_estados.setModel(model);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar");
            this.error = ex.getMessage();
            this.isError = true;
        }

    }

    //Metodo para guardar el registro
    public int insertar(Estados e) {
        int resultado = 0;
        clean();
        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            resultado = st.executeUpdate("INSERT INTO estados value('" + e.getId_estado() + "','" + e.getEstado() + "')");

        } catch (Exception ex) {
            this.error = ex.getMessage();
            this.isError = true;
        }
        return resultado;
    }
    
    //Metodo para actualizar el registro 
    public int actualizar (Estados e){
        int resultado=0;
        clean();
        
        try{
            Connection con = DBConnection.getConexion();
            Statement st=con.createStatement();
            resultado=st.executeUpdate("UPDATE estados SET id_estado='"+e.getId_estado()+"', estado='"+ e.getEstado()+"'WHERE id_estado='"+e.getId_estado()+"'");
            
        } catch (Exception ex){
            this.error=ex.getMessage();
            this.isError=true;
        }
        return resultado;
    }
    
    //Metodo para eliminar un registro
    public int eliminar (String id_estado){
        int resultado =0;
        clean();
        try{
            Connection con =DBConnection.getConexion();
            Statement st=con.createStatement();
            resultado=st.executeUpdate("DELETE FROM estados WHERE id_estado='"+id_estado+"';");
            
        }catch (Exception ex){
            this.error=ex.getMessage();
            this.isError=true;
        }
        return resultado;
    }
    
    //Metodo para buscar el registro 
    public Estados buscar (String id_estado){
        Estados p=null;
        clean();
        
        try{
            Connection con=DBConnection.getConexion();
            Statement at=con.createStatement();
            ResultSet rs=at.executeQuery("SELECT * FROM estados WHERE id_estado='"+id_estado+"';");
            rs.next();
            p=new Estados();
            p.setId_estado(rs.getString("id_estado"));
            p.setEstado(rs.getString("estado"));
            
        }catch (Exception ex){
            this.error=ex.getMessage();
            this.isError=true;
        }
        return p;
    }
    
    //Metodo para filtrar la busqueda
    public void filtroe(JTable tabla_estados, String fe) {
        clean();
        DefaultTableModel model=(DefaultTableModel) tabla_estados.getModel();

        try {

            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM estados WHERE estado LIKE '%"+fe+"%'");
            Object row[] = new Object[4];

            while (rs.next()) {
                row[0] = rs.getString("id_estado");
                row[1] = rs.getString("estado");
                model.addRow(row);

            }
            
            tabla_estados.setModel(model);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar");
            this.error = ex.getMessage();
            this.isError = true;
        }

    }
    

    //SET y GET de los atributos.
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

    //Limpiado del registro
    public void clean() {
        this.error = "";
        this.isError = false;
    }

}
