package Ejercicio2;
import java.util.Scanner;

public class Pedido {
    //En esta clase se crearán los pedidos de los clientes
    //Se crea un array para almacenar los pedidos
    static Pedido[] pedidos = new Pedido[100];


    public void crearPedido() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el id del cliente: ");
        //Mostrar clientes
        Cliente.mostrarClientes();
        int idCliente = scanner.nextInt();
        //Se comprueba que el id del cliente existe con el id introducido, si no existe, se muestra un mensaje de error
        if (idCliente > Cliente.clientes.size() || idCliente < 1) {
            System.out.println("El id del cliente no existe");
            return;
        }
        //Si existe, se pide el nombre del libro o video que desea comprar
        System.out.println("Libros disponibles: ");
        Libro.mostrarLibros();
        Video.mostrarVideos();
        System.out.println("Por favor, introduce el nombre del recurso que deseas comprar: ");
        String nombreRecurso;
        nombreRecurso = scanner.nextLine();
        //Limpiar buffer
        scanner.nextLine();
        //Se comprueba si el nombre del recurso introducido existe en el arraylist de libros o videos
        for (Libro libro : Libro.libros) {
            if (nombreRecurso.equals(libro.getTitulo())) {
                System.out.println("Pulsa 1 para comprar el libro");
                int opcionCompra = scanner.nextInt();
                if (opcionCompra == 1) {
                    System.out.println("Libro comprado con éxito");
                }
            }
        }
        for (Video video : Video.videos) {
            if (nombreRecurso.equals(video.getTitulo())) {
                System.out.println("Pulsa 1 para comprar el video");
                int opcionCompra = scanner.nextInt();
                if (opcionCompra == 1) {
                    System.out.println("Video comprado con éxito");
                }
            }

        }
    }
}

