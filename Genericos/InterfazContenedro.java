package Genericos;

import java.util.ArrayList;
import java.util.List;

/**
 * Interfaz genérica que define operaciones básicas de un contenedor
 * @param <T> Tipo genérico de los elementos
 */
interface Contenedor<T> {
    /**
     * Agrega un elemento al contenedor
     * @param item El elemento a agregar
     */
    void agregar(T item);
    
    /**
     * Obtiene un elemento en la posición indicada
     * @param indice La posición del elemento
     * @return El elemento en la posición especificada
     */
    T obtener(int indice);
    
    /**
     * Obtiene la cantidad de elementos en el contenedor
     * @return El tamaño del contenedor
     */
    int tamaño();
    
    /**
     * Método main dentro de la interfaz para permitir ejecución directa
     * (opcional, sólo a modo de demostración)
     */
    static void main(String[] args) {
        System.out.println("Main de Contenedor ejecutado");
        // Crear una instancia de la implementación y hacer una prueba rápida
        Contenedor<String> prueba = new InterfazContenedro<>();
        prueba.agregar("uno");
        prueba.agregar("dos");
        System.out.println("Primer elemento: " + prueba.obtener(0));
        System.out.println("Tamaño: " + prueba.tamaño());
    }
}

/**
 * Implementación de la interfaz Contenedor usando ArrayList
 * @param <T> Tipo genérico de los elementos
 */
public class InterfazContenedro<T> implements Contenedor<T> {
    private List<T> elementos;
    
    /**
     * Constructor que inicializa la lista
     */
    public InterfazContenedro() {
        this.elementos = new ArrayList<>();
    }
    
    /**
     * Agrega un elemento a la lista
     * @param item El elemento a agregar
     */
    @Override
    public void agregar(T item) {
        elementos.add(item);
    }
    
    /**
     * Obtiene un elemento en la posición indicada
     * @param indice La posición del elemento
     * @return El elemento en la posición especificada
     */
    @Override
    public T obtener(int indice) {
        if (indice < 0 || indice >= elementos.size()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango: " + indice);
        }
        return elementos.get(indice);
    }
    
    /**
     * Obtiene el tamaño del contenedor
     * @return La cantidad de elementos
     */
    @Override
    public int tamaño() {
        return elementos.size();
    }
    
    /**
     * Imprime todos los elementos del contenedor
     */
    public void mostrarElementos() {
        System.out.print("[");
        for (int i = 0; i < elementos.size(); i++) {
            System.out.print(elementos.get(i));
            if (i < elementos.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    public static void main(String[] args) {
        // Ejemplo con Integers
        System.out.println("--- Contenedor de Integers ---");
        InterfazContenedro<Integer> contenedorInt = new InterfazContenedro<>();
        contenedorInt.agregar(10);
        contenedorInt.agregar(20);
        contenedorInt.agregar(30);
        
        System.out.println("Elementos: ");
        contenedorInt.mostrarElementos();
        System.out.println("Tamaño: " + contenedorInt.tamaño());
        System.out.println("Elemento en índice 2: " + contenedorInt.obtener(2));
      
    }
}
