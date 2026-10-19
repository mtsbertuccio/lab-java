package part03_operators;

public class OperatorsExercises {

    public static void main(String[] args) {

        // Ejercicio 1:
        // - Declara dos variables enteras.
        // - Calcula e imprime su suma, resta, multiplicación y el módulo.

        /*
        int x = 2;
        int y = 5;
        int sum = x + y;
        int sub = x - y;
        int multiplication = x * y;
        double division = (double) x / y;
        int remainder = x % y;

        System.out.printf("%d + %d = %d\n", x, y, sum);
        System.out.printf("%d - %d = %d\n", x, y, sub);
        System.out.printf("%d * %d = %d\n", x, y, multiplication);
        System.out.printf("%d / %d = %f\n", x, y, division);
        System.out.printf("%d %% %d = %d\n", x, y, remainder);
        */

        // Ejercicio 2:
        // - Declara una variable entera `lives` con valor 3.
        // - Utiliza operadores de asignación compuesta para restarle 1 vida (perdió).
        // - Luego sumarle 2 vidas (ganó un bono).
        // - Imprime el resultado final.

        /*
        int lives = 3;
        System.out.println("Lives: " + lives);
        lives--;
        System.out.println("Lives: " + lives);
        lives += 2;
        System.out.println("Lives: " + lives);
        */

        // Ejercicio 3:
        // - Declara una variable `temperature` con valor 28.5.
        // - Crea una variable que verifique si la temperatura es mayor a 25.0.
        // - Imprime el resultado.

        /*
        double temperature = 28.5;
        boolean checkTemperature = temperature > 25.0;
        System.out.printf("%f es MAYOR a 25.0 → %b", temperature, checkTemperature);
        */

        // Ejercicio 4:
        // - Declara dos variables `isAdult = true` y `hasTicket = false`.
        // - Crea una variable `canAccess` que evalúe si es adulto y tiene entrada.
        // - Imprime el resultado.

        /*
        boolean isAdult = true;
        boolean hasTicket = false;
        boolean canAccess = isAdult && hasTicket;

        System.out.println("¿Puede Entrar?: " + canAccess);
        */

        // Ejercicio 5:
        // - Calcula el promedio de tres notas escolares enteras.
        // - Imprime el promedio.

        /*
        double averageGrades = (4 + 6 + 8) / 3.0;
        System.out.println("Promedio: " + averageGrades);
         */
    }
}
