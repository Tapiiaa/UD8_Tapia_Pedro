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
        Menu menu = new Menu();

        System.out.println("Introduce el nombre del cliente: ");
        String nombre = scanner.nextLine();
        Cliente cliente = new Cliente(nombre, clientes.size() + 1);
        System.out.println("Cliente creado:");
        clientes.add(cliente);
    }
    //Método para mostrar los clientes
    public static void mostrarClientes() {
        //Si no hay clientes, mostrar un mensaje
        if(clientes.size() == 0){
            System.out.println("No hay clientes");
        }
        //Esperar 0.2 segundos para mostrar de nuevo el menu
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
    public void historialDeCompras(){
        System.out.println("Por favor, indica tu id de cliente:");
        //Obtener el id del cliente
        int id = scanner.nextInt();
        //Recorrer el arraylist de clientes
        for (Cliente cliente : clientes) {
            //Si el id del cliente es igual al id introducido
            if(cliente.getId() == id){
                System.out.println("Verificado con éxito");
                // Historial de compras, es decir, en el menu, la opcion tres es para importar recursos, si este ha importado algo, mostrar lo que ha importado
                Libro.crearLibro();
                if(Libro.libros.size() > 0){
                    System.out.println("Historial de compras: ");
                    for (Libro libro : Libro.libros) {
                        System.out.println(libro);
                    }
                }
            }
        }
    }
}
