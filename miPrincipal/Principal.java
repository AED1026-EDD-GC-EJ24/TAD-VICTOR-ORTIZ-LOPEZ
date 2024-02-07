package miPrincipal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) throws Exception {
       // Utilizamos try-with-resources para asegurarnos de que el Scanner se cierre correctamente
       try (Scanner consola = new Scanner(System.in)) {
        // Variable para almacenar la opción seleccionada por el usuario
        int opc = 0;
        
        // Bucle que se ejecuta hasta que el usuario seleccione la opción de salir (0)
        do {
            // Se muestra el menú principal
            System.out.println("*************************");
            System.out.println("TIPOS ABSTRACTOS DE DATOS");
            System.out.println("*************************");
            System.out.println("1) RATIONAL");
            System.out.println("2) MATRIZ  ");
            System.out.println("3) CONJUNTO");
            System.out.println("4) PERSONA ");
            System.out.println("5) FECHA   ");
            System.out.println("6) CADENA  ");
            System.out.println("7) NUMEROTE");
            System.out.println("8) CUENTA_CHEQUES");
            System.out.println("9) PUNTO");
            System.out.println("10)TRIANGULO");
            System.out.println("            ");
            System.out.println("0) SALIR");
            System.out.print("Selecciona opción:");
            // Se lee la opción seleccionada por el usuario
            opc = consola.nextInt();

            // Se maneja la opción seleccionada por el usuario
            switch (opc) {
                case 1:
                    AppRational.menu();
                    break;
                case 2:
                    AppMatriz.menu();
                    break;
                case 3:
                    AppConjunto.menu();
                    break;
                case 4:
                    AppPersona.menu();
                    break;
                case 5:
                    AppFecha.menu();
                    break;
                case 6:
                    AppCadena.menu();
                    break;
                case 7:
                    AppNumerote.menu();
                    break;
                case 8:
                    AppCuenta_cheques.menu();
                    break;
                case 9:
                    AppPunto.menu();
                    break;
                case 10:
                    AppTriangulo.menu();
                    break;
                case 0:
                    // Mensaje de despedida cuando el usuario selecciona la opción de salir (0)
                    System.out.println("ADIOS!");
                    // Se cierra el Scanner para liberar recursos
                    consola.close();
                    break;
                default:
                    // Mensaje de error para opciones no válidas
                    System.out.println("Valor incorrecto, intente de nuevo!");
            }
        } while (opc != 0); // El bucle se ejecuta hasta que el usuario selecciona la opción de salir (0)
    }
}
}
