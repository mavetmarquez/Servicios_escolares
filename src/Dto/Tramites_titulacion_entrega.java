/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dto;

/**
 *
 * @author jotruvel
 */
public class Tramites_titulacion_entrega {
    
    private String matricula;
    private String nombre;
    private String fecha_entrega;
    private String observaciones;
    private String tipo_certificado;
    private String pago;
    private String ciclo_egreso;
    private String egel;
    private String medio_titulación;
    
    public Tramites_titulacion_entrega(){
        
    }

    public Tramites_titulacion_entrega(String matricula, String nombre, String fecha_entrega, String observaciones, String tipo_certificado, String pago, String ciclo_egreso, String egel, String medio_titulación) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.fecha_entrega = fecha_entrega;
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

    public String getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(String fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
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
