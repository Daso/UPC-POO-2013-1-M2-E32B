
package coquito;

public class Mascota {
    private String nombre;

    public Mascota(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String moverCola(){
        return "Soy " + nombre + " y estoy moviendo la cola";
    }
    
    public String acercarse(){
        return "Soy " + nombre + " y me estoy acercando";
    }
}
