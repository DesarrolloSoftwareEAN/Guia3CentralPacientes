package modelos;

public class Paciente {
    private String nombre;
    private int id;
    private int edad;
    private String clinica;

    public Paciente(String nombre, int id, int edad, String clinica) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.clinica = clinica;
    }

    public String getNombre() { return nombre; }
    public int getId() { return id; }
    public int getEdad() { return edad; }
    public String getClinica() { return clinica; }

    @Override
    public String toString() {
        return "ID: " + id + " | Nombre: " + nombre + " | Edad: " + edad + " | Clínica: " + clinica;
    }
}
