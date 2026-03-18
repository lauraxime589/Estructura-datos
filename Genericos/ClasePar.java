package Genericos;

/**
 * Clase genérica que almacena dos elementos de tipo T
 * @param <T> Tipo genérico de los elementos
 */
public class ClasePar<T> {
    private T primero;
    private T segundo;
    
    /**
     * Constructor que inicializa los dos elementos
     */
    public ClasePar(T primero, T segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }
    
    /**
     * Verifica si ambos elementos son iguales
     * @return true si son iguales, false en caso contrario
     */
    public boolean sonIguales() {
        if (primero == null && segundo == null) {
            return true;
        }
        if (primero == null || segundo == null) {
            return false;
        }
        return primero.equals(segundo);
    }
    
    // Getters y Setters
    public T getPrimero() {
        return primero;
    }
    
    public void setPrimero(T primero) {
        this.primero = primero;
    }
    
    public T getSegundo() {
        return segundo;
    }
    
    public void setSegundo(T segundo) {
        this.segundo = segundo;
    }
    
    @Override
    public String toString() {
        return "Par [" + primero + ", " + segundo + "]";
    }
    
    public static void main(String[] args) {
    
        ClasePar<Integer> parNumeros = new ClasePar<>(5, 5);
        System.out.println(parNumeros);
        System.out.println("¿Son iguales? " + parNumeros.sonIguales());
        
        parNumeros.setSegundo(10);
        System.out.println(parNumeros);
        System.out.println("¿Son iguales? " + parNumeros.sonIguales());
        

    }
}
