
package veterinaria;

public class Perro extends Mascota{

    private String tamanho;
    
    public Perro() {
    }
        
    public Perro(String nombre) {
        super(nombre);
    }   

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    public String ladrar(){
        return "Guau mi nombre es " + this.nombre;
    }
    
    @Override
    public String comer(){
        return "Como carne";
    }
    
    
}
