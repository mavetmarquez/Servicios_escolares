/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dto;

/**
 *
 * @author jotruvel
 */
public final class Estados {
    private String id_estado;
    private String estado;
    
    public Estados(){
    
    }
    
    public Estados(String id_estado, String estado){
        this.id_estado= id_estado;
        this.estado=estado;
        
    }

    public String getId_estado() {
        return id_estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setId_estado(String id_estado) {
        this.id_estado = id_estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
