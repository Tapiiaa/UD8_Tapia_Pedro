package Ejercicio2;
//Reutilizo código de la clase Cliente del ejercicio 2 de la práctica 7
import java.util.ArrayList;
import java.util.Scanner;
public class Cliente {
    static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    static Scanner scanner = new Scanner(System.in);
    private String nombre;
    private int id;

    // Creamos el constructor
    public Cliente(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    // Creamos los getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Creamos el método toString

    public String toString() {
        return "Cliente: " + nombre + " con id: " + id;
    }

    public static void crearCliente() {

        System.out.println("Introduce el nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.println("Introduce que te gusta leer (género):");
        // Esperar dos segundos para mostrar los libros
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String genero = scanner.nextLine();
        if(genero.equals("Terror") || genero.equals("terror") || genero.equals("TERROR")){
            //Recomendar titulos de libros de terror
            System.out.println("Te recomendamos estos libros de terror: ");
            System.out.println("1. El resplandor");
            System.out.println("2. It");
        }
        //Si el genero es igual a "Romantico", "Romántico" o "romántico"
        if(genero.equals("Romantico" ) || genero.equals("Romántico") || genero.equals("romántico")){
            //Recomendar titulos de libros románticos
            System.out.println("Te recomendamos estos libros románticos: ");
            System.out.println("1. Orgullo y prejuicio");
            System.out.println("2. Cumbres borrascosas");
        }
        if(genero.equals("Fantasia") || genero.equals("fantasia") || genero.equals("FANTASIA")){
            //Recomendar titulos de libros de fantasía
            System.out.println("Te recomendamos estos libros de fantasía: ");
            System.out.println("1. El señor de los anillos");
            System.out.println("2. Harry Potter");
        }
        if(genero.equals("Ciencia Ficción") || genero.equals("ciencia ficción") || genero.equals("CIENCIA FICCIÓN")){
            //Recomendar titulos de libros de ciencia ficción
            System.out.println("Te recomendamos estos libros de ciencia ficción: ");
            System.out.println("1. Dune");
            System.out.println("2. Fundación");
        }
        if(genero.equals("Aventuras") || genero.equals("aventuras") || genero.equals("AVENTURAS")){
            //Recomendar titulos de libros de aventuras
            System.out.println("Te recomendamos estos libros de aventuras: ");
            System.out.println("1. La isla del tesoro");
            System.out.println("2. Las aventuras de Tom Sawyer");
        }
        Cliente cliente = new Cliente(nombre, clientes.size() + 1);
        System.out.println("Cliente creado:");
        clientes.add(cliente);
    }
    //Método para mostrar los clientes
    public static void mostrarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}
