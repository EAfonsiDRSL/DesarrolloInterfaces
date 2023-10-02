import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Calculadora {

    public static void calculadora(){

        JFrame ventana = new JFrame();
        ventana.setSize(800,800);
        JPanel teclado, pantalla, main;
        JTextField texto_en_pantalla = new JTextField();
        JLabel etiqueta = new JLabel();
        JLabel etiqueta2 = new JLabel();

        JButton suma, resta, multiplicacion, division, cero, igual, coma, c, ce, porcentaje, uno, dos, tres, cuatro, cinco, seis, siete, ocho,
                nueve;

        ImageIcon icon, goku;
            icon = new ImageIcon("C:\\Users\\EliotAlfonsoAriasO\\Downloads\\casio.png");
            goku = new ImageIcon("C:\\Users\\EliotAlfonsoAriasO\\Downloads\\goku-removebg-preview.png");

        Image img = icon.getImage().getScaledInstance(50,30,Image.SCALE_SMOOTH);
        Image img2 = goku.getImage().getScaledInstance(100,50,Image.SCALE_SMOOTH);

        icon = new ImageIcon(img);
        goku = new ImageIcon(img2);

        etiqueta.setIcon(icon);
        etiqueta2.setIcon(goku);

        etiqueta.setLayout(null);
        etiqueta.setBounds(0,0,100,20);

        etiqueta2.setLayout(null);
        etiqueta2.setBounds(130,40,100,60);

        int filas = 5;
        int columnas = 4;


        main = new JPanel();
        teclado = new JPanel();
        pantalla = new JPanel();

        pantalla.setBounds(10,50,200,80);
        pantalla.setLayout(null);
        pantalla.setBackground(Color.PINK);
        teclado.setBounds(10,130,200,300);
        texto_en_pantalla.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        texto_en_pantalla.setBackground(Color.decode("#bfff00"));
        texto_en_pantalla.setBounds(20,25,150,30);

       // main.setBackground(Color.BLACK);

        teclado.setLayout(new GridLayout(filas, columnas));
        main.setLayout(null);

        teclado.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;


        c = new JButton("C");
        gbc.gridx=0;
        gbc.gridy=0;
        gbc.gridwidth=1;
        gbc.gridheight=1;
        c.setBackground(Color.red);
        teclado.add(c,gbc);

        ce = new JButton("CE");
        gbc.gridx=1;
        gbc.gridy=0;
        gbc.gridwidth=1;
        gbc.gridheight=1;
        teclado.add(ce,gbc);

        porcentaje = new JButton("%");
        gbc.gridx=2;
        gbc.gridy=0;
        gbc.gridwidth=1;
        gbc.gridheight=1;
        teclado.add(porcentaje,gbc);

        division = new JButton("/");
        gbc.gridx=3;
        gbc.gridy=0;
        gbc.gridwidth=1;
        gbc.gridheight=1;
        teclado.add(division,gbc);

        siete = new JButton("7");
        gbc.gridx=0;
        gbc.gridy=1;
        gbc.gridwidth=1;
        gbc.gridheight=1;
        teclado.add(siete,gbc);

        ocho = new JButton("8");
        gbc.gridx=1;
        gbc.gridy=1;
        gbc.gridwidth=1;
        gbc.gridheight=1;
        teclado.add(ocho,gbc);

        nueve = new JButton("9");
        gbc.gridx=2;
        gbc.gridy=1;
        gbc.gridwidth=1;
        gbc.gridheight=1;
        teclado.add(nueve,gbc);

        multiplicacion = new JButton("x");
        gbc.gridx=3;
        gbc.gridy=1;
        gbc.gridwidth=1;
        gbc.gridheight=1;
        teclado.add(multiplicacion,gbc);

        cuatro = new JButton("4");
        gbc.gridx=0;
        gbc.gridy=2;
        gbc.gridwidth=1;
        gbc.gridheight=1;
        teclado.add(cuatro,gbc);

        cinco = new JButton("5");
        gbc.gridx=1;
        gbc.gridy=2;
        gbc.gridwidth=1;
        gbc.gridheight=1;
        teclado.add(cinco,gbc);

        seis = new JButton("6");
        gbc.gridx=2;
        gbc.gridy=2;
        gbc.gridwidth=1;
        gbc.gridheight=1;
        teclado.add(seis,gbc);

        resta = new JButton("-");
        gbc.gridx=3;
        gbc.gridy=2;
        gbc.gridwidth=1;
        gbc.gridheight=1;
        teclado.add(resta,gbc);

        uno = new JButton("1");
        gbc.gridx=0;
        gbc.gridy=3;
        gbc.gridwidth=1;
        gbc.gridheight=1;
        teclado.add(uno,gbc);

        dos = new JButton("2");
        gbc.gridx=1;
        gbc.gridy=3;
        gbc.gridwidth=1;
        gbc.gridheight=1;
        teclado.add(dos,gbc);

        tres = new JButton("3");
        gbc.gridx=2;
        gbc.gridy=3;
        gbc.gridwidth=1;
        gbc.gridheight=1;
        teclado.add(tres,gbc);

        suma = new JButton("+");
        gbc.gridx=3;
        gbc.gridy=3;
        gbc.gridwidth=1;
        gbc.gridheight=2;
        teclado.add(suma,gbc);

        coma = new JButton(",");
        gbc.gridx=0;
        gbc.gridy=4;
        gbc.gridwidth=1;
        gbc.gridheight=1;
        teclado.add(coma,gbc);

        cero = new JButton("0");
        gbc.gridx=1;
        gbc.gridy=4;
        gbc.gridwidth=1;
        gbc.gridheight=1;
        teclado.add(cero,gbc);

        igual = new JButton("=");
        gbc.gridx=2;
        gbc.gridy=4;
        gbc.gridwidth=1;
        gbc.gridheight=1;
        teclado.add(igual,gbc);

        pantalla.add(etiqueta);
        pantalla.add(etiqueta2);

        pantalla.add(texto_en_pantalla);
        main.add(pantalla);
        main.add(teclado);
        ventana.add(main);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);

    }

    public static void main(String[] args) {
        calculadora();
    }
}
