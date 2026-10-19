package part04_strings;

public class StringsExercises {

    public static void main(String[] args) {

        // Ejercicio 1:
        // - Declara una variable String con la frase "  Spring Boot Back-End  ".
        // - Imprime la frase eliminando los espacios sobrantes de los extremos y en mayúsculas.

        /*
        String phrase = "  Spring Boot Back-End  ";
        String trimmedPhrase = phrase.trim();
        System.out.printf("Antes: [%s] — Después: [%s]", phrase, trimmedPhrase);
        */

        // Ejercicio 2:
        // - Declara una cadena con la palabra "Programación".
        // - Obtén e imprime cuántos caracteres tiene y cuál es la letra en la posición 3.

        /*
        String word = "Programación";
        int wordLength = word.length();
        char thirdCharInWord = word.charAt(3);
        System.out.printf("%s tiene %d caracteres y su carácter en la tercera posición es %c", word, wordLength, thirdCharInWord);
        */

        // Ejercicio 3:
        // - Declara dos variables String para tu nombre y tu apellido por separado.
        // - Únelas en una sola variable llamada `fullName`.
        // - Imprime el resultado.

        /*
        String firstName = "Matias";
        String lastName = "Bertuccio";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        */

        // Ejercicio 4:
        // - Declara una frase que hable sobre tecnología.
        // - Utiliza un booleano para verificar si la frase incluye la palabra "Java".
        // - Imprime el resultado con un mensaje claro.

        /*
        String phrase = "Estoy aprendiendo Java y me gusta mucho.";
        boolean containsWord = phrase.contains("Java");
        System.out.printf("¿La frase [%s] contiene la palabra Java?: %b", phrase, containsWord);
        */

        // Ejercicio 5:
        // - Declara dos cadenas con el mismo texto, pero una creada de forma literal ("Hola") y otra usando `new String("Hola")`.
        // - Compara ambas usando `.equals()` y muestra el resultado booleano por consola.

        /*
        String greeting = "Hola";
        String greetingTwo = new String("Hola");
        boolean areEquals = greeting.equals(greetingTwo);
        System.out.printf("¿La palabra [%s] es igual a [%s]?: %b", greeting, greetingTwo, areEquals);
        */
    }
}
