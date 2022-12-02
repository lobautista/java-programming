package estudiante;

public class Main {
    public static void main(String[] args) {
        Estudiante angel = new Estudiante("Angel", 70.0);
        String resultado = angel.obtenerCalificacionEstudiante();

        System.out.println("La calificacion es:" + resultado);
    }
}
