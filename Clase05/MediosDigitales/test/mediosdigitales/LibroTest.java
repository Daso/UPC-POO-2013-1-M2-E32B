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
public class LibroTest {
    
    public LibroTest() {
    }

     @Test
    public void deboPoderCrearUnLibro() {
         Libro miLibro = new Libro("Drácula","Brian Stoker",182);
         Assert.assertEquals("Drácula", miLibro.getTitulo());
        
    }
}