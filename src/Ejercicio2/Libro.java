package Ejercicio2;
import java.util.Scanner;
import java.util.ArrayList;
public class Libro extends Contenido{
    // ArrayList para almacenar los libros
    static ArrayList<Libro> libros = new ArrayList<Libro>();

    int numPaginas;

    //Constructor de la clase Contenido añadiendo el número de páginas
    public Libro(String titulo, String autor, String genero, int numPaginas) {
        super(titulo, autor, genero);
        this.numPaginas = numPaginas;
    }

    public static void crearLibro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el título del libro: ");
        String titulo = scanner.nextLine();

        System.out.println("Introduce el autor del libro: ");
        String autor = scanner.nextLine();

        System.out.println("Introduce el género del libro: ");
        String genero = scanner.nextLine();

        System.out.println("Introduce el número de páginas del libro: ");
        int numPaginas = scanner.nextInt();

        Libro libro = new Libro(titulo, autor, genero, numPaginas);
        libros.add(libro);

        System.out.println("Libro creado con éxito");


    }
}
