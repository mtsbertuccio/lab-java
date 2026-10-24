package part08_methods;

public class Methods {

    public static void main(String[] args) {
        // 1. Llamada a un método void (sin retorno)
        printWelcomeMessage("Matías");

        // 2. Llamada a un método con retorno
        int sumResult = addNumbers(10, 20);
        System.out.println("Resultado de la suma: " + sumResult);

        // 3. Sobrecarga de métodos (Method Overloading)
        double doubleSum = addNumbers(5.5, 4.5);
        System.out.println("Resultado de la suma decimal: " + doubleSum);
    }

    // Método sin retorno (void)
    public static void printWelcomeMessage(String name) {
        System.out.println("¡Bienvenido al sistema, " + name + "!");
    }

    // Método con retorno entero
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // Sobrecarga del método addNumbers para recibir doubles
    public static double addNumbers(double a, double b) {
        return a + b;
    }
}
