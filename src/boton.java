import javax.swing.*;
import java.awt.*;

public class boton {

    public static void main(String[] args) {

        JFrame miprimeraventana = new JFrame();
        JPanel panel01 = new JPanel();
        JPanel panel02 = new JPanel();
        miprimeraventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miprimeraventana.setBounds(200,250,300,250);

        JButton boton1 = new JButton("boton 1");
        JButton boton2 = new JButton("boton 2");
        JLabel boton3 = new JLabel("boton 3");


        miprimeraventana.add(boton1);
        panel01.add(boton2);
        panel02.add(boton3);

        miprimeraventana.add(panel01);
        miprimeraventana.add(panel02);

        miprimeraventana.setLayout(new FlowLayout());
        //miprimeraventana.setLayout(new GridLayout());
        //miprimeraventana.setLayout(new BorderLayout());
        //miprimeraventana.setLayout(new GridBagLayout());


        miprimeraventana.setVisible(true);
    }
}
