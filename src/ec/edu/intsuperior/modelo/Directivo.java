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
public class Directivo {
   
    public enum Categoria{CategoriaA, CategoriaB, CategoriaC, CategoriaD}
    private Categoria categoria;
    
    public Directivo(){
        
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "las categorias son :\n"
                +"Categoria"+getCategoria()+"\n";
         
                }
    
    
    
}
