
package turismo;


public class Bus {
    private int codigo;
    private String destino;
    private Pasajero[] pasajeros;
    private int capacidad;

    public Bus(int codigo, String destino) {
        this.codigo = codigo;
        this.destino = destino;
        this.pasajeros = new Pasajero[5];
        capacidad = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Pasajero[] getPasajero() {
        return pasajeros;
    }

    public void setPasajero(Pasajero[] pasajero) {
        this.pasajeros = pasajero;
    }

    public int getCapacidad() {
        return capacidad;
    }
    
    public String asientosDisponibles(){
        return "Quedan " + (5 - capacidad) + " asientos";
    }
    public String listaDePasajeros(){
        String mensaje = " ";
        for (int aux=0;aux < capacidad ;aux++){           
            mensaje += (pasajeros[aux].nombreCompleto());
            mensaje += " ";            
        }
     return mensaje;
    }
    
    public void subirPasajero(Pasajero pasajero){
        pasajeros[this.capacidad] = pasajero;
        this.capacidad++;        
    }
    
    
}
