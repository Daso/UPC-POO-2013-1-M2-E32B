/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ripley;

/**
 *
 * @author pcsidsub
 */
public class Ripley {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Persona();
        Refrigeradora refri = new Refrigeradora();
        Carro carro = new Carro();
       System.out.println(Reporte.imprimir(refri));
       System.out.println(Reporte.imprimir(persona));
       System.out.println(Reporte.imprimir(carro));
    }
}
