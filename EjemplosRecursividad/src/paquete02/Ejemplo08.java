/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete02;

import java.util.Scanner;

public class Ejemplo08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tamaño;

        System.out.println("Ingrese el tamaño del arreglo:");
        tamaño = entrada.nextInt();

        int[] valores = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {
            System.out.println("Ingrese el valor:");
            valores[i] = entrada.nextInt();

        }

        System.out.printf("\nEl total es: %d\n",
                misterio(valores, valores.length));
    }

    public static int misterio(int[] arreglo, int tamanio) {

        if (tamanio == 1) {
            return arreglo[0];
        } else {
            return arreglo[tamanio - 1] + misterio(arreglo, tamanio - 1);
        }
    }

}
