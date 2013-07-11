
package coquito;


public class Alumno {
    private String nombre;
    private int edad;
    private Mascota mascota;

    public Alumno(String nombre, int edad, String nombreConejo) {
        
        this.nombre = nombre;
        this.edad = edad;
        this.mascota = new Mascota(nombreConejo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String tocarOreja(){
        
        return "Soy "+ nombre + " y toco la oreja del conejo " + mascota.getNombre() + " " + mascota.moverCola();
        
        
    }
    
    public String mostrarZanahoria(){
        return "Soy "+ nombre + " y muestro zanahoria al conejo " + mascota.getNombre() +" "+ mascota.acercarse();
    }
    
    
    
}
