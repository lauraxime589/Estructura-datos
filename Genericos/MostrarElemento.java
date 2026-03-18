package Genericos;

/**
 * Clase que proporciona un método genérico para mostrar elementos en consola
 */
public class MostrarElemento { 
  
    public static <T> void mostrar(T elemento) {
        System.out.println(elemento);
    }
    
    /**
     * Método genérico que imprime un elemento con un prefijo
     * @param <T> Tipo genérico del elemento
     * @param prefijo El prefijo para la salida
     * @param elemento El elemento a mostrar
     */
    public static <T> void mostrar(String prefijo, T elemento) {
        System.out.println(prefijo + elemento);
    }
    
    /**
     * Método genérico que imprime un arreglo de elementos
     * @param <T> Tipo genérico de los elementos
     * @param elementos Arreglo de elementos a mostrar
     */
    public static <T> void mostrarArreglo(T[] elementos) {
        System.out.print("[");
        for (int i = 0; i < elementos.length; i++) {
            System.out.print(elementos[i]);
            if (i < elementos.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    public static void main(String[] args) {
       
        System.out.println("--- Mostrando Integers ---");
        mostrar(42);
        mostrar("Número: ", 100);
    }
}
