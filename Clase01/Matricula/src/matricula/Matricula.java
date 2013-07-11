package matricula;


public class Matricula {

    
    public static void main(String[] args) {
     
        Alumno alumno = new Alumno("001", "Carlos", "Sanchez");
        Alumno alumno2 = new Alumno("002", "Pedro", "Gomez");
        System.out.println("Primer Programa");
        System.out.println(alumno.saludar());
        System.out.println(alumno2.saludar());
        
        
        
    }
}
