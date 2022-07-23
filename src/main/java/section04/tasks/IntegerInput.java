package section04.tasks;

import java.util.Scanner;

public class IntegerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type four integers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();

        System.out.printf("\n%d x %d - %d x %d = %d", number1, number2, number3, number4, number1 * number2 - number3 * number4);

        scanner.close();
    }
}
