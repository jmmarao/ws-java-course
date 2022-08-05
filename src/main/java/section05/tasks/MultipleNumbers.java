package section05.tasks;

import java.util.Scanner;

public class MultipleNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type two numbers: ");

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        if (firstNumber % secondNumber == 0 || secondNumber % firstNumber == 0)
            System.out.println("The numbers typed are multiples");
        else
            System.out.println("The numbers typed are not multiples");

        scanner.close();
    }
}
