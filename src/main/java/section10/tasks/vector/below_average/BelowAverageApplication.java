package section10.tasks.vector.below_average;

import java.util.Locale;
import java.util.Scanner;

public class BelowAverageApplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to type? ");
        int numbersToType = scanner.nextInt();

        double[] numberVector = new double[numbersToType];

        for (int i = 0; i < numberVector.length; i++) {
            System.out.print("   #" + (i + 1) + " type a number: ");
            numberVector[i] = scanner.nextDouble();
        }
        scanner.close();

        double sum = 0.0;
        for (int i = 0; i < numberVector.length; i++) {
            sum += numberVector[i];
        }

        double average = sum / numberVector.length;

        System.out.println("\nVector average = " + String.format("%.3f", average));

        System.out.println("Elements below average");
        for (int i = 0; i < numberVector.length; i++) {
            if (numberVector[i] < average)
                System.out.println(numberVector[i]);
        }
    }
}
