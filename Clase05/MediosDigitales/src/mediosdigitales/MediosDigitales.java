package mediosdigitales;


public class MediosDigitales {

    public static void imprimir(String texto){
        System.out.println(texto);
    }
    
    public static void main(String[] args) {
       CD miCd = new CD("Sabina", "Yolo", 123, 34, 45);
       imprimir(Impresora.imprimir(miCd));
       Libro miLibro = new Libro("Pelotón", "Roman Urbish", 12);
       imprimir(Impresora.imprimir(miLibro));
       Persona miPersona = new Persona("Carlos");
       imprimir(Impresora.imprimir(miPersona));
    }
}
