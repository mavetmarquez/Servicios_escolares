/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Dto.EscuelasUnitec;
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
public class DaoEscuelasUnitec {

    private String error;
    private boolean isError;
    
    //Tabla

    public void buscartabla(JTable tabla) {
        clean();

        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM escuelas_unitec");

            Object row[] = new Object[3];

            while (rs.next()) {
                row[0] = rs.getString("id_escuela");
                row[1] = rs.getString("nombre_escuela");

                model.addRow(row);
            }

            tabla.setModel(model);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar");
            this.error = ex.getMessage();
            this.isError = true;
        }

    }

    // METODO PARA REGISTRAR O GUARDAR
    public int insertar(EscuelasUnitec p) {
        int resultado = 0;
        clean();
        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            resultado = st.executeUpdate("INSERT INTO escuelas_unitec VALUE('" + p.getId_escuela() + "','"
                    + p.getNombre_escuela() + "')");

        } catch (Exception ex) {
            this.error = ex.getMessage();
            this.isError = true;
        }

        return resultado;

    }

    // METODO PARA ELIMINAR UAN ESCUELA
    public int eliminar(String id_escuela) {
        int resultado = 0;
        clean();
        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            resultado = st.executeUpdate("DELETE FROM escuelas_unitec WHERE id_escuela='" + id_escuela + "';");

        } catch (Exception ex) {
            this.error = ex.getMessage();
            this.isError = true;
        }

        return resultado;
    }

    /// METODO PARA BUSCAR UN REGISTRO
    public EscuelasUnitec buscar(String id_escuela) {
        EscuelasUnitec p = null;
        clean();
        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM escuelas_unitec WHERE id_escuela='" + id_escuela + "';");
            rs.next();
            
            p = new EscuelasUnitec();
            p.setId_escuela(rs.getString("id_escuela"));
            p.setNombre_escuela(rs.getString("nombre_escuela"));

        } catch (Exception ex) {
            this.error = ex.getMessage();
            this.isError = true;
        }
        return p;
    }

    //Metodo para actualizar el registro
    public int actualizar(EscuelasUnitec p) {
        int resultado = 0;
        clean();
        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            resultado = st.executeUpdate("UPDATE escuelas_unitec SET id_escuela='" + p.getId_escuela()+"', nombre_escuela='"+ p.getNombre_escuela()+"' WHERE id_escuela='"+ p.getId_escuela()+"'");

        } catch (Exception ex) {
            this.error = ex.getMessage();
            this.isError = true;
        }

        return resultado;

    }
    
    //Metodo para filtrar la busqueda
    public void filtrar (JTable tabla, String f) {
        clean();

        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM escuelas_unitec WHERE nombre_escuela LIKE '%"+f+"%'" );

            Object row[] = new Object[3];

            while (rs.next()) {
                row[0] = rs.getString("id_escuela");
                row[1] = rs.getString("nombre_escuela");

                model.addRow(row);
            }

            tabla.setModel(model);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar");
            this.error = ex.getMessage();
            this.isError = true;
        }

    }
    
    
   
    
    
    
    
    

    // Metodo clean
    public void clean() {
        this.error = "";
        this.isError = false;
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
