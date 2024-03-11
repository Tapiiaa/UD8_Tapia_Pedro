package Ejercicio3;

public class Barco {
    //Clase para crear los barcos de cada jugador. Se creará un barco para cada jugador en la clase Juego.
    // La dimensión de los barcos es de 2x2 y tienen que estar dentro de la cuadricula

    private int longitud;
    private boolean hundido;

    public Barco(int longitud) {
        this.longitud = longitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public boolean isHundido() {
        return hundido;
    }

    public void setHundido(boolean hundido) {
        this.hundido = hundido;
    }


}
