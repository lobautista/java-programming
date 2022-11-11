import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Persona {
    private String nombre;
    private String appellido;
    private String nombreCompleto;
    String edad = "20";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppellido() {
        return appellido;
    }

    public void setAppellido(String appellido) {
        this.appellido = appellido;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public Persona(){
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.appellido = apellido;

    }

    public Persona(String nombre, String apellido, String edad) {
        this.nombre = nombre;
        this.appellido = apellido.toString();

        int edadConstructor = Double.(edad);
        System.out.println(edadConstructor);

    }

    public void imprirNombreCompleto() {
        String nombreCompleto = obtenerNombreCompleto();
        System.out.println(nombreCompleto);

    }

    private String obtenerNombreCompleto() {
        this.nombreCompleto = this.nombre + " " + this.appellido;
        return this.nombreCompleto;

    }
}
