import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jja {

    public static void calculadora() {
        JFrame ventana = new JFrame();
        ventana.setSize(400, 600);

        JPanel pantalla = new JPanel();
        JTextField texto_en_pantalla = new JTextField(20);
        pantalla.add(texto_en_pantalla);

        JPanel teclado = new JPanel(new GridLayout(4, 4));

        String[] botonesText = {"7", "8", "9", "/",
                "4", "5", "6", "x",
                "1", "2", "3", "-",
                "C", "0", ",", "+"};

        JButton[] botones = new JButton[botonesText.length];

        for (int i = 0; i < botonesText.length; i++) {
            botones[i] = new JButton(botonesText[i]);
            botones[i].setBackground(Color.decode("#99A3A4"));
            teclado.add(botones[i]);

            final int index = i;
            botones[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String textoActual = texto_en_pantalla.getText();
                    String botonText = botonesText[index];

                    if (botonText.equals("C")) {
                        textoActual = "";  // Limpiar la pantalla
                    } else {
                        textoActual += botonText;
                    }

                    texto_en_pantalla.setText(textoActual);
                }
            });
        }

        ventana.setLayout(new BorderLayout());
        ventana.add(texto_en_pantalla, BorderLayout.NORTH);
        ventana.add(teclado, BorderLayout.CENTER);

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }

    public static void main(String[] args) {
        calculadora();
    }
}
