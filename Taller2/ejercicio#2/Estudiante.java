public class Estudiante {
    
    private String nombre;
    private int edad;

    // Constructor por defecto
    public Estudiante() {
        // Llama al constructor con parámetros usando 'this()'
        this("Desconocido", 18);
    }

    // Constructor con dos parámetros
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para mostrar los detalles del estudiante
    public void mostrarEstudiante() {
        System.out.println("Nombre del estudiante: " + this.nombre);
        System.out.println("Edad del estudiante: " + this.edad);
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante("Juan", 20);

        estudiante1.mostrarEstudiante();
        estudiante2.mostrarEstudiante();
    }
}
