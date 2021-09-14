package co.com.swing;
import javax.swing.*;
import java.awt.*;

/**
 * @author judmontoyaso
 */

public class SwingDemo7 {

    SwingDemo7() {

        JFrame ventana = new JFrame("Ejemplo dos paneles");
        Container contenedor = ventana.getContentPane();

        JPanel panelNorte = new JPanel();

        contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.Y_AXIS));
        panelNorte.add(new JButton("Norte 1"));
        panelNorte.add(new JButton("Norte 2"));
        panelNorte.add(new JButton("Norte 3"));
        contenedor.add(panelNorte, BorderLayout.NORTH);

        JPanel panelSur = new JPanel();
        panelSur.setLayout(new BoxLayout(panelSur, BoxLayout.PAGE_AXIS));

        JButton boton = new JButton("Sur 1");
        boton.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelSur.add(boton);
        JButton boton2 = new JButton("Sur 2");
        boton2.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelSur.add(boton2);
        JButton boton3 = new JButton("sur 3");
        boton3.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelSur.add(boton3);



        contenedor.add(panelSur);

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //pack sirve para autoajustar la ventana

        ventana.pack();
        ventana.setVisible(true);

    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo7();
            }
        });

    }
}
