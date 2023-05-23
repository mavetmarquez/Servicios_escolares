/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dto;

/**
 *
 * @author jotruvel
 */
public class RegistroAlumno {
    
     private String matricula;
     private String ciclo;
     private String id_escuela_f;
     private String id_carrera_f;
     private String nombre;
     private String id_gral;
     private String id_estatus_f;
     private String id_tipo_ingreso_f;
     private String id_escuela_pro_f;
     private String id_carrera_ingreso;
     private String ciclo_ingreso;
     private String domicilio;
     private String codigo_postal;
     private String pais;
     private String estado;
     private String telefono_part;
     private String celular;
     private String tel_emergencia;
     private String correo_p;
     private String correo_i;
     private String promedio_esc_proc;
     private String fecha_ingreso;
     private String curp;
     private String beca;
     private String prom_general;
     private String desc_ingreso;
     //Busqueda
     private String id;
     private String bnombre;
     
     public RegistroAlumno (){
         
     }

    public RegistroAlumno(String matricula, String ciclo, String id_escuela_f, String id_carrera_f, String nombre, String id_gral, String id_estatus_f, String id_tipo_ingreso_f, String id_escuela_pro_f, String id_carrera_ingreso, String ciclo_ingreso, String domicilio, String codigo_postal, String pais, String estado, String telefono_part, String celular, String tel_emergencia, String correo_p, String correo_i, String promedio_esc_proc, String fecha_ingreso, String curp, String beca, String prom_general, String desc_ingreso, String id, String bnombre) {
        this.matricula = matricula;
        this.ciclo = ciclo;
        this.id_escuela_f = id_escuela_f;
        this.id_carrera_f = id_carrera_f;
        this.nombre = nombre;
        this.id_gral = id_gral;
        this.id_estatus_f = id_estatus_f;
        this.id_tipo_ingreso_f = id_tipo_ingreso_f;
        this.id_escuela_pro_f = id_escuela_pro_f;
        this.id_carrera_ingreso = id_carrera_ingreso;
        this.ciclo_ingreso = ciclo_ingreso;
        this.domicilio = domicilio;
        this.codigo_postal = codigo_postal;
        this.pais = pais;
        this.estado = estado;
        this.telefono_part = telefono_part;
        this.celular = celular;
        this.tel_emergencia = tel_emergencia;
        this.correo_p = correo_p;
        this.correo_i = correo_i;
        this.promedio_esc_proc = promedio_esc_proc;
        this.fecha_ingreso = fecha_ingreso;
        this.curp = curp;
        this.beca = beca;
        this.prom_general = prom_general;
        this.desc_ingreso = desc_ingreso;
        this.id = id;
        this.bnombre = bnombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCiclo() {
        return ciclo;
    }

    public String getId_escuela_f() {
        return id_escuela_f;
    }

    public String getId_carrera_f() {
        return id_carrera_f;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId_gral() {
        return id_gral;
    }

    public String getId_estatus_f() {
        return id_estatus_f;
    }

    public String getId_tipo_ingreso_f() {
        return id_tipo_ingreso_f;
    }

    public String getId_escuela_pro_f() {
        return id_escuela_pro_f;
    }

    public String getId_carrera_ingreso() {
        return id_carrera_ingreso;
    }

    public String getCiclo_ingreso() {
        return ciclo_ingreso;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public String getPais() {
        return pais;
    }

    public String getEstado() {
        return estado;
    }

    public String getTelefono_part() {
        return telefono_part;
    }

    public String getCelular() {
        return celular;
    }

    public String getTel_emergencia() {
        return tel_emergencia;
    }

    public String getCorreo_p() {
        return correo_p;
    }

    public String getCorreo_i() {
        return correo_i;
    }

    public String getPromedio_esc_proc() {
        return promedio_esc_proc;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public String getCurp() {
        return curp;
    }

    public String getBeca() {
        return beca;
    }

    public String getProm_general() {
        return prom_general;
    }

    public String getDesc_ingreso() {
        return desc_ingreso;
    }

    public String getId() {
        return id;
    }

    public String getBnombre() {
        return bnombre;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public void setId_escuela_f(String id_escuela_f) {
        this.id_escuela_f = id_escuela_f;
    }

    public void setId_carrera_f(String id_carrera_f) {
        this.id_carrera_f = id_carrera_f;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId_gral(String id_gral) {
        this.id_gral = id_gral;
    }

    public void setId_estatus_f(String id_estatus_f) {
        this.id_estatus_f = id_estatus_f;
    }

    public void setId_tipo_ingreso_f(String id_tipo_ingreso_f) {
        this.id_tipo_ingreso_f = id_tipo_ingreso_f;
    }

    public void setId_escuela_pro_f(String id_escuela_pro_f) {
        this.id_escuela_pro_f = id_escuela_pro_f;
    }

    public void setId_carrera_ingreso(String id_carrera_ingreso) {
        this.id_carrera_ingreso = id_carrera_ingreso;
    }

    public void setCiclo_ingreso(String ciclo_ingreso) {
        this.ciclo_ingreso = ciclo_ingreso;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setTelefono_part(String telefono_part) {
        this.telefono_part = telefono_part;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setTel_emergencia(String tel_emergencia) {
        this.tel_emergencia = tel_emergencia;
    }

    public void setCorreo_p(String correo_p) {
        this.correo_p = correo_p;
    }

    public void setCorreo_i(String correo_i) {
        this.correo_i = correo_i;
    }

    public void setPromedio_esc_proc(String promedio_esc_proc) {
        this.promedio_esc_proc = promedio_esc_proc;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public void setBeca(String beca) {
        this.beca = beca;
    }

    public void setProm_general(String prom_general) {
        this.prom_general = prom_general;
    }

    public void setDesc_ingreso(String desc_ingreso) {
        this.desc_ingreso = desc_ingreso;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBnombre(String bnombre) {
        this.bnombre = bnombre;
    }

   
     
     
     
    
}
