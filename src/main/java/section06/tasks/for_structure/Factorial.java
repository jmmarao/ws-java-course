package section06.tasks.for_structure;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int factorial = 1;

        System.out.print("Factorial: ");
        int stopCondition = scanner.nextInt();

        for (int i = stopCondition; i > 0; i--) {
            factorial *= i;
        }
        scanner.close();

        System.out.println(stopCondition + "! = " + factorial);
    }
}
