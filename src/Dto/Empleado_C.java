/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dto;

/**
 *
 * @author jotruvel
 */
public  final class Empleado_C {
    
    private String id_empleadoa;
    private String nombrea;
    private String puestoa;
    private String contraseñaa;
    private String contraseña2a;
    
    public Empleado_C(){
        
    }
    
    public Empleado_C(String id_empleadoa, String nombrea, String puestoa, String contraseñaa, String contraseña2a){
        this.id_empleadoa=id_empleadoa;
        this.nombrea=nombrea;
        this.puestoa=puestoa;
        this.contraseñaa=contraseñaa;
        this.contraseña2a=contraseña2a;
    }

    public String getId_empleadoa() {
        return id_empleadoa;
    }

    public String getNombrea() {
        return nombrea;
    }

    public String getPuestoa() {
        return puestoa;
    }

    public String getContraseñaa() {
        return contraseñaa;
    }

    public String getContraseña2a() {
        return contraseña2a;
    }

    public void setId_empleadoa(String id_empleadoa) {
        this.id_empleadoa = id_empleadoa;
    }

    public void setNombrea(String nombrea) {
        this.nombrea = nombrea;
    }

    public void setPuestoa(String puestoa) {
        this.puestoa = puestoa;
    }

    public void setContraseñaa(String contraseñaa) {
        this.contraseñaa = contraseñaa;
    }

    public void setContraseña2a(String contraseña2a) {
        this.contraseña2a = contraseña2a;
    }
    
    
    
            
    
}
