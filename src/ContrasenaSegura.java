
import java.util.Scanner;

public class ContrasenaSegura {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una contrasena: ");
        String contrasena = entrada.nextLine();

        boolean tieneLetra = false;
        boolean tieneDigito = false;
        boolean tieneSimbolo = false;

        for (int i = 0; i < contrasena.length(); i++) {

            char caracter = contrasena.charAt(i);

            if ((caracter >= 'A' && caracter <= 'Z')
                    || (caracter >= 'a' && caracter <= 'z')) {

                tieneLetra = true;

            } else if (caracter >= '0' && caracter <= '9') {

                tieneDigito = true;

            } else if (!Character.isWhitespace(caracter)) {

                tieneSimbolo = true;
            }
        }

        boolean segura = contrasena.length() >= 10
                && tieneLetra
                && tieneDigito
                && tieneSimbolo;

        if (segura) {
            System.out.println("La contrasena es segura.");
        } else {
            System.out.println("La contrasena no es segura.");
        }

        entrada.close();
    }
}
