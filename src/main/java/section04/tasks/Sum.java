package section04.tasks;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("-------------------");
        System.out.println("Sum: " + firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));

        scanner.close();
    }
}
