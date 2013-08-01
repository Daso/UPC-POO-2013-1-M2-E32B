/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediosdigitales;

/**
 *
 * @author operador
 */
public class DVD extends Disco{
    private String titulo;

    public DVD() {
        
    }

    public DVD(String titulo, int minutos, int capacidad, int duracion) {
        super(minutos, capacidad, duracion);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
    @Override
    public String imprimirme(){
        return "Título: "+this.titulo;
    }
}
