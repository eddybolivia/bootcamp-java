package Clase7;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        // Ingreso de datos
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el número " + (i +1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar los datos
        System.out.println("Los números ingresados son: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }

        // Cierra el objeto Scanner
        scanner.close();

    }
}
