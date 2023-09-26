import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;

public class Formulario {

    public static void main(String[] args) {

        JFrame miventana = new JFrame("Formulario");
        JPanel main = new JPanel();
        main.setLayout(new BorderLayout());
        JPanel izq = new JPanel();
        izq.setLayout(new GridLayout(2,0));
        JLabel nombre, apellidos, domicilio, nacionalidad, fechaNacimiento, dni,sexo;
        nombre = new JLabel("Nombre");
        apellidos = new JLabel("Apellidos");
        domicilio = new JLabel("Domicilio");
        nacionalidad = new JLabel("Nacionalidad");
        fechaNacimiento = new JLabel("Fecha de nacimiento");
        dni = new JLabel("DNI");
        sexo = new JLabel("Sexo");

        miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miventana.setBounds(500,250,250,600);

        izq.add(nombre);
        izq.add(apellidos);

        main.add(izq, BorderLayout.WEST);
        miventana.add(main);


        miventana.setLayout(new FlowLayout(FlowLayout.LEFT));

        miventana.setVisible(true);
    }
}
