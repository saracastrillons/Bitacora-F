
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();

       
        int[] arreglo1 = new int[n];
        System.out.println("Ingrese los elementos del arreglo:");


        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo1[i] = scanner.nextInt();
        }

        int[] arreglo2 = new int[n];
        for (int i = 0; i < n; i++) {
            arreglo2[i] = arreglo1[n - i - 1];
        }

        System.out.println("Arreglo original:");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo1[i] + " ");
        }

        System.out.println("\nArreglo invertido:");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo2[i] + " ");
        }

        
    }
}
