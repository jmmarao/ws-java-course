package section20.examples.consumer.application;

import section20.examples.consumer.entities.Product;
import section20.examples.consumer.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> products = new ArrayList<>();

        products.add(new Product("TV", 900.0));
        products.add(new Product("Mouse", 50.0));
        products.add(new Product("Tablet", 350.50));
        products.add(new Product("HD Case", 80.90));

//        i. Interface implementation
//        products.forEach(new PriceUpdate());

//        ii. Reference method with static method
//        products.forEach(Product::staticPriceUpdate);

//        iii. Reference method with non static method
//        products.forEach(Product::nonStaticPriceUpdate);

//        iv. Lambda expression declared
        double factor = 1.1;

//        Consumer<Product> consumer = product -> product.setPrice(product.getPrice() * factor);
//        products.forEach(consumer);

//        iv. Lambda expression inline
        products.forEach(product -> product.setPrice(product.getPrice() * factor));

        products.forEach(System.out::println);
    }
}
