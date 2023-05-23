/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;


import Dto.RegistroAlumno;
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
public class DaoRegistroAlumno {
    private String error;
    private boolean isError;
    
    // MOSTRAR TABLA DE ALUMNOS
    
    public void buscartablar (JTable tabla_alumno){
        clean();
        
        DefaultTableModel model=(DefaultTableModel)tabla_alumno.getModel();
        
        try{
            Connection con =DBConnection.getConexion();
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery("SELECT * FROM servicios_escolares.alumno");
            
            Object row[] =new Object[27];
            
            while (rs.next()){
                row[0]= rs.getString("matricula");
                row[1]= rs.getString("ciclo");
                row[2]= rs.getString("id_escuela_f");
                row[3]= rs.getString("id_carrera_f");
                row[4]= rs.getString("nombre");
                row[5]= rs.getString("id_gral");
                row[6]= rs.getString("id_estatus_f");
                row[7]=rs.getString("id_tipo_ingreso_f");
                row[8]=rs.getString("id_escuela_pro_f");
                row[9]=rs.getString("id_carrera_ingreso");
                row[10]=rs.getString("ciclo_ingreso");
                row[11]=rs.getString("domicilio");
                row[12]=rs.getString("codigo_postal");
                row[13]=rs.getString("pais");
                row[14]=rs.getString("estado");
                row[15]=rs.getString("telefono_part");
                row[16]=rs.getString("celular");
                row[17]=rs.getString("tel_emergencia");
                row[18]=rs.getString("correo_p");
                row[19]=rs.getString("correo_i");
                row[20]=rs.getString("promedio_esc_proc");
                row[21]=rs.getString("fecha_ingreso");
                row[22]=rs.getString("curp");
                row[23]=rs.getString("beca");
                row[24]=rs.getString("prom_general");
                row[25]=rs.getString("desc_ingreso");
                
                model.addRow(row);
            }
            
            tabla_alumno.setModel(model);
            
        }catch (Exception ex){
            
            JOptionPane.showMessageDialog(null, "No se pudo mostrar");
            this.error=ex.getMessage();
            this.isError=true;
        }
    }
    
    //Metodo para filtrar una busqueda por medio de la id.
    
    public void filtroAI( JTable  tabla_alumno, String AI){
        clean();
        
        DefaultTableModel model= (DefaultTableModel) tabla_alumno.getModel();
        
        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM servicios_escolares.alumno WHERE matricula LIKE '%"+ AI + "%'");
             
            Object row[]= new Object[27];
            
            while (rs.next()){
                row[0]= rs.getString("matricula");
                row[1]= rs.getString("ciclo");
                row[2]= rs.getString("id_escuela_f");
                row[3]= rs.getString("id_carrera_f");
                row[4]= rs.getString("nombre");
                row[5]= rs.getString("id_gral");
                row[6]= rs.getString("id_estatus_f");
                row[7]=rs.getString("id_tipo_ingreso_f");
                row[8]=rs.getString("id_escuela_pro_f");
                row[9]=rs.getString("id_carrera_ingreso");
                row[10]=rs.getString("ciclo_ingreso");
                row[11]=rs.getString("domicilio");
                row[12]=rs.getString("codigo_postal");
                row[13]=rs.getString("pais");
                row[14]=rs.getString("estado");
                row[15]=rs.getString("telefono_part");
                row[16]=rs.getString("celular");
                row[17]=rs.getString("tel_emergencia");
                row[18]=rs.getString("correo_p");
                row[19]=rs.getString("correo_i");
                row[20]=rs.getString("promedio_esc_proc");
                row[21]=rs.getString("fecha_ingreso");
                row[22]=rs.getString("curp");
                row[23]=rs.getString("beca");
                row[24]=rs.getString("prom_general");
                row[25]=rs.getString("desc_ingreso");
                
                model.addRow(row);
            }
            tabla_alumno.setModel(model);
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "No se puedo mostrar");
            this.error = ex.getMessage();
            this.isError= true;
        }
    }
    
    //Metodo para filtar la busqueda por medio del nombre para el registro de alumnos.
    public void filtrarNA (JTable tabla_alumno, String NA){
        clean();
        
        DefaultTableModel model = (DefaultTableModel) tabla_alumno.getModel();
        
        try{
            Connection con = DBConnection.getConexion();
            Statement st= con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM servicios_escolares.alumno WHERE nombre LIKE '%"+NA + "%'");
            
            Object row[]= new Object[27];
            
            while (rs.next()){
                row[0]= rs.getString("matricula");
                row[1]= rs.getString("ciclo");
                row[2]= rs.getString("id_escuela_f");
                row[3]= rs.getString("id_carrera_f");
                row[4]= rs.getString("nombre");
                row[5]= rs.getString("id_gral");
                row[6]= rs.getString("id_estatus_f");
                row[7]=rs.getString("id_tipo_ingreso_f");
                row[8]=rs.getString("id_escuela_pro_f");
                row[9]=rs.getString("id_carrera_ingreso");
                row[10]=rs.getString("ciclo_ingreso");
                row[11]=rs.getString("domicilio");
                row[12]=rs.getString("codigo_postal");
                row[13]=rs.getString("pais");
                row[14]=rs.getString("estado");
                row[15]=rs.getString("telefono_part");
                row[16]=rs.getString("celular");
                row[17]=rs.getString("tel_emergencia");
                row[18]=rs.getString("correo_p");
                row[19]=rs.getString("correo_i");
                row[20]=rs.getString("promedio_esc_proc");
                row[21]=rs.getString("fecha_ingreso");
                row[22]=rs.getString("curp");
                row[23]=rs.getString("beca");
                row[24]=rs.getString("prom_general");
                row[25]=rs.getString("desc_ingreso");
                
                model.addRow(row);
            }
            tabla_alumno.setModel(model);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se puedo mostrar.");
            this.error= ex.getMessage();
            this.isError= true;
            
        }
    }
    
    //Otro metodo para buscar los registro de la tabla por medio de la ID y del nombre 
    public RegistroAlumno buscar(String id ){
        RegistroAlumno c= null;
        clean();
        
        try{
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM servicios_escolares.alumno WHERE  matricula= '" + id +"';");
            rs.next();
            
            c= new RegistroAlumno();
            c.setMatricula(rs.getString("matricula"));
            c.setCiclo(rs.getString("ciclo"));
            c.setId_escuela_f(rs.getString("id_escuela_f"));
            c.setId_carrera_f(rs.getString("id_carrera_f"));
            c.setNombre(rs.getString("nombre"));
            c.setId_gral(rs.getString("id_gral"));
            c.setId_estatus_f(rs.getString("id_estatus_f"));
            c.setId_tipo_ingreso_f(rs.getString("id_tipo_ingreso_f"));
            c.setId_escuela_pro_f(rs.getString("id_escuela_pro_f"));
            c.setId_carrera_ingreso(rs.getString("id_carrera_ingreso"));
            c.setCiclo_ingreso(rs.getString("ciclo_ingreso"));
            c.setDomicilio(rs.getString("domicilio"));
            c.setCodigo_postal(rs.getString("codigo_postal"));
            c.setPais(rs.getString("pais"));
            c.setEstado(rs.getString("estado"));
            c.setTelefono_part(rs.getString("telefono_part"));
            c.setCelular(rs.getString("celular"));
            c.setTel_emergencia(rs.getString("tel_emergencia"));
            c.setCorreo_p(rs.getString("correo_p"));
            c.setCorreo_i(rs.getString("correo_i"));
            c.setPromedio_esc_proc(rs.getString("promedio_esc_proc"));
            c.setFecha_ingreso(rs.getString("fecha_ingreso"));
            c.setCurp(rs.getString("curp"));
            c.setBeca(rs.getString("beca"));
            c.setProm_general(rs.getString("prom_general"));
            c.setDesc_ingreso(rs.getString("desc_ingreso"));
            
        } catch (Exception ex){
            this.error= ex.getMessage();
            this.isError= true;
        }
        return c;
        
    }
    
    // ACTUALIZAR UN REGISTRO
    
    public int actualizar (RegistroAlumno e){
        int resultado=0;
        clean();
        
        try{
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            resultado = st.executeUpdate("UPDATE servicios_escolares.alumno SET matricula='" +e.getMatricula()+
                    "', ciclo='"+ e.getCiclo()+
                    "', id_escuela_f='"+ e.getId_escuela_f()+
                    "', id_carrera_f='" +e.getId_carrera_f()+
                    "', nombre='" +e.getNombre()+
                    "', id_gral='" +e.getId_gral()+
                    "', id_estatus_f='" +e.getId_estatus_f()+
                    "', id_tipo_ingreso_f='" +e.getId_tipo_ingreso_f()+
                    "', id_escuela_pro_f='" +e.getId_escuela_pro_f()+
                    "', id_carrera_ingreso='" +e.getId_carrera_ingreso()+
                    "', ciclo_ingreso='" +e.getCiclo_ingreso()+
                    "', domicilio='" +e.getDomicilio()+
                    "', codigo_postal='" +e.getCodigo_postal()+
                    "', pais='" +e.getPais()+
                    "', estado='" +e.getEstado()+
                    "', telefono_part='" +e.getTelefono_part()+
                    "', celular='" +e.getCelular()+
                    "', tel_emergencia='" +e.getTel_emergencia()+
                    "', correo_p='" +e.getCorreo_p()+
                    "', correo_i='" +e.getCorreo_i()+
                    "', promedio_esc_proc='" +e.getPromedio_esc_proc()+
                    "', fecha_ingreso='" +e.getFecha_ingreso()+
                    "', curp='" +e.getCurp()+
                    "', beca='" +e.getBeca()+
                    "', prom_general='" +e.getProm_general()+
                    "', desc_ingreso='" +e.getDesc_ingreso()+
                    "' WHERE matricula='"+ e.getMatricula()+"'");
            
        }catch (Exception ex){
            this.error=ex.getMessage();
            this.isError=true;
        }
        return resultado;
    }
    
    
    
            
    
    // AGREGAR UN REGISTRO 
    
    public int insertar(RegistroAlumno e){
        int resultado=0;
        clean();
        
        try{
            Connection con = DBConnection.getConexion();
            Statement st= con.createStatement();
            resultado = st.executeUpdate("INSERT INTO servicios_escolares.alumno VALUE('"+e.getMatricula()+"','"
                    +e.getCiclo()+"','"
                    +e.getId_escuela_f()+"','"
                    +e.getId_carrera_f()+"','"
                    + e.getNombre()+"','"
                    +e.getId_gral()+"','"
                    +e.getId_estatus_f()+"','"
                    +e.getId_tipo_ingreso_f()+"','"
                    +e.getId_escuela_pro_f()+"','"
                    +e.getId_carrera_ingreso()+"','"
                    +e.getCiclo_ingreso()+"','"
                    +e.getDomicilio()+"','"
                    +e.getCodigo_postal()+"','"
                    +e.getPais()+"','"
                    +e.getEstado()+"','"
                    +e.getTelefono_part()+"','"
                    +e.getCelular()+"','"
                    +e.getTel_emergencia()+"','"
                    +e.getCorreo_p()+"','"
                    +e.getCorreo_i()+"','"
                    +e.getPromedio_esc_proc()+"','"
                    +e.getFecha_ingreso()+"','"
                    +e.getCurp()+"','"
                    +e.getBeca()+"','"
                    +e.getProm_general()+"','"
                    +e.getDesc_ingreso()+"')");
            
        }catch (Exception ex){
            this.error=ex.getMessage();
            this.isError=true;
        }
        return resultado;
    }
    
    //eliminar registro
    
    public int eliminar (String matricula){
        int resultado = 0;
        clean();
        try{
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            resultado = st.executeUpdate("DELETE FROM alumno WHERE matricula='"+matricula+"';");
            
        }catch (Exception ex){
            this.error= ex.getMessage();
            this.isError=true;
        }
        
        
        return resultado;
    }
   
    
    
    public void clean(){
        this.error="";
        this.isError=false;
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
