package veterinaria;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


public class VeterinariaTest {
    
    private Veterinaria veterinaria;
    
    public VeterinariaTest() {
        veterinaria = new Veterinaria();
    }

    @Test
    public void deboPoderCrearUnPerro() {      
       Assert.assertEquals("Fido", veterinaria.crearPerro("Fido").getNombre());       
    }
    
    @Test
    public void deboPoderCrearUnGato(){
        Assert.assertEquals("Bigotes", veterinaria.crearGato("Bigotes").getNombre());
    }
    
    @Test
    public void deboPoderCrearUnAve(){
        Assert.assertNotNull(veterinaria.crearAve());
    }
}
