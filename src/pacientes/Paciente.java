package pacientes;

public class Paciente {
    private String nombre;
    private int id;
    private int edad;
    private String clinicaDondeRecibeAtencion;

    public Paciente(String nombre,int id,int edad,String clinicaDondeRecibeAtencion) {
        this.nombre =nombre;
        this.id = id;
        this.edad = edad;
        this.clinicaDondeRecibeAtencion = clinicaDondeRecibeAtencion;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getClinicaDondeRecibeAtencion() {
        return clinicaDondeRecibeAtencion;
    }

    public void setClinicaDondeRecibeAtencion(String clinicaDondeRecibeAtencion) {
        this.clinicaDondeRecibeAtencion = clinicaDondeRecibeAtencion;
    }

    public String toString() {
        return "ID " + id + " |Nombre: " + nombre + " |edad: " + edad + " |Clinica:  " + clinicaDondeRecibeAtencion;
    }

}
