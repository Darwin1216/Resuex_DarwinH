/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author Usuario
 */
public class Empresa {
    private String nombre;
    private String direccion;
    private String telfono;
    private String rut;
    private String contacto;
    private String correo;
    private String pais;
    private String region;
    
    public Empresa(){
        
    }

    public Empresa(String nombre, String direccion, String telfono, String rut, String contacto, String correo, String pais, String region) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telfono = telfono;
        this.rut = rut;
        this.contacto = contacto;
        this.correo = correo;
        this.pais = pais;
        this.region = region;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setTelfono(String telfono) {
        this.telfono = telfono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelfono() {
        return telfono;
    }

    public String getRut() {
        return rut;
    }

    public String getContacto() {
        return contacto;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPais() {
        return pais;
    }

    public String getRegion() {
        return region;
    }

    @Override
    public String toString() {
        return "los datos de la empresa son:\n"
                +"Nombre: "+getNombre()+"\n"
                +"Direccion: "+getDireccion()+"\n"
                +"Telefono: "+getTelfono()+"\n"
                +"Rut: "+getRut()+"\n"
                +"Contacto: "+getContacto()+"\n"
                +"Correo: "+getCorreo()+"\n"
                +"Pais: "+getPais()+"\n"
                +"Region: "+getRegion()+"\n";
        
    }
        
    
    
   
}
