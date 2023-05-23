/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dto;

import java.util.logging.Logger;

/**
 *
 * @author jotruvel
 */
public class Tramites_certificaciones_recepcion {
    
    private String matricula;
    private String nombre;
    private String fecha_recepcion;
    private String observaciones;
    private String tipo_certificado;
    private String pago;
    private String ciclo_egreso;
    
    public Tramites_certificaciones_recepcion(){
    
    }

    public Tramites_certificaciones_recepcion(String matricula, String nombre, String fecha_recepcion, String observaciones, String tipo_certificado, String pago, String ciclo_egreso) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.fecha_recepcion = fecha_recepcion;
        this.observaciones = observaciones;
        this.tipo_certificado = tipo_certificado;
        this.pago = pago;
        this.ciclo_egreso = ciclo_egreso;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha_recepcion() {
        return fecha_recepcion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public String getTipo_certificado() {
        return tipo_certificado;
    }

    public String getPago() {
        return pago;
    }

    public String getCiclo_egreso() {
        return ciclo_egreso;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha_recepcion(String fecha_recepcion) {
        this.fecha_recepcion = fecha_recepcion;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public void setTipo_certificado(String tipo_certificado) {
        this.tipo_certificado = tipo_certificado;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public void setCiclo_egreso(String ciclo_egreso) {
        this.ciclo_egreso = ciclo_egreso;
    }
   
    

    
    

    
    
}
