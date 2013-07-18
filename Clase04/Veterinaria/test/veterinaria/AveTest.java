package veterinaria;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class AveTest {
    private Ave ave;
    public AveTest() {
        ave = new Ave();
    }

    @Test
    public void aveDebeExistir() {        
        Assert.assertNotNull(ave);
    }
    
    @Test
    public void aveDebeTenerNombre(){
        ave = new Ave("Piolin");
        Assert.assertEquals("Piolin",ave.getNombre());
    }
    
     @Test
    public void gatoPuedeTenerRaza(){
        ave = new Ave();
        ave.setRaza("Canario");
        Assert.assertEquals("Canario", ave.getRaza());
    }
      @Test
    public void aveDebeDecirQueCome(){
        Assert.assertEquals("Como alpiste", ave.comer());
    }
}
