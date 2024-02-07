package miPrincipal;

import java.util.*;

public class AppRational {

    public static void menu() throws Exception {
        // Se crea un objeto Scanner llamado consola para leer la entrada del usuario desde la consola
        Scanner consola = new Scanner(System.in);
        
        // Se declara un objeto Rational llamado r1 sin argumentos
        Rational r1 = new Rational();
        
        // Se declaran variables enteras a y b para almacenar el numerador y denominador del primer número racional
        int a, b;
        
        // Se imprime el encabezado del menú de operaciones con números racionales
        System.out.println("==================================");
        System.out.println("Operaciones con Números Racionales");
        System.out.println("==================================");
        
        // Se solicita al usuario que ingrese el numerador del primer número racional
        System.out.print("Introduce el numerador del Racional 1:");
        a = consola.nextInt();
        
        // Se solicita al usuario que ingrese el denominador del primer número racional
        System.out.print("Introduce el denominador del Racional 1:");
        b = consola.nextInt();
        
        // Se crea un nuevo objeto Rational con los valores de numerador y denominador proporcionados por el usuario
        r1 = new Rational(a, b);
        
        // Se imprime el primer número racional ingresado por el usuario
        System.out.println(r1);

        // Se solicita al usuario que ingrese el numerador del segundo número racional
        System.out.print("Introduce el numerador del Racional 2:");
        a = consola.nextInt();
        
        // Se solicita al usuario que ingrese el denominador del segundo número racional
        System.out.print("Introduce el denominador del Racional 2:");
        b = consola.nextInt();
        
        // Se crea un nuevo objeto Rational con los valores de numerador y denominador proporcionados por el usuario
        Rational r2 = new Rational(a, b);
        
        // Se imprime el segundo número racional ingresado por el usuario
        System.out.println(r2);
        
        // Se realiza la suma de los dos números racionales y se imprime el resultado
        System.out.println("Suma = " + r1.toString() + "+" + r2.toString() + "=" + r1.add(r1, r2));
        
        // Se realiza la multiplicación de los dos números racionales y se imprime el resultado
        System.out.println("Multiplica = " + r1.toString() + "*" + r2.toString() + "=" + r1.mult(r1, r2));
        
        // Se verifica si los dos números racionales son iguales y se imprime el resultado
        System.out.println("¿Son Iguales? =" + r1 + "== " + r2 + r1.equal(r1, r2)); 
    }

}
