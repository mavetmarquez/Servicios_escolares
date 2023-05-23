/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dto;

/**
 *
 * @author jotruvel
 */
public final class IngresoGeneral {
    private String id_ingreso_gral;
    private String ingreso_gral;
    
    public IngresoGeneral(){
        
    }
    
    public IngresoGeneral(String id_ingreso_gral, String ingreso_gral){
        this.id_ingreso_gral= id_ingreso_gral;
        this.ingreso_gral= ingreso_gral;
    }

    public String getId_ingreso_gral() {
        return id_ingreso_gral;
    }

    public String getIngreso_gral() {
        return ingreso_gral;
    }

    public void setId_ingreso_gral(String id_ingreso_gral) {
        this.id_ingreso_gral = id_ingreso_gral;
    }

    public void setIngreso_gral(String ingreso_gral) {
        this.ingreso_gral = ingreso_gral;
    }
    
    
}
