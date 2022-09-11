package section10.examples.vector.price;

import java.util.Locale;
import java.util.Scanner;

public class PriceVector {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many products do you want put in the store's warehouse? ");
        int numberOfProducts = scanner.nextInt();

        Product[] vector = new Product[numberOfProducts];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("#" + (i + 1) + " product name: ");
            scanner.nextLine();
            String name = scanner.nextLine();

            System.out.print("#" + (i + 1) + " product price: $");
            double price = scanner.nextDouble();

            vector[i] = new Product(name, price);
        }
        scanner.close();

        double sum = 0.0;
        for (int i = 0; i < vector.length; i++) {
            sum += vector[i].getPrice();
        }

        double average = sum / vector.length;
        System.out.println("AVERAGE PRICE: $" + String.format("%.2f", average));
    }
}
