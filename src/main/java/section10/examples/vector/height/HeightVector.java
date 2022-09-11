package section10.examples.vector.height;

import java.util.Locale;
import java.util.Scanner;

public class HeightVector {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many people do you want measure their heights? ");
        int numberOfPeople = scanner.nextInt();

        double[] vector = new double[numberOfPeople];

        for (int i = 0; i < numberOfPeople; i++) {
            System.out.print("#" + (i + 1) + " person height: ");
            vector[i] = scanner.nextDouble();
        }
        scanner.close();

        double sum = 0.0;
        for (int i = 0; i < numberOfPeople; i++) {
            sum += vector[i];
        }

        double average = sum / numberOfPeople;
        System.out.println("AVERAGE HEIGHT: " + String.format("%.2f", average));
    }
}
