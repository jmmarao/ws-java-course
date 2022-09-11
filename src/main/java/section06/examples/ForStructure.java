package section06.examples;

import java.util.Scanner;

public class ForStructure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many input numbers do you want to add: ");
        int stopCondition = scanner.nextInt();

        int number;
        int sum = 0;
        for (int i = 0; i < stopCondition; i++) {
            System.out.print("#" + (i + 1) + " Type a number: ");
            number = scanner.nextInt();
            sum += number;
        }
        scanner.close();

        System.out.println("Sum of input numbers = " + sum);
    }
}
