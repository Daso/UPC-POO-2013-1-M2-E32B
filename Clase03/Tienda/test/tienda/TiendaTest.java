
package tienda;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


public class TiendaTest {
    
    public TiendaTest() {
    }

    @Test
    public void deboPoderCrearUnProducto() {
        Tienda tienda = new Tienda();
        String nombre = "Chocolate";
        double precio = 12.00;
      Assert.assertNotNull(tienda.crearProducto(nombre, precio));
    }
    
    @Test
    public void deboPoderCrearUnaCompra(){
        Tienda tienda = new Tienda();
        String codigo = "001";
        int cantidad = 1;
        Producto producto = new Producto("Canela", 50);
        Assert.assertNotNull(tienda.crearCompra(codigo, cantidad, producto));
    }
    
}
