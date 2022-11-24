import java.util.Scanner;

public class DosNumeros {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Ingrese numero 1");
        int numero1 = Entrada.nextInt();
        System.out.println("Ingrese numero 2");
        int numero2 = Entrada.nextInt();

        if (numero1>numero2){
            System.out.println(numero1 + " es mayor a " + numero2);
        }else{
            System.out.println(numero2 + " es mayor a " + numero1);
        }
    }
}
