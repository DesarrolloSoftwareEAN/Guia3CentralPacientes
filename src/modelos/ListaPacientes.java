package modelos;

import java.util.ArrayList;
import java.util.List;

public class ListaPacientes {
    private NodoPaciente cabeza;

    public void agregarPaciente(Paciente paciente) {
        NodoPaciente nuevo = new NodoPaciente(paciente);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
        }
    }

    public List<Paciente> obtenerPacientes() {
        List<Paciente> pacientes = new ArrayList<>();
        NodoPaciente temp = cabeza;
        while (temp != null) {
            pacientes.add(temp.paciente);
            temp = temp.siguiente;
        }
        return pacientes;
    }

    public Paciente buscarPaciente(int id) {
        NodoPaciente temp = cabeza;
        while (temp != null) {
            if (temp.paciente.getId() == id) {
                return temp.paciente;
            }
            temp = temp.siguiente;
        }
        return null;  // Devuelve null si no se encuentra el paciente
    }

    public boolean eliminarPaciente(int id) {
        if (cabeza == null) return false;

        // Si el primer nodo es el que debe eliminarse
        if (cabeza.paciente.getId() == id) {
            cabeza = cabeza.siguiente;
            return true;
        }

        // Buscar en la lista el nodo a eliminar
        NodoPaciente temp = cabeza;
        while (temp.siguiente != null) {
            if (temp.siguiente.paciente.getId() == id) {
                temp.siguiente = temp.siguiente.siguiente;
                return true;
            }
            temp = temp.siguiente;
        }
        return false;  // Devuelve false si el paciente no fue encontrado
    }
}
