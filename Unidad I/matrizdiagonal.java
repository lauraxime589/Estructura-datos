

public class matrizdiagonal {

	// Rellena la diagonal principal: m[i][i] = val, recursivamente por índice i
	public static void fillDiagonal(int[][] m, int i, int val) {
		if (m == null) return;                // CASO BASE: matriz null
		if (i >= m.length) return;            // CASO BASE: hemos pasado la última fila/diagonal

		m[i][i] = val;                        // acción: asignar en la diagonal
		// LLAMADA RECURSIVA: siguiente elemento diagonal
		fillDiagonal(m, i + 1, val + 1);
	}

	// Imprime toda la matriz recursivamente (r: fila, c: columna)
	public static void printMatrix(int[][] m, int r, int c) {
		if (m == null) return;                // CASO BASE: matriz null
		if (r >= m.length) return;            // CASO BASE: ya no hay más filas

		if (c >= m[0].length) {
			System.out.println();
			// LLAMADA RECURSIVA: pasar a la siguiente fila
			printMatrix(m, r + 1, 0);
			return;
		}
		System.out.print(m[r][c] + " "); 
		// LLAMADA RECURSIVA: siguiente columna
		printMatrix(m, r, c + 1);
	}
	// Recorre e imprime solo la diagonal (i=0..n-1) recursivamente
	public static void printDiagonal(int[][] m, int i) {
		if (m == null) return;                // CASO BASE: matriz null
		if (i >= m.length) return;            // CASO BASE: fin de diagonal

		System.out.println("m[" + i + "][" + i + "] = " + m[i][i]);
		// LLAMADA RECURSIVA: siguiente índice diagonal
		printDiagonal(m, i + 1);
	}

	// Main de ejemplo: crea matriz 4x4, rellena diagonal y recorrela
	public static void main(String[] args) {
		int n = 4;
		int[][] m = new int[n][n];

		// Rellenar diagonal recursivamente (valores 1,2,3,...)
		fillDiagonal(m, 0, 1);

		System.out.println("Matriz completa:");
		printMatrix(m, 0, 0);

		System.out.println();
		System.out.println("Diagonal (recorrido recursivo):");
		printDiagonal(m, 0);
	}
}
