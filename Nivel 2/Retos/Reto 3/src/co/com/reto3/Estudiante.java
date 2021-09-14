package co.com.reto3;

/**
 * @author judmontoyaso
 */
public class Estudiante extends Persona{
     public Estudiante(String id, String nombre, String email, String idioma) {
          super(id, nombre, email, idioma);
     }

     @Override
     public void dirigir() {
          setUrl("educursos.com/"+ getIdioma() + "/estudiante" );
     }
}
