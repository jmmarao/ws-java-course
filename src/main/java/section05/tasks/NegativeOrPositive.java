package section05.tasks;

import java.util.Scanner;

public class NegativeOrPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number = scanner.nextInt();

        if (number < 0)
            System.out.println("The number typed is negative");
        else if (number > 0)
            System.out.println("The number typed is positive");
        else
            System.out.println("The number typed is equal to zero");

        scanner.close();
    }
}
