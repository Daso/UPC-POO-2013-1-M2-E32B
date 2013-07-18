package veterinaria;

public class Ave extends Mascota{

    public Ave() {
    }

    public Ave(String nombre) {
        super(nombre);
    }

    @Override
    public String comer() {
        return "Como alpiste";
    }
    
    
    
}
