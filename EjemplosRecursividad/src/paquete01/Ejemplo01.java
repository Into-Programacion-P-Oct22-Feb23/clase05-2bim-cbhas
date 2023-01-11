package paquete01;

public class Ejemplo01 {

    public static void main(String[] args) {
        imprimirNumeros(4);
    }

    public static void imprimirNumeros(int numero) {
        System.out.printf("El número es: %d\n", numero);
        numero = numero - 1;
        imprimirNumeros(numero);

    }

}
