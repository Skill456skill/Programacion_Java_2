import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);


    // Inicio Variables
    String positivos = "";
    String negativos = "";
    // Fin Var


    System.out.println("Ingrese un valor (Para finalizar ingrese 0): ");


    // Procedimiento
    while(true) {

        // Entrada
        int num = sc.nextInt();
        // Fin entr

        if (num == 0) {
            break;
        } else if (num > 0) {
            positivos += "*";
        } else if (num < 0) {
            negativos += "*";
        }
    }
    // Fin Process


    // Salida
    System.out.println("\n Conteo \n");
    System.out.println("Positivos: "+positivos);
    System.out.println("Negativos: "+negativos);
    // Fin salid
    }
}