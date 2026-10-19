package part04_strings;

public class Strings {

    public static void main(String[] args) {
        String greeting = "  ¡Hola, Java Developer!  ";

        // 1. Métodos Principales
        int length = greeting.length();
        String upper = greeting.toUpperCase();
        String trimmed = greeting.trim();
        char character = greeting.charAt(6);
        boolean containsWord = greeting.contains("Java");

        System.out.println("Original: [" + greeting + "]");
        System.out.println("Longitud: " + length);
        System.out.println("Mayúsculas: " + upper);
        System.out.println("Sin espacios (Trim): [" + trimmed + "]");
        System.out.println("Caracter en índice 6: " + character);
        System.out.println("¿Contiene 'Java'?: " + containsWord);

        // 2. Inmutabilidad y Concatenación Moderna
        String firstName = "Matías";
        String lastName = "Bertuccio";

        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println("Nombre Completo: " + fullName);

        // 3. Comparación
        String text1 = "Java";
        String text2 = new String("Java");

        boolean wrongComparison = (text1 == text2); // Compara referencias en memoria (false)
        boolean correctComparison = text1.equals(text2); // Compara contenido real (true)

        System.out.println("Comparación con == (Errónea): " + wrongComparison);
        System.out.println("Comparación con .equals() (Correcta): " + correctComparison);
    }
}
