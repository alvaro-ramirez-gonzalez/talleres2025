public class Estudiante {
    private String nombre;
    private int edad;
    private String curso;

    // Constructor por defecto
    public Estudiante() {
        this.nombre = "Desconocido";
        this.edad = 0;
        this.curso = "No asignado";
    }

    // Constructor con dos parámetros (nombre y edad)
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = "No asignado";
    }

    // Constructor con todos los parámetros
    public Estudiante(String nombre, int edad, String curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante [Nombre=" + nombre + ", Edad=" + edad + ", Curso=" + curso + "]";
    }
    
}
