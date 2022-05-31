import java.util.List;
import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String args[]) {
      
     List<String> ciudades = new ArrayList<>();
     
     ciudades.add("Buenos Aires");
     ciudades.add("Corrientes");
     ciudades.add("Resistencia");

    System.out.println("#1 - " + ciudades.get(0));
    System.out.println("#2 - " + ciudades.get(1));
    System.out.println("#3 - " + ciudades.get(2));
    }
}