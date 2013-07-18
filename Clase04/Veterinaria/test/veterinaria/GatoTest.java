/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author proyecto
 */
public class GatoTest {
    private Gato gato;
    public GatoTest() {
        gato = new Gato();
    }

    @Test
    public void gatoDebeTenerNombre() {
        gato = new Gato("Bigotes");
        Assert.assertEquals("Bigotes", gato.getNombre());
    }
    
    @Test
    public void gatoPuedeTenerRaza(){
        gato = new Gato();
        gato.setRaza("Romano");
        Assert.assertEquals("Romano", gato.getRaza());
    }
    
    @Test
    public void gatoDebeDecirQueCome(){
        Assert.assertEquals("Como pescado", gato.comer());
    }
}
