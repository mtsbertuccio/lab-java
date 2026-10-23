package part07_arrays;

public class Arrays {

    public static void main(String[] args) {
        // 1. Declaración e Inicialización

        // Forma 1: Con tamaño fijo y asignando valores después
        String[] languages = new String[3];
        languages[0] = "Java";
        languages[1] = "Python";
        languages[2] = "JavaScript";

        // Forma 2: Directa
        int[] scores = {90, 85, 88, 95, 100};

        // 2. Acceso a elementos y propiedad length
        System.out.println("Primer lenguaje: " + languages[0]);
        System.out.println("Cantidad de notas: " + scores.length);

        // 3. Recorrer un Array con un bucle for clásico
        System.out.println("\n--- Recorriendo lenguajes ---");
        for (int i = 0; i < languages.length; i++) {
            System.out.println("Índice " + i + ": " + languages[i]);
        }

        // 4. Recorrer un Array con bucle For-Each (Recomendado para lectura)
        System.out.println("\n--- Recorriendo notas con For-Each ---");
        for (int score : scores) {
            System.out.println("Nota: " + score);
        }
    }
}
