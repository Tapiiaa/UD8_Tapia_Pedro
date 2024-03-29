package Ejercicio2;

import java.util.concurrent.Callable;
import java.util.Scanner;
public class Menu {


    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.menu();




    }
    public void opcionesMenu(int opcion) {
        switch (opcion) {
            case 1:
                Cliente.crearCliente();
                //Esperar dos segundos para mostrar nuevamente el menú
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                menu();
                break;
            case 2:
                Cliente.mostrarClientes();
                //Esperar dos segundos para mostrar nuevamente el menú
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    //Pulsar enter para volver al menú


                }

                menu();
                break;
            case 3:
                Scanner scanner = new Scanner(System.in);
                System.out.println("Importar recursos");
                System.out.println("-----------------");
                System.out.println("1. Importar libro");
                System.out.println("2. Importar video");
                int opcionImportar = scanner.nextInt();
                if(opcionImportar == 1){
                    Libro.crearLibro();
                    // Esperar dos segundos para mostrar nuevamente el menú
                    menu();
                }
                if(opcionImportar == 2){
                    Video.crearVideo();
                    //Esperar dos segundos para mostrar nuevamente el menú
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    menu();
                }
                if(opcionImportar != 1 && opcionImportar != 2){
                    System.out.println("Opción no válida");
                }
                break;
            case 4:
                scanner = new Scanner(System.in);
                // Eliminar recurso
                // Consultar en el arraylist de libros y videos
                // Si el recurso existe, eliminarlo
                System.out.println("Vamos a eliminar un recurso");
                System.out.println("Introduce el título del recurso a eliminar: ");
                String libroAEliminar = scanner.nextLine();
                for (Libro libro : Libro.libros) {
                    if(libro.getTitulo().equals(libroAEliminar)){
                        Libro.libros.remove(libro);
                        System.out.println("Libro eliminado con éxito");
                        // Al eliminar el libro, salimos del bucle
                        break;
                    }
                }
                // Esperar dos segundos para mostrar nuevamente el menú
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                menu();
                break;
            case 5:
                //Opcion para mostrar los libros y videos almacenados
                System.out.println("Recursos almacenados:");
                System.out.println("Presiona enter para mostrar los libros y videos almacenados");
                Scanner scanner1 = new Scanner(System.in);
                scanner1.nextLine();
                System.out.println("Libros: ");
                Libro.mostrarLibros();
                System.out.println("Videos: ");
                Video.mostrarVideos();
                //Esperar dos segundos para mostrar nuevamente el menú
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                menu();
                break;
            case 6:
                Pedido pedido = new Pedido();
                pedido.crearPedido();
                break;
            case 7:
                System.out.println("Saliendo del programa...");
                System.out.println("Gracias por usar nuestra aplicación. Nos vemos pronto");
                //Esperar 3 segundos para acabar el programa
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            default:
                System.out.println("Opción no válida");
                menu();
                break;
        }
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.println("Menu");
        System.out.println("1. Crear cliente");
        System.out.println("2. Mostrar clientes");
        System.out.println("3. Importar recursos");
        System.out.println("4. Eliminar recurso");
        System.out.println("5. Biblioteca de libros y videos");
        System.out.println("6. Crear Pedido");
        System.out.println("7. Salir");
        System.out.println("Introduce una opción: ");
        opcion = scanner.nextInt();
        if(opcion < 1 || opcion > 6) {
            System.out.println("Opción no válida");
        }
        opcionesMenu(opcion);
    }


    }


