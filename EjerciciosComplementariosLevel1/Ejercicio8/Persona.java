package EjerciciosComplementariosLevel1.Ejercicio8;

public class Persona {
    String nombreCompleto;
    int edad;
    String direccion;
    String ciudad;

    public Persona(String nombreCompleto, int edad, String direccion, String ciudad) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return ciudad + " - " + direccion + " - " + edad + " - "
                + nombreCompleto;
    }

}
