package equipofutbol;


public class Jugador {
    private static int numero = 0 ;
    private String nombre;

    public Jugador(String nombre) {
        this.nombre = nombre;        
        contador();
    }

    public int getNumero() {
        return numero;
    }
        
    
    private void contador(){
        this.numero++;
    }
    
    
}
