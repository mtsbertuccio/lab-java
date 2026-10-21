package part06_loops;

public class LoopsExercises {

    public static void main(String[] args) {

        // Ejercicio 1:
        // - Utiliza un bucle for para imprimir los números pares del 1 al 10.

        /*
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        */

        // Ejercicio 2:
        // - Utiliza un bucle while para sumar los números enteros del 1 al 5 e imprime el resultado final de la suma.

        /*
        int index = 0;
        int result = 0;

        while (index <= 5) {
            result += index;
            index++;
        }

        System.out.println(result);
        */

        // Ejercicio 3:
        // - Crea una variable entera con un valor inicial (ej. 3).
        // - Utiliza un bucle do-while que imprima un mensaje y decremente la variable hasta que sea menor o igual a 0.

        /*
        int var = 5;

        do {
            System.out.println(var);
            var--;
        } while (var >= 0);
        */

        // Ejercicio 4:
        // - Utiliza un bucle for para mostrar la tabla de multiplicar de un número (ej. del 5) del 1 al 10.

        /*
        for (int i = 1; i <= 10; i++) {
            System.out.println(5 * i);
        }
        */

        // Ejercicio 5:
        // - Utiliza un bucle for con una estructura condicional (if) para encontrar e imprimir el primer número divisible por 7 en el rango del 1 al 30, y utiliza `break` para detener el bucle una vez encontrado.

        /*
        for (int i = 1; i <= 30; i++) {
            if (i % 7 == 0) {
                System.out.println("El primer número divisible por 7 es " + i);
                break;
            }
        }
        */
    }
}
