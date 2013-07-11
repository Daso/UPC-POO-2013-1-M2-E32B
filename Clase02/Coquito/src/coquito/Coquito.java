/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coquito;

/**
 *
 * @author proyecto
 */
public class Coquito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     
        Alumno alumno1 = new Alumno("Jorge", 8, "Colita");
        Alumno alumno2 = new Alumno("Patricia",10, "Rambo");
        
        
        System.out.println(alumno1.mostrarZanahoria());
        System.out.println(alumno2.mostrarZanahoria());
        System.out.println(alumno1.tocarOreja());
        System.out.println(alumno2.mostrarZanahoria());
        System.out.println(alumno1.mostrarZanahoria());
        
        
    }
}
