import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalMinutos = 0;

        while (true) {
            System.out.print("Ingrese la duración en minutos del tramo (0 para finalizar): ");
            int minutos = sc.nextInt();

            if (minutos == 0) {
                break;
            }

           totalMinutos += minutos;
       }

        sc.close();


       int horas = totalMinutos / 60;
       int minutosRestantes = totalMinutos % 60;
       System.out.println("Tiempo total de viaje: " + horas + " horas " + minutosRestantes + " minutos");
    }
}