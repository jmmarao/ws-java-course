package section05.examples;

public class SimpleConditionalStructure {
    public static void main(String[] args) {
        double conditionalTest = Math.random() * 10.0;

        System.out.println("Before condition");

        if (conditionalTest > 5)
            System.out.println("In conditional structure!");

        System.out.println("After conditional");
    }
}
