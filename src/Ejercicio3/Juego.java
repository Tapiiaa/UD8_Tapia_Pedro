package Ejercicio3;

import java.util.Scanner;

// Clases Barco y CuadriculaIA permanecen igual.

public class Juego {
    private CuadriculaIA cuadricula1;
    private CuadriculaIA cuadricula2;
    private String usuario1;
    private String usuario2;

    public Juego() {
        // Inicializamos las cuadriculas de ambos jugadores
        cuadricula1 = new CuadriculaIA();
        cuadricula2 = new CuadriculaIA();
    }

    public void introducirUsuarios(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre del usuario 1:");
        usuario1 = scanner.nextLine();
        System.out.println("Nombre del usuario 2:");
        usuario2 = scanner.nextLine();
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        introducirUsuarios();
        cuadricula1.inicializarCuadricula();
        cuadricula2.inicializarCuadricula();
        //Pedir a los usuarios que coloquen sus barcos
        System.out.println(usuario1+","+"Coloca tus barcos, " + usuario1 + ". Ingresa coordenadas (x y) y si el barco es horizontal (true) o vertical (false):");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        boolean horizontal = scanner.nextBoolean();
        cuadricula1.colocarBarco(x, y, new Barco(2), horizontal);

        System.out.println(usuario2+","+"Coloca tus barcos, " + usuario2 + ". Ingresa coordenadas (x y) y si el barco es horizontal (true) o vertical (false):");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        boolean horizontal2 = scanner.nextBoolean();
        cuadricula2.colocarBarco(x2, y2, new Barco(2), horizontal2);

        boolean turnoUsuario1 = true;
        while (true) {
            CuadriculaIA cuadriculaActiva = turnoUsuario1 ? cuadricula2 : cuadricula1;
            System.out.println("Turno de " + (turnoUsuario1 ? usuario1 : usuario2) + ". Ingresa coordenadas para atacar (x y):");
            x = scanner.nextInt();
            y = scanner.nextInt();
            if (cuadriculaActiva.getValor(x, y) == 1) {
                System.out.println("¡Tocado!");
                cuadriculaActiva.setValor(x, y, 2);
            } else {
                System.out.println("¡Agua!");
                cuadriculaActiva.setValor(x, y, 3);
            }
            cuadriculaActiva.imprimirCuadricula();
            turnoUsuario1 = !turnoUsuario1;
            definirGanador();
        }

    }

    public void definirGanador(){
        //Método para definir el ganador del juego
        if(cuadricula1.getValor(0, 0) == 2 && cuadricula1.getValor(0, 1) == 2){
            System.out.println("El ganador es: "+usuario1);
    }
        else if(cuadricula2.getValor(0, 0) == 2 && cuadricula2.getValor(0, 1) == 2){
            System.out.println("El ganador es: "+usuario2);
        }
    }


    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.jugar();
    }
}
