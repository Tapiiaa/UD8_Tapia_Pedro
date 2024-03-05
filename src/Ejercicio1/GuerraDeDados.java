package Ejercicio1;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;
public class GuerraDeDados {
    ArrayList<Integer>resultadosJugador1 = new ArrayList<>();
    ArrayList<Integer>resultadosJugador2 = new ArrayList<>();

    int opcion;

    public void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a la Guerra de Dados");
        System.out.println("Seleccione una opción");
        System.out.println("1. Jugar");
        System.out.println("2. Salir");
        opcion = sc.nextInt();

    }

    public static void main(String[] args) {
        GuerraDeDados juego = new GuerraDeDados();
        juego.menu();
        juego.jugar();
    }

    public void jugar() {
        Scanner sc = new Scanner(System.in);
        //Si en el menú, se selecciona "1", se ejecutará el juego
        if (opcion == 1) {

                System.out.println("¡Comienza la guerra!");
                //Creamos dos jugadores
                System.out.println("Introduce el nombre del jugador 1: ");
                String nombreJugador1 = sc.nextLine();
                Persona jugador1 = new Persona(nombreJugador1, 1);
                System.out.println("Introduce el nombre del jugador 2: ");
                String nombreJugador2 = sc.nextLine();
                Persona jugador2 = new Persona(nombreJugador2, 2);

// El juego constará de 5 rondas
                // jugador1 lanza el dado
            while(true){
                Dado dadoJugador1 = new Dado();
                int resultadoJugador1 = dadoJugador1.lanzarDado();
                System.out.println("El jugador " + jugador1.getNombre() + " ha sacado un " + resultadoJugador1);
                resultadosJugador1.add(resultadoJugador1);

                // jugador2 lanza el dado

                Dado dadoJugador2 = new Dado();
                int resultadoJugador2 = dadoJugador2.lanzarDado();
                System.out.println("El jugador " + jugador2.getNombre() + " ha sacado un " + resultadoJugador2);
                resultadosJugador2.add(resultadoJugador2);

                //Comparamos los resultados
                if (resultadoJugador1 > resultadoJugador2) {
                    System.out.println("¡El jugador " + jugador1.getNombre() + " ha ganado!");
                } else if (resultadoJugador1 < resultadoJugador2) {
                    System.out.println("¡El jugador " + jugador2.getNombre() + " ha ganado!");
                } else {
                    System.out.println("¡Empate!");
                }
                //Resultados de la ronda 1
                System.out.println("Resultados de la ronda 1: ");
                System.out.println(jugador1.getNombre() + ": " + resultadoJugador1 + " vs " + jugador2.getNombre() + ": " + resultadoJugador2);
                // Preguntar si se quiere volver a lanzar los dados
                System.out.println("¿Quieres volver a lanzar los dados? (s/n)");
                String respuesta = sc.nextLine();
                if (respuesta.equals("n")) {
                    System.out.println("Imprimiendo resultados totales...");
                    //Hacer una suma de los resultados de los jugadores
                    System.out.println("Resultados totales: ");
                    // Imprimir y sumar  los resultados de los dos jugadores
                    int sumaJugador1 = 0;
                    int sumaJugador2 = 0;
                    for (int i = 0; i < resultadosJugador1.size(); i++) {
                        sumaJugador1 += resultadosJugador1.get(i);
                    }
                    for (int i = 0; i < resultadosJugador2.size(); i++) {
                        sumaJugador2 += resultadosJugador2.get(i);
                    }
                    //Imprimir los resultados totales
                    System.out.println(jugador1.getNombre() + ": " + sumaJugador1);
                    System.out.println(jugador2.getNombre() + ": " + sumaJugador2);
                    if(sumaJugador1 > sumaJugador2){
                        System.out.println("¡"+ jugador1.getNombre() + " ha ganado la guerra!");
                    } else if(sumaJugador1 < sumaJugador2){
                        System.out.println("¡"+ jugador2.getNombre() + " ha ganado la guerra!");
                    } else {
                        System.out.println("¡Empate!");
                    }


                    break;
                }
                if(respuesta.equals("s")){
                    continue;
                }


            }

        }
    }
}
