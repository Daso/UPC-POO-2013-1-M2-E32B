/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package equipofutbol;

/**
 *
 * @author proyecto
 */
public class EquipoFutbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador jugador = new Jugador("Carlos");
        System.out.println(jugador.getNumero());
        Jugador jugador1 = new Jugador("Pedro");
        System.out.println(jugador1.getNumero());      
        System.out.println(Equipo.imprimir(jugador));
        
        Equipo equipo = new Equipo();
        System.out.println(equipo.saludo());
    }
}
