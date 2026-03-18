

public class Main {

      public static void main(String[] args) {

        ListaSimplementeEnlazada<Object> lista = new ListaSimplementeEnlazada<>();
        lista.agregar("Hola");
        lista.agregar(20);
        lista.agregar("Adios");

        System.out.println();
        lista.imprimir();

        lista.agregarAlInicio("Inicio");
        lista.agregarAlInicio(10);

        System.out.println("Después de agregar al inicio:");
        lista.imprimir();

    System.out.println("Después de eliminar el valor 20:");

        lista.eliminar(20);
          
         lista.imprimir();

        lista.agregarEnPosicion("Vaca", 2);
        System.out.println("Después de agregar 'Vaca' en posición 2:");
        lista.imprimir();
   
    }
}
