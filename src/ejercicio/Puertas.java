/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author Invitado1
 */
public class Puertas extends Auto{
    
    int puertas;
    
    public Puertas(String nombre, String modelo, double precio, int puertas) {
        super(nombre, modelo, precio);
        this.puertas = puertas;
    }
    
      @Override
    public String toString(){
       
       String descripcion = "Marca: " + this.nombre + " // " + "Modelo: " + this.modelo + " // Puertas: " + this.puertas + " // Precio: " + agregarPrecio()  ;
    
       return descripcion;
     }
}
