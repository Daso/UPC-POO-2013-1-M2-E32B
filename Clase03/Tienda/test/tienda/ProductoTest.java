/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProductoTest {
    
    public ProductoTest() {
    }

    @Test
    public void productoDebeTenerNombre() {
        Producto producto = new Producto("Chocolate", 10);
        Assert.assertEquals("Chocolate", producto.getNombre());        
    }
    
    @Test
    public void productoDebeTenerPrecio(){
        Producto producto = new Producto("Chocolate", 10);
        Assert.assertEquals(10.0, producto.getPrecio(),0);
    }
}
