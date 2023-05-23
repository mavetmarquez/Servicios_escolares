/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import java.sql.ResultSet;
import Dto.Tramites_certificaciones_entrega;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jotruvel
 */
public class DaoTramites_certificaciones_entrega {
    private String error;
    private boolean isError;

    // Metodo para insertar valores a base de datos
    public int insertar(Tramites_certificaciones_entrega e) {
        int resultado = 0;
        clean();

        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            resultado = st.executeUpdate("INSERT INTO certificacion_entrega VALUE('" + e.getMatricula() + "','"
                    + e.getNombre() + "','"
                    + e.getFecha_entrega() + "','"
                    + e.getObservaciones()+"','"
                    + e.getTipo_certificado()+"','"
                    +e.getPago()+"','"
                    +e.getCiclo_egreso()+"')");

        } catch (Exception ex) {
            this.error = ex.getMessage();
            this.isError = true;
        }
        return resultado;
    }

    // Metodo para mostrar tabla
    public void buscartabla(JTable tabla_entrega) {

        clean();

        DefaultTableModel model = (DefaultTableModel) tabla_entrega.getModel();

        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM certificacion_entrega");

            Object row[] = new Object[7];

            while (rs.next()) {
                row[0] = rs.getString("matricula");
                row[1] = rs.getString("nombre");
                row[2] = rs.getString("fecha_entrega");
                row[3] = rs.getString("observaciones");
                row[4]= rs.getString("tipo_certificado");
                row[5]=rs.getString("pago");
                row[6]= rs.getString("ciclo_egreso");

                model.addRow(row);
            }

            tabla_entrega.setModel(model);

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "No se pudo mostrar");
            this.error = ex.getMessage();
            this.isError = true;
        }

    }
    
    public void filtrar (JTable tabla, String f) {
        clean();

        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM certificacion_entrega WHERE matricula LIKE '%"+f+"%'" );

            Object row[] = new Object[7];

            while (rs.next()) {
                row[0] = rs.getString("matricula");
                row[1] = rs.getString("nombre");
                row[2] = rs.getString("fecha_entrega");
                row[3] = rs.getString("observaciones");
                row[4]= rs.getString("tipo_certificado");
                row[5]=rs.getString("pago");
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
    
    public void filtrarN (JTable tabla, String f) {
        clean();

        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM certificacion_entrega WHERE nombre LIKE '%"+f+"%'" );

            Object row[] = new Object[7];

            while (rs.next()) {
                row[0] = rs.getString("matricula");
                row[1] = rs.getString("nombre");
                row[2] = rs.getString("fecha_entrega");
                row[3] = rs.getString("observaciones");
                row[4]= rs.getString("tipo_certificado");
                row[5]=rs.getString("pago");
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
