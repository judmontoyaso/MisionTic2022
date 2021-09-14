package co.com.swing;

import javax.swing.*;
import java.awt.*;

/**
 * @author judmontoyaso
 */

public class SwingDemo10 {

    public SwingDemo10(){

        //Se crea ventana
        JFrame window = new JFrame("Formulario");

        //Se crea panel primario
        JPanel leftPanel = new JPanel();
        JPanel rigthPanel = new JPanel();
        JPanel bottomPanel = new JPanel();
        JPanel headPanel = new JPanel();

        //Se crea panel para agregar nombre
        JLabel name = new JLabel("Nombre");
        JLabel lastname = new JLabel("Apellido");
        JLabel telephone = new JLabel("Telefono");
        JLabel id = new JLabel("Identificación");

        //Se crean textfield

        JTextField nameT1 = new JTextField();
        JTextField lastnameT2 = new JTextField();
        JTextField telephoneT3 = new JTextField();
        JTextField idT4 = new JTextField();

        //se crean botones
        JButton button1 = new JButton();
        JButton button2 = new JButton();

        // se añaden propiedades a la ventana
        window.setVisible(true);
        window.setLayout(new FlowLayout());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(300,200);

        //se añaden nombres a los botones
        button1.setText("Aceptar");
        button2.setText("Cancelar");

        //Se ubican los paneles creados
        leftPanel.setLayout( new GridLayout(4,1));
        leftPanel.add(name);
        leftPanel.add(lastname);
        leftPanel.add(telephone);
        leftPanel.add(id);

        rigthPanel.setLayout(new GridLayout(4,1));
        rigthPanel.add(nameT1);
        rigthPanel.add(lastnameT2);
        rigthPanel.add(telephoneT3);
        rigthPanel.add(idT4);

        bottomPanel.setLayout(new FlowLayout());
        bottomPanel.setPreferredSize(new Dimension(200,50));
        bottomPanel.add(button1);
        bottomPanel.add(button2);

        headPanel.setLayout(new GridLayout(1,2));
        headPanel.setPreferredSize(new Dimension(250,100));
        headPanel.add(leftPanel);
        headPanel.add(rigthPanel);

        //Se crea un nuevo panel para contener todos los componentes
        JPanel completePanel = new JPanel();
        completePanel.setLayout(new GridLayout(2,1));
        completePanel.add(headPanel);
        completePanel.add(bottomPanel);

        window.getContentPane().add(completePanel);




    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(SwingDemo10::new);

    }

}
