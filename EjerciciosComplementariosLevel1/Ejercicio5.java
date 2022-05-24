package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        System.out.println("Ingrese un número");

        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int resultado = num1;
        int i = 1;

        while (i < num2) {
            i++;
            resultado = resultado + num1;
        }

        System.out.println(String.format("%s x %s = %s", num1, num2, resultado));

        input.close();
    }
}
