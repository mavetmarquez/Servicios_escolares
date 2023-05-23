/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dto;

/**
 *
 * @author jotruvel
 */
public final class Empleados {


    private String id_empleado;
    private String nombre;
    private String puesto;
    private String contraseña;
    private String contraseña2;
    
    public Empleados (){
        
    }

    public Empleados(String id_empleado, String nombre, String puesto, String contraseña, String contraseña2) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.puesto = puesto;
        this.contraseña = contraseña;
        this.contraseña2 = contraseña2;
    }

    public String getId_empleado() {
        return id_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getContraseña2() {
        return contraseña2;
    }

    public void setId_empleado(String id_empleado) {
        this.id_empleado = id_empleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setContraseña2(String contraseña2) {
        this.contraseña2 = contraseña2;
    }


}
