package section10.tasks.vector.sum;

import java.util.Locale;
import java.util.Scanner;

public class SumApplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many number do you want to type? ");
        int numbersToType = scanner.nextInt();

        double[] numberVector = new double[numbersToType];

        for (int i = 0; i < numberVector.length; i++) {
            System.out.print("#" + (i + 1) + " type a number: ");
            numberVector[i] = scanner.nextDouble();
        }
        scanner.close();

        double sum = 0.0;

        System.out.print("\nValues: ");
        for (int i = 0; i < numberVector.length; i++) {
            System.out.printf("%.1f   ", numberVector[i]);
            sum += numberVector[i];
        }

        double average = sum / numberVector.length;

        System.out.println("\nSum = " + String.format("%.2f", sum));
        System.out.println("Average = " + String.format("%.2f", average));
    }
}
