import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.WindowConstants;

public class Frm_estadistica extends JFrame {

    JTextField txtDato;
    JList lstmuestra;

    public Frm_estadistica() {
        setSize(600, 300);
        setTitle("Estadistica");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        // Etiqueta dato
        JLabel lblDato = new JLabel("Dato");
        lblDato.setBounds(10, 10, 100, 25);
        getContentPane().add(lblDato);

        // Etiqueta datos
        JLabel btDatos = new JLabel("Muestra");
        btDatos.setBounds(200, 10, 100, 25);
        getContentPane().add(btDatos);

        // Campo desviación
        JTextField txtdDato = new JTextField("Desviación");
        txtdDato.setBounds(330, 200, 100, 25);
        getContentPane().add(txtdDato);

        // Campo dato
        txtDato = new JTextField("");
        txtDato.setBounds(50, 10, 100, 25);
        getContentPane().add(txtDato);

        // Botón Agregar
        JButton btnagregar = new JButton("Agregar");
        btnagregar.setBounds(50, 50, 100, 25);
        getContentPane().add(btnagregar);

        // Botón quitar
        JButton btnquitar = new JButton("Quitar");
        btnquitar.setBounds(50, 80, 100, 25);
        getContentPane().add(btnquitar);

        // Botón desviacion
        JButton btdDes = new JButton("Desviación");
        btdDes.setBounds(200, 200, 100, 25);
        getContentPane().add(btdDes);

        // Lista
        lstmuestra = new JList();
        lstmuestra.setBounds(210, 40, 100, 150);
        getContentPane().add(lstmuestra);

        // Eventos de la GUI
        btnagregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                agregarDato();
            }
        });
        btnquitar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                quitarDato();
            }
        });

    }

    // Declanar el arreglo que almacenará los datos de la muestra
    private double[] muestra = new double[1000];
    private int totalDatos = -1;

    private void agregarDato() {
        double dato = Double.parseDouble(txtDato.getText());
        totalDatos++;
        muestra[totalDatos] = dato;
        mostrarMuestra();
    }

    private void mostrarMuestra() {
        String[] strMuestra = new String[totalDatos + 1];
        for (int i = 0; i <= totalDatos; i++) {
            strMuestra[i] = String.valueOf(muestra[i]);
        }
        lstmuestra.setListData(strMuestra);
    }

    private void quitarDato() {
        JOptionPane.showMessageDialog(null, "Hizo clic en quitar");
    }
}
