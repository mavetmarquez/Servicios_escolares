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
public class DaoReporteEnvio_vistaTitulacion {

    private String error;
    private boolean isError;
    
    public void buscartabla(JTable tabla_envio) {

        clean();

        DefaultTableModel model = (DefaultTableModel) tabla_envio.getModel();

        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM servicios_escolares.reporte_envio_titulacion");

            Object row[] = new Object[17];

            while (rs.next()) {
                row[0] = rs.getString("matricula");
                row[1] = rs.getString("nombre");
                row[2] = rs.getString("fecha_envio");
                row[3] = rs.getString("observaciones");
                row[4]= rs.getString("tipo_certificado");
                row[5]=rs.getString("pago");
                row[6]= rs.getString("ciclo_egreso");
                row[7]= rs.getString("egel");
                row[8]= rs.getString("medio_titulación");
                row[9]= rs.getString("id_escuela_f");
                row[10]= rs.getString("nombre_escuela");
                row[11]= rs.getString("id_carrera_f");
                row[12]= rs.getString("nombre_carrera");
                row[13]= rs.getString("id_escuela_pro_f");
                row[14]= rs.getString("nombre_escuela_p");
                row[15]= rs.getString("ciclo_ingreso");
                row[16]= rs.getString("curp");
                

                model.addRow(row);
            }

            tabla_envio.setModel(model);

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "No se pudo mostrar");
            this.error = ex.getMessage();
            this.isError = true;
        }

    } 
    
    public void filtroE(JTable tabla_envio, String E) {

        clean();

        DefaultTableModel model = (DefaultTableModel) tabla_envio.getModel();

        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM servicios_escolares.reporte_envio_titulacion WHERE nombre LIKE '%"+ E+"%'");

            Object row[] = new Object[12];

            while (rs.next()) {
                row[0] = rs.getString("matricula");
                row[1] = rs.getString("nombre");
                row[2] = rs.getString("fecha_envio");
                row[3] = rs.getString("observaciones");
                row[4]= rs.getString("tipo_certificado");
                row[5]=rs.getString("pago");
                row[6]= rs.getString("ciclo_egreso");
                row[7]= rs.getString("egel");
                row[8]= rs.getString("medio_titulación");
                row[9]= rs.getString("id_escuela_f");
                row[10]= rs.getString("nombre_escuela");
                row[11]= rs.getString("id_carrera_f");
                row[12]= rs.getString("nombre_carrera");
                row[13]= rs.getString("id_escuela_pro_f");
                row[14]= rs.getString("nombre_escuela_p");
                row[15]= rs.getString("ciclo_ingreso");
                row[16]= rs.getString("curp");
                

                model.addRow(row);
            }

            tabla_envio.setModel(model);

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "No se pudo mostrar");
            this.error = ex.getMessage();
            this.isError = true;
        }
  
  }
    
    //Metodo para el filtro de busqueda por medio de la matricula en envio
   public void filtroEM(JTable tabla_envio, String E) {

        clean();

        DefaultTableModel model = (DefaultTableModel) tabla_envio.getModel();

        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM servicios_escolares.reporte_envio_titulacion WHERE matricula LIKE '%"+ E+"%'");

            Object row[] = new Object[17];

            while (rs.next()) {
                row[0] = rs.getString("matricula");
                row[1] = rs.getString("nombre");
                row[2] = rs.getString("fecha_envio");
                row[3] = rs.getString("observaciones");
                row[4]= rs.getString("tipo_certificado");
                row[5]=rs.getString("pago");
                row[6]= rs.getString("ciclo_egreso");
                row[7]= rs.getString("egel");
                row[8]= rs.getString("medio_titulación");
                row[9]= rs.getString("id_escuela_f");
                row[10]= rs.getString("nombre_escuela");
                row[11]= rs.getString("id_carrera_f");
                row[12]= rs.getString("nombre_carrera");
                row[13]= rs.getString("id_escuela_pro_f");
                row[14]= rs.getString("nombre_escuela_p");
                row[15]= rs.getString("ciclo_ingreso");
                row[16]= rs.getString("curp");
                

                model.addRow(row);
            }

            tabla_envio.setModel(model);

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "No se pudo mostrar");
            this.error = ex.getMessage();
            this.isError = true;
        }
  
  }
   
   // Metodo para filtrar la busqueda por medio de un rango de fechas en envio
   
   public void filtrofecha(JTable tabla_envio, String E, String F) {

        clean();

        DefaultTableModel model = (DefaultTableModel) tabla_envio.getModel();

        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM servicios_escolares.reporte_envio_titulacion WHERE fecha_envio BETWEEN '"+E+"' AND '"+F+"'");

            Object row[] = new Object[17];

            while (rs.next()) {
                row[0] = rs.getString("matricula");
                row[1] = rs.getString("nombre");
                row[2] = rs.getString("fecha_envio");
                row[3] = rs.getString("observaciones");
                row[4]= rs.getString("tipo_certificado");
                row[5]=rs.getString("pago");
                row[6]= rs.getString("ciclo_egreso");
                row[7]= rs.getString("egel");
                row[8]= rs.getString("medio_titulación");
                row[9]= rs.getString("id_escuela_f");
                row[10]= rs.getString("nombre_escuela");
                row[11]= rs.getString("id_carrera_f");
                row[12]= rs.getString("nombre_carrera");
                row[13]= rs.getString("id_escuela_pro_f");
                row[14]= rs.getString("nombre_escuela_p");
                row[15]= rs.getString("ciclo_ingreso");
                row[16]= rs.getString("curp");
                

                model.addRow(row);
            }

            tabla_envio.setModel(model);

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
