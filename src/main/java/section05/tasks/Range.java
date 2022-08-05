package section05.tasks;

import java.util.Locale;
import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a number: ");
        double number = scanner.nextDouble();

        if (number < 0.0 || number > 100.0)
            System.out.println("The number typed is out the range [0.0, 100.0]");
        else if (number <= 25.0)
            System.out.println("The number typed is between the range [0.0, 25.0]");
        else if (number <= 50.0)
            System.out.println("The number typed is between the range (25.0, 50.0]");
        else if (number <= 75.0)
            System.out.println("The number typed is between the range (50.0, 75.0]");
        else
            System.out.println("The number typed is between the range (75.0, 100.0]");

        scanner.close();
    }
}
