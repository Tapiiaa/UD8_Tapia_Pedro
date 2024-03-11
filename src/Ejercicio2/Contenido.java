package Ejercicio2;

public abstract class Contenido {
    // Recursos comunes entre los videos y los libros
    private static String titulo;
    private String autor;
    private String genero;

    // Constructor
    public Contenido(String titulo, String autor, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }

    // Getters y setters
    public static String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Método toString
    public String toString() {
        return "Título: " + titulo +","+ " Autor: " + autor +"," + " Género: " + genero;
    }

}
