package section05.examples;

public class LinkedConditionalStructure {
    public static void main(String[] args) {
        double conditionalTest = Math.random() * 10.0;

        System.out.printf("Random number: %.2f", conditionalTest);

        if (conditionalTest < 3.0)
            System.out.println("\nConditional structure < 3.0");
        else
        {
            if (conditionalTest < 6.0)
                System.out.println("\nConditional structure > 3.0 and < 6.0");
            else
                System.out.println("\nConditional structure > 6.0");
        }
    }
}
