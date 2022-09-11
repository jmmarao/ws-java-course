package section08.examples.product;

import java.util.Locale;
import java.util.Scanner;

public class ProductApplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter product data:");

        System.out.print("Name: ");
        product.name = scanner.next();

        System.out.print("Price: $");
        product.price = scanner.nextDouble();

        System.out.print("Quantity in stock: ");
        product.quantity = scanner.nextInt();

        System.out.println("\nProduct data: " + product);

        System.out.print("Enter the number of products to be added in stock: ");
        int productQuantity = scanner.nextInt();
        product.addProducts(productQuantity);
        System.out.println("\nUpdated data: " + product);

        System.out.print("Enter the number of products to be removed from stock: ");
        productQuantity = scanner.nextInt();
        product.removeProducts(productQuantity);
        System.out.println("\nUpdated data: " + product);

        scanner.close();
    }
}
