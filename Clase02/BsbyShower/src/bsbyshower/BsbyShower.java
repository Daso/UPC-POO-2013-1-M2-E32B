/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bsbyshower;

/**
 *
 * @author proyecto
 */
public class BsbyShower {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Asistente asistente1 = new Asistente("Karla");
        Asistente asistente2 = new Asistente("Patricia");
        Asistente asistente3 = new Asistente("Sofia");
        
        System.out.println(asistente1.preguntarNombre(asistente2));
        System.out.println(asistente3.preguntarNombre(asistente1));
        
    }
}
