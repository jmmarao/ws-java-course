package section04;

import java.util.Locale;
import java.util.Scanner;

public class DataInput {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("String: ");
        String string = scanner.next();
        System.out.println("String typed: " + string);

        System.out.print("\nInt: ");
        int integer = scanner.nextInt();
        System.out.println("Int typed: " + integer);

        System.out.print("\nDouble: ");
        double doubleNumber = scanner.nextDouble();
        System.out.println("Double typed: " + doubleNumber);

        System.out.print("\nCharacter: ");
        char character = scanner.next().charAt(0);
        System.out.println("Char typed: " + character);

        System.out.print("\nType a string, int and double: ");
        string = scanner.next();
        integer = scanner.nextInt();
        doubleNumber = scanner.nextDouble();
        System.out.println("String: " + string + " | Int: " + integer + " | Double: " + doubleNumber);

        scanner.close();
    }
}
