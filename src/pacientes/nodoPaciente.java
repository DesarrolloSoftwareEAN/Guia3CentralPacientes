package pacientes;

public class nodoPaciente {
    Paciente paciente;
    nodoPaciente siguiente;

    public nodoPaciente(Paciente paciente) {
        this.paciente = paciente;
        this.siguiente = null;
    }

}
