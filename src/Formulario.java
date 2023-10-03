import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Formulario {

    public static void main(String[] args) {

        JFrame miventana = new JFrame("Formulario");

        JButton boton = new JButton("Enviar");

        JLabel nombre, apellidos, domicilio, nacionalidad, fechaNacimiento, dni, sexo;
        nombre =  new JLabel("Nombre");
        apellidos = new JLabel("Apellidos");
        domicilio = new JLabel("Domicilio");
        nacionalidad = new JLabel("Nacionalidad");
        fechaNacimiento = new JLabel("Fecha de nacimiento");
        dni = new JLabel("DNI");
        sexo = new JLabel("Sexo");

        JPanel main = new JPanel();
        main.setLayout(new BorderLayout());
        JPanel izq = new JPanel();
        izq.setLayout(new GridLayout(7,1));
        izq.setBackground(Color.pink);
        JPanel der = new JPanel();
        der.setLayout(new GridLayout(7,1));
        der.setBackground(Color.GREEN);
        JPanel opcionesSexo= new JPanel();
        opcionesSexo.setLayout(new GridLayout(1, 2));


        JTextField name, ap, dom, fec, nie;
        name = new JTextField();
        ap = new JTextField();
        dom = new JTextField();
        fec = new JTextField();
        nie = new JTextField();

        ButtonGroup buttonGroup = new ButtonGroup();

        JRadioButton caja1, caja2;
        caja1 = new JRadioButton("Hombre");
        caja2 = new JRadioButton("Mujer");

        buttonGroup.add(caja1);
        buttonGroup.add(caja2);


        String[] opciones = {null,"Española","Holandes","Ecuatoriana"};
        JComboBox<String> caja = new JComboBox<>(opciones);


        miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miventana.setBounds(500,250,800,800);

        izq.add(nombre);
        izq.add(apellidos);
        izq.add(domicilio);
        izq.add(nacionalidad);
        izq.add(fechaNacimiento);
        izq.add(dni);
        izq.add(sexo);

        der.add(name);
        der.add(ap);
        der.add(dom);
        der.add(caja);
        der.add(fec);
        der.add(nie);
        der.add(caja1);

        opcionesSexo.add(caja1);
        opcionesSexo.add(caja2);



        main.add(izq, BorderLayout.WEST);
        main.add(der, BorderLayout.EAST);
        main.add(opcionesSexo, BorderLayout.PAGE_END);
        miventana.add(main);
        miventana.add(boton);


        miventana.setVisible(true);
    }
}
