package consulta;

import java.util.ArrayList;


public class Consulta {

    
    
    public static void main(String[] args) {
      Alumno alumno01 = new AlumnoPRE("Jorge Perez");
      Alumno alumno02 = new AlumnoEPE("Manuel Ramos");
      Alumno alumno03 = new AlumnoPRE("Sandra Gonzales");
      
      Curso curso01 = new Curso("001", "Matemática I");
      Curso curso02 = new Curso("002", "Lengua II");
            
      curso01.matricular(alumno01);      
      curso01.matricular(alumno02);
      curso01.matricular(alumno03);
      
     Alumno[] alumnos = curso01.listaDeMatriculados();
      
      
      for(int aux = 0; aux < curso01.cantidadDeMatriculados(); aux++){
          System.out.println(alumnos[aux].saludo());
      }
        
        
      
      
      
      
      
      
      
    }
}
