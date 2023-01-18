package section15.examples.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String[] vector = scanner.nextLine().split(" ");
            int position = scanner.nextInt();
            scanner.close();

            System.out.println(vector[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
        } catch (InputMismatchException e) {
            System.out.println("Input error!");
        }
        System.out.println("End of program!");
    }
}
