package pacientes;

public class ListaPacientes {
    private nodoPaciente cabeza;

    public void agregarPaciente(Paciente paciente) {
        nodoPaciente nuevo = new nodoPaciente(paciente);
        if (cabeza == null) {
            cabeza = nuevo;
        }else {
            nuevo.siguiente = cabeza;
            cabeza = nuevo;

        }
    }

    public void mostrarPacientes() {
        nodoPaciente temp = cabeza;
        if (temp == null) {
            System.out.println("no se encontraron pacientes registrados en la base de datos");
            return;
        }

        while (temp != null) {
            System.out.println(temp.paciente);
            temp = temp.siguiente;
        }
    }
    public Paciente buscarPaciente(int id) {
        nodoPaciente temp = cabeza;
        while (temp != null) {
            if (temp.paciente.getId() == id) {
                return temp.paciente;
            }
            temp = temp.siguiente;
        }
        return null;
    }
    public boolean eliminarPaciente(int id) {
        if (cabeza == null) return false;
        if (cabeza.paciente.getId() == id) {
            cabeza = cabeza.siguiente;
            return true;
        }
        nodoPaciente temp = cabeza;
        while (temp.siguiente != null) {
            if (temp.siguiente.paciente.getId() == id) {
                temp.siguiente = temp.siguiente.siguiente;
                return true;
            }
            temp = temp.siguiente;
        }
        return false;
    }
}



