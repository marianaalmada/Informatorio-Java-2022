package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> horasTrabajadas = new ArrayList<>(List.of(6, 7, 8, 4, 5));
        ArrayList<Integer> valorXHora = new ArrayList<>(List.of(350, 345, 550, 600, 320));

        calcularMontoTotal(horasTrabajadas, valorXHora);
    }

    public static void calcularMontoTotal(ArrayList<Integer> horas, ArrayList<Integer> valor) {
        List<Integer> totalXDia = new ArrayList<>();
        int cont = 0;
        int resultado;

        for (int hora : horas) {
            resultado = hora * valor.get(cont);
            totalXDia.add(resultado);
            cont++;
        }

        int suma = 0;
        
        for (Integer monto : totalXDia) {
            suma = suma + monto;
        }

        System.out.println(totalXDia);
        System.out.println("Total Final: $" + suma);
    }
}