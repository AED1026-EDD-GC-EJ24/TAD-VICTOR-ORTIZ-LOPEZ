package miPrincipal;

// Se define la clase Matriz en el paquete miPrincipal
public class Matriz {
    private int n, m; // Variables para almacenar el número de filas y columnas de la matriz
    private int matriz[][]; // Matriz de enteros

    // Constructor por defecto que inicializa una matriz de 10x10
    public Matriz() {
        matriz = new int[10][10];
        n = 10;
        m = 10;
    }

    // Constructor que permite especificar el número de filas y columnas de la matriz
    public Matriz(int n, int m) throws PosicionIlegalException {
        // Verificar si el número de filas o columnas es negativo
        if (n < 0 || m < 0) {
            throw new PosicionIlegalException();
        }
        matriz = new int[n][m];
        this.n = n;
        this.m = m;
    }

    // Método para obtener el número de filas de la matriz
    public int getRenglon() {
        return n;
    }

    // Método para obtener el número de columnas de la matriz
    public int getColumna() {
        return m;
    }

    // Método para obtener la matriz
    public int[][] getMatriz() {
        return matriz;
    }

    // Método para asignar un valor a una posición específica de la matriz
    public void asignarMatriz(int r, int c, int valor) throws PosicionIlegalException {
        // Verificar si la posición está dentro de los límites de la matriz
        if (r >= n || c >= m || r < 0 || c < 0) {
            throw new PosicionIlegalException();
        }
        matriz[r][c] = valor;
    }

    // Método para obtener el valor de una posición específica de la matriz
    public int infoMat(int r, int c) throws PosicionIlegalException {
        // Verificar si la posición está dentro de los límites de la matriz
        if (r >= n || c >= m || r < 0 || m < 0) {
            throw new PosicionIlegalException();
        }
        return matriz[r][c];
    }

    // Método para obtener el número de filas de la matriz
    public int filasMat() {
        return n;
    }

    // Método para obtener el número de columnas de la matriz
    public int columnasMat() {
        return m;
    }
}
