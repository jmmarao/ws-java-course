package section06.tasks.for_structure;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numerator;
        int denominator;
        double division;

        System.out.print("How many input numbers do you want to division: ");
        int stopCondition = scanner.nextInt();

        for (int i = 0; i < stopCondition; i++) {
            System.out.print("Numerator: ");
            numerator = scanner.nextInt();

            System.out.print("Denominator: ");
            denominator = scanner.nextInt();

            if (denominator == 0)
                System.out.println("Error... impossible division\n");
            else {
                division = (double) numerator / denominator;
                System.out.println(numerator + "/" + denominator + " = " + String.format("%.2f", division) + "\n");
            }
        }
        scanner.close();
    }
}
