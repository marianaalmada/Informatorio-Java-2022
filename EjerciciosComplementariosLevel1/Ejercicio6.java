package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
    
        System.out.println("Ingrese dos números");

        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        int exp = input.nextInt();

        System.out.println(multiplicacion(base, exp));

        input.close();
    }

    public static int multiplicacion(int base, int exp) {
        if (exp == 0)
            return 1;
        else
            return base * multiplicacion(base, exp - 1);
    }
}