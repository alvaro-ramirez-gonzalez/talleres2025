import java.util.Scanner;

class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    // Constructor por defecto
    public Libro() {
        this.titulo = "Título Desconocido";
        this.autor = "Autor Desconocido";
        this.numeroPaginas = 0;
    }

    // Constructor parametrizado
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Libro [Título=" + titulo + ", Autor=" + autor + ", Número de páginas=" + numeroPaginas + "]";
    }
}