/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dto;

/**
 *
 * @author jotruvel
 */
public class Tramites_certificaciones_envio {
    
    private String matricula;
    private String nombre;
    private String fecha_envio;
    private String observaciones;
    private String tipo_certificado;
    private String pago;
    private String ciclo_egreso;
   
    
    public Tramites_certificaciones_envio (){
        
    }

    public Tramites_certificaciones_envio(String matricula, String nombre, String fecha_envio, String observaciones, String tipo_certificado, String pago, String ciclo_egreso) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.fecha_envio = fecha_envio;
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

    public String getFecha_envio() {
        return fecha_envio;
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

    public void setFecha_envio(String fecha_envio) {
        this.fecha_envio = fecha_envio;
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
