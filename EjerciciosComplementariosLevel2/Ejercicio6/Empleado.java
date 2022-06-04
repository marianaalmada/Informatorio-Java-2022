package Ejercicio6;

public class Empleado {
    private String nomYApe;
    private long dni;
    private double horasTrabajadas;
    private double valorPorHora;

    public Empleado(String nomYApe, long dni, double horasTrabajadas, double valorPorHora) {
        this.nomYApe = nomYApe;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    public String getNomYApe() {
        return nomYApe;
    }
    public void setNomYApe(String nomYApe) {
        this.nomYApe = nomYApe;
    }
    public long getDni() {
        return dni;
    }
    public void setDni(long dni) {
        this.dni = dni;
    }
    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    public double getValorPorHora() {
        return valorPorHora;
    }
    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public double calcularSueldo() {
        return horasTrabajadas * valorPorHora;
    }

    @Override
    public String toString() {
        return "Empleado [dni=" + dni + ", horasTrabajadas=" + horasTrabajadas + ", nomYApe=" + nomYApe
                + ", valorPorHora=" + valorPorHora + "]";
    }
}
