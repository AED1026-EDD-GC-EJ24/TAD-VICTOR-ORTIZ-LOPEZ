package miPrincipal;

// Definición de la clase PosicionIlegalException que extiende de la clase Exception
public class PosicionIlegalException extends Exception {

    // Constructor de la clase que llama al constructor de la clase base (Exception) con un mensaje predefinido
    public PosicionIlegalException() {
        super("posición ilegal"); // Llama al constructor de la clase base (Exception) con el mensaje "posición ilegal"
    }
}
