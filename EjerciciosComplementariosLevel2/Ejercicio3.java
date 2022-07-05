package EjerciciosComplementariosLevel2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Ejercicio3 {

    public static void main(String[] args) {

        List<String> numerosCartas = new ArrayList<>();
        numerosCartas.add("A");
        numerosCartas.add("2");
        numerosCartas.add("3");
        numerosCartas.add("4");
        numerosCartas.add("5");
        numerosCartas.add("6");
        numerosCartas.add("7");
        numerosCartas.add("8");
        numerosCartas.add("9");
        numerosCartas.add("10");
        numerosCartas.add("J");
        numerosCartas.add("Q");
        numerosCartas.add("K");

        System.out.println(numerosCartas);

        Collections.reverse(numerosCartas);
        System.out.println(numerosCartas);

        Collections.shuffle(numerosCartas);
        System.out.println(numerosCartas);
    }
}
