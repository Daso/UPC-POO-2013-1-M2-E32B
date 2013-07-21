
package facturacion;

public class Factura {
    private String RUC;
    private Detalle[] detalles;
    private int cantidadDeDetalle;
    
    public void crearDetalle(){
        Detalle detalle = new Detalle();
        detalles[cantidadDeDetalle] = detalle;
        cantidadDeDetalle++;
    }
    
}
