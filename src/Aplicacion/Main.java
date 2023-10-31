package Aplicacion;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setSize(500,500);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(true);


        ArrayList<User> usuarios = new ArrayList<>();
        usuarios.add(new User("eliot", "arias", "884883f", "kfjalsjf@gmail.com", "hofaf"));
        usuarios.add(new User("eliot", "arias", "884883f", "kfjalsjf@gmail.com", "hofaf"));
        usuarios.add(new User("eliot", "arias", "884883f", "kfjalsjf@gmail.com", "hofaf"));
        usuarios.add(new User("eliot", "arias", "884883f", "kfjalsjf@gmail.com", "hofaf"));
        usuarios.add(new User("eliot", "arias", "884883f", "kfjalsjf@gmail.com", "hofaf"));

        Table table = new Table(usuarios);
        JTable tabla = new JTable(table);


        ventana.add(new JScrollPane(tabla));
        ventana.pack();





    }
}
