package consulta;

import java.util.ArrayList;

public class Curso {
    private String codigo;
    private String nombre;
    private Alumno[] alumnos;
    private int matriculados;
                
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.alumnos = new Alumno[20];
        this.matriculados = 0;
    }
    
    public void matricular(Alumno alumno){
       
        alumnos[matriculados] = alumno;
        matriculados++;
       
    }
    
    public int cantidadDeMatriculados(){
        return matriculados;
    }
    
    public Alumno[] listaDeMatriculados(){
        return alumnos;
    }
    
    
    
    
}
