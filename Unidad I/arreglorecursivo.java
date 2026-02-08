


public class arreglorecursivo {

	/**
	 * Recorre el arreglo desde el índice dado hacia adelante e imprime cada elemento.
	 * Versión recursiva "adelante".
	 */
	public static void recorrerAdelante(int[] arr, int idx) {
		if (arr == null) {
			System.out.println("[recorrerAdelante] Arreglo null.");
			return; //caso base 
		}
		if (idx >= arr.length) {
			return; // caso base 
		}
		// acción: procesar elemento actual
		System.out.println(arr[idx]);
		// llamada recursiva al siguiente índice
		recorrerAdelante(arr, idx + 1); // caso recursivo 
	}
	/**
	 * Recorre el arreglo desde el índice dado hacia atrás e imprime cada elemento.
	 * Versión recursiva "inversa".
	 */
	public static void recorrerInvertido(int[] arr, int idx) {
		if (arr == null) {
			System.out.println("[recorrerInvertido] Arreglo null.");
			return; //caso base 
		}
		if (idx < 0) {
			
			return; // caso base 
		}
		System.out.println(arr[idx]);
		recorrerInvertido(arr, idx - 1); // caso recursivo
	}
	
	 

	public static void main(String[] args) {
		// Ejemplo de uso
		int[] ejemplo = { 10, 20, 30, 40, 50 };

		System.out.println("Recorrido recursivo (adelante):");
		recorrerAdelante(ejemplo, 0);

		System.out.println();
		System.out.println("Recorrido recursivo (invertido):");
		recorrerInvertido(ejemplo, ejemplo.length - 1);

		System.out.println();
		// Casos borde
		System.out.println("Caso borde: arreglo vacío");
		demo(new int[0]);

		System.out.println();
		System.out.println("Caso borde: arreglo null");
		demo(null);
	}
}


