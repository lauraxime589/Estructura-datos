package Genericos;
/**
 * Clase genérica que almacena un valor de tipo T
 * @param <T> Tipo genérico del contenido
 */
public class ClaseT<T> {
    private T contenido;
    
    /**
     * Constructor sin parámetros
     */
    public ClaseT() {
        this.contenido = null;
    }
    
    /**
     * Constructor con parámetro
     */
    public ClaseT(T valor) {
        this.contenido = valor;
    }
    
    /**
     * Guarda un valor de tipo T
     * @param valor El valor a guardar
     */
    public void guardar(T valor) {
        this.contenido = valor;
    }
    
    /**
     * Obtiene el valor almacenado
     * @return El valor de tipo T
     */
    public T obtener() {
        return this.contenido;
    }
    
    @Override
    public String toString() {
        return "ClaseT [contenido=" + contenido + "]";
    }
    
    public static void main(String[] args) {
       
        ClaseT<Integer> cajaInt = new ClaseT<>();
        cajaInt.guardar(42);
        System.out.println("Integer guardado: " + cajaInt.obtener());
     
    }
}
