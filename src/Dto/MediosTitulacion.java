/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dto;

/**
 *
 * @author jotruvel
 */
public final class MediosTitulacion {
    private String id_medio_titulacion;
    private String medio_titulacion;
    
    public MediosTitulacion (){
        
    }

    public MediosTitulacion(String id_medio_titulacion, String medio_titulacion) {
        this.id_medio_titulacion = id_medio_titulacion;
        this.medio_titulacion = medio_titulacion;
    }

    public String getId_medio_titulacion() {
        return id_medio_titulacion;
    }

    public String getMedio_titulacion() {
        return medio_titulacion;
    }

    public void setId_medio_titulacion(String id_medio_titulacion) {
        this.id_medio_titulacion = id_medio_titulacion;
    }

    public void setMedio_titulacion(String medio_titulacion) {
        this.medio_titulacion = medio_titulacion;
    }
    
    
    
    
    
}
