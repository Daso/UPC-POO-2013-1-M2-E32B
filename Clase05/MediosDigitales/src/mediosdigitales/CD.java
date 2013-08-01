
package mediosdigitales;


public class CD extends Disco{
    private String artista;
    private String album;

    public CD() {
    }

    public CD(String artista, String album, int minutos, int capacidad, int duracion) {
        super(minutos, capacidad, duracion);
        this.artista = artista;
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }
  
    @Override
    public String imprimirme(){
        return "Titulo: "+this.album;
    }

  
    
    
    
}
