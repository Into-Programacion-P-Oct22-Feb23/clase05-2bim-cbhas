package paquete01;

public class Ejemplo02 {

    public static void main(String[] args) {
        int numero = 20;
        System.out.printf("Números del %d al 1\n", numero);
        imprimirNumeros(numero);
    }

    public static void imprimirNumeros(int numero) {

        System.out.printf("\tEl número es: %d\n", numero);
        if (numero > 1) {  // se busca una condición que se 
                           // acerque al caso base
            numero = numero - 1;
            imprimirNumeros(numero);
        }
    }

}
