package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(7);
        numeros.add(15);
        numeros.add(20);
        numeros.add(11);

        List<Integer> nuevosNumeros = new ArrayList<>();
        nuevosNumeros.addAll(numeros);
        nuevosNumeros.add(0, 5);
        nuevosNumeros.add(6, 2);

        for (Integer numero : nuevosNumeros) {
            System.out.println(numero);
        }

        System.out.println("Tamaño antes: " + numeros.size());
        System.out.println("Tamaño después: " + nuevosNumeros.size());
    }
}
