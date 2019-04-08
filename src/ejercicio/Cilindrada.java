
package ejercicio;


public class Cilindrada extends Auto {
    
    int cilindrada;
    
    public Cilindrada(String nombre, String modelo, double precio, int cilindrada) {
        super(nombre, modelo, precio);
        this.cilindrada = cilindrada;
    }
    
     @Override
    public String toString(){
       
       String descripcion = "Marca: " + this.nombre + " // " + "Modelo: " + this.modelo + " // Cilindrada: " + this.cilindrada + "c // Precio: " + agregarPrecio() ;
    
       return descripcion;
     }

  

}
