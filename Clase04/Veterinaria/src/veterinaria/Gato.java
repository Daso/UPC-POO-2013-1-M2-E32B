
package veterinaria;


public class Gato extends Mascota{    

    public Gato() {
       
    }

    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public String comer() {
        return "Como pescado";
    }
    
    
        
}
