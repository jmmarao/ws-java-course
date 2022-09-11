package section06.examples;

import java.util.Scanner;

public class DoWhileStructure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char stopCondition;
        double celsius;
        double fahrenheit;

        do {
            System.out.print("Temperature in celsius degrees: ");
            celsius = scanner.nextDouble();

            fahrenheit = (9.0 * celsius) / 5.0 + 32.0;

            System.out.println("Equivalent temperature in fahrenheit degrees: " + String.format("%.2f", fahrenheit));

            System.out.print("Repeat (y/n)? ");
            stopCondition = scanner.next().charAt(0);
        }
        while (stopCondition != 'n');

        scanner.close();
    }
}
