package miPrincipal;

// Se define la clase AppPunto en el paquete miPrincipal
public class AppPunto {

    // Método estático para imprimir el menú de operaciones con puntos
    public static void menu() {
        // Imprime una línea de separación
        System.out.println("==================================");
        // Imprime el título del menú
		System.out.println("    Operaciones con Puntos        ");
        // Imprime otra línea de separación
        System.out.println("==================================");
        
        // Se crean dos instancias de la clase Punto
        Punto p1 = new Punto();
        Punto p2 = new Punto();
        
        // Se invoca al método leer() para ingresar las coordenadas del punto p1
        p1.leer();
        // Se imprime el punto p1
        p1.despliega();
        
        // Se invoca al método leer() para ingresar las coordenadas del punto p2
        p2.leer();
        // Se imprime el punto p2
        p2.despliega();
        
        // Se calcula la distancia entre los puntos p1 y p2
        p1.distancia(p2);
    }
}
