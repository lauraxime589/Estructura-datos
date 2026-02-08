

public class MatrizRecurSimple {

  
    // Imprime la matriz recursivamente
    public static void printRec(int[][] m, int r, int c) {
        if (m == null) return;            // CASO BASE: matriz null
        if (r >= m.length) return;        // CASO BASE: ya no hay filas

        if (c >= m[0].length) {
            System.out.println();
            // LLAMADA RECURSIVA: siguiente fila
            printRec(m, r + 1, 0);
            return;
        }

        System.out.print(m[r][c] + " ");
        // LLAMADA RECURSIVA: siguiente columna
        printRec(m, r, c + 1);
    }

    // main simple: matriz 2x2
    public static void main(String[] args) {
        int[][] m = new int[2][2];
        
        printRec(m, 0, 0);
    }
}
