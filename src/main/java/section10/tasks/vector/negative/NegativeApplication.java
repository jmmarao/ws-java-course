package section10.tasks.vector.negative;

import java.util.Scanner;

public class NegativeApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to type? ");
        int numbersToType = scanner.nextInt();

        int[] numberVector = new int[numbersToType];

        for (int i = 0; i < numberVector.length; i++) {
            System.out.print("#" + (i + 1) + " type a number: ");
            numberVector[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println("\nNegative numbers:");
        for (int i = 0; i < numberVector.length; i++) {
            if (numberVector[i] < 0) {
                System.out.printf("%d\n", numberVector[i]);
            }
        }
    }
}
