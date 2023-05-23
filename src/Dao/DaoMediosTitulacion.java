/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Dto.MediosTitulacion;
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
public class DaoMediosTitulacion {

    private String error;
    private boolean isError;

    // METODO PARA MOSTRAR TABLA
    public void buscartabla(JTable tablamedios_titulacion) {
        clean();

        DefaultTableModel model = (DefaultTableModel) tablamedios_titulacion.getModel();
        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM medios_titulacion");

            Object row[] = new Object[2];

            while (rs.next()) {
                row[0] = rs.getString("id_medio_titulacion");
                row[1] = rs.getString("medio_titulacion");

                model.addRow(row);
            }

            tablamedios_titulacion.setModel(model);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar");
            this.error = ex.getMessage();
            this.isError = true;
        }

    }

    // METODO PARA REGISTRAR UN MEDIO DE TITULACIÓN
    public int insertar(MediosTitulacion p) {
        int resultado = 0;
        clean();
        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            resultado = st.executeUpdate("INSERT INTO medios_titulacion value('" + p.getId_medio_titulacion() + "','"
                    + p.getMedio_titulacion() + "')");

        } catch (Exception ex) {
            this.error = ex.getMessage();
            this.isError = true;
        }
        return resultado;
    }

    //METODO PARA ACTUALIZAR EL REGISTRO
    public int actualizar(MediosTitulacion p) {
        int resultado = 0;
        clean();
        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            resultado = st.executeUpdate("UPDATE medios_titulacion SET id_medio_titulacion='" + p.getId_medio_titulacion() + "', medio_titulacion='" + p.getMedio_titulacion() + "' WHERE id_medio_titulacion='" + p.getId_medio_titulacion() + "'");

        } catch (Exception ex) {
            this.error = ex.getMessage();
            this.isError = true;
        }
        return resultado;
    }

    // METODO PARA BUSCAR UN REGISTRO
    public MediosTitulacion buscar(String id_medio_titulacion) {
        MediosTitulacion p = null;
        clean();
        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM medios_titulacion WHERE id_medio_titulacion='" + id_medio_titulacion + "';");
            rs.next();
            p = new MediosTitulacion();
            p.setId_medio_titulacion(rs.getString("id_medio_titulacion"));
            p.setMedio_titulacion(rs.getString("medio_titulacion"));

        } catch (Exception ex) {
            this.error = ex.getMessage();
            this.isError = true;
        }
        return p;
    }

    //METODO PARA ELIMINAR UN REGISTRO EN METODOS DE TITULACIÓN
    public int eliminar(String id_medio_titulacion) {
        int resultado = 0;
        clean();

        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            resultado = st.executeUpdate("DELETE FROM medios_titulacion WHERE id_medio_titulacion='" + id_medio_titulacion + "';");

        } catch (Exception ex) {
            this.error = ex.getMessage();
            this.isError = true;
        }
        return resultado;

    }
    
    //Metodo para filtrar registro de titulacion
    
    public void filtrot(JTable tablamedios_titulacion, String ft) {
        clean();

        DefaultTableModel model = (DefaultTableModel) tablamedios_titulacion.getModel();
        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM medios_titulacion WHERE medio_titulacion LIKE '%"+ ft+"%'");

            Object row[] = new Object[2];

            while (rs.next()) {
                row[0] = rs.getString("id_medio_titulacion");
                row[1] = rs.getString("medio_titulacion");

                model.addRow(row);
            }

            tablamedios_titulacion.setModel(model);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar");
            this.error = ex.getMessage();
            this.isError = true;
        }

    }

    // Limpiando Registros
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
