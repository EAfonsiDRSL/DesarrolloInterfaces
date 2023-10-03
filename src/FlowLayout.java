import javax.swing.*;

public class FlowLayout {

    public static void main(String[] args) {

        JFrame ventana = new JFrame("FlowLayout");

        JPanel panel1;
        panel1 = new JPanel();


        JButton boton1, boton2, boton3, boton4, boton5, aplicar;

        boton1 = new JButton("Boton 1");
        boton2 = new JButton("Boton 2");
        boton3 = new JButton("Boton 3");
        boton4 = new JButton("Boton 4");
        boton5 = new JButton("5");
        aplicar = new JButton("Apply orientation");

        JRadioButton left_to_right, right_to_left;
        right_to_left = new JRadioButton("left to right");
        left_to_right = new JRadioButton("right to left");

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(left_to_right);
        grupo.add(right_to_left);

        panel1.add(boton1);
        panel1.add(boton2);
        panel1.add(boton3);
        panel1.add(boton4);
        panel1.add(boton5);
        panel1.add(left_to_right);
        panel1.add(right_to_left);
        panel1.add(aplicar);

        panel1.setLayout(new java.awt.FlowLayout());


        ventana.add(panel1);



        ventana.setSize(400,200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);

    }
}
