/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ripley;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pcsidsub
 */
public class ReporteTest {
    
    public ReporteTest() {
    }

    @Test
    public void deboPoderImprimirUnaPersona() {
        Persona persona = new Persona();
        Assert.assertEquals("Soy persona", Reporte.imprimir(persona));
    }
    
    @Test
    public void deboPoderImprimirUnaCarro(){
        Carro carro = new Carro();
        Assert.assertEquals("Soy un carro", Reporte.imprimir(carro));
    }
    
    @Test
    public void deboPoderImprimirUnaRefrigeradora(){
        Refrigeradora refrigeradora = new Refrigeradora();
        Assert.assertEquals("Soy una refrigeradora", Reporte.imprimir(refrigeradora));
    }
}