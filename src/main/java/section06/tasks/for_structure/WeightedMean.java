package section06.tasks.for_structure;

import java.util.Scanner;

public class WeightedMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade1;
        double grade2;
        double grade3;
        double weight1 = 2.0;
        double weight2 = 3.0;
        double weight3 = 5.0;
        double weightedMean;

        System.out.print("How many input numbers do you want to calculate the weighted mean: ");
        int stopCondition = scanner.nextInt();

        for (int i = 0; i < stopCondition; i++) {
            System.out.print("Grade 1: ");
            grade1 = scanner.nextDouble();

            System.out.print("Grade 2: ");
            grade2 = scanner.nextDouble();

            System.out.print("Grade 3: ");
            grade3 = scanner.nextDouble();

            weightedMean = (grade1 * weight1 + grade2 * weight2 + grade3 * weight3) / (weight1 + weight2 + weight3);

            System.out.println("Weighted Mean = " + String.format("%.2f", weightedMean) + "\n");
        }
        scanner.close();
    }
}
