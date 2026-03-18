package Genericos;

public class intercambiar {
    

    public static <T> void intercambiar(T[] arreglo, int i, int j) {
        T temp = arreglo[i];
        arreglo[i] = arreglo[j];
        arreglo[j] = temp;
    }
    
    public static void main(String[] args) {
     
        Integer[] numeros = {1, 2, 3, 4, 5};
        System.out.println("Arreglo original (Integers):");
        imprimirArreglo(numeros);
        
        intercambiar(numeros, 0, 4);
        System.out.println("\nDespués de intercambiar índices 0 y 4:");
        imprimirArreglo(numeros);
        
    }
    
    // Método auxiliar para imprimir arreglos
    public static <T> void imprimirArreglo(T[] arreglo) {
        System.out.print("[");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
            if (i < arreglo.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
