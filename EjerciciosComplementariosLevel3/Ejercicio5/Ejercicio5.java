package EjerciciosComplementariosLevel3.Ejercicio5;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio5 {
    
    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("Mariana", "Almada", LocalDate.of(2002, 2, 12));
        Alumno alumno2 = new Alumno("Camila", "Soto", LocalDate.of(2002, 5, 12));
        Alumno alumno3 = new Alumno("Abigail", "Sanchez", LocalDate.of(2002, 4, 21));
        Alumno alumno4 = new Alumno("Hector", "Alvarez", LocalDate.of(2000, 9, 8));
        Alumno alumno5 = new Alumno("Antonella", "Pelozo", LocalDate.of(1999, 7, 20));
        
        List<Alumno> alumnos = List.of(alumno1, alumno2, alumno3, alumno4, alumno5);

        Map<String, Integer> alumnosStream = alumnos.stream()
                .collect(Collectors.toMap(alumno -> alumno.getNombre() + " " + alumno.getApellido(), 
                alumno -> alumno.getEdad()));

        System.out.println(alumnosStream);
    }
}
