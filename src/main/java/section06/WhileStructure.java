package section06;

import java.util.Scanner;

public class WhileStructure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 1;
        int sum = 0;

        while (number != 0) {
            System.out.print("Type a number or 0 to exit: ");
            number = scanner.nextInt();

            sum += number;
        }
        scanner.close();

        System.out.println("Sum of input numbers = " + sum);
        System.out.println("Closing application...");
    }
}
