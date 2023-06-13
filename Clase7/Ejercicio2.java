package Clase7;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        // Ingreso de datos
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el número " + (i +1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Encuentra el número mayor y el número menor
        int numeroMayor = numeros[0];
        int numeroMenor = numeros[0];

        for (int i = 1; i < 5; i++) {
            if (numeros[i] > numeroMayor) {
                numeroMayor = numeros[i];
            }

            if (numeros[i] < numeroMenor) {
                numeroMenor = numeros[i];
            }
        }


        // Muestra el número mayor y el número menor en pantalla
        System.out.println("El número mayor es: " + numeroMayor);
        System.out.println("El número menor es: " + numeroMenor);

        // Cierra el objeto Scanner
        scanner.close();

    }
}
