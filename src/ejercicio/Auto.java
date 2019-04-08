
package ejercicio;

import java.text.DecimalFormat;


public class Auto {
    
    String nombre;
    String modelo;
    double precio;

    public Auto(String nombre, String modelo, double precio) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    @Override
    public String toString(){
       
       String descripcion = "Marca: " + this.nombre + " // " + "Modelo: " + this.modelo + " // Precio: " + agregarPrecio() ;
    
       return descripcion;
     }
    
        
    public String agregarPrecio(){
       
        
        String agregarString  = "$" + String.format("%.0f", precio)  ;
        return agregarString;
    }
 }