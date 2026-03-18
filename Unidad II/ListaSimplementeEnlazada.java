
public class ListaSimplementeEnlazada<T> {

    private Nodo<T> cabeza;


    public void agregar(T valor) {

        Nodo<T> nuevoNodo = new Nodo<T>(valor);

        if (cabeza == null) {
            cabeza = nuevoNodo;

        } else {
            
            Nodo<T> actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
    }

    public void agregarAlInicio(T valor) {

        Nodo<T> nuevoNodo = new Nodo<T>(valor);
        nuevoNodo.setSiguiente(cabeza);
        cabeza = nuevoNodo;
       
    }

    public void agregarEnPosicion(T valor, int posicion) {
        if (posicion <= 0) {
            agregarAlInicio(valor);
            return;
        }

        Nodo<T> nuevoNodo = new Nodo<T>(valor);
        Nodo<T> actual = cabeza;
        int contador = 0;

        while (actual != null && contador < posicion - 1) {
            actual = actual.getSiguiente();
            contador++;
        }

        if (actual == null) {
            // Si la posición es mayor que el tamaño, agregar al final
            agregar(valor);
        } else {
            nuevoNodo.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(nuevoNodo);
        }
    }

    public void eliminar(T valor) {
        if (cabeza == null) {
            return; // Lista vacía, no hay nada que eliminar
        }

        if (cabeza.getValor().equals(valor)) {
            cabeza = cabeza.getSiguiente(); // Eliminar el nodo cabeza
            return;
        }

        Nodo<T> actual = cabeza;
        while (actual.getSiguiente() != null) {
            if (actual.getSiguiente().getValor().equals(valor)) {
                actual.setSiguiente(actual.getSiguiente().getSiguiente()); // Eliminar el nodo siguiente
                return;
            }
            actual = actual.getSiguiente();
        }
    }
    

    public void imprimir() {
        Nodo<T> actual = cabeza;
        while (actual != null) {
            System.out.print(actual.getValor() + " ");
            actual = actual.getSiguiente();
            
        }
     
    }


}
