public class ControlesFlujo {

    public void evaluarEdad(int edad){

        //numericos > > => =< == !=
        // String .equals() equalsIgnoreCase()

        if(edad != 18) {
            System.out.println("Tramitar ine");
        } else {
            System.out.println("No puede tramitar INE");
        }

        String cadena1 = "Hola mundo";
        String cadena2 = "Hola mundo";

        if(cadena1.equals(cadena2)){
            System.out.println("-las cadenas son iguales");

        } else if (cadena1.equals("cadena3")) {
            
        } else{
            System.out.println("No son igualea");
        }

    }

    public void whileCiclo(int edad) {

        while (edad <= 10) {
            System.out.println(edad);
            edad = edad + 1;
        }

        System.out.println("Excedió el límite " + edad);

    }
}
