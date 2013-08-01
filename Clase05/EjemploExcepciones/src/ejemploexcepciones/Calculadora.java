
package ejemploexcepciones;

public class Calculadora {
    
    public int dividir(int a, int b) throws MiExcepcion{
        if (a==5){
            throw new MiExcepcion("No vale el número 5");
        }
        if (b==0){
            throw new MiExcepcion("Oh por DIOS!?!? ¿qué hiciste?");
        }
        return a / b;
    }
    
    public void arreglo(){
        int[] miArreglo = new int[3];
        miArreglo[5] = 19;
    }
    
}
