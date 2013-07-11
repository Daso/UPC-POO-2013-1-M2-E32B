
package turismo;


public class Turismo {
    private Bus[] buses;
    private Pasajero[] pasajeros;

    public Turismo() {
       buses = new Bus[3];
       pasajeros = new Pasajero[5];
       
       buses[0] = new Bus(1, "Cuzco");
       buses[1] = new Bus(2, "Arequipa");
       buses[2] = new Bus(3, "lima");
       
       pasajeros[0] = new Pasajero("Carlos", "Perez");
       pasajeros[1] = new Pasajero("Sandra", "Gomez");
       pasajeros[2] = new Pasajero("Felipe", "Garcia");
       pasajeros[3] = new Pasajero("Alain", "Espejo");
       
       buses[0].subirPasajero(pasajeros[0]);
       buses[0].subirPasajero(pasajeros[1]);
       buses[0].subirPasajero(pasajeros[2]);
       buses[1].subirPasajero(pasajeros[3]);
       
    }
    
    
   
    public void consulta(int numero){
       System.out.println("-----------------------");
        String mensaje ="Lista de Pasajeros";
        System.out.println(mensaje);
        System.out.println(buses[numero-1].listaDePasajeros());
        System.out.println("Capacidad");
        System.out.println(buses[numero-1].asientosDisponibles());  
    }
    
    public static void main(String[] args) {
        Turismo turismo = new Turismo();
        turismo.consulta(1);
        turismo.consulta(2);
      
       
     
            
    }
}
