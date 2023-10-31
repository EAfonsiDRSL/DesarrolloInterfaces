import javax.swing.*;
import java.awt.*;

public class CurrencyConverterApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Currency Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(5, 5, 5, 5);

        // Importe
        JLabel amountLabel = new JLabel("Importe:");
        JTextField amountField = new JTextField(10);
        c.gridx = 0;
        c.gridy = 0;
        panel.add(amountLabel, c);
        c.gridx = 1;
        panel.add(amountField, c);

        // De:
        JLabel fromLabel = new JLabel("De:");
        JComboBox<String> fromCurrencyComboBox = new JComboBox<>(new String[]{"USD", "EUR", "GBP"}); // Agrega las monedas que desees
        c.gridx = 0;
        c.gridy = 1;
        panel.add(fromLabel, c);
        c.gridx = 1;
        panel.add(fromCurrencyComboBox, c);

        // Swap Button
        JButton swapButton = new JButton("Swap currencies");
        c.gridx = 2;
        c.gridheight = 2;
        panel.add(swapButton, c);

        // A:
        JLabel toLabel = new JLabel("A:");
        JComboBox<String> toCurrencyComboBox = new JComboBox<>(new String[]{"USD", "EUR", "GBP"}); // Agrega las monedas que desees
        c.gridx = 0;
        c.gridy = 2;
        c.gridheight = 1;
        panel.add(toLabel, c);
        c.gridx = 1;
        panel.add(toCurrencyComboBox, c);

        // Convert Button
        JButton convertButton = new JButton("Convertir");
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 3;
        panel.add(convertButton, c);

        frame.add(panel);
        frame.setVisible(true);
    }
}
