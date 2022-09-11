package section05.examples;

public class IfElseStructure {
    public static void main(String[] args) {
        double conditionalTest = Math.random() * 10.0;

        System.out.printf("Random number: %.2f", conditionalTest);

        if (conditionalTest > 5.0)
            System.out.println("\nConditional structure > 5.0");
        else
            System.out.println("\nConditional structure < 5.0");
    }
}
