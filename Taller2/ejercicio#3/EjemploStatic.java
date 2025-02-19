public class EjemploStatic {
    
    private String nombre;

    // Constructor
    public EjemploStatic(String nombre) {
        this.nombre = nombre;
    }

    // Método static con uso incorrecto del this
    public static void mostrarNombre() {
        // El uso de this en un método estático genera error, porque 'this' se refiere a una instancia
     //System.out.println(this.nombre); //<-- hay esta el error // Error de compilación
    }

    // Método principal
    public static void main(String[] args) {
        mostrarNombre();
    }
}
