package part06_loops;

public class Loops {

    public static void main(String[] args) {
        // 1. For
        System.out.println("--- Bucle For (1 al 3) ---");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Iteración: " + i);
        }

        // 2. While
        System.out.println("\n--- Bucle While ---");
        int countdown = 3;
        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }

        // 3. Do-While
        System.out.println("\n--- Bucle Do-While ---");
        int attempts = 1;
        do {
            System.out.println("Intento: " + attempts);
            attempts++;
        } while (attempts <= 2);
    }
}
