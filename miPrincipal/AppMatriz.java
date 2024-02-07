package miPrincipal;

// Definición de la clase AppMatriz
public class AppMatriz {
    
    // Método que representa el menú de operaciones con matrices
    public static void menu() throws PosicionIlegalException {
        // Se imprime el encabezado del menú
        System.out.println("==================================");
		System.out.println("    Operaciones con Matrices      ");
        System.out.println("==================================");
        
        // Se crea una nueva matriz de tamaño 2x3
        Matriz m = new Matriz(2, 3);
        
        // Se asigna un valor a un elemento específico de la matriz
        m.asignarMatriz(0, 0, 5);
        // Se imprime el valor del elemento asignado anteriormente
        System.out.println("Valor del elemento 0,0=" + m.infoMat(0, 0));
        // Se imprime el valor de un elemento de la matriz que no ha sido asignado aún, lo que debería lanzar una excepción
        System.out.println("Valor del elemento 1,0=" + m.infoMat(1, 0));

        // Se intenta obtener el valor de un elemento de la matriz sin asignar, lo que debería lanzar una excepción
        m.infoMat(0, 0);
        
        // Se imprime el número de filas de la matriz
        System.out.println("Filas = " + m.filasMat());
        // Se imprime el número de columnas de la matriz
        System.out.println("Columnas =" + m.columnasMat());
    }
}
