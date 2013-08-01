
package mediosdigitales;


public class Persona implements IImprimible{
private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String imprimirme() {
        return "Hola, soy: " + this.nombre;
    }
    
}
