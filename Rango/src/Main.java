import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de datos que ingresará: ");
        int numDatos = scanner.nextInt();

        double minimo = Double.MAX_VALUE;
        double maximo = -Double.MAX_VALUE;


        for (int i = 0; i < numDatos; i++) {
            System.out.print("Ingrese el dato " + (i + 1) + ": ");
            double dato = scanner.nextDouble();

            if (dato < minimo) {
                minimo = dato;
            }
            if (dato > maximo) {
                maximo = dato;
            }
        }

        // Calcular y mostrar el rango de los datos
        double rango = maximo - minimo;
        System.out.println("El rango de los datos ingresados es: " + rango);

        // Cerrar el scanner
        scanner.close();
    }
}