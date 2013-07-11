
package tienda;


public class Tienda {

    
    public Producto crearProducto(String nombre, double precio){
        Producto producto = new Producto(nombre, precio);
        return producto;        
    }
    
    public Compra crearCompra(String codigo, int cantidad, Producto producto){
        Compra compra = new Compra(codigo, cantidad, producto);
        return compra;
    }
    
    public static void main(String[] args) {
        
    }
}
