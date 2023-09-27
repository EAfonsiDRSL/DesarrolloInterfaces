import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class fa {

    public static void main(String[] args) {


        JFrame miventana = new JFrame("Formulario");
        JPanel main = new JPanel();
        main.setLayout(new BorderLayout());
        JPanel izq = new JPanel();

        izq.setBackground(Color.pink);

        ArrayList<JLabel> campos = new ArrayList<>();
        campos.add(new JLabel("Nombre"));
        campos.add(new JLabel("Apellidos"));
        campos.add(new JLabel("Nacionalidad"));
        campos.add(new JLabel("DNI"));

        for (JLabel e : campos){

            izq.add(e);
        }
        izq.setLayout(new GridLayout(campos.size(),0));
        main.add(izq, BorderLayout.WEST);
        miventana.add(main);


        miventana.setLayout(new FlowLayout(FlowLayout.LEFT));

        miventana.setVisible(true);
    }
}
