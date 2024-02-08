package miPrincipal;

// Se define la clase Rational en el paquete miPrincipal
public class Rational {

    // Arreglo para almacenar el numerador y el denominador de un número racional
    private int r[] = new int[2];

    // Constructor por defecto que inicializa el número racional como 1/1
    public Rational() {
        r[0] = 1;
        r[1] = 1;
    }

    // Constructor que recibe un numerador y un denominador para inicializar el número racional
    public Rational(int a, int b) throws PosicionIlegalException {
        // Verificar si el denominador es positivo
        if (b <= 0) {
            throw new PosicionIlegalException();
        }
        r[0] = a;
        r[1] = b;
    }

    // Método getter para obtener el numerador del número racional
    public int getNumerador() {
        return r[0];
    }

    // Método getter para obtener el denominador del número racional
    public int getDenominador() {
        return r[1];
    }

    // Método setter para establecer el numerador del número racional
    public void setNumerador(int a) {
        r[0] = a;
    }

    // Método setter para establecer el denominador del número racional
    public void setDenominador(int a) {
        r[1] = a;
    }

    // Método para sumar dos números racionales
    public Rational add(Rational a, Rational b) {
        Rational x = new Rational();
        x.setNumerador(a.getDenominador() * b.getNumerador() + b.getDenominador() * a.getNumerador());
        x.setDenominador(a.getDenominador() * b.getDenominador());
        return x;
    }

    // Método para multiplicar dos números racionales
    public Rational mult(Rational a, Rational b) {
        Rational x = new Rational();
        x.setNumerador(a.getNumerador() * b.getNumerador());
        x.setDenominador(a.getDenominador() * b.getDenominador());
        return x;
    }

    // Método para verificar si dos números racionales son iguales
    public boolean equal(Rational a, Rational b) {
        return a.getDenominador() * b.getNumerador() == b.getDenominador() * a.getNumerador();
    }

    // Método toString para representar el número racional como una cadena de caracteres
    @Override
    public String toString() {
        return r[0] + "/" + r[1];
    }
}
