package miPrincipal;

import java.util.Scanner;

// Se define la clase Punto en el paquete miPrincipal
public class Punto {

    // Variables de instancia para las coordenadas x, y, y z del punto
    private int x, y, z;

    // Constructor que recibe las coordenadas x e y
    public Punto(int coorx, int coory) {
        this.x = coorx;
        this.y = coory;
    }

    // Constructor que recibe las coordenadas x, y y z
    public Punto(int coorx, int coory, int coorz) {
        this.x = coorx;
        this.y = coory;
        this.z = coorz;
    }

    // Constructor por defecto que inicializa las coordenadas en (0, 0)
    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    // Método getter para obtener la coordenada x del punto
    public int getX() {
        return x;
    }

    // Método getter para obtener la coordenada y del punto
    public int getY() {
        return y;
    }

    // Método getter para obtener la coordenada z del punto
    public int getZ() {
        return z;
    }

    // Método setter para establecer la coordenada x del punto
    public void setX(int valor) {
        this.x = valor;
    }

    // Método setter para establecer la coordenada y del punto
    public void setY(int valor) {
        this.y = valor;
    }

    // Método setter para establecer la coordenada z del punto
    public void setZ(int valor) {
        this.z = valor;
    }

    // Método para leer las coordenadas del punto desde el usuario
    public void leer() {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Proporciona valor de x:");
            this.x = entrada.nextInt();
            System.out.print("Proporciona valor de y:");
            this.y = entrada.nextInt();
        }
    }

    // Método para mostrar las coordenadas del punto
    public void despliega() {
        System.out.println("valor de x:" + this.x);
        System.out.println("valor de y:" + this.y);
    }

    // Método para calcular la distancia entre dos puntos
    public double distancia(Punto p) {
        double d;
        d = Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
        return d;
    }
}
