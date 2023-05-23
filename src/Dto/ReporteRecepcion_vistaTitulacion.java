/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dto;

/**
 *
 * @author jotruvel
 */
public class ReporteRecepcion_vistaTitulacion {
    
    private String matricula;
    private String nombre;
    private String fecha_recepcion;
    private String observaciones;
    private String tipo_certificado;
    private String pago;
    private String ciclo_egreso;
    private String nombre_escuela;
    private String nombre_carrera;
    private String nombre_escuela_p;
    private String ciclo_ingreso;
    private String curp;
    private String fecha_recepcion_de;
    private String fecha_recepcion_hasta;
    
    public ReporteRecepcion_vistaTitulacion(){
        
    }

    public ReporteRecepcion_vistaTitulacion(String matricula, String nombre, String fecha_recepcion, String observaciones, String tipo_certificado, String pago, String ciclo_egreso, String nombre_escuela, String nombre_carrera, String nombre_escuela_p, String ciclo_ingreso, String curp, String fecha_recepcion_de, String fecha_recepcion_hasta) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.fecha_recepcion = fecha_recepcion;
        this.observaciones = observaciones;
        this.tipo_certificado = tipo_certificado;
        this.pago = pago;
        this.ciclo_egreso = ciclo_egreso;
        this.nombre_escuela = nombre_escuela;
        this.nombre_carrera = nombre_carrera;
        this.nombre_escuela_p = nombre_escuela_p;
        this.ciclo_ingreso = ciclo_ingreso;
        this.curp = curp;
        this.fecha_recepcion_de = fecha_recepcion_de;
        this.fecha_recepcion_hasta = fecha_recepcion_hasta;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_recepcion() {
        return fecha_recepcion;
    }

    public void setFecha_recepcion(String fecha_recepcion) {
        this.fecha_recepcion = fecha_recepcion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getTipo_certificado() {
        return tipo_certificado;
    }

    public void setTipo_certificado(String tipo_certificado) {
        this.tipo_certificado = tipo_certificado;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public String getCiclo_egreso() {
        return ciclo_egreso;
    }

    public void setCiclo_egreso(String ciclo_egreso) {
        this.ciclo_egreso = ciclo_egreso;
    }

    public String getNombre_escuela() {
        return nombre_escuela;
    }

    public void setNombre_escuela(String nombre_escuela) {
        this.nombre_escuela = nombre_escuela;
    }

    public String getNombre_carrera() {
        return nombre_carrera;
    }

    public void setNombre_carrera(String nombre_carrera) {
        this.nombre_carrera = nombre_carrera;
    }

    public String getNombre_escuela_p() {
        return nombre_escuela_p;
    }

    public void setNombre_escuela_p(String nombre_escuela_p) {
        this.nombre_escuela_p = nombre_escuela_p;
    }

    public String getCiclo_ingreso() {
        return ciclo_ingreso;
    }

    public void setCiclo_ingreso(String ciclo_ingreso) {
        this.ciclo_ingreso = ciclo_ingreso;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getFecha_recepcion_de() {
        return fecha_recepcion_de;
    }

    public void setFecha_recepcion_de(String fecha_recepcion_de) {
        this.fecha_recepcion_de = fecha_recepcion_de;
    }

    public String getFecha_recepcion_hasta() {
        return fecha_recepcion_hasta;
    }

    public void setFecha_recepcion_hasta(String fecha_recepcion_hasta) {
        this.fecha_recepcion_hasta = fecha_recepcion_hasta;
    }
    
    
    
}
