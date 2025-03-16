package vistas;

import javax.swing.*;
import modelos.ListaPacientes;
import modelos.Paciente;
import java.awt.*;

public class BuscarPacienteVista extends JFrame {
    private JTextField txtId;
    private JTextArea txtResultado;
    private ListaPacientes listaPacientes;

    public BuscarPacienteVista(ListaPacientes listaPacientes) {
        this.listaPacientes = listaPacientes;

        setTitle("Buscar Paciente");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(2, 2));
        panel.add(new JLabel("Ingrese ID:"));
        txtId = new JTextField();
        panel.add(txtId);

        JButton btnBuscar = new JButton("Buscar");
        btnBuscar.addActionListener(e -> buscarPaciente());
        panel.add(btnBuscar);

        add(panel, BorderLayout.NORTH);

        txtResultado = new JTextArea();
        txtResultado.setEditable(false);
        add(new JScrollPane(txtResultado), BorderLayout.CENTER);
    }

    private void buscarPaciente() {
        try {
            int id = Integer.parseInt(txtId.getText());
            Paciente p = listaPacientes.buscarPaciente(id);

            if (p != null) {
                txtResultado.setText(p.toString());
            } else {
                txtResultado.setText("Paciente no encontrado.");
            }
        } catch (NumberFormatException e) {
            txtResultado.setText("Ingrese un ID válido.");
        }
    }
}
