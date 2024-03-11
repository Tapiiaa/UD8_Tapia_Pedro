package Ejercicio4;
import java.util.Scanner;
public class Juego {
//Atributos
    private Tablero tableroUsuario;
    private Tablero tableroOrdenador;
    private Scanner sc;

//Constructor

    public Juego() {
        tableroUsuario = new Tablero();
        tableroOrdenador = new Tablero();
        sc = new Scanner(System.in);
    }

//Métodos

    public void jugar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Usuario coloca tus barcos, fila y columna");
        int fila = sc.nextInt();
        int columna = sc.nextInt();
        tableroUsuario.colocarBarcos(fila, columna);
        tableroUsuario.mostrar();
        System.out.println("Ordenador coloca tus barcos");
        tableroOrdenador.colocarBarcosAleatorios();
        tableroOrdenador.mostrar();

        while(true){
            System.out.println("Usuario dispara, fila y columna");
            fila = sc.nextInt();
            columna = sc.nextInt();
            if(tableroOrdenador.disparar(fila, columna)){
                System.out.println("Tocado");
            }else{
                System.out.println("Agua");
            }
            tableroOrdenador.mostrar();
            if(tableroOrdenador.todosHundidos()){
                System.out.println("Usuario gana");
                break;
            }
            System.out.println("Ordenador dispara");
            fila = (int) (Math.random() * 10);
            columna = (int) (Math.random() * 10);
            if(tableroUsuario.disparar(fila, columna)){
                System.out.println("Tocado");
            }else{
                System.out.println("Agua");
            }
            tableroUsuario.mostrar();
            if(tableroUsuario.todosHundidos()){
                System.out.println("Ordenador gana");
                break;
            }
        }


    }
}