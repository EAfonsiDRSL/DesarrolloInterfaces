import javax.swing.*;
import java.awt.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class Calculadora {
    public static void main(String[] args) {
        calculadora();
    }

    public static void calculadora(){

        JFrame ventana = new JFrame();
        ventana.setSize(800,800);
        JPanel teclado, pantalla, main;
        JTextField texto_en_pantalla = new JTextField();
        JLabel etiqueta = new JLabel();
        JLabel etiqueta2 = new JLabel();



        JButton suma, resta, multiplicacion, division, cero, igual, coma, c, ce, porcentaje, uno, dos, tres, cuatro, cinco, seis, siete, ocho,
                nueve, negativos;
        suma = new JButton("+");
        resta = new JButton("-");
        multiplicacion = new JButton("x");
        division = new JButton("/");
        cero = new JButton("0");
        igual = new JButton("=");
        coma = new JButton(",");
        c = new JButton("C");
        ce = new JButton("CE");
        porcentaje = new JButton("%");
        uno = new JButton("1");
        dos = new JButton("2");
        tres = new JButton("3");
        cuatro = new JButton("4");
        cinco = new JButton("5");
        seis = new JButton("6");
        siete = new JButton("7");
        ocho = new JButton("8");
        nueve = new JButton("9");
        negativos = new JButton("+/-");


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

        main = new JPanel();
        teclado = new JPanel();
        pantalla = new JPanel();



        pantalla.setBounds(10,50,300,80);
        pantalla.setLayout(null);
        pantalla.setBackground(Color.decode("#1C2833"));

        int ancho_panel_pantalla = pantalla.getWidth();
        int anchura_texto= 150;
        int x = (ancho_panel_pantalla - anchura_texto)/2;

        teclado.setBounds(10,130,300,300);
        texto_en_pantalla.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        texto_en_pantalla.setBackground(Color.decode("#D6EAF8"));
        texto_en_pantalla.setBounds(x,25,anchura_texto,30);


        main.setLayout(null);
        //main.setBackground(Color.decode("#F9EBEA"));
        main.setBounds(400,400,100,100);

        teclado.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;

        JButton[] botones = {
                c, ce, porcentaje, division,
                siete, ocho, nueve, multiplicacion,
                cuatro, cinco, seis, resta,
                uno, dos, tres, suma,
                coma, cero, negativos,igual
        };

        teclado.setLayout(new GridBagLayout());

        final boolean[] comaPulsada = {false};
        final boolean[] operadoPulsado = {false};

        for (int i = 0; i < botones.length; i++) {

                    gbc.gridx = i % 4; // Columna
                    gbc.gridy = i / 4; // Fila
                    gbc.gridwidth = 1;
                    gbc.gridheight = 1;
                    gbc.fill = GridBagConstraints.BOTH;
                    gbc.weightx = 1.0;
                    gbc.weighty = 1.0;

            botones[i].setBackground(Color.decode("#99A3A4"));
            teclado.add(botones[i], gbc);

            int index = i;
            botones[i].addActionListener(e -> {
                String textoActual = texto_en_pantalla.getText();
                String textoBotones = botones[index].getText();


                if (textoBotones.equals("CE")){
                    textoActual = "";
                }
                if (textoBotones.equals(",") && !comaPulsada[0]) {
                    textoActual += textoBotones;
                    operadoPulsado [0] = false;
                    comaPulsada [0] = true;
                    coma.setEnabled(false);
                }
                if (textoBotones.equals("+") || textoBotones.equals("-") || textoBotones.equals("x") || textoBotones.equals("/") || textoBotones.equals("=")){
                    textoActual += textoBotones;
                    operadoPulsado[0] = true;
                    comaPulsada[0] = false;
                    coma.setEnabled(true);
                }
                else if (!textoBotones.equals(",") && !textoBotones.equals("CE")) {
                    textoActual += textoBotones;
                }

                texto_en_pantalla.setText(textoActual);

        });
    }

        pantalla.add(etiqueta);
        pantalla.add(etiqueta2);

        pantalla.add(texto_en_pantalla);
        main.add(pantalla);
        main.add(teclado);
        ventana.add(main);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);


    }

}
