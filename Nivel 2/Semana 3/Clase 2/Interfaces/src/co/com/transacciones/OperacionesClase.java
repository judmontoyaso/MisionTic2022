package co.com.transacciones;

public class OperacionesClase implements OperacionesInterfaces{
    @Override
    public String insertarEmpleado(int id, String nombre) {
        System.out.println( " Se inserto el empleado con nombre: " + nombre);
        return "Se realizo el insert";
    }

    @Override
    public String actualizarEmpleado(String nombre) {
        System.out.println( " Se actualizo el empleado: " + nombre);
        return "Se realizo la actualizacion";
    }

    @Override
    public String borrarEmpleado(int id) {
        System.out.println("Se borro el empleado con id: " + id);
        return "Se realizo el borrado";
    }

    @Override
    public String consultarEmpleado(int id) {
        System.out.println("Se consulto el empleado con id: " + id);
        return "Se realizo la consulta";
    }
}
