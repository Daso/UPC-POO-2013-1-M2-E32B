
package veterinaria;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class PerroTest {
    private Perro perro;
    public PerroTest() {
        perro = new Perro();
    }

    @Test
    public void perroDebeTenerNombre() {    
        perro = new Perro("Fido");
        Assert.assertEquals("Fido", perro.getNombre());
    }
    
    @Test
    public void perroPuedeTenerRaza(){
        perro = new Perro();
        perro.setRaza("Boxer");
        Assert.assertEquals("Boxer", perro.getRaza());
    }
    
    @Test
    public void perroDebeTenerTamanho(){
        perro.setTamanho("Grande");
        Assert.assertEquals("Grande", perro.getTamanho());
    }
    
    @Test
    public void perroDebeLadrar(){
        perro = new Perro("Fido");
        Assert.assertEquals("Guau mi nombre es Fido", perro.ladrar());
    }
    
    @Test
    public void perroDebeDecirQueCome(){
        Assert.assertEquals("Como carne", perro.comer());
    }
}
