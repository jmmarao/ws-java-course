package section10.tasks.vector.even_average;

import java.util.Locale;
import java.util.Scanner;

public class EvenAverageApplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to type? ");
        int numbersToType = scanner.nextInt();

        int[] numberVector = new int[numbersToType];

        for (int i = 0; i < numberVector.length; i++) {
            System.out.print("   #" + (i + 1) + " type a number: ");
            numberVector[i] = scanner.nextInt();
        }
        scanner.close();

        double evenSum = 0.0;
        int countEvenNumbers = 0;

        for (int i = 0; i < numberVector.length; i++) {
            if (numberVector[i] % 2 == 0) {
                evenSum += numberVector[i];
                countEvenNumbers++;
            }
        }

        if (countEvenNumbers == 0)
            System.out.println("There is no even number in this array.");
        else {
            double evenAverage = evenSum / countEvenNumbers;
            System.out.println("Average of even numbers in this array : " + String.format("%.1f", evenAverage));
        }
    }
}
