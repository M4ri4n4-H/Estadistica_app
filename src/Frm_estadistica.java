import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.WindowConstants;

public class Frm_estadistica extends JFrame {


    public Frm_estadistica() {
        setSize(600, 300);
        setTitle("Estadistica");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        //Etiqueta dato
        JLabel lblDato=new JLabel("Dato");
        lblDato.setBounds(10, 10, 100, 25);
        getContentPane().add(lblDato);

        //Etiqueta datos
        JLabel btDatos=new JLabel("Muestra");
        btDatos.setBounds(200, 10, 100, 25);
        getContentPane().add(btDatos);

        //Campo desviación
        JTextField txtdDato=new JTextField("Desviación");
        txtdDato.setBounds(330,200,100,25);
        getContentPane().add(txtdDato);

        //Campo dato
        JTextField txtDato=new JTextField("Dato");
        txtDato.setBounds(50, 10, 100, 25);
        getContentPane().add(txtDato);

        //Botón Agregar
        JButton btnagregar=new JButton("Agregar");
        btnagregar.setBounds(50, 50, 100, 25);
        getContentPane().add(btnagregar);

        //Botón quitar
        JButton btnquitar=new JButton("Quitar");
        btnquitar.setBounds(50, 80, 100, 25);
        getContentPane().add(btnquitar);

        //Botón desviacion
        JButton btdDes=new JButton("Desviación");
        btdDes.setBounds(200, 200, 100, 25);
        getContentPane().add(btdDes);

        //Lista
        JList lstmuestra=new JList();
        lstmuestra.setBounds(210, 40, 100, 150);
        getContentPane().add(lstmuestra);

        //Eventos de la GUI
        btnagregar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                agregarDato();
            }
        });
        btnquitar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                quitarDato();
            }
        });

    }

    private void agregarDato(){
        JOptionPane.showMessageDialog(null, "Hizo clic en Agregar");
    }

    private void quitarDato(){
        JOptionPane.showMessageDialog(null, "Hizo clic en quitar");
    }
}
