package part08_methods;

import java.lang.reflect.Array;

public class MethodsExercises {

    public static void main(String[] args) {

        // Ejercicio 1:
        // - Crea un método void llamado `printGreeting` que reciba un nombre por parámetro y salude por consola.
        // - Llámalo desde el método main.

        // printGreeting("Matias");

        // Ejercicio 2:
        // - Crea un método que reciba dos números enteros y devuelva (return) su multiplicación.
        // - Imprime el resultado obtenido desde el main.

        // System.out.println(multiplyNumbers(2, 5));

        // Ejercicio 3:
        // - Crea un método que reciba un número entero y devuelva un booleano indicando si es par (true) o impar (false).
        // - Pruébalo con un par de números e imprime el resultado.

        // System.out.println(checkEven(10));

        // Ejercicio 4:
        // - Crea un método que reciba una cadena de texto y devuelva la misma cadena convertida a mayúsculas (.toUpperCase()).
        // - Imprime el resultado desde el main.

        // System.out.println(convertToUpperCase("Word"));

        // Ejercicio 5:
        // - Crea un método que reciba un array de enteros y devuelva el promedio de todos sus elementos (como double).
        // - Imprime el promedio obtenido.

        // System.out.println(calculateAverage(new int[]{16, 27, 38, 45, 61, 82}));
    }

    public static void printGreeting(String name) {
        System.out.printf("¡Hola, %s!\n", name);
    }

    public static int multiplyNumbers(int numberA, int numberB) {
        return numberA * numberB;
    }

    public static boolean checkEven(int number) {
        return number % 2 == 0;
    }

    public static String convertToUpperCase(String word) {
        return word.toUpperCase();
    }

    public static double calculateAverage(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.length;
    }
}
