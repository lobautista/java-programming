import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args){
        Scanner Ejercicio2 = new Scanner(System.in);
        System.out.println("Ingrese nombre completo");
        String nombrec = Ejercicio2.nextLine();
        System.out.println("Ingrese Edad");
        int Edad = Ejercicio2.nextInt();

        if (Edad>=16){
            System.out.println("Puede tramitar su licencia");
        }else{
            System.out.println("No puede tramitar licecia");
        }
    }
}
