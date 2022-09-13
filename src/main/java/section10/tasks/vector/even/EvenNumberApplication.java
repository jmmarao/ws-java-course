package section10.tasks.vector.even;

import java.util.Scanner;

public class EvenNumberApplication {
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

        int countEvenNumbers = 0;

        System.out.println("\nEven numbers:");
        for (int i = 0; i < numberVector.length; i++) {
            if (numberVector[i] % 2 == 0) {
                countEvenNumbers++;
                System.out.printf("%d   ", numberVector[i]);
            }
        }

        System.out.println("\n\nEven numbers: " + countEvenNumbers);
    }
}
