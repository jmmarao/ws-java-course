package section07;

import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        int number1 = 89;
        int number2 = 60;

        System.out.println(number1 & number2);
        System.out.println(number1 | number2);
        System.out.println(number1 ^ number2);

        Scanner scanner = new Scanner(System.in);

        int mask = 0b100000;// 32 bits

        System.out.print("\n\nType a number to validate if your 6th bit is 1: ");
        int number = scanner.nextInt();


        if ((number & mask) != 0)
            System.out.println("6th bit is true!");
        else
            System.out.println("6th bit is false!");

        scanner.close();
    }
}
