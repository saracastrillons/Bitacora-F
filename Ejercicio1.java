import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo: ");
        int x = scanner.nextInt();

        // Crear el arreglo
        int[] arr_int = new int[x];

        // Llenar el arreglo con el doble de cada número ingresado por el usuario
        for (int i = 0; i < x; i++) {
            System.out.print("Ingrese un número entero: ");
            arr_int[i] = scanner.nextInt() * 2;
        }

        // Imprimir el arreglo
        System.out.println("Valores multiplicados por dos:");
        for (int i = 0; i < x; i++) {
            System.out.println(arr_int[i]);
        }

        
    }
}
