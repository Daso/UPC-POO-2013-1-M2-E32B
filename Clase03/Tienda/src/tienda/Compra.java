
package tienda;


public class Compra {
    private String codigo;
    private int cantidad;
    private Producto producto;

    public Compra(String codigo, int cantidad, Producto producto) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public String getCodigo() {
        return codigo;
    }
    
    
    
}
