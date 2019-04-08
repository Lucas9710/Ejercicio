package ejercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeneradorDeAutos {

   private String descripcionDeAuto;

    public void generadorAutos() {

        Puertas auto1 = new Puertas("Peugeot", "206", 20000000, 4);
        Cilindrada auto2 = new Cilindrada("Honda", "Titan", 6000000, 125);
        Puertas auto3 = new Puertas("Peugeot", "208", 25000000, 5);
        Cilindrada auto4 = new Cilindrada("Yamaha", "YBR", 8050050, 160);

        ArrayList<Auto> list = new ArrayList<Auto>();

        list.add(auto1);
        list.add(auto2);
        list.add(auto3);
        list.add(auto4);
        this.descripcionDeAuto = generarListaAutos(list);
    }

    private String generarListaAutos(List<Auto> autoList) {
        //imprimir el listado completo de productos
        String textoCompleto = "";
        for (Auto eachAuto : autoList) {
            String descripcion = eachAuto.toString();
            textoCompleto += descripcion + "\n";
        }

        textoCompleto += "=============================\n";

        //ordenar el array en función del precio
        Collections.sort(autoList);
        Auto primerAuto = autoList.get(0);
        Auto ultimoAuto = autoList.get(autoList.size() - 1);
       
        String comparadorDescripcion = "Vehículo más caro: " + ultimoAuto.nombre + ultimoAuto.modelo + "\n" + "Vehículo más barato: " + primerAuto.nombre + primerAuto.modelo;
            
        textoCompleto += comparadorDescripcion;

        return textoCompleto;
    }

    @Override
    public String toString() {
        return descripcionDeAuto;
    }

}
