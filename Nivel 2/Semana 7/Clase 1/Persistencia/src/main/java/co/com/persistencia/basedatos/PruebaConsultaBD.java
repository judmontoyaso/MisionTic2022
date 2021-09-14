package co.com.persistencia.basedatos;
import java.sql.*;

/**
 * @author judmontoyaso
 */
public class PruebaConsultaBD {
    public static void main(String[] args) {
        try{
            int documentoVendedor;
            String nombre;
            String apellidos;
            String ciudad;

            //Se carga el driver correspondiente a MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Establecer conexión con la base de datos
            //tener en cuenta el puerto, usuario y contraseña para la conexion a la base de datos

            String url = "jdbc:mysql://localhost:3306/consecionario";
            Connection conexion = DriverManager.getConnection(url, "judmontoyasodb", "juan0521");

            //Se crea la consulta con la base de datos
            String sentencia = "SELECT * FROM vendedores";
            Statement consulta = conexion.createStatement();

            //Se crea un ResultSet con los resultados de la consulta
            ResultSet resultados = consulta.executeQuery(sentencia);

            System.out.println("Listado de vendedores: ");
            System.out.println("_______________________");

            while (resultados.next()){
                documentoVendedor = resultados.getInt("documento_vendedor");
                nombre = resultados.getString("nombres");
                apellidos = resultados.getString("apellidos");
                ciudad = resultados.getString("ciudad");


                System.out.println("Documento: " + documentoVendedor);
                System.out.println("Nombre: " + nombre);
                System.out.println("Apellidos: " + apellidos);
                System.out.println("Ciudad: " + ciudad);
                System.out.println("_______________________");

            }

            conexion.close();

        } catch (SQLException e) {

            System.out.println("Hubo un error al acceder a la base de datos: " + e.getMessage() + e.getErrorCode());

        } catch (ClassNotFoundException e) {
            System.out.println("no Fue posible cargar el driver");
        }
    }
}
