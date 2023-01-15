package section14.tasks.product.application;

import section14.tasks.product.entities.ImportedProduct;
import section14.tasks.product.entities.Product;
import section14.tasks.product.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Application {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int numberOfProducts = scanner.nextInt();

        for (int i = 1; i <= numberOfProducts; i++) {
            System.out.print("Product #" + i + " data:");

            System.out.print("Common, used or imported (c/u/i)? ");
            char productType = scanner.next().charAt(0);

            System.out.print("Name: ");
            String name = scanner.next();

            System.out.print("Price: ");
            Double price = scanner.nextDouble();

            if (productType == 'c') {
                products.add(new Product(name, price));
            } else if (productType == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = simpleDateFormat.parse(scanner.next());
                products.add(new UsedProduct(name, price, manufactureDate));
            } else if (productType == 'i') {
                System.out.print("Customs fee: ");
                Double customsFee = scanner.nextDouble();
                products.add(new ImportedProduct(name, price, customsFee));
            }
        }

        System.out.println("\nPRICE TAGS");
        for (Product product : products) {
            System.out.println(product.priceTag());
        }
    }
}
