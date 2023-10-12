
public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[10]; // Cambia el tamaño del array según sea necesario
        Utilidades.rellenarNumerosAleatorios(numeros);
        long startTime = System.nanoTime();
        Utilidades.calcularPrimos(numeros);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;

        System.out.println("Tiempo de cálculo en segundos: " + (double) elapsedTime / 1_000_000_000 + " segundos");
        System.out.println("Tiempo de cálculo en milisegundos: " + (double) elapsedTime / 1_000_000 + " milisegundos");
        System.out.println("Tiempo de cálculo en nanosegundos: " + elapsedTime + " nanosegundos");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + numeros[i] + " es primo: " + Utilidades.naive(numeros[i]));
        }
    }
}