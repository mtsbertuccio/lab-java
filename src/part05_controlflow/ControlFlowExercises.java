package part05_controlflow;

public class ControlFlowExercises {

    public static void main(String[] args) {

        // Ejercicio 1:
        // - Declara una variable entera para la nota de un examen (de 0 a 10).
        // - Evalúa si la nota es mayor o igual a 6 para imprimir que aprobó, caso contrario que desaprobó.

        /*
        int score = 6;

        if (score >= 6) {
            System.out.println("Aprobado.");
        } else {
            System.out.println("Desaprobado.");
        }
        */

        // Ejercicio 2:
        // - Declara una variable entera para la edad de una persona.
        // - Evalúa con if-else if-else si es niño (menor de 12), adolescente (entre 12 y 17) o adulto (18 o más).
        // - Imprime el resultado.

        /*
        int age = 24;

        if (age >= 18) {
            System.out.println("Adulto.");
        } else if (age >= 12 && age <= 17) {
            System.out.println("Adolescente.");
        } else if (age < 12) {
            System.out.println("Niño.");
        }
        */

        // Ejercicio 3:
        // - Declara una variable numérica del 1 al 7 representando un día de la semana.
        // - Utiliza un switch para imprimir el nombre del día correspondiente.

        /*
        int dayOfTheWeek = 6;

        switch (dayOfTheWeek) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("[ERROR] - El día de la semana no es válido.");
                break;
        }
        */

        // Ejercicio 4:
        // - Declara una variable String que almacene un rol de usuario ("ADMIN", "USER", "GUEST").
        // - Utiliza un switch para imprimir un mensaje de bienvenida personalizado según el rol.

        /*
        String userRole = "USER";

        switch (userRole) {
            case "ADMIN":
                System.out.println("¡Bienvenido, Admin!");
                break;
            case "USER":
                System.out.println("¡Bienvenido, Usuario!");
                break;
            case "GUEST":
                System.out.println("¡Bienvenido, Invitado!");
                break;
            default:
                System.out.println("[ERROR] - El tipo de usuario no es válido.");
        }
        */

        // Ejercicio 5:
        // - Declara una variable entera para un año.
        // - Evalúa si es un año bisiesto (divisible por 4 pero no por 100, o divisible por 400) usando operadores lógicos y condicionales.
        // - Imprime el resultado.

        /*
        int year = 2026;

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Bisiesto.");
        } else {
            System.out.println("Normal.");
        }
        */

    }
}
