import java.util.Random;

public class Utilidades {
    public static void rellenarNumerosAleatorios(int[] array) {
        Random random = new Random();
        long valorMaximoJava = Long.MAX_VALUE; // Máximo valor permitido en Java

        for (int i = 0; i < array.length; i++) {
            long numeroAleatorio = random.nextLong();
            long numeroRandom = Math.abs(numeroAleatorio) % (valorMaximoJava / 10); // 10% del valor máximo permitido
            array[i] = (int) numeroRandom;
        }
    }


    public static boolean naive(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void calcularPrimos(int[] numeros) {
        for (int numero : numeros) {
            boolean esPrimo = naive(numero);
            System.out.println("Número " + numero + " es primo: " + esPrimo);
        }
    }
}





