package part07_arrays;

public class ArraysExercises {

    public static void main(String[] args) {

        // Ejercicio 1:
        // - Declara un array de enteros con 5 valores numéricos de tu elección.
        // - Utiliza un bucle for para imprimir todos los elementos del array.

        /*
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        */

        // Ejercicio 2:
        // - Declara un array de Strings con los nombres de 4 ciudades.
        // - Imprime únicamente la primera y la última ciudad usando sus índices.

        /*
        String[] cities = {"Buenos Aires", "Londres", "Ciudad del Cabo", "Tokio"};
        System.out.println("1er Ciudad: " + cities[0]);
        System.out.println("4ta Ciudad: " + cities[cities.length - 1]);
        */

        // Ejercicio 3:
        // - Declara un array de enteros con 4 números.
        // - Recorre el array utilizando un bucle para sumar todos sus valores e imprime el total de la suma.

        /*
        int[] numbers = {1, 2, 3, 4};
        int result = 0;

        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }

        System.out.println(result);
        */

        // Ejercicio 4:
        // - Declara un array de enteros con 5 números desordenados.
        // - Encuentra e imprime cuál es el número mayor de todo el array.

        /*
        int[] randomNumbers = {3, 6, 7, 2, 4};
        int greaterNumber = randomNumbers[0];

        for (int i = 0; i < randomNumbers.length; i++) {
            int currentNumber = randomNumbers[i];

            if (currentNumber > greaterNumber) {
                greaterNumber = currentNumber;
            }
        }

        System.out.println(greaterNumber);
        */

        // Ejercicio 5:
        // - Declara un array de Strings con 3 palabras.
        // - Utiliza un bucle for-each para recorrerlo e imprime cada palabra en mayúsculas (usando .toUpperCase()).

        /*
        String[] words = {"Uno", "Dos", "Tres"};

        for (String word : words) {
            System.out.println(word.toUpperCase());
        }
        */
    }
}
