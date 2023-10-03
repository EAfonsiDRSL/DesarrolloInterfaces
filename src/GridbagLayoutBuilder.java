import javax.swing.*;
import java.awt.*;

public class GridbagLayoutBuilder {

    public static void main(String[] args) {

        JFrame jf = new JFrame("FlowLayout");
        jf.setLayout(new BorderLayout());
        jf.setResizable(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(600, 400);

        JPanel jp1 = new JPanel(new GridBagLayout());
        JPanel p2 = new JPanel();
        p2.setBounds(0,0,550,300);


        JLabel name, street, city, zip, address, phone, age, description;
        JTextField tn,tstr,tcity,tzip, tphone, tage;
        JTextArea desc;
        JButton submit = new JButton("Submit");
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill= GridBagConstraints.HORIZONTAL;
        gbc.insets= new Insets(2,5,2,5);


        JFrame ventana = new JFrame("GridbagLayout build");

        ventana.setSize(500,500);
        ventana.setResizable(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JTextField nombre, calle, ciudad, codigo_postal, telefono, edad, descripcion;
        JButton boton = new JButton("Submit");
        JPanel panel = new JPanel();


        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(2,5,2,5);
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;

        name = new JLabel("Full Name");
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(name,gbc);


        nombre = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        panel.add(nombre,gbc);

        street = new JLabel("Street");
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(street,gbc);

        city = new JLabel("City");
        gbc.gridx = 2;
        gbc.gridy = 1;
        panel.add(city,gbc);

        zip = new JLabel("Zip Code");
        gbc.gridx = 3;
        gbc.gridy = 1;
        panel.add(zip,gbc);

        address = new JLabel("Address");
        gbc.gridx = 0;
        gbc.gridy = 2;
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
        panel.add(phone,gbc);

        telefono = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(telefono,gbc);

        age = new JLabel("Age");
        gbc.gridx = 2;
        gbc.gridy = 3;
        panel.add(age,gbc);

        edad = new JTextField();
        gbc.gridx = 3;
        gbc.gridy = 3;
        panel.add(edad,gbc);

        description = new JLabel("Description");
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(description,gbc);

        descripcion = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(descripcion,gbc);


        ventana.add(panel);
        ventana.setVisible(true);
    }
}
