package part05_controlflow;

public class ControlFlow {

    public static void main(String[] args) {
        // 1. Estructuras Condicionales (if / else)
        int age = 20;

        if (age >= 18) {
            System.out.println("Acceso Permitido.");
        } else {
            System.out.println("Acceso Denegado.");
        }

        // 2. Condicionales Múltiples (if / else if / else)
        int score = 85;

        if (score >= 90) {
            System.out.println("Calificación: Excelente (A)");
        } else if (score >= 75) {
            System.out.println("Calificación: Bueno (B)");
        } else {
            System.out.println("Calificación: Regular (C)");
        }

        // 3. Estructura de Selección (switch clásico)
        int dayOfWeek = 3;

        switch (dayOfWeek) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("Día no válido");
                break;
        }
    }
}
