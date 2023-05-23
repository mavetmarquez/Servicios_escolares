/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Dto.Tramites_certificaciones_recepcion;
import java.sql.ResultSet;
import Dto.Empleados;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jotruvel
 */
public class DaoTramites_certificaciones_recepcion {
    
    private String error;
    private boolean isError;
    
    //Metodo para inseertar valores a una base de datos.
    
    public int insertarr(Tramites_certificaciones_recepcion e){
        int resultado=0;
        clean();
        
        try{
            Connection con = DBConnection.getConexion();
            Statement st= con.createStatement();
            resultado = st.executeUpdate("INSERT INTO certificacion_recepcion VALUE('"+e.getMatricula()+"','" 
                    +e.getNombre()+"','"
                    +e.getFecha_recepcion()+"','"
                    +e.getObservaciones()+"','"
                    + e.getTipo_certificado()+"','"
                    +e.getPago()+"','"
                    +e.getCiclo_egreso()+"')");
            
        }catch (Exception ex){
            this.error=ex.getMessage();
            this.isError=true;
        }
        return resultado;
    }
    
    //Metodo para mostrar a tabla 
    
    public void buscartablar (JTable tabla_recepcion){
        clean();
        
        DefaultTableModel model=(DefaultTableModel)tabla_recepcion.getModel();
        
        try{
            Connection con =DBConnection.getConexion();
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery("SELECT * FROM certificacion_recepcion");
            
            Object row[] =new Object[7];
            
            while (rs.next()){
                row[0]= rs.getString("matricula");
                row[1]= rs.getString("nombre");
                row[2]= rs.getString("fecha_recepcion");
                row[3]= rs.getString("observaciones");
                row[4]= rs.getString("tipo_certificado");
                row[5]= rs.getString("pago");
                row[6]= rs.getString("ciclo_egreso");
                
                model.addRow(row);
            }
            
            tabla_recepcion.setModel(model);
            
        }catch (Exception ex){
            
            JOptionPane.showMessageDialog(null, "No se pudo mostrar");
            this.error=ex.getMessage();
            this.isError=true;
        }
    }
    
    //Metodo para filtrar la busqueda por matricula en recepcion 
    public void filtrarMR (JTable tabla, String f) {
        clean();

        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM certificacion_recepcion WHERE matricula LIKE '%"+f+"%'" );

            Object row[] = new Object[7];

            while (rs.next()) {
                row[0] = rs.getString("matricula");
                row[1] = rs.getString("nombre");
                row[2] = rs.getString("fecha_recepcion");
                row[3] = rs.getString("observaciones");
                row[4]= rs.getString("tipo_certificado");
                row[5]= rs.getString("pago");
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
    
    //Metodo para filtar la busqueda por medio del nombre en recepcion
    public void filtrarNR (JTable tabla, String f) {
        clean();

        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM certificacion_recepcion WHERE nombre LIKE '%"+f+"%'" );

            Object row[] = new Object[7];

            while (rs.next()) {
                row[0] = rs.getString("matricula");
                row[1] = rs.getString("nombre");
                row[2] = rs.getString("fecha_recepcion");
                row[3] = rs.getString("observaciones");
                row[4]= rs.getString("tipo_certificado");
                row[5]= rs.getString("pago");
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
    
    //Clean
    public void clean(){
        this.error="";
        this.isError=false;
    }
    
    public String getError(){
        return error;
    }
    
    public boolean isIsError(){
        return isError;
    }
    
    public void setError (String error){
        this.error=error;
    }
    
    public void setIsError (boolean isError){
        this.isError= isError;
    }
    
}
