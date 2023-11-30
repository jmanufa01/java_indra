package domain;

public class Usuario {
    private String nombre;
    private String apellido;
    private String ciudad;
    private int edad;

    public Usuario(String nombre, String apellido, String ciudad, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nApellido: " + apellido +
                "\nCiudad: " + ciudad +
                "\nEdad: " + edad + " años";
    }
}
