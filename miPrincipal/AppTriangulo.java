package miPrincipal;

import java.util.Scanner;

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

        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario las coordenadas de los vértices del triángulo
        System.out.println("Ingrese las coordenadas del primer vértice (x1 y1):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Ingrese las coordenadas del segundo vértice (x2 y2):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.println("Ingrese las coordenadas del tercer vértice (x3 y3):");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        // Crear los puntos con las coordenadas proporcionadas
        Punto v1 = new Punto(x1, y1);
        Punto v2 = new Punto(x2, y2);
        Punto v3 = new Punto(x3, y3);

        // Crear un triángulo con los puntos proporcionados
        Triangulo t1 = new Triangulo(v1, v2, v3);

        // Calcular las longitudes de los lados del triángulo
        double[] lados = t1.longitudes();

        // Imprimir las longitudes de los lados del triángulo
        System.out.println("Lado 1: " + lados[0]);
        System.out.println("Lado 2: " + lados[1]);
        System.out.println("Lado 3: " + lados[2]);

        // Calcular y mostrar el perímetro del triángulo
        double perimetro = t1.perimetro();
        System.out.println("Perímetro: " + perimetro);

        // Calcular y mostrar el área del triángulo
        double area = t1.area();
        System.out.println("Área: " + area);

        // Cerrar el scanner
        scanner.close();
    }

    // Clase para representar un punto en el plano cartesiano
    public static class Punto {
        private double x;
        private double y;

        public Punto(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }
    }

    // Clase para representar un triángulo en el plano cartesiano
    public static class Triangulo {
        private Punto v1;
        private Punto v2;
        private Punto v3;

        public Triangulo(Punto v1, Punto v2, Punto v3) {
            this.v1 = v1;
            this.v2 = v2;
            this.v3 = v3;
        }

        // Método para calcular las longitudes de los lados del triángulo
        public double[] longitudes() {
            double[] lados = new double[3];
            lados[0] = distancia(v1, v2);
            lados[1] = distancia(v2, v3);
            lados[2] = distancia(v3, v1);
            return lados;
        }

        // Método auxiliar para calcular la distancia entre dos puntos
        private double distancia(Punto p1, Punto p2) {
            return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
        }

        // Método para calcular el perímetro del triángulo
        public double perimetro() {
            double[] lados = longitudes();
            return lados[0] + lados[1] + lados[2];
        }

        // Método para calcular el área del triángulo
        public double area() {
            double[] lados = longitudes();
            double s = perimetro() / 2;
            return Math.sqrt(s * (s - lados[0]) * (s - lados[1]) * (s - lados[2]));
        }
    }
}

