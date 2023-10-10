import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Eventos {

    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setSize(700,700);
        window.setResizable(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel main = new JPanel();
        JPanel panel = new JPanel(new GridBagLayout());
        JLabel list = new JLabel("JList");
        JLabel text = new JLabel();
        JTextField name = new JTextField();

        panel.setPreferredSize(new Dimension(500,300));

        Button add, delete, deleteList;

        DefaultListModel<String>addList = new DefaultListModel<>();
        JList<String > listaElementos = new JList<>(addList);
        JScrollPane scrollPane = new JScrollPane(listaElementos);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill=GridBagConstraints.BOTH;
        gbc.weightx=1.0;
        gbc.weighty=1.0;
        gbc.insets=new Insets(6,5,6,5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth=2;
        list.setHorizontalAlignment(SwingConstants.CENTER);
        list.setFont(new Font("Arial",Font.PLAIN,35));
        list.setBorder(new BevelBorder(BevelBorder.LOWERED));
        panel.add(list,gbc);

        list.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                list.setForeground(Color.red);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                list.setForeground(Color.BLACK);
            }
        });

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.ipadx = 100;
        gbc.gridwidth = 1;
        panel.add(name,gbc);

        add = new Button("Agregar");
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(add,gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.gridheight=2;
        panel.add(scrollPane,gbc);


        delete = new Button("Eliminar");
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        panel.add(delete,gbc);

        deleteList = new Button("Borrar lista");
        gbc.gridx = 1;
        gbc.gridy = 5;
        panel.add(deleteList,gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        panel.add(text,gbc);

        listaElementos.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

                text.setText("Seleccionado el elemento: "+listaElementos.getSelectedValue());
            }
        });


        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = name.getText();
                if (texto != null){
                    addList.addElement(texto);
                    text.setText("Elemento añadido: "+texto);
                    name.setText("");
                }
            }
        });



        main.add(panel);
        window.add(main);

        window.setVisible(true);
    }
}
