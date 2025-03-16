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

    public Paciente buscarPaciente(int id) {
        NodoPaciente temp = cabeza;
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
        NodoPaciente temp = cabeza;
        while (temp.siguiente != null) {
            if (temp.siguiente.paciente.getId() == id) {
                temp.siguiente = temp.siguiente.siguiente;
                return true;
            }
            temp = temp.siguiente;
        }
        return false;
    }

    public List<Paciente> obtenerListaPacientes() {
        List<Paciente> lista = new ArrayList<>();
        NodoPaciente temp = cabeza;
        while (temp != null) {
            lista.add(temp.paciente);
            temp = temp.siguiente;
        }
        return lista;
    }
}
