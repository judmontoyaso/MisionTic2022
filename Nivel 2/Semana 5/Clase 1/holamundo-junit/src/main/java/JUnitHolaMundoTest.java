import static org.junit.Assert.assertTrue;

import org.junit.*;


/**
 * @author judmontoyaso
 */

public class JUnitHolaMundoTest {
    private static JUnitHolaMundo holaMundo;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Antes de todos");
        holaMundo = new JUnitHolaMundo();
    }
    @Before
    public void before(){
        System.out.println("Antes de cada test");

    }

    @Test
    public void esMayorTest(){
        System.out.println("Ejecuta la prueba");
        assertTrue("num 1 no es mayor que el Num2", holaMundo.esMayor(4,3));

    }

    @After
    public void after(){
        System.out.println("Despues de cada prueba");

    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Despues de todas las prueba");

    }
}
