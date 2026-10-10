import java.util.Scanner;

public class CadenasAmigas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la primera cadena S: ");
        String s = entrada.nextLine();

        System.out.print("Ingrese la primera cadena T: ");
        String t = entrada.nextLine();

        boolean sonAmigas = false;

        for (int i = 1; i < s.length(); i++) {
            String u = s.substring(0, i);
            String v = s.substring(i);
            String invertida = v + u;

            if (invertida.equals(t)) {
                sonAmigas = true;
                break;
            }
        }
        if (sonAmigas) {
            System.out.println("Las cadenas son amigas");
        } else {
            System.out.println("Las cadenas no son amigas");
        }
        entrada.close();
    }
}
