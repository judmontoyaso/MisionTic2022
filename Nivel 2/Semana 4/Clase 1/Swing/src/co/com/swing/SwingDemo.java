package co.com.swing;
import javax.swing.*;

public class SwingDemo {
    SwingDemo(){
        //Creaun contenedor jframe equivale a una ventana
        JFrame ventana = new JFrame("Aplicacion Swing");

        //Dar tamaño inicial a la ventana
        ventana.setSize(475,200);

        //Terminar el programa al cerrar la aplicacion
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Crear un texto dentro de la ventana
        JLabel label = new JLabel(" Interfaz gráfica con Swing");

        //Añadir el componente a la clase contenedora
        ventana.add(label);

        //Visualizar ventana
        ventana.setVisible(true);


    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();

            }
        });

    }
}
