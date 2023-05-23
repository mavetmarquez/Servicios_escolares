/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dto;

/**
 *
 * @author jotruvel
 */
public final class CarrerasUnitec {
    private String id_carrera;
    private String nombre;
    
    public CarrerasUnitec (){
        
    }
    
    // Constructor

    public CarrerasUnitec(String id_carrera, String nombre) {
        this.id_carrera = id_carrera;
        this.nombre = nombre;
    }
    
    // Setter y Getter

    public String getId_carrera() {
        return id_carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId_carrera(String id_carrera) {
        this.id_carrera = id_carrera;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
