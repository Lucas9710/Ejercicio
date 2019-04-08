
package ejercicio;


public class Main{

    
    public static void main(String[] args) {
        GeneradorDeAutos autos = new GeneradorDeAutos();
        	autos.generadorAutos();
		String result = autos.toString();
		System.out.println(result);
		return;
    }
    
}
