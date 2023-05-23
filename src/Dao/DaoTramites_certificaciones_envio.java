/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.sql.ResultSet;
import Dto.Tramites_certificaciones_envio;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jotruvel
 */
public class DaoTramites_certificaciones_envio {

    private String error;
    private boolean isError;

    // Metodo para insertar valores a base de datos
    public int insertar(Tramites_certificaciones_envio e) {
        int resultado = 0;
        clean();

        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            resultado = st.executeUpdate("INSERT INTO certificacion_envio VALUE('" + e.getMatricula() + "','"
                    + e.getNombre() + "','"
                    + e.getFecha_envio() + "','"
                    + e.getObservaciones() + "','"
                    + e.getTipo_certificado()+"','"
                    + e.getPago()+"','"
                    +e.getCiclo_egreso()+"')");

        } catch (Exception ex) {
            this.error = ex.getMessage();
            this.isError = true;
        }
        return resultado;
    }

    // Metodo para mostrar tabla
    public void buscartabla(JTable tabla_envio) {

        clean();

        DefaultTableModel model = (DefaultTableModel) tabla_envio.getModel();

        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM certificacion_envio");

            Object row[] = new Object[7];

            while (rs.next()) {
                row[0] = rs.getString("matricula");
                row[1] = rs.getString("nombre");
                row[2] = rs.getString("fecha_envio");
                row[3] = rs.getString("observaciones");
                row[4] = rs.getString("tipo_certificado");
                row[5] = rs.getString("pago");
                row[6]= rs.getString("ciclo_egreso");

                model.addRow(row);
            }

            tabla_envio.setModel(model);

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "No se pudo mostrar");
            this.error = ex.getMessage();
            this.isError = true;
        }

    }
    
    //Filtrar matricula envio
    public void filtrarME (JTable tabla, String f) {
        clean();

        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM certificacion_envio WHERE matricula LIKE '%"+f+"%'" );

            Object row[] = new Object[7];

            while (rs.next()) {
                row[0] = rs.getString("matricula");
                row[1] = rs.getString("nombre");
                row[2] = rs.getString("fecha_envio");
                row[3] = rs.getString("observaciones");
                row[4] = rs.getString("tipo_certificado");
                row[5] = rs.getString("pago");
                row[6]= rs.getString("ciclo_egreso");

                model.addRow(row);
            }

            tabla.setModel(model);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar");
            this.error = ex.getMessage();
            this.isError = true;
        }

    }
    
    //Filtrar nombre envio
    public void filtrarNE (JTable tabla, String f) {
        clean();

        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM certificacion_envio WHERE nombre LIKE '%"+f+"%'" );

            Object row[] = new Object[7];

            while (rs.next()) {
                row[0] = rs.getString("matricula");
                row[1] = rs.getString("nombre");
                row[2] = rs.getString("fecha_envio");
                row[3] = rs.getString("observaciones");
                row[4] = rs.getString("tipo_certificado");
                row[5] = rs.getString("pago");
                row[6]= rs.getString("ciclo_egreso");

                model.addRow(row);
            }

            tabla.setModel(model);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar");
            this.error = ex.getMessage();
            this.isError = true;
        }

    }

    // METODO CLEAN
    public void clean() {
        this.error = "";
        this.isError = false;
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
