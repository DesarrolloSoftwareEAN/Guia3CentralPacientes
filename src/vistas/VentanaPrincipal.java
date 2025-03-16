package vistas;

import javax.swing.*;
import java.awt.*;
import modelos.ListaPacientes;

public class VentanaPrincipal extends JFrame {
    private ListaPacientes listaPacientes;

    public VentanaPrincipal() {
        listaPacientes = new ListaPacientes();

        setTitle("Gestión de Pacientes");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 1));

        JButton btnRegistrar = new JButton("Registrar Paciente");
        btnRegistrar.addActionListener(e -> new FormularioPaciente(listaPacientes).setVisible(true));
        add(btnRegistrar);

        JButton btnVerPacientes = new JButton("Ver Pacientes");
        btnVerPacientes.addActionListener(e -> new ListaPacientesVista(listaPacientes).setVisible(true));
        add(btnVerPacientes);

        JButton btnBuscar = new JButton("Buscar Paciente");
        btnBuscar.addActionListener(e -> new BuscarPacienteVista(listaPacientes).setVisible(true));
        add(btnBuscar);

        JButton btnEliminar = new JButton("Eliminar Paciente");
        btnEliminar.addActionListener(e -> eliminarPaciente());
        add(btnEliminar);
    }

    private void eliminarPaciente() {
        String input = JOptionPane.showInputDialog("Ingrese el ID del paciente a eliminar:");
        if (input != null) {
            try {
                int id = Integer.parseInt(input);
                if (listaPacientes.eliminarPaciente(id)) {
                    JOptionPane.showMessageDialog(this, "Paciente eliminado con éxito.");
                } else {
                    JOptionPane.showMessageDialog(this, "Paciente no encontrado.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingrese un ID válido.");
            }
        }
    }
}
