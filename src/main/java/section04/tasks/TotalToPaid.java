package section04.tasks;

import java.util.Locale;
import java.util.Scanner;

public class TotalToPaid {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("First product");
        System.out.println("Type the product code, quantity of products and each product value");
        int productId1 = scanner.nextInt();
        int productQuantity1 = scanner.nextInt();
        double unitValueProduct1 = scanner.nextDouble();

        System.out.println("-------------------");
        System.out.println("Second product");
        System.out.println("Type the product code, quantity of products and each product value");
        int productId2 = scanner.nextInt();
        int productQuantity2 = scanner.nextInt();
        double unitValueProduct2 = scanner.nextDouble();

        System.out.println("-------------------");
        System.out.printf("Total to be paid: U$%.2f", productQuantity1 * unitValueProduct1 + productQuantity2 * unitValueProduct2);

        scanner.close();
    }
}
