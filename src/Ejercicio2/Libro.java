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
        //Cada vez que se crea un libro, se añade al arraylist de libros
        libros.add(libro);

        System.out.println("Libro creado con éxito");
        //Esperar 0.5 segundos
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Aqui te van unas recomendaciones para tu género favorito, por favor, mantente a la espera:");
        //Esperar 2 segundos
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Recomendar libros en funcion del genero

        if(genero.equals("Aventura") || genero.equals("aventura") || genero.equals("AVENTURA")){
            //Recomendar titulos de libros de aventura
            System.out.println("Te recomendamos estos libros de aventura: ");
            System.out.println("1. La isla del tesoro");
            System.out.println("2. La vuelta al mundo en 80 días");
            //Esperar 1 segundo
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if(genero.equals("Terror") || genero.equals("terror") || genero.equals("TERROR")){
            //Recomendar titulos de libros de terror
            System.out.println("Te recomendamos estos libros de terror: ");
            System.out.println("1. El resplandor");
            System.out.println("2. El exorcista");
            //Esperar 1 segundo
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if(genero.equals("Ciencia Ficción") || genero.equals("ciencia ficción") || genero.equals("CIENCIA FICCIÓN")){
            //Recomendar titulos de libros de ciencia ficción
            System.out.println("Te recomendamos estos libros de ciencia ficción: ");
            System.out.println("1. 1984");
            System.out.println("2. Un mundo feliz");
            //Esperar 1 segundo
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if(genero.equals("Romántico") || genero.equals("romántico") || genero.equals("ROMÁNTICO")){
            //Recomendar titulos de libros románticos
            System.out.println("Te recomendamos estos libros románticos: ");
            System.out.println("1. Orgullo y prejuicio");
            System.out.println("2. Cumbres borrascosas");
            //Esperar 1 segundo
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        //Si no se introduce ninguno de esos géneros, mostrar un mensaje
        if(!genero.equals("Aventura") && !genero.equals("aventura") && !genero.equals("AVENTURA") && !genero.equals("Terror") && !genero.equals("terror") && !genero.equals("TERROR") && !genero.equals("Ciencia Ficción") && !genero.equals("ciencia ficción") && !genero.equals("CIENCIA FICCIÓN") && !genero.equals("Romántico") && !genero.equals("romántico") && !genero.equals("ROMÁNTICO")){
            System.out.println("No tenemos recomendaciones para ese género");
        }





    }
    public static void mostrarLibros(){
        for (Libro libro : libros) {
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Género: " + libro.getGenero());
            System.out.println("Número de páginas: " + libro.numPaginas);
            System.out.println("");
        }
    }
}
