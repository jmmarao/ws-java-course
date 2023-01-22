package section20.examples.predicate.application;

import section20.examples.predicate.entities.Product;
import section20.examples.predicate.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> products = new ArrayList<>();

        products.add(new Product("TV", 900.0));
        products.add(new Product("Mouse", 50.0));
        products.add(new Product("HD Case", 80.90));
        products.add(new Product("Tablet", 350.50));

//        i. Interface implementation
//        products.removeIf(new ProductPredicate());

//        ii. Reference method with static method
//        products.removeIf(Product::staticProductPredicate);

//        iii. Reference method with non static method
//        products.removeIf(Product::nonStaticProductPredicate);

//        iv. Lambda expression declared
//        products.removeIf(product -> product.getPrice() >= 100.0);
        Predicate<Product> predicate = product -> product.getPrice() >= 100.0;
        products.removeIf(predicate);

//        iv. Lambda expression inline
//        products.removeIf(product -> product.getPrice() >= 100.0);

        for (Product product : products) {
            System.out.println(product);
        }
    }
}
