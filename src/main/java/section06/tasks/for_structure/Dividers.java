package section06.tasks.for_structure;

import java.util.Scanner;

public class Dividers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number = scanner.nextInt();

        System.out.println("\nNumber dividers:");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                System.out.println(i);
        }
        scanner.close();
    }
}
