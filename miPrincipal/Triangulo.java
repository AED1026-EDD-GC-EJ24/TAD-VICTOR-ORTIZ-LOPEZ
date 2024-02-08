package miPrincipal;

// Se define la clase Triangulo en el paquete miPrincipal
public class Triangulo {
    // Variables de instancia para representar los vértices del triángulo
    private Punto v1, v2, v3;
    
    // Arreglo para almacenar las longitudes de los lados del triángulo
    private double longLados[] = new double[3];

    // Constructor que recibe tres puntos que representan los vértices del triángulo
    public Triangulo(Punto v1, Punto v2, Punto v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    // Método para calcular las longitudes de los lados del triángulo
    public double[] longuitudes() {
        // Calcula la longitud de cada lado del triángulo usando el método distancia de la clase Punto
        longLados[0] = v1.distancia(v2);
        longLados[1] = v2.distancia(v3);
        longLados[2] = v3.distancia(v1);
        
        // Devuelve el arreglo con las longitudes de los lados
        return longLados;
    }
}

