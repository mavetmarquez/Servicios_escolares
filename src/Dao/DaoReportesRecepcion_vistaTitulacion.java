/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

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
public class DaoReportesRecepcion_vistaTitulacion {
    private String error;
    private boolean isError;
    
    public void buscartabla(JTable tabla_recepcion) {

        clean();

        DefaultTableModel model = (DefaultTableModel) tabla_recepcion.getModel();

        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM servicios_escolares.reporte_recepcion_titulacion");

            Object row[] = new Object[18];

            while (rs.next()) {
                row[0] = rs.getString("matricula");
                row[1] = rs.getString("nombre");
                row[2]= rs.getString("fecha_envio");
                row[3] = rs.getString("fecha_recepcion");
                row[4] = rs.getString("observaciones");
                row[5] = rs.getString("tipo_certificado");
                row[6] = rs.getString("pago");
                row[7] = rs.getString("ciclo_egreso");
                row[8] = rs.getString("egel");
                row[9] = rs.getString("medio_titulación");
                row[10] = rs.getString("id_escuela_f");
                row[11] = rs.getString("nombre_escuela");
                row[12] = rs.getString("id_carrera_f");
                row[13] = rs.getString("nombre_carrera");
                row[14] = rs.getString("id_escuela_pro_f");
                row[15] = rs.getString("nombre_escuela_p");
                row[16] = rs.getString("ciclo_ingreso");
                row[17] = rs.getString("curp");

                model.addRow(row);
            }

            tabla_recepcion.setModel(model);

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "No se pudo mostrar");
            this.error = ex.getMessage();
            this.isError = true;
        }

    }
    
    //Metodo para filtrar la busqueda por medio del nombre en recepcion.
    public void filtrarNR(JTable tabla_recepcion, String nr) {

        clean();

        DefaultTableModel model = (DefaultTableModel) tabla_recepcion.getModel();

        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM servicios_escolares.reporte_recepcion_titulacion WHERE nombre LIKE '%" + nr + "%'");

            Object row[] = new Object[18];

            while (rs.next()) {
                row[0] = rs.getString("matricula");
                row[1] = rs.getString("nombre");
                row[2]= rs.getString("fecha_envio");
                row[3] = rs.getString("fecha_recepcion");
                row[4] = rs.getString("observaciones");
                row[5] = rs.getString("tipo_certificado");
                row[6] = rs.getString("pago");
                row[7] = rs.getString("ciclo_egreso");
                row[8] = rs.getString("egel");
                row[9] = rs.getString("medio_titulación");
                row[10] = rs.getString("id_escuela_f");
                row[11] = rs.getString("nombre_escuela");
                row[12] = rs.getString("id_carrera_f");
                row[13] = rs.getString("nombre_carrera");
                row[14] = rs.getString("id_escuela_pro_f");
                row[15] = rs.getString("nombre_escuela_p");
                row[16] = rs.getString("ciclo_ingreso");
                row[17] = rs.getString("curp");

                model.addRow(row);
            }

            tabla_recepcion.setModel(model);

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "No se pudo mostrar");
            this.error = ex.getMessage();
            this.isError = true;
        }

    }
    
    public void filtrarMR(JTable tabla_recepcion, String nr) {

        clean();

        DefaultTableModel model = (DefaultTableModel) tabla_recepcion.getModel();

        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM servicios_escolares.reporte_recepcion_titulacion WHERE matricula LIKE '%" + nr + "%'");

            Object row[] = new Object[18];

            while (rs.next()) {
                row[0] = rs.getString("matricula");
                row[1] = rs.getString("nombre");
                row[2]= rs.getString("fecha_envio");
                row[3] = rs.getString("fecha_recepcion");
                row[4] = rs.getString("observaciones");
                row[5] = rs.getString("tipo_certificado");
                row[6] = rs.getString("pago");
                row[7] = rs.getString("ciclo_egreso");
                row[8] = rs.getString("egel");
                row[9] = rs.getString("medio_titulación");
                row[10] = rs.getString("id_escuela_f");
                row[11] = rs.getString("nombre_escuela");
                row[12] = rs.getString("id_carrera_f");
                row[13] = rs.getString("nombre_carrera");
                row[14] = rs.getString("id_escuela_pro_f");
                row[15] = rs.getString("nombre_escuela_p");
                row[16] = rs.getString("ciclo_ingreso");
                row[17] = rs.getString("curp");

                model.addRow(row);
            }

            tabla_recepcion.setModel(model);

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "No se pudo mostrar");
            this.error = ex.getMessage();
            this.isError = true;
        }

    }
    
    // FILTRAR PARA FECHA POR INTERVALO
    public void filtrofecha(JTable tabla_recepcion, String E, String F) {

        clean();

        DefaultTableModel model = (DefaultTableModel) tabla_recepcion.getModel();

        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM servicios_escolares.reporte_recepcion_titulacion WHERE fecha_recepcion BETWEEN'"+E+"' AND '"+F+"'");

            Object row[] = new Object[18];

            while (rs.next()) {
                row[0] = rs.getString("matricula");
                row[1] = rs.getString("nombre");
                row[2]= rs.getString("fecha_envio");
                row[3] = rs.getString("fecha_recepcion");
                row[4] = rs.getString("observaciones");
                row[5] = rs.getString("tipo_certificado");
                row[6] = rs.getString("pago");
                row[7] = rs.getString("ciclo_egreso");
                row[8] = rs.getString("egel");
                row[9] = rs.getString("medio_titulación");
                row[10] = rs.getString("id_escuela_f");
                row[11] = rs.getString("nombre_escuela");
                row[12] = rs.getString("id_carrera_f");
                row[13] = rs.getString("nombre_carrera");
                row[14] = rs.getString("id_escuela_pro_f");
                row[15] = rs.getString("nombre_escuela_p");
                row[16] = rs.getString("ciclo_ingreso");
                row[17] = rs.getString("curp");
                

                model.addRow(row);
            }

            tabla_recepcion.setModel(model);

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "No se pudo mostrar");
            this.error = ex.getMessage();
            this.isError = true;
        }
  
  }
    
    
    
    
    
    public void clean(){
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
