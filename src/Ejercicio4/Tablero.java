package Ejercicio4;

public class Tablero {
//Tablero para el tocado y hundido implementando la clase juego, intercalando los turnos entre el usuario y el ordenador

    private int[][] tablero;

    public Tablero() {
        tablero = new int[10][10];
    }

    public void colocarBarcosAleatorios() {
        for (int i = 0; i < 10; i++) {
            int fila = (int) (Math.random() * 10);
            int columna = (int) (Math.random() * 10);
            tablero[fila][columna] = 1;
        }
    }

    public void mostrar() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (tablero[i][j] == 0) {
                    System.out.print("~ ");
                } else if (tablero[i][j] == 1) {
                    System.out.print("O ");
                } else if (tablero[i][j] == 2) {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    public boolean disparar(int fila, int columna) {
        if (tablero[fila][columna] == 1) {
            tablero[fila][columna] = 2;
            return true;
        }
        return false;
    }

    public boolean todosHundidos() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (tablero[i][j] == 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public void colocarBarcos(int fila, int columna) {
        tablero[fila][columna] = 1;
    }
}
