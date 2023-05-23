/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dto;

/**
 *
 * @author jotruvel
 */
public final class EscuelasUnitec {
    
    private String id_escuela;
    private String nombre_escuela;
    
    public EscuelasUnitec(){
    
    }

    public EscuelasUnitec(String id_escuela, String nombre_escuela) {
        this.id_escuela = id_escuela;
        this.nombre_escuela = nombre_escuela;
    }

    public String getId_escuela() {
        return id_escuela;
    }

    public String getNombre_escuela() {
        return nombre_escuela;
    }

    public void setId_escuela(String id_escuela) {
        this.id_escuela = id_escuela;
    }

    public void setNombre_escuela(String nombre_escuela) {
        this.nombre_escuela = nombre_escuela;
    }
      
    
    
}
