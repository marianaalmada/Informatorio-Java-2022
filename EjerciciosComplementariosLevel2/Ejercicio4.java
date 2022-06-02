import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        List<String> alumnos = new ArrayList<>(List.of("Mariana Almada", "Abigail Sanchez", 
                            "Camila Soto", "Hector Alvarez", "Antonella Pelozo", "San Jose Dominguez", 
                            "Micaela Diaz", "Mauricio Valenzuela", "Joaquín Duarte", "Esteban Gonzalez", 
                            "Juliana Prieto", "Andrea Suarez"));

        List<String> curso1 = new ArrayList<>();
        curso1 = alumnos.subList(0, 4);

        List<String> curso2 = new ArrayList<>();
        curso2 = alumnos.subList(4, 8);

        List<String> curso3 = new ArrayList<>();
        curso3 = alumnos.subList(8, 12);

        System.out.println("Curso 1: " + curso1);
        System.out.println("Curso 2: " + curso2);
        System.out.println("Curso 3: " + curso3);
    }
}