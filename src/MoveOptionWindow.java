import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MoveOptionWindow {
    public static void main(String[] args) {


        JFrame ventana = new JFrame();

        ventana.setSize(800,800);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel main, panel, botones;
        main = new JPanel();
        panel = new JPanel();
        botones = new JPanel();

        JButton td, ti, iz, de;
        td = new JButton(">>");
        ti = new JButton("<<");
        iz = new JButton("<");
        de = new JButton(">");

        botones.setLayout(new GridLayout(4,1));
        botones.add(td);
        botones.add(de);
        botones.add(iz);
        botones.add(ti);


        DefaultListModel<String>lista_derecha = new DefaultListModel<>();
        DefaultListModel<String>lista_izquierda = new DefaultListModel<>();

        for (int i = 0; i<= 10; i++){
            lista_derecha.addElement("Objeto "+i);
        }

        JList<String > der = new JList<>(lista_derecha);
        JList<String > izq = new JList<>(lista_izquierda);

        JScrollPane scrollPane = new JScrollPane(der);
        JScrollPane scrollPane1 = new JScrollPane(izq);

        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(5,3,5,3);


        gbc.gridx = 0;
        gbc.gridy = 0;
        scrollPane.setPreferredSize(new Dimension(200,30));
        panel.add(scrollPane, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(botones, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        scrollPane1.setPreferredSize(new Dimension(200,30));
        panel.add(scrollPane1,gbc);



       td.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               for(int i = 0; i< lista_derecha.size();i++){

                   String elemento = lista_derecha.get(i);
                   lista_derecha.remove(i);
                   lista_izquierda.add(i+1,elemento);
           }
           }
       });


        main.add(panel);
        ventana.add(main);
        ventana.setVisible(true);

    }
}
