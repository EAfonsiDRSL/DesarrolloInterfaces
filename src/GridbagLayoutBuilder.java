import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;

public class GridbagLayoutBuilder {

    public static void main(String[] args) {

        JFrame ventana = new JFrame("GridbagLayout build");

        ventana.setSize(700,400);
        ventana.setResizable(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel name, street, city, zip, address, phone, age, description;
        JTextArea desc;
        JTextField nombre, calle, ciudad, codigo_postal, telefono, edad;
        JButton boton;
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();


        panel.setLayout(new GridBagLayout());
        panel.setSize(550,300);

        panel2.setBounds(0,0,700,300);
        panel2.setBackground(Color.cyan);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(2,5,2,5);
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;

        name = new JLabel("Full Name");
        gbc.gridx = 0;
        gbc.gridy = 0;
        name.setHorizontalAlignment(SwingConstants.RIGHT);
        panel.add(name,gbc);

        nombre = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        panel.add(nombre,gbc);

        street = new JLabel("Street");
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth=1;
        street.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(street,gbc);

        city = new JLabel("City");
        gbc.gridx = 2;
        gbc.gridy = 1;
        city.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(city,gbc);

        zip = new JLabel("Zip Code");
        gbc.gridx = 3;
        gbc.gridy = 1;
        zip.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(zip,gbc);

        address = new JLabel("Address");
        gbc.gridx = 0;
        gbc.gridy = 2;
        address.setHorizontalAlignment(SwingConstants.RIGHT);
        panel.add(address,gbc);

        calle = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 2;

        panel.add(calle,gbc);

        ciudad = new JTextField();
        gbc.gridx = 2;
        gbc.gridy = 2;
        panel.add(ciudad,gbc);

        codigo_postal = new JTextField();
        gbc.gridx = 3;
        gbc.gridy = 2;
        panel.add(codigo_postal,gbc);

        phone = new JLabel("Phone");
        gbc.gridx = 0;
        gbc.gridy = 3;
        phone.setHorizontalAlignment(SwingConstants.RIGHT);
        panel.add(phone,gbc);

        telefono = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(telefono,gbc);

        age = new JLabel("Age");
        gbc.gridx = 2;
        gbc.gridy = 3;
        age.setHorizontalAlignment(SwingConstants.RIGHT);
        panel.add(age,gbc);

        edad = new JTextField();
        gbc.gridx = 3;
        gbc.gridy = 3;
        panel.add(edad,gbc);

        description = new JLabel("Description");
        gbc.gridx = 0;
        gbc.gridy = 4;
        description.setHorizontalAlignment(SwingConstants.RIGHT);
        description.setVerticalAlignment(SwingConstants.TOP);
        panel.add(description,gbc);

        desc = new JTextArea();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 3;
        gbc.ipady = 200;
        panel.add(desc,gbc);

        boton = new JButton("Submit");
        gbc.gridx = 2;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.ipady = 0;
        panel.add(boton,gbc);

        panel.setPreferredSize(new Dimension(500,350));


        panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel2.add(panel);
        ventana.add(panel2);
        ventana.setVisible(true);
    }
}
