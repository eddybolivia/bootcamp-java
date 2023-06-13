package Clase7;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        // Ingreso de datos
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el número " + (i +1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar el promedio
        int total = 0;

        for (int i = 0; i < 5; i++) {
            total += numeros[i];
        }

        float promedio = (float) total / 5;

        System.out.print("El promedio de los números ingresados es: " + promedio);

        // Cierra el objeto Scanner
        scanner.close();

    }
}
