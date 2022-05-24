package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        System.out.println("Ingrese un numero");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int cont = 1;
        while (cont <= num) {
            for (int i = 1; i <= cont; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            cont++;
        }

        input.close();
    }
}