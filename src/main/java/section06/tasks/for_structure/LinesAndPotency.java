package section06.tasks.for_structure;

import java.util.Scanner;

public class LinesAndPotency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int squared;
        int cubed;

        System.out.print("Number of lines: ");
        int lines = scanner.nextInt();

        for (int i = 1; i <= lines; i++) {
            number = i;
            squared = number * number;
            cubed = squared * number;

            System.out.printf("%d\t%d\t%d\n", number, squared, cubed);
        }

        scanner.close();
    }
}
