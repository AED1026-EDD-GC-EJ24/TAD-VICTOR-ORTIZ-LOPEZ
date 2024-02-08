package miPrincipal;

// Se define la clase AppFecha en el paquete miPrincipal
public class AppFecha {

    // Método estático para imprimir el menú de operaciones con fechas
    public static void menu() {
        // Imprime una línea de separación
        System.out.println("====================================");
        // Imprime el título del menú
		System.out.println("    Operaciones con Fechas        ");
        // Imprime otra línea de separación
        System.out.println("====================================");
        
        // Se crean dos instancias de la clase Fecha con valores específicos
        Fecha f = new Fecha(2,20,1970);
		Fecha f1 = new Fecha(2,20,1970);
		
		// Intento de acceder a variables privadas (comentado ya que no es accesible desde aquí)
		/*
		 * No es accesible porque son privadas
		f.dia = 2;
		f.mes = 20;
		f.anio = 1970;
		*/
		
		// Intento de acceder a métodos setter (comentado ya que no son accesibles desde aquí)
		/*
		f.setDia(2);
		f.setMes(20);
		f.setAnio(1970);
		f1.setDia(2);
		f1.setMes(20);
		f1.setAnio(1970);
		*/
		
		// Imprimir el día de la fecha f
		System.out.println("Dia = "+f.getDia());
		// Imprimir el mes de la fecha f
		System.out.println("Mes = "+f.getMes());
		// Imprimir el año de la fecha f
		System.out.println("Año = "+f.getAnio());
		// Imprimir la fecha f utilizando el método toString()
		System.out.println(f);
		
		// Comprobar si las fechas f y f1 son iguales y mostrar el resultado
		if (f.equals(f1))
			System.out.println("Son iguales");
		else
			System.out.println("Son Diferentes");
    }
}
