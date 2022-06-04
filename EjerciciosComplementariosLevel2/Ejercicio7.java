package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio7 {

    public static void main(String[] args) {
        
        fizzBuzzFunction(1, 6);
        fizzBuzzFunction(1, 8);
    }

    public static void fizzBuzzFunction(int numMenor, int numMayor) {
        List<String> secuencia = new ArrayList<>();

        int cont = numMenor;

        while (cont < numMayor) {
            if (cont % 2 == 0 && cont % 3 == 0) {
                secuencia.add("FizzBuzz"); 
            } else if (cont % 2 == 0) {
                secuencia.add("Fizz"); 
            } else if (cont % 3 == 0) {
                secuencia.add("Buzz");
            } else {
                secuencia.add(String.valueOf(cont));
            }
            cont++;
        }
        System.out.println(secuencia);
    }
}