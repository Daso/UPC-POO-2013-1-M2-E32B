
package consulta;

public class AlumnoPRE extends Alumno{

    public AlumnoPRE(String nombre) {
        super(nombre);
    }

    @Override
    public double promedio(double a, double b) {
        return (2*a + b) / 2;
    }
    
    
    
}
