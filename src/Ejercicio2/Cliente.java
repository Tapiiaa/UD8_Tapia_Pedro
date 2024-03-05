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

    public void opcionesMenu(int opcion) {
        switch (opcion) {
            case 1:
                crearCliente();
                menu();
                break;
            case 2:
                mostrarClientes();
                menu();
                break;
            case 3:
                System.out.println("Importar recursos");
                System.out.println("");
                int opcionImportar = scanner.nextInt();
                if(opcionImportar == 1){
                    Libro.crearLibro();
                }
                if(opcionImportar == 2){
                    Video.crearVideo();
                }
                if(opcionImportar != 1 && opcionImportar != 2){
                    System.out.println("Opción no válida");
                }
                break;
            case 4:
                //crearRecurso();
                break;
            case 5:
                //mostrarRecursos();
                break;
            case 6:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida");
                menu();
                break;
        }
    }

    public void menu() {
        int opcion;
        System.out.println("Menu");
        System.out.println("1. Crear cliente");
        System.out.println("2. Mostrar clientes");
        System.out.println("3. Salir");
        System.out.println("Introduce una opción: ");
        opcion = scanner.nextInt();
        if(opcion < 1 || opcion > 3) {
            System.out.println("Opción no válida");
        }
        opcionesMenu(opcion);
    }
    //Método para mostrar los clientes
    public static void mostrarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}
