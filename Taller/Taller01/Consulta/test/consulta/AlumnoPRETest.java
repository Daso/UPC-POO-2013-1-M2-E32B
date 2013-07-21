
package consulta;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


public class AlumnoPRETest {
     private AlumnoPRE alumnoPre;
     
    public AlumnoPRETest() {
        alumnoPre = new AlumnoPRE("Silvia");
    }
    
     @Test
    public void unAlumnoSiempreDebeTenerNombre() {
        Assert.assertEquals("Silvia", alumnoPre.getNombre());
    }

    @Test
    public void unAlumnoDebePoderSaludar() {

        Assert.assertEquals("Hola soy Silvia", alumnoPre.saludo());
    }

     @Test
    public void debePoderCalcularSuPromedio() {      
        Assert.assertEquals(25.0,alumnoPre.promedio(20.0, 10.0),0.0);
    }
}
