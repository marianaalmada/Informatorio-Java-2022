package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        System.out.println("Ingrese dos números:");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        
        numerosOperaciones(num1, num2);

        input.close();
    }

    public static void numerosOperaciones (int num1, int num2) {
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;
        int modulo = num1 % num2;
        System.out.println(String.format("%s + %s = %s", num1, num2, suma));
        System.out.println(String.format("%s - %s = %s", num1, num2, resta));
        System.out.println(String.format("%s * %s = %s", num1, num2, multiplicacion));
        System.out.println(String.format("%s / %s = %s", num1, num2, division));
        System.out.println(String.format("%s %% %s = %s", num1, num2, modulo));
    }

}
