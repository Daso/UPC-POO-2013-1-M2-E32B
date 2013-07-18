
package saludo;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Saludo {

    
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String edad = " ";
        System.out.println("Ingresa tu edad");
        try {
            edad = in.readLine();
        } catch (Exception e) {
        }
        System.out.println("tu edad es " + edad + ", mucho gusto");
        
    }
}
