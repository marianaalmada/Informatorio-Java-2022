package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String[] args) {

        System.out.print("Ingresar texto: ");

        Scanner input = new Scanner(System.in);
        String texto = input.nextLine();;

        char[] textoChar = texto.toCharArray();

        for (int i = 0; i < textoChar.length; i++) {
            if (textoChar[i] >= 'a' && textoChar[i] <= 'z') {
                textoChar[i] = (char) (textoChar[i] - 32);
            }

        }
        for (int i = 0; i < textoChar.length; i++) {
            System.out.print(textoChar[i]);
        }

        input.close();
    }
}
