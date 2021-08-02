package co.com.transacciones;

public interface OperacionesInterfaces {
    public String insertarEmpleado (int id, String nombre);
    public String actualizarEmpleado (String nombre);
    public String borrarEmpleado (int id);
    public String consultarEmpleado (int id);
}
