/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dto;

/**
 *
 * @author jotruvel
 */
public final class Ingreso {

    private String id_ingreso;
    private String ingreso;

    public Ingreso() {

    }

    public Ingreso(String id_ingreso, String ingreso) {
        this.id_ingreso = id_ingreso;
        this.ingreso = ingreso;
    }

    public String getId_ingreso() {
        return id_ingreso;
    }

    public String getIngreso() {
        return ingreso;
    }

    public void setId_ingreso(String id_ingreso) {
        this.id_ingreso = id_ingreso;
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

}
