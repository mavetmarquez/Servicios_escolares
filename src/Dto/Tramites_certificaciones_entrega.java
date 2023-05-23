/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dto;

/**
 *
 * @author jotruvel
 */
public class Tramites_certificaciones_entrega {
    private String matricula;
    private String nombre;
    private String fecha_entrega;
    private String observaciones;
    private String tipo_certificado;
    private String pago;
    private String ciclo_egreso;
    
    public Tramites_certificaciones_entrega (){
        
    }

    public Tramites_certificaciones_entrega(String matricula, String nombre, String fecha_entrega, String observaciones, String tipo_certificado, String pago, String ciclo_egreso) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.fecha_entrega = fecha_entrega;
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

    public String getFecha_entrega() {
        return fecha_entrega;
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

    public void setFecha_entrega(String fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
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
