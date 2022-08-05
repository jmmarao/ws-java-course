package section05.tasks;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0)
            System.out.println("The number typed is even");
        else
            System.out.println("The number typed is odd");

        scanner.close();
    }
}
