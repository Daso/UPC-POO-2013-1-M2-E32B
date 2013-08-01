package ejemploexcepciones;

public class EjemploExcepciones {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();



        try {
            System.out.println(calculadora.dividir(5, 3));
            calculadora.arreglo();
            System.out.println("Gracias por participar");
        } catch(MiExcepcion me){
            System.out.println("Ha ocurrido una MiExcepción");
            System.out.println(me.getMessage());
        } catch (ArithmeticException ae) {
            System.out.println("Ha ocurrido un error de división entre 0");
        } catch (IndexOutOfBoundsException ie) {
            System.out.println("Ha ocurrido un error de índice");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error");
        }
    }
}
