package Ejercicio2;
import java.util.ArrayList;
import java.util.Scanner;
public class Video extends Contenido{
    // ArrayList para almacenar los videos
    static ArrayList<Video> videos = new ArrayList<Video>();

    private int duracion;

    //Constructor de la clase Video añadiendo la duración que hereda de la clase Contenido

    public Video(String titulo, String autor, String genero, int duracion) {
        super(titulo, autor, genero);
        this.duracion = duracion;
    }

    // Getters y setters
    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    // Método para crear un video

    public static void crearVideo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el título del video: ");
        String titulo = scanner.nextLine();

        System.out.println("Introduce el autor del video: ");
        String autor = scanner.nextLine();

        System.out.println("Introduce el género del video: ");
        String genero = scanner.nextLine();

        System.out.println("Introduce la duración del video en minutos: ");
        int duracion = scanner.nextInt();
        //Convertir la duracion a horas con minutos
        double horas = duracion / 60;

        Video video = new Video(titulo, autor, genero, duracion);
        videos.add(video);

        System.out.println("Video creado con éxito");
    }
    // Método para mostrar los videos

public static void mostrarVideos() {
        for (Video video : videos) {
            System.out.println("Título: " + video.getTitulo() + " | Autor: " + video.getAutor() + " | Género: " + video.getGenero() + " | Duración: " + video.getDuracion() + " minutos");
        }
    }
}
