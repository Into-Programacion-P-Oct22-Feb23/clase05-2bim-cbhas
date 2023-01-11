/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete02;

public class Ejemplo07 {

    public static void main(String[] args) {
        int[] valores = {2, 3, 4, 5, 6, 7, 8};
        int[] potencias = {2, 3};

        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < potencias.length; j++) {
                System.out.printf("El valor %d elevado a la potencia 2, es: %d\n",
                    valores[i],
                    obtenerPotencia(valores[i],
                            potencias[j]));
            System.out.printf("El valor %d elevado a la potencia 3, es: %d\n\n",
                    valores[i],
                    obtenerPotencia(valores[i],
                            potencias[j]));

            }
            

        }

    }

    public static int obtenerPotencia(int base, int exponente) {

        if (exponente == 1) {
            return base;
        } else {

            return base * obtenerPotencia(base, exponente - 1);
        }
    }

}
