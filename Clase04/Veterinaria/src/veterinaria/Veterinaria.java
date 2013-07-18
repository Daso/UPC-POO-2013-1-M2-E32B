package veterinaria;

public class Veterinaria {

    public Ave crearAve(){
        Ave ave = new Ave();
        return ave;
    }
   
    public Perro crearPerro(String nombrePerro){
        Perro perro = new Perro(nombrePerro);
        return perro;
    }
    
    public Gato crearGato(String nombreGato){
        Gato gato = new Gato(nombreGato);
        return gato;
    }
    
    public static void main(String[] args) {
        
    }
}
