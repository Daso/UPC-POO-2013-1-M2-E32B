
package tienda;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


public class CompraTest {
    
    public CompraTest() {
    }

    @Test
    public void deboPoderCrearUnaCompra() {
        Producto producto = new Producto("Canela", 20.0);
        Compra compra = new Compra("001", 3, producto);
        Assert.assertEquals("001", compra.getCodigo());
    }
}
