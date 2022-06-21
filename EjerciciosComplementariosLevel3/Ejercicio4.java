package EjerciciosComplementariosLevel3;

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        List<Integer> numeros = List.of(1, 2, 4, 4, 4);

        List<Integer> numerosStream = numeros.stream()
                .map(numero -> factorial(numero))
                .distinct()
                .collect(Collectors.toList());

        System.out.println(numerosStream);
    }

    public static int factorial(int numero) {
        if (numero == 0) {
            return 1;
        }
        return numero * factorial(numero - 1);
    }
}
