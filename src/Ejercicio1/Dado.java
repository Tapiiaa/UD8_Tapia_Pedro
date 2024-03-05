package Ejercicio1;

public class Dado {

    private int caras;
    //Definir un atributo para el número de caras del dado
    public Dado(int caras){
        this.caras = caras;
    }
    public Dado(){
        this.caras = 6;
    }

    //Getters y setters
    public int getCaras(){
        return caras;
    }

    public void setCaras(int caras){
        this.caras = caras;
    }

    //Método para lanzar el dado

    public int lanzarDado(){
        return (int) (Math.random() * caras) + 1;
    }

}
