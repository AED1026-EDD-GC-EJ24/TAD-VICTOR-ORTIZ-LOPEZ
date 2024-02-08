package miPrincipal;

import java.util.Scanner;

// Definición de la clase AppMatriz
public class AppMatriz {
    
    // Método que representa el menú de operaciones con matrices
    public static void menu() throws PosicionIlegalException {
        // Se imprime el encabezado del menú
        System.out.println("==================================");
		System.out.println("    Operaciones con Matrices      ");
        System.out.println("==================================");
        
        // Se solicita al usuario que ingrese el número de filas y columnas de la matriz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas de la matriz: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la matriz: ");
        int columnas = scanner.nextInt();
        
        // Se crea una nueva matriz con las dimensiones proporcionadas por el usuario
        Matriz m = new Matriz(filas, columnas);
        
        // Se solicita al usuario que llene la matriz
        System.out.println("Ingrese los valores de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "," + j + "]: ");
                int valor = scanner.nextInt();
                m.asignarMatriz(i, j, valor);
            }
        }
        
        // Se muestra la matriz ingresada por el usuario
        System.out.println("Matriz ingresada:");
        int[][] matriz = m.getMatriz();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        // Se imprime el número de filas y columnas de la matriz
        System.out.println("Filas = " + m.filasMat());
        System.out.println("Columnas = " + m.columnasMat());
    }
}
