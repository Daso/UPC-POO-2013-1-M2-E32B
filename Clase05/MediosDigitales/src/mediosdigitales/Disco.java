
package mediosdigitales;


public abstract class Disco implements IImprimible{
     protected int minutos;
    protected int capacidad;
    protected int duracion; 

    public Disco() {
    }

    public Disco(int minutos, int capacidad, int duracion) {
        this.minutos = minutos;
        this.capacidad = capacidad;
        this.duracion = duracion;
    }
    
    
    
}
