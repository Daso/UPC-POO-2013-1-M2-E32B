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
public class ImpresoraTest {
    private Impresora impresora;
    public ImpresoraTest() {
        impresora = new Impresora();
    }

    @Test
    public void deboPoderImprimirUnLibro() {
        Libro libro = new Libro("Yo Claudio", "Virgo Danis", 123);
        Assert.assertEquals("Título: Yo Claudio", Impresora.imprimir(libro));
    }
    @Test
    public void deboPoderImprimirUnCD() {
        CD cd = new CD("Sabina", "Yo", 123, 14, 145);
        Assert.assertEquals("Titulo: Yo", Impresora.imprimir(cd));
    }
    @Test
    public void deboPoderImprimirUnDVD() {
    }
}