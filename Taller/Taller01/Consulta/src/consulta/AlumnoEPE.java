package consulta;

public class AlumnoEPE extends Alumno{

    public AlumnoEPE(String nombre) {
        super(nombre);
    }

    @Override
    public double promedio(double a, double b) {
       return (a + b)/2;
    }

   
    
    
}
