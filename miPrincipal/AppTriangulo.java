package miPrincipal;

// Se define la clase AppTriangulo en el paquete miPrincipal
public class AppTriangulo {

    // Método estático para imprimir el menú de operaciones con triángulos
    public static void menu() {
        // Imprime una línea de separación
        System.out.println("==================================");
        // Imprime el título del menú
		System.out.println("    Operaciones con Triangulo     ");
        // Imprime otra línea de separación
        System.out.println("==================================");
        
        // Se crean tres puntos que representan los vértices del triángulo
        Punto v1 = new Punto(1,2);
		Punto v2 = new Punto(1,6);
		Punto v3 = new Punto(4,4);
		
		// Se crea un array para almacenar las longitudes de los lados del triángulo
		double lados[] = {0, 0, 0};
		
		// Se crea una instancia de la clase Triangulo con los puntos v1, v2 y v3
		Triangulo t1 = new Triangulo(v1, v2, v3);
		
		// Se calculan las longitudes de los lados del triángulo
		lados = t1.longuitudes();
		
		// Se imprimen las longitudes de los lados del triángulo
		System.out.println("Lado 1: " + lados[0]);
		System.out.println("Lado 2: " + lados[1]);
		System.out.println("Lado 3: " + lados[2]);
    }
}
