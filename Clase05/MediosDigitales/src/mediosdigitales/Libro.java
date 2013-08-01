
package mediosdigitales;

public class Libro implements IImprimible{
    private String titulo;
    private String autor;
    private int paginas;
    
    public Libro() {
    }

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String imprimirme() {
        return "Título: "+this.titulo;
    }
   
    
}
