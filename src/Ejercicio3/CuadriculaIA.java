package Ejercicio3;

public class CuadriculaIA {
    //Clase para crear la cuadricula del juego 10x10. Se creará una cuadricula para cada jugador en la clase Juego.
    private final int[][] cuadricula;

    public CuadriculaIA() {
        cuadricula = new int[10][10];
    }

    public void inicializarCuadricula() {
        for (int i = 0; i < cuadricula.length; i++) {
            for (int j = 0; j < cuadricula[i].length; j++) {
                cuadricula[i][j] = 0;
            }
        }
    }

    public void colocarBarco(int x, int y, Barco barco, boolean horizontal) {
        for(int i = 0; i < barco.getLongitud(); i++) {
            if (horizontal) {
                cuadricula[x][y + i] = 1;
            } else {
                cuadricula[x + i][y] = 1;
            }
        }
    }

    public void imprimirCuadricula() {
        for (int i = 0; i < cuadricula.length; i++) {
            for (int j = 0; j < cuadricula[i].length; j++) {
                System.out.print(cuadricula[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int getValor(int x, int y) {
        return cuadricula[x][y];
    }

    public void setValor(int x, int y, int valor) {
        cuadricula[x][y] = valor;
    }
}
