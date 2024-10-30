
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();

        int[] arr_int = new int[n];

        
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arr_int[i] = scanner.nextInt();
        }

        System.out.println("Arreglo invertido:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr_int[i] + " ");
        }

        scanner.close();
    }
}
