public class EjemploCorregido {

    private String nombre;

    // Constructor
    public EjemploCorregido(String nombre) {
        this.nombre = nombre;
    }

    // Método estático que recibe el nombre como parámetro
    public static void mostrarNombre(String nombre) {
        System.out.println(nombre);  // Muestra el nombre que se pasa como argumento
    }

    // Método principal
    public static void main(String[] args) {
        // Puedes llamar a mostrarNombre y pasar un valor de nombre directamente
        mostrarNombre("Juan");
    }
}
