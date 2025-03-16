package vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelos.Paciente;
import modelos.ListaPacientes;

public class FormularioPaciente extends JFrame {
    private JTextField txtNombre, txtId, txtEdad, txtClinica;
    private ListaPacientes listaPacientes;

    public FormularioPaciente() {
        setTitle("Registrar Paciente");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        listaPacientes = new ListaPacientes(); // Instancia de la lista

        JPanel panel = new JPanel(new GridLayout(5, 2));

        panel.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        panel.add(txtNombre);

        panel.add(new JLabel("ID:"));
        txtId = new JTextField();
        panel.add(txtId);

        panel.add(new JLabel("Edad:"));
        txtEdad = new JTextField();
        panel.add(txtEdad);

        panel.add(new JLabel("Clínica:"));
        txtClinica = new JTextField();
        panel.add(txtClinica);

        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarPaciente();
            }
        });

        panel.add(btnGuardar);
        add(panel);
    }

    private void guardarPaciente() {
        try {
            String nombre = txtNombre.getText();
            int id = Integer.parseInt(txtId.getText());
            int edad = Integer.parseInt(txtEdad.getText());
            String clinica = txtClinica.getText();

            Paciente nuevoPaciente = new Paciente(nombre, id, edad, clinica);
            listaPacientes.agregarPaciente(nuevoPaciente);

            JOptionPane.showMessageDialog(this, "Paciente agregado con éxito.");
            this.dispose();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese valores numéricos válidos para ID y edad.");
        }
    }
}
