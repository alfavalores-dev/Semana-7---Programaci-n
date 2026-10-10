import java.util.Arrays;
import java.util.Scanner;

public class EntregaFinalSemana7 {

           // Metodo que calcula la mediana de un arreglo de numeros reales
        public static double calcularMediana(double[] numeros) {

            // Se crea una copia para no modificar el arreglo original
            double[] ordenados = Arrays.copyOf(numeros, numeros.length);

            // Se ordenan los numeros de menor a mayor
            Arrays.sort(ordenados);

            int cantidad = ordenados.length;

            // Si la cantidad es impar, se toma el numero central
            if (cantidad % 2 == 1) {
                return ordenados[cantidad / 2];
            } else {
                // Si es par, se promedian los dos numeros centrales
                return (ordenados[cantidad / 2 - 1]
                        + ordenados[cantidad / 2]) / 2.0;
            }
        }

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("==========================================");
            System.out.println("          CALCULO DE LA MEDIANA");
            System.out.println("==========================================");

            int cantidad;

            // Validacion de la cantidad de numeros
            do {
                System.out.print("Ingrese la cantidad de numeros: ");

                while (!scanner.hasNextInt()) {
                    System.out.println("Error: debe ingresar un numero entero.");
                    scanner.next();
                    System.out.print("Ingrese la cantidad de numeros: ");
                }

                cantidad = scanner.nextInt();

                if (cantidad <= 0) {
                    System.out.println(
                            "Error: la cantidad debe ser mayor que cero.");
                }

            } while (cantidad <= 0);

            // Creacion del arreglo
            double[] numeros = new double[cantidad];

            // Lectura de los numeros
            for (int i = 0; i < cantidad; i++) {

                System.out.print(
                        "Ingrese el numero " + (i + 1) + ": ");

                while (!scanner.hasNextDouble()) {
                    System.out.println(
                            "Error: debe ingresar un numero valido.");
                    scanner.next();
                    System.out.print(
                            "Ingrese el numero " + (i + 1) + ": ");
                }

                numeros[i] = scanner.nextDouble();
            }

            // Calculo de la mediana
            double mediana = calcularMediana(numeros);

            System.out.println("------------------------------------------");
            System.out.println("La mediana es: " + mediana);
            System.out.println("------------------------------------------");

            scanner.close();
        }
}
