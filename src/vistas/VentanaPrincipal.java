package vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {
    public VentanaPrincipal() {
        setTitle("Gestión de Pacientes");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton btnAbrirFormulario = new JButton("Registrar Paciente");
        btnAbrirFormulario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FormularioPaciente().setVisible(true);
            }
        });

        JPanel panel = new JPanel();
        panel.add(btnAbrirFormulario);
        add(panel, BorderLayout.CENTER);
    }
}
