/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dto;

/**
 *
 * @author jotruvel
 */
public final class Pais {
    private String id_nacionalidad;
    private String pais;
    private String nacionalidad;
    
    public Pais (){
        
    }

    public Pais(String id_nacionalidad, String pais, String nacionalidad) {
        this.id_nacionalidad = id_nacionalidad;
        this.pais = pais;
        this.nacionalidad = nacionalidad;
    }

    public String getId_nacionalidad() {
        return id_nacionalidad;
    }

    public String getPais() {
        return pais;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setId_nacionalidad(String id_nacionalidad) {
        this.id_nacionalidad = id_nacionalidad;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
        
        
}
    

