/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dto;

/**
 *
 * @author jotruvel
 */
public class Tramites_titulacion_recepcion {
    private String matricula;
    private String nombre;
    private String fecha_recepcion;
    private String observaciones;
    private String tipo_certificado;
    private String pago;
    private String ciclo_egreso;
    private String egel;
    private String medio_titulación;
    private String registro;
    
    public Tramites_titulacion_recepcion (){
        
    }

    public Tramites_titulacion_recepcion(String matricula, String nombre, String fecha_recepcion, String observaciones, String tipo_certificado, String pago, String ciclo_egreso, String egel, String medio_titulación) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.fecha_recepcion = fecha_recepcion;
        this.observaciones = observaciones;
        this.tipo_certificado = tipo_certificado;
        this.pago = pago;
        this.ciclo_egreso = ciclo_egreso;
        this.egel = egel;
        this.medio_titulación = medio_titulación;
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

    public String getEgel() {
        return egel;
    }

    public void setEgel(String egel) {
        this.egel = egel;
    }

    public String getMedio_titulación() {
        return medio_titulación;
    }

    public void setMedio_titulación(String medio_titulación) {
        this.medio_titulación = medio_titulación;
    }

   
    
    
}
