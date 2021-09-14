package co.com.swing;
import javax.swing.*;
import java.awt.*;

public class SwingDemo3{

    SwingDemo3(){
        JFrame ventana = new JFrame("FlowLayout");
        Container contenedor = ventana.getContentPane();
        contenedor.setLayout(new FlowLayout());

        JButton boton1 = new JButton("uno");
        JButton boton2 = new JButton("dos");
        JButton boton3 = new JButton("tres");
        JButton boton4 = new JButton("cuatro");
        JButton boton5 = new JButton("cinco");

        contenedor.add(boton1);
        contenedor.add(boton2);
        contenedor.add(boton3);
        contenedor.add(boton4);
        contenedor.add(boton5);

        ventana.setSize(200,200);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo3();
            }
        });

    }

}

