/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Dto.CarrerasUnitec;
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
public class DaoCarrerasUnitec {

    private String error;
    private boolean isError;

    // Mostrar tabla
    public void buscartabla(JTable tablacarreras_unitec) {
        clean();

        DefaultTableModel model = (DefaultTableModel) tablacarreras_unitec.getModel();
        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM carreras_unitec");

            Object row[] = new Object[2];

            while (rs.next()) {
                row[0] = rs.getString("id_carrera");
                row[1] = rs.getString("nombre_carrera");

                model.addRow(row);
            }

            tablacarreras_unitec.setModel(model);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar");
            this.error = ex.getMessage();
            this.isError = true;
        }

    }

    // Bucar en txt
    /**
     * Metodo para buscar carreras de Unitec en el sistema
     *
     *
     */
    public CarrerasUnitec buscar(String id_carrera) {
        CarrerasUnitec c = null;
        clean();
        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM carreras_unitec WHERE id_carrera='" + id_carrera + "';");
            rs.next();
            c = new CarrerasUnitec();
            c.setId_carrera(rs.getString("id_carrera"));
            c.setNombre(rs.getString("nombre_carrera"));

        } catch (Exception ex) {
            this.error = ex.getMessage();
            this.isError = true;
        }
        return c;
    }

    // METODO PARA REGISTRAR UNA CARRERA
    public int insertar(CarrerasUnitec p) {
        int resultado = 0;
        clean();
        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            resultado = st.executeUpdate("INSERT INTO carreras_unitec VALUE('" + p.getId_carrera()+ "','"
                    + p.getNombre()+ "')");

        } catch (Exception ex) {
            this.error = ex.getMessage();
            this.isError = true;
        }

        return resultado;

    }
    
    // METODO PARA ELIMINAR UN REGISTRO
    
    public int eliminar (String id_carrera){
        int resultado = 0;
        clean();
        try{
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            resultado = st.executeUpdate("DELETE FROM carreras_unitec WHERE id_carrera='"+id_carrera+"';");
            
        }catch (Exception ex){
            this.error= ex.getMessage();
            this.isError=true;
        }
        
        
        return resultado;
    }
    
    /// METODO PARA ACTUALIZAR ALGUN REGISTRO
    public int actualizar(CarrerasUnitec p) {
        int resultado = 0;
        clean();
        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            resultado = st.executeUpdate("UPDATE carreras_unitec SET id_carrera='"+ p.getId_carrera() +"', nombre_carrera='"+ p.getNombre()+"' WHERE id_carrera='"+ p.getId_carrera()+"'");

        } catch (Exception ex) {
            this.error = ex.getMessage();
            this.isError = true;
        }

        return resultado;

    }
    
    //Metodo de filtrado del registro
    public void filtroC(JTable tablacarreras_unitec, String fc) {
        clean();

        DefaultTableModel model = (DefaultTableModel) tablacarreras_unitec.getModel();
        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM carreras_unitec WHERE nombre_carrera LIKE '%"+ fc+"%'");

            Object row[] = new Object[2];

            while (rs.next()) {
                row[0] = rs.getString("id_carrera");
                row[1] = rs.getString("nombre_carrera");

                model.addRow(row);
            }

            tablacarreras_unitec.setModel(model);

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

    public void buscartabla(DefaultTableModel modelo_carreras) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
