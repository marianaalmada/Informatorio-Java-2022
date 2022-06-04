package EjerciciosComplementariosLevel2.Ejercicio6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Juan Suarez", 58438936, 40, 1500);
        Empleado empleado2 = new Empleado("Lina Gonzalez", 84602856, 35, 1500);
        Empleado empleado3 = new Empleado("Alenjandro Perez", 26475986, 45, 1500);
        Empleado empleado4 = new Empleado("Cristian Cardozo", 58360837, 37, 1500);
        Empleado empleado5 = new Empleado("Julieta Martinez", 34097581, 30, 1500);

        Set<Empleado> empleados = new HashSet<>();
        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);
        empleados.add(empleado4);
        empleados.add(empleado5);

        Map<Long, Double> empleadoSueldo = new HashMap<>();

        for (Empleado empleado : empleados) {
            empleadoSueldo.put(empleado.getDni(), empleado.calcularSueldo());
        }

        System.out.println(empleadoSueldo);
    }

}
