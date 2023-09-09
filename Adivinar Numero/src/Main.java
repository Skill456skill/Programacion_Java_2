import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAdivinar = random.nextInt(100) + 1;
        int intentos = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adivina el número entre 1 y 100.");

        while (true) {
            intentos++;

            System.out.print("Intento " + intentos + ": ");
            int intentoUsuario = scanner.nextInt();

            if (intentoUsuario < numeroAdivinar) {
                System.out.println("Es mayor que " + intentoUsuario);
            } else if (intentoUsuario > numeroAdivinar) {
                System.out.println("Es menor que " + intentoUsuario);
            } else {
                System.out.println("Correcto. ¡Adivinaste en " + intentos + " intentos!");
                break;
            }
        }
    }
}