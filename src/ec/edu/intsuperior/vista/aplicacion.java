/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Cliente;
import ec.edu.intsuperior.modelo.Empleado;
import ec.edu.intsuperior.modelo.Empresa;
import ec.edu.intsuperior.modelo.Persona;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class aplicacion {
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
         Persona p1= new Cliente();
         
         p1.setNombre1(JOptionPane.showInputDialog("Ingrese el primer nombre "));
         p1.setNombre2(JOptionPane.showInputDialog("Ingrese el segundo nombre"));
         p1.setApellido1(JOptionPane.showInputDialog("Ingrese le primer apellido"));
         p1.setApellio2(JOptionPane.showInputDialog("Ingrese el segundo apellido"));
         p1.setCedula(JOptionPane.showInputDialog("Ingrese el numero de cedula"));
         p1.setCedula(JOptionPane.showInputDialog("Ingrese la direccion"));
         p1.setCedula(JOptionPane.showInputDialog("Ingrese el numero de contacto"));
         p1.setCorreo(JOptionPane.showInputDialog("Ingrese el correo"));
         
         JOptionPane.showInputDialog(null,p1.toString());
         
         Persona p2= new Empleado();
         p2.setNombre1(JOptionPane.showInputDialog("Ingrese el primer nombre del Empleado "));
         p2.setNombre2(JOptionPane.showInputDialog("Ingrese el segundo nombre del Empleado"));
         p2.setApellido1(JOptionPane.showInputDialog("Ingrese le primer apellido del Empleado"));
         p2.setApellio2(JOptionPane.showInputDialog("Ingese el segundo apellido de Empleado"));
         p2.setCedula(JOptionPane.showInputDialog("Ingese el numero de cedula del Empleado"));
         p2.setCedula(JOptionPane.showInputDialog("Ingese la direccion del Empleado"));
         p2.setCedula(JOptionPane.showInputDialog("Calcule el sueldo bruto del Empleado"));
         p2.setCorreo(JOptionPane.showInputDialog("Ingrese el correo del Empleado"));
         
         JOptionPane.showInputDialog(null,p2.toString());
         
        Empresa empresa=new Empresa();
        
         
        
        
        
        
       
         
         
         
         
         
         
         
         
         
    }
}
