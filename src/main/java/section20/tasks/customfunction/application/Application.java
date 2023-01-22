package section20.tasks.customfunction.application;

import section20.tasks.customfunction.model.entities.Product;
import section20.tasks.customfunction.model.services.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> products = new ArrayList<>();

        products.add(new Product("TV", 900.0));
        products.add(new Product("Mouse", 50.0));
        products.add(new Product("Tablet", 350.50));
        products.add(new Product("HD Case", 80.90));

        ProductService productService = new ProductService();
        double sum = productService.filteredSum(products, product -> product.getName().charAt(0) == 'T');

        System.out.println("Sum = " + String.format("%.2f", sum));
    }
}
