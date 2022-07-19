/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

import java.util.Date;
import java.util.HashSet;

/**
 *
 * @author Usuario
 */ 
public class Empleado extends Persona{
   String sueldobruto;
   
   HashSet<Directivo>directivo=new HashSet<Directivo>();

    public Empleado() {
    }

    public Empleado(String sueldobruto, String Cedula, String nombre1, String nombre2, String apellido1, String apellio2, String telefono, String correo, Date fechadenacimiento) {
        super(Cedula, nombre1, nombre2, apellido1, apellio2, telefono, correo, fechadenacimiento);
        this.sueldobruto = sueldobruto;
    }

    public void setDirectivo(HashSet<Directivo> directivo) {
        this.directivo = directivo;
    }
    

    public void setSueldobruto(String sueldobruto) {
        this.sueldobruto = sueldobruto;
    }

    public HashSet<Directivo> getDirectivo() {
        return directivo;
    }
    

    public String getSueldobruto() {
        return sueldobruto;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"
                +"Directivo"+getDirectivo()+"\n"
                +"SueldoBruto: "+getSueldobruto(); //To change body of generated methods, choose Tools | Templates.
    }
   

}
