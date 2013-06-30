
package matricula;

public class Matricula {

   
    public static void main(String[] args) {
        Alumno alumno = new Alumno("001", "Pedro", "Sanchez");
        Alumno alumno2 = new Alumno("002", "Carla", "Nuñez");
        System.out.println("Sistema de Matrícula");
        System.out.println( alumno.saludar() );
        System.out.println( alumno2.saludar());
        
    }
}
