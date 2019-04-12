package ejercicio;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class GeneradorDeAutos  {
    
    private String descripcionDeAuto ;

       public void generadorAutos() {

        Puertas auto1 = new Puertas("Peugeot", "206", 200000, 4);
        Cilindrada auto2 = new Cilindrada("Honda", "Titan", 60000, 125);
        Puertas auto3 = new Puertas("Peugeot", "208", 250000, 5);
        Cilindrada auto4 = new Cilindrada("Yamaha", "YBR", 80500.50, 160);

        ArrayList<Auto> list = new ArrayList<Auto>();

        list.add(auto1);
        list.add(auto2);
        list.add(auto3);
        list.add(auto4);
        
        this.descripcionDeAuto = generarDescripcion(list);
    }

    private String generarDescripcion(List<Auto> autoList){
        //imprimir el listado completo de productos
        String textoCompleto = "";
        for (Auto eachAuto : autoList) {
            String descripcion = eachAuto.toString();
            textoCompleto += descripcion + "\n";
        }

        textoCompleto += "=============================\n";
      
         Collections.sort(autoList);
        Auto primerAuto = autoList.get(0);
        Auto ultimoAuto = autoList.get(autoList.size()-1);
        Auto segundoAuto = autoList.get(autoList.size()-2);
        Auto tercerAuto = autoList.get(autoList.size()-3);
        
        Auto autoConLetra = null;
        for (Auto auto : autoList) {
            if (auto.modelo.contains("Y")) {
                autoConLetra = auto;
            }   
        }

            
        
        String comparatorDescription = "Producto más caro: " + ultimoAuto.nombre + " " +ultimoAuto.modelo +"\n" + 
                "Producto más barato: " + primerAuto.nombre + " " +primerAuto.modelo + "\n" + 
                "Vehículo que contiene en el modelo la letra ‘Y’: " + autoConLetra.nombre + " " 
                + autoConLetra.modelo + " " + autoConLetra.precioFormatted() + 
                "\n" +"=============================\n" +
               "Vehículos ordenados por precio de mayor a menor: " + "\n" + ultimoAuto.nombre + " " +ultimoAuto.modelo +"\n" + segundoAuto.nombre + " " + segundoAuto.modelo  
                + "\n" + tercerAuto.nombre + " " + tercerAuto.modelo + "\n" + primerAuto.nombre + " " + primerAuto.modelo ;

        textoCompleto += comparatorDescription;
        
       return textoCompleto;
   
        }
    

    
    @Override
    public String toString() {
        return descripcionDeAuto;
    }

}
