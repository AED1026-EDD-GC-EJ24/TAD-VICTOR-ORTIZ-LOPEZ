package miPrincipal;

// Se define la clase Cadena en el paquete miPrincipal
public class Cadena {
    private char cadena[] = new char[80]; // Arreglo para almacenar la cadena de caracteres
    private int tamanio = 0; // Variable para almacenar el tamaño actual de la cadena
    private final int TOPE = 80; // Tamaño máximo de la cadena

    // Constructor por defecto
    public Cadena() {
        tamanio = 0;
    }

    // Constructor que recibe una cadena de caracteres como parámetro
    public Cadena(char[] cadena) {
        this.cadena = cadena;
    }

    // Método para borrar el primer carácter de la cadena
    public void borrarInicio() {
        for (int i = 0; i <= tamanio; i++) {
            cadena[i] = cadena[i + 1];
        }
        cadena[tamanio] = ' ';
        tamanio--;
        System.out.println("Valor de tamaño: " + tamanio);
    }

    // Método para agregar un carácter al final de la cadena
    public void agregarFinal(char c) throws PosicionIlegalException {
        // Verificar si la cadena está llena
        if (tamanio >= TOPE) {
            throw new PosicionIlegalException();
        }

        // Verificar si el carácter es una letra o un dígito
        boolean esLetraMinuscula = (c >= 'a' && c <= 'z');
        boolean esLetraMayuscula = (c >= 'A' && c <= 'Z');
        boolean esDigito = (c >= '0' && c <= '9');

        // Si el carácter no es una letra ni un dígito, lanzar una excepción
        if (!(esLetraMinuscula || esLetraMayuscula || esDigito)) {
            throw new PosicionIlegalException();
        }

        cadena[tamanio++] = c;
        System.out.println("Valor de tamaño: " + tamanio);
    }

    // Método para verificar si la cadena está vacía
    public boolean vacia() {
        return (tamanio == 0);
    }

    // Método para verificar si la cadena está llena
    public boolean llena() {
        return (tamanio == TOPE);
    }

    // Método para invertir la cadena
    public Cadena invertir() throws PosicionIlegalException {
        Cadena invertida = new Cadena();
        for (int i = tamanio - 1; i >= 0; i--) {
            invertida.agregarFinal(cadena[i]);
        }
        return invertida;
    }

    // Método toString para representar la cadena como una cadena de caracteres
    @Override
    public String toString() {
        String cadenita = "";
        for (int i = 0; i <= tamanio; i++) {
            cadenita = cadenita + cadena[i];
        }
        return cadenita;
    }
}
