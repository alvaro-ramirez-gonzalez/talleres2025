import java.util.Scanner;

public class ProyectoIntegrador {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar detalles del Libro
        System.out.println("Ingrese los detalles del Libro:");
        System.out.print("Título: ");
        String tituloLibro = scanner.nextLine();
        System.out.print("Autor: ");
        String autorLibro = scanner.nextLine();
        System.out.print("Número de páginas: ");
        int paginasLibro = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        Libro libro = new Libro(tituloLibro, autorLibro, paginasLibro);

        // Ingresar detalles de la Cuenta Bancaria
        System.out.println("\nIngrese los detalles de la Cuenta Bancaria:");
        System.out.print("Número de Cuenta: ");
        String numeroCuenta = scanner.nextLine();
        System.out.print("Saldo: ");
        double saldoCuenta = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Tipo de Cuenta: ");
        String tipoCuenta = scanner.nextLine();
        CuentaBancaria cuentaBancaria = new CuentaBancaria(numeroCuenta, saldoCuenta, tipoCuenta);

        // Ingresar detalles del Estudiante
        System.out.println("\nIngrese los detalles del Estudiante:");
        System.out.print("Nombre: ");
        String nombreEstudiante = scanner.nextLine();
        System.out.print("Edad: ");
        int edadEstudiante = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Curso: ");
        String cursoEstudiante = scanner.nextLine();
        Estudiante estudiante = new Estudiante(nombreEstudiante, edadEstudiante, cursoEstudiante);

        // Mostrar detalles de los objetos utilizando toString()
        System.out.println("\nDetalles ingresados:");
        System.out.println(libro);
        System.out.println(cuentaBancaria);
        System.out.println(estudiante);

        scanner.close();
    }
}
