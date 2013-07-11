
package bsbyshower;


public class Asistente {
    private String nombre;

    public Asistente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String preguntarNombre(Asistente asistente){
        return "Hola soy "+ nombre + " y ella es: " + asistente.getNombre();
    }
    
}
