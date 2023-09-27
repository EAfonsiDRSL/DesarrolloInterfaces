import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Formulario {

    public static void main(String[] args) {

        JFrame miventana = new JFrame("Formulario");
        JPanel main = new JPanel();
        main.setLayout(new BorderLayout());
        JPanel izq = new JPanel();
        izq.setLayout(new GridLayout(7,2));
        izq.setBackground(Color.pink);

        JTextField name, ap, dom, nac, fec, nie;
        name = new JTextField();
        ap = new JTextField();
        dom = new JTextField();
        nac = new JTextField();
        fec = new JTextField();
        nie = new JTextField();

        ArrayList<JLabel> campos = new ArrayList<>();
        campos.add(new JLabel("Nombre"));
        campos.add(new JLabel("Apellidos"));
        campos.add(new JLabel("Domicilio"));
        campos.add(new JLabel("Nacionalidad"));
        campos.add( new JLabel("Fecha de nacimiento"));
        campos.add( new JLabel("DNI"));
        campos.add(new JLabel("Sexo"));

        for (JLabel e : campos){
            izq.add(e);
        }



        JCheckBox caja1, caja2;
        caja1 = new JCheckBox("Hombre");
        caja2 = new JCheckBox("Mujer");

        String[] opciones = {null,"Hombre","Mujer","Prefiero no contestar"};
        JComboBox<String> caja = new JComboBox<>(opciones);


        miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miventana.setBounds(500,250,600,600);

        /*izq.add(nombre);izq.add(name);
        izq.add(apellidos);izq.add(ap);
        izq.add(domicilio);izq.add(dom);
        izq.add(nacionalidad);izq.add(nac);
        izq.add(fechaNacimiento);izq.add(fec);
        izq.add(dni);izq.add(nie);
        izq.add(sexo);izq.add(caja);*/


        main.add(izq, BorderLayout.WEST);
        miventana.add(main);


        miventana.setLayout(new FlowLayout(FlowLayout.LEFT));

        miventana.setVisible(true);
    }
}
