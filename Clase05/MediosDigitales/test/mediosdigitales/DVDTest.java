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
public class DVDTest {
    
    public DVDTest() {
    }

     @Test
    public void deboPoderCrearUnDVD() {
         DVD miDvd = new DVD("Pelotón",30,350,82);
         Assert.assertEquals("Pelotón", miDvd.getTitulo());
        
    }
}