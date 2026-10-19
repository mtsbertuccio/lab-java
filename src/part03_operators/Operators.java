package part03_operators;

public class Operators {

    public static void main(String[] args) {

        // 1. Operadores Aritméticos
        int a = 10;
        int b = 3;

        int sum = a + b;
        int sub = a - b;
        int multiplication = a * b;
        double division = (double) a / b;
        int remainder = a % b;

        System.out.println("---- 1. Operadores Aritméticos ----");
        System.out.println("Suma: " + sum);
        System.out.println("Resta: " + sub);
        System.out.println("Multiplicación: " + multiplication);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + remainder);

        // 2. Operadores de Asignación Compuesta
        int points = 50;
        points += 10;

        System.out.println("---- 2. Operadores de Asignación Compuesta ----");
        System.out.println("Puntuación Actualizada: " + points);

        // 3. Operadores Relacionales
        int x = 15;
        int y = 20;
        boolean isGreater = x > y;
        boolean areEquals = (x == y);

        System.out.println("---- 3. Operadores Relacionales ----");
        System.out.println("¿Es X Mayor que Y?: " + isGreater);
        System.out.println("¿Son X e Y Iguales?: " + areEquals);

        // 4. Operadores Lógicos
        boolean hasMoney = true;
        boolean hasTime = false;
        boolean canTravel = hasMoney && hasTime;
        boolean canRest = hasMoney || hasTime;

        System.out.println("---- 4. Operadores Lógicos ----");
        System.out.println("¿Puede Viajar?: " + canTravel);
        System.out.println("¿Puede Descansar?: " + canRest);
    }
}
