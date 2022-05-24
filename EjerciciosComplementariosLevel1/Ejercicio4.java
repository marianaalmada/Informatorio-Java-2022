package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {

        System.out.println("Ingrese un número");

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.println(String.format("El factorial de %s es: %s", num, factorial(num)));

        input.close();
    }

    public static int factorial(int numero) {
        if (numero == 0) {
            return 1;
        }
        return numero * factorial(numero - 1);
    }
}