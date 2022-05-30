package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio9 {
    
    public static void main(String[] args) {
        
        System.out.println("Ingresar texto");
        Scanner input = new Scanner(System.in);
        String texto = input.next();

        System.out.println(contarLetra(texto, "a"));

        input.close();
    }

    public static int contarLetra(String texto, String letra) {

        char[] cadena = texto.toCharArray();
        int letr = 0;

        for (char letras : cadena) {
            if (letras == letra.charAt(0)) {
                letr++;
            }
        }

        return letr;
    }

}
