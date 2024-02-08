package miPrincipal;

// Se define la clase Persona en el paquete miPrincipal
public class Persona {
    private String dni; // DNI de la persona
    private String nombre; // Nombre de la persona
    private Fecha fechaNacimiento; // Fecha de nacimiento de la persona

    // Método getter para obtener el DNI de la persona
    public String getDni() {
        return dni;
    }

    // Método getter para obtener el nombre de la persona
    public String getNombre() {
        return nombre;
    }

    // Método getter para obtener la fecha de nacimiento de la persona
    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    // Método setter para establecer el DNI de la persona
    public void setDni(String dni) {
        this.dni = dni;
    }

    // Método setter para establecer el nombre de la persona
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método setter para establecer la fecha de nacimiento de la persona
    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
