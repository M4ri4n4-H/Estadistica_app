import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
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
        JButton btDato=new JButton("Agregar");
        btDato.setBounds(50, 50, 100, 25);
        getContentPane().add(btDato);

        //Botón quitar
        JButton btnDato=new JButton("Quitar");
        btnDato.setBounds(50, 80, 100, 25);
        getContentPane().add(btnDato);

        //Botón desviacion
        JButton btdDato=new JButton("Desviación");
        btdDato.setBounds(200, 200, 100, 25);
        getContentPane().add(btdDato);

        //Lista
    }
}