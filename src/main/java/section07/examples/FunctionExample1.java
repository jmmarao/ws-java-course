package section07.examples;

import java.util.Scanner;

public class FunctionExample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        int higherNumber = maxNumber(number1, number2, number3);

        showResult(higherNumber);

        scanner.close();
    }

    private static void showResult(int higherNumber) {
        System.out.println("Higher number: " + higherNumber);
    }

    private static int maxNumber(int number1, int number2, int number3) {
        if (number1 > number2 && number1 > number3)
            return number1;
        else if (number2 > number1 && number2 > number3)
            return number2;
        else
            return number3;
    }
}
