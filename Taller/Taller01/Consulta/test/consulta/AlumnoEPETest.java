package consulta;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class AlumnoEPETest {

    private AlumnoEPE alumnoEpe;

    public AlumnoEPETest() {
        alumnoEpe = new AlumnoEPE("Jorge");
    }

    @Test
    public void unAlumnoSiempreDebeTenerNombre() {
        Assert.assertEquals("Jorge", alumnoEpe.getNombre());
    }

    @Test
    public void unAlumnoDebePoderSaludar() {

        Assert.assertEquals("Hola soy Jorge", alumnoEpe.saludo());
    }

    @Test
    public void debePoderCalcularSuPromedio() {

        Assert.assertEquals(18.0, alumnoEpe.promedio(18.0, 18.0), 0.0);
    }
}
