package co.com.transacciones;

public class OperacionesMain {
    public static void main(String[] args) {
        OperacionesInterfaces operacionesI = new OperacionesClase();
        operacionesI.insertarEmpleado(123,"Juan");
        operacionesI.actualizarEmpleado("David");
        operacionesI.borrarEmpleado(123);
        operacionesI.consultarEmpleado(123);
    }
}
