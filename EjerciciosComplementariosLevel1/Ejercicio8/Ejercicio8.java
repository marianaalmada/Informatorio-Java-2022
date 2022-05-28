package EjerciciosComplementariosLevel1.Ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[] args) {
        
        System.out.println("Ingresar nombre completo");
        Scanner datos = new Scanner(System.in);
        String nombreCom = datos.nextLine();

        System.out.println("Ingresar edad");
        int edad = datos.nextInt();

        System.out.println("Ingresar direccion");
        String direccion = datos.nextLine();

        System.out.println("Ingresar ciudad");
        String ciudad = datos.nextLine();

        Persona persona = new Persona(nombreCom, edad, direccion, ciudad);

        System.out.println(persona);

        datos.close();
    }
}
