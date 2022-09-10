package section06.tasks.for_structure;

import java.util.Scanner;

public class OddValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number = scanner.nextInt();

        System.out.println("Odd values until " + number);

        for (int i = 0; i <= number; i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }
        scanner.close();
    }
}
