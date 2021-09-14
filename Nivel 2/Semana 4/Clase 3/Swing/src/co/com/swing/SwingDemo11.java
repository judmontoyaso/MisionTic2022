package co.com.swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * @author judmontoyaso
 */
public class SwingDemo11 {

    private JFrame window;
    private JLabel welcome, number1, number2;
    private JTextField text1, text2;
    private JButton button1, button2;

    public SwingDemo11() {

        window = new JFrame("Ventana suma");

        welcome = new JLabel("Bienvenidos");
        number1 = new JLabel("Numero 1");
        number2 = new JLabel("Numero 2");

        text1 = new JTextField(10);
        text2 = new JTextField(10);

        button1 = new JButton("Sumar");
        button2 = new JButton("Salir");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "La suma es: " +  sumar());
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });

        window.setLayout(new FlowLayout());
        window.setSize(500,500);

        window.getContentPane().add(welcome);
        window.getContentPane().add(number1);
        window.getContentPane().add(text1);
        window.getContentPane().add(number2);
        window.getContentPane().add(text2);
        window.getContentPane().add(button1);
        window.getContentPane().add(button2);

        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




    }

    public int sumar() {
        try {
            int num1 = Integer.parseInt(text1.getText());
            int num2 = Integer.parseInt(text2.getText());

            return num1 + num2;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de lectura");
            return 0;
        }
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> new SwingDemo11());

    }

}


