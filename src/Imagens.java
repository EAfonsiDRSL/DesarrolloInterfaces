import javax.swing.*;
import java.awt.*;

public class Imagens {

    public static void main(String[] args) {


        JFrame ventana = new JFrame("Ventana con imagenes");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(600,600);

        JLabel etiqueta = new JLabel();
        etiqueta.setBounds(400,200,400,500);
        //etiqueta.setLocation(etiqueta.getX()+10,etiqueta.getY()+10);

        ImageIcon icon = new ImageIcon("C://Users//EliotAlfonsoAriasO//Pictures/kevin_page-0001.jpg");

        Image img = icon.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);

        icon = new ImageIcon(img);
        etiqueta.setIcon(icon);


        ventana.getContentPane().add(etiqueta, BorderLayout.CENTER);

        ventana.setVisible(true);

    }
}
