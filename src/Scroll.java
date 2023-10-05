import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.util.ArrayList;

public class Scroll {

    public static void main(String[] args) {

        JFrame window = new JFrame("My First Scroll");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(600,600);

        JLabel password = new JLabel("Password");
        JLabel text = new JLabel("Camp text");
        JLabel elements = new JLabel("List of elements");
        JPasswordField Pass = new JPasswordField(10);
        JTextArea area = new JTextArea(10,10);


        JPanel panel = new JPanel(new GridBagLayout());

        panel.setPreferredSize(new Dimension(600,400));
        JPanel panel2 = new JPanel();

        panel.setSize(400,600);


        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(2,5,2,5);
        gbc.weightx=1.0;
        gbc.weighty=1.0;

        ArrayList<String> listOfElements = new ArrayList<>();

        for (int i = 0 ; i<=10;i++){
            listOfElements.add("Element "+i);
        }

        DefaultListModel<String>addList = new DefaultListModel<>();
        for (String list : listOfElements){
            addList.addElement(list);
        }

        JList<String>addedList = new JList<>(addList);

        JScrollPane listElements = new JScrollPane(addedList);

        JScrollPane scrollPane;
        scrollPane = new JScrollPane(area);

        gbc.gridx=0;
        gbc.gridy=0;
        password.setHorizontalAlignment(SwingConstants.RIGHT);
        panel.add(password,gbc);

        gbc.gridx=1;
        gbc.gridy=0;
        panel.add(Pass,gbc);

        gbc.gridx=0;
        gbc.gridy=1;
        text.setHorizontalAlignment(SwingConstants.RIGHT);
        panel.add(text,gbc);

        gbc.gridx=1;
        gbc.gridy=1;
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        panel.add(scrollPane,gbc);

        gbc.gridx=0;
        gbc.gridy=2;
        elements.setHorizontalAlignment(SwingConstants.RIGHT);
        panel.add(elements,gbc);

        gbc.gridx=1;
        gbc.gridy=2;
        panel.add(listElements,gbc);

        JScrollPane panel1 = new JScrollPane(panel);

        panel2.add(panel1);

        window.add(panel2);
        window.setVisible(true);

    }
}
