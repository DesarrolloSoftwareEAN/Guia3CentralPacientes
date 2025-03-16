package vistas;

import javax.swing.*;
import modelos.ListaPacientes;
import modelos.Paciente;
import java.awt.*;

public class ListaPacientesVista extends JFrame {
    private JTextArea txtLista;

    public ListaPacientesVista(ListaPacientes listaPacientes) {
        setTitle("Lista de Pacientes");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        txtLista = new JTextArea();
        txtLista.setEditable(false);

        actualizarLista(listaPacientes);

        JScrollPane scroll = new JScrollPane(txtLista);
        add(scroll, BorderLayout.CENTER);
    }

    public void actualizarLista(ListaPacientes listaPacientes) {
        StringBuilder sb = new StringBuilder();
        for (Paciente p : listaPacientes.obtenerPacientes()) {  // ✅ Ahora funciona
            sb.append(p.toString()).append("\n");
        }
        txtLista.setText(sb.toString());
    }
}
