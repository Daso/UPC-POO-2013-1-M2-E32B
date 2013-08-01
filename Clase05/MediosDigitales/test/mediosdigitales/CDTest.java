/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediosdigitales;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author operador
 */
public class CDTest {
    private CD cd;
    public CDTest() {
      cd = new CD();
    }

    @Test
    public void deboPoderCrearUnCD() {
         CD miCd = new CD("Sabina","Dímelo en la calle",20,250,72);
         Assert.assertEquals("Sabina", miCd.getArtista());
        
    }
}