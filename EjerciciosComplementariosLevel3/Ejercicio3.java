package EjerciciosComplementariosLevel3;

import java.util.List;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl",
                "Wonder Woman", "brainiac");

        Long palabrasStream = palabras.stream()
                .filter(palabra -> palabra.substring(0, 1).equalsIgnoreCase("b"))
                .count();

        System.out.println(palabrasStream);
    }

}

