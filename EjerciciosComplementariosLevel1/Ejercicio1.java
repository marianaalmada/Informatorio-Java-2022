package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        System.out.println("Ingrese su nombre: ");
        Scanner input = new Scanner(System.in);
        String nombre = input.next();

        saludarUsuario(nombre);
        
        input.close();
    }

    public static void saludarUsuario(String nombre) {
        System.out.println("HOLA " + nombre);
    }
}