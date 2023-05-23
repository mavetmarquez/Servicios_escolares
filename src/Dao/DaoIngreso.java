/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Dto.Ingreso;
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
public class DaoIngreso {

    private String error;
    private boolean isError;

    //Mostrar la tabla de ingreso
    public void buscartabla(JTable tabla) {
        clean();

        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM ingreso");

            Object row[] = new Object[3];

            while (rs.next()) {
                row[0] = rs.getString("id_ingreso");
                row[1] = rs.getString("tipo_ingreso");

                model.addRow(row);
            }
            tabla.setModel(model);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar");
            this.error = ex.getMessage();
            this.isError = true;
        }

    }
    
    //Metodo para guardar el registro
    
    public int insertar(Ingreso i){
        int resultado =0;
        clean();
        try{
            Connection con =DBConnection.getConexion();
            Statement st = con.createStatement();
            resultado = st.executeUpdate("INSERT INTO ingreso VALUE('"+ i.getId_ingreso()+ "','" + i.getIngreso()+"')");
            
        }catch (Exception ex){
            this.error=ex.getMessage();
            this.isError=true;
        }
        return resultado;
    }
    
    //Metodo para actualizar el regisgtro de ingreso
    
    public int actualizar(Ingreso i){
        int resultado=0;
        clean();
        try{
            Connection con= DBConnection.getConexion();
            Statement st= con.createStatement();
            resultado= st.executeUpdate("UPDATE ingreso SET id_ingreso='"+i.getId_ingreso()+"', tipo_ingreso='"+ i.getIngreso()+"' WHERE id_ingreso='"+ i.getId_ingreso()+"'" );
            
        }catch (Exception ex){
            this.error=ex.getMessage();
            this.isError= true;
        }
        return resultado;
    }
    
    //Metdo para buscar el registro de ingreso
    
    public Ingreso buscar(String id_ingreso){
        Ingreso i=null;
        clean();
        try{
            Connection con= DBConnection.getConexion();
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery("SELECT * FROM ingreso WHERE id_ingreso='" + id_ingreso+"';");
            rs.next();
            i=new Ingreso();
            i.setId_ingreso(rs.getString("id_ingreso"));
            i.setIngreso(rs.getString("tipo_ingreso"));
            
        }catch (Exception ex){
            this.error=ex.getMessage();
            this.isError=true;
        }
        return i;
    }
    
    //Metodo para elminar el registro de ingreso
    
    public int eliminar (String id_ingreso){
        int resultado=0;
        clean();
        try{
            Connection con =DBConnection.getConexion();
            Statement st= con.createStatement();
            resultado= st.executeUpdate("DELETE FROM ingreso WHERE id_ingreso='"+id_ingreso+"';");
            
        }catch (Exception ex){
            this.error=ex.getMessage();
            this.isError=true;
        }
        return resultado;
    }
    
    //Metdo de filtrado de tabla ingreso
    public void filtroi (JTable tabla, String fi){
        clean();
        
        DefaultTableModel model= (DefaultTableModel)tabla.getModel();
        try{
            Connection con =DBConnection.getConexion();
            Statement st=con.createStatement();
            ResultSet rs= st.executeQuery("SELECT * FROM ingreso WHERE tipo_ingreso LIKE '%"+ fi+"%'");
            
            Object row[]=new Object[3];
            
            while (rs.next()){
                row[0]=rs.getString("id_ingreso");
                row[1]=rs.getString("tipo_ingreso");
                
                model.addRow(row);
            }
            tabla.setModel(model);
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "No se pudo mostrar");
            this.error=ex.getMessage();
            this.isError=true;
        }
    }

    // Limpiado registro
    public void clean() {
        this.error = " ";
        this.isError = false;
    }

    //Set y Get de los atributos 
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
