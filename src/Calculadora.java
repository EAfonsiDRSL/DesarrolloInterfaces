import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Calculadora {

    public static void calculadora(){

        JFrame ventana = new JFrame();
        ventana.setSize(800,800);
        JPanel opciones, pantalla, main;

        main = new JPanel();
        main.setBackground(Color.BLACK);
        opciones = new JPanel();
        pantalla = new JPanel();

        pantalla.setBackground(Color.cyan);
        opciones.setBackground(Color.GREEN);
        int filas = 5;
        int columnas = 4;

        opciones.setLayout(new GridLayout(filas, columnas));
        main.setLayout(new GridLayout(2,0));
        ArrayList<JButton>botones = new ArrayList<>();
        botones.add(new JButton("C"));
        botones.add(new JButton("Ce"));
        botones.add(new JButton("%"));
        botones.add(new JButton("/"));
        botones.add(new JButton("7"));
        botones.add(new JButton("8"));
        botones.add(new JButton("9"));
        botones.add(new JButton("x"));
        botones.add(new JButton("4"));
        botones.add(new JButton("5"));
        botones.add(new JButton("6"));
        botones.add(new JButton("-"));
        botones.add(new JButton("1"));
        botones.add(new JButton("2"));
        botones.add(new JButton("3"));
        botones.add(new JButton("+"));
        botones.add(new JButton(""));
        botones.add(new JButton("0"));
        botones.add(new JButton(","));
        botones.add(new JButton("="));

        for (JButton e : botones){
            opciones.add(e);
        }

        main.add(pantalla);
        main.add(opciones);
        ventana.add(main);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);

    }

    public static void main(String[] args) {
        calculadora();
    }
}
