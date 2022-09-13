package section10.tasks.vector.higher;

import java.util.Locale;
import java.util.Scanner;

public class HigherNumberApplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to type? ");
        int numbersToType = scanner.nextInt();

        double[] numberVector = new double[numbersToType];

        for (int i = 0; i < numberVector.length; i++) {
            System.out.print("#" + (i + 1) + " type a number: ");
            numberVector[i] = scanner.nextDouble();
        }
        scanner.close();

        double higherValue = numberVector[0];
        int higherValuePosition = 0;

        for (int i = 0; i < numberVector.length; i++) {
            if (numberVector[i] > higherValue) {
                higherValue = numberVector[i];
                higherValuePosition = i;
            }
        }

        System.out.println("\nHigher value: " + String.format("%.2f", higherValue));
        System.out.println("Higher value position: " + higherValuePosition);
    }
}
