/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dto;

/**
 *
 * @author jotruvel
 */
public final class EscuelasProcedencia {
    
    private String id_escuela;
    private String nombre_escuela_p;
    
    public EscuelasProcedencia(){
        
    }

    public EscuelasProcedencia(String id_escuela, String nombre_escuela_p) {
        this.id_escuela = id_escuela;
        this.nombre_escuela_p = nombre_escuela_p;
    }

    public String getId_escuela() {
        return id_escuela;
    }

    public String getNombre_escuela_p() {
        return nombre_escuela_p;
    }

    public void setId_escuela(String id_escuela) {
        this.id_escuela = id_escuela;
    }

    public void setNombre_escuela_p(String nombre_escuela_p) {
        this.nombre_escuela_p = nombre_escuela_p;
    }
    
    
    
}
