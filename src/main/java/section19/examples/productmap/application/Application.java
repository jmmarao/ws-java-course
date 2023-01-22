package section19.examples.productmap.application;

import section19.examples.productmap.entities.Product;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        Map<Product, Double> stock = new HashMap<>();

        Product product1 = new Product("TV", 900.0);
        Product product2 = new Product("Notebook", 1200.0);
        Product product3 = new Product("Tablet", 400.0);

        stock.put(product1, 10000.0);
        stock.put(product2, 20000.0);
        stock.put(product3, 15000.0);

        Product ps = new Product("TV", 900.0);

        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
    }
}
