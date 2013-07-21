package consulta;

public abstract class Alumno {
   private String nombre;
   private String apellido;
   
    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public Alumno() {
    }
    
    

    public String getNombre() {
        return nombre;
    }
   
   public String saludo(){
       return "Hola soy " + nombre;
   }
   
   public abstract double promedio(double a, double b);
    
}
