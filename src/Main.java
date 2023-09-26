import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {


    public static void main(String[] args) {



        JFrame j = new JFrame("Formulario");
        j.setBounds(900,10,900,900);

        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel apellidos, nombre, sexo, nacionalidad, fechanacimiento, dni, Titulo;
        JTextField ap, nom, sex, naci, fecha, nie;
        JButton boton = new JButton("enviar");
        boton.setBounds(120,250,100,50);

        Titulo = new JLabel("Formulario de salud pública");
        Titulo.setFont(new Font("Agency FB",Font.BOLD,45));
        Titulo.setBounds(1,-20, 500,90);

        apellidos = new JLabel("Apellido");
        apellidos.setBounds(10,10,200,100);
        ap = new JTextField(50);
        ap.setBounds(100,50,200,20);

        nombre = new JLabel("Nombre");
        nombre.setBounds(10,40,200,100);
        nom = new JTextField(50);
        nom.setBounds(100,80,200,20);

        sexo = new JLabel("Sexo");
        sexo.setBounds(10,70,200,100);
        sex = new JTextField(50);
        sex.setBounds(100,110,100,20);

        nacionalidad =new JLabel("Nacionalidad");
        nacionalidad.setBounds(10,100,200,100);
        naci = new JTextField(50);
        naci.setBounds(100,140,200,20);

        fechanacimiento = new JLabel("Fecha de nacimiento");
        fechanacimiento.setBounds(10,130,200,100);
        fecha = new JTextField(50);
        fecha.setBounds(130,170,200,20);

        dni = new JLabel("DNI");
        dni.setBounds(10,160,200,100);
        nie = new JTextField(50);
        nie.setBounds(100,200,200,20);


        j.getContentPane().setLayout(null);

        JPanel p = new JPanel();
        p.setBackground(Color.BLUE);
        p.add(apellidos);


        JPanel p2 = new JPanel();
        p2.setBackground(Color.red);
        p2.setLayout(new FlowLayout());
        p2.add(nombre);



        j.add(Titulo);
        //j.add(apellidos);
        //j.add(nombre);
        j.add(sexo);
        j.add(nacionalidad);
        j.add(fechanacimiento);
        j.add(dni);
        j.add(ap);
        j.add(nom);
        j.add(sex);
        j.add(naci);
        j.add(fecha);
        j.add(nie);
        j.add(boton);
        j.add(p);
        j.add(p2);
        j.getContentPane().setBackground(Color.PINK);

        j.setVisible(true);
    }
}