package section06.tasks.for_structure;

import java.util.Scanner;

public class InOrOutRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many input numbers do you want to check if it is in range [10, 20]: ");
        int stopCondition = scanner.nextInt();

        int number;
        int inRange = 0;
        int outRange = 0;

        for (int i = 0; i < stopCondition; i++) {
            System.out.print("#" + (i + 1) + " Number: ");
            number = scanner.nextInt();

            if (number < 10 || number > 20)
                outRange++;
        }
        scanner.close();

        inRange = stopCondition - outRange;

        System.out.println("\tNumbers in range: " + inRange);
        System.out.println("\tNumbers out range: " + outRange);
    }
}
