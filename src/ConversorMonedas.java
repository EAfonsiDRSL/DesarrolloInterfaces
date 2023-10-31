import javax.swing.*;
import java.awt.*;

public class ConversorMonedas {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
        ventana.setSize(500,500);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(Color.cyan);
        JLabel importe, de, a;
        JTextField cantidad = new JTextField();

        String [] monedas = {
                "",
                "Dolares",
                "Euros",
                "Libra esterlina",
                "Yen japonés",
                "Peso mexicano",
                "Bitcoin"
        };

        JComboBox<String > desplegable1 = new JComboBox<>();
        JComboBox<String > desplegable2 = new JComboBox<>();

        for (int i = 0; i < monedas.length;i++){
            if (i >= 1) {
                desplegable1.addItem(monedas[i]);
            }
            desplegable2.addItem(monedas[i]);

        }

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;

        importe = new JLabel("Importe");
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(importe,gbc);

        de = new JLabel("De:");
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(de,gbc);

        a = new JLabel("a:");
        gbc.gridx = 2;
        gbc.gridy = 0;
        panel.add(a,gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(cantidad,gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(desplegable1,gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(desplegable2,gbc);


        ventana.add(panel);

    }


}
