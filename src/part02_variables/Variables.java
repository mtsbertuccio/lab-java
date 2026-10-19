package part02_variables;

public class Variables {

    public static void main(String[] args) {
        int age = 24;
        long worldPopulation = 8000000000L;
        double height = 1.82;
        float weight = 86.5f;
        boolean isProgrammer = true;
        char initial = 'M';
        String name = "Matias";

        System.out.println("---- USER DATA ----");
        System.out.println("Nombre: " + name + "\nInicial: " + initial);
        System.out.println("Edad: " + age);
        System.out.println("Altura: " + height + " mts");
        System.out.println("Peso: " + weight + " kgs");
        System.out.println("Es Programador?: " + isProgrammer);
        System.out.println("Población de la Tierra: " + worldPopulation);
    }
}
