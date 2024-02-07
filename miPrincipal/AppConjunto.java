package miPrincipal;

import java.util.*;

public class AppConjunto {
    
    public static void menu() throws Exception {
        // Se imprime el encabezado del menú de operaciones con conjuntos
        System.out.println("==================================");
        System.out.println("    Operaciones con Conjuntos     ");
        System.out.println("==================================");
        
        // Se crea un nuevo conjunto A
        Conjunto A = new Conjunto();
        
        // Se verifica si el conjunto A está vacío y se imprime el resultado
        if (A.esVacio())
            System.out.println("El conjunto A está vacío");
        else
            System.out.println("El conjunto A NO está vacío");
        
        // Se imprime la cantidad de elementos en el conjunto A
        System.out.println("El conjunto A tiene " + A.cardinal() + " elementos");
        
        // Se añaden elementos al conjunto A
        Integer ele = 4;
        A.añadir(ele);
        ele = 7;
        A.añadir(ele);
        ele = 2;
        A.añadir(ele);
        ele = 5;
        A.añadir(ele);
        
        // Se imprime la cantidad de elementos en el conjunto A después de añadir elementos
        System.out.println("El conjunto A tiene " + A.cardinal() + " elementos");
        
        // Se crea un nuevo conjunto B
        Conjunto B = new Conjunto();
        
        // Se añaden elementos al conjunto B
        ele = 6;
        B.añadir(ele);
        ele = 3;
        B.añadir(ele);
        
        // Se imprime la cantidad de elementos en el conjunto B
        System.out.println("El conjunto B tiene " + B.cardinal() + " elementos");
        
        // Se realiza la unión del conjunto A con el conjunto B y se imprime la cantidad de elementos en el conjunto B
        A.union(B);
        ele = 6;
        B.retirar(ele);
        System.out.println("El conjunto B tiene " + B.cardinal() + " elementos");
        
        // Se retira un elemento del conjunto B y se imprime si el elemento 3 pertenece a los conjuntos A y B
        B.retirar(ele);
        ele = 3;
        if (A.pertenece(ele))
            System.out.println("El elemento " + ele + " pertenece a A");
        else
            System.out.println("El elemento " + ele + " NO pertenece a A");
        
        if (B.pertenece(ele))
            System.out.println("El elemento " + ele + " pertenece a B");
        else
            System.out.println("El elemento " + ele + " NO pertenece a B");
        
        // Se imprime el elemento en la posición 2 del conjunto A y del conjunto A
        System.out.println(A.elemento(2));
        System.out.println(A.elemento(4));
    }
}
