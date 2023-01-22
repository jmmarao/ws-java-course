package section20.examples.comparator.application;

import section20.examples.comparator.entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> products = new ArrayList<>();

        products.add(new Product("TV", 900.0));
        products.add(new Product("Notebook", 1200.0));
        products.add(new Product("Tablet", 450.0));

//        i. Calling MyComparator class
//        products.sort(new MyComparator());

//        ii. Calling anonimous method
//        Comparator<Product> comparator = new Comparator<Product>() {
//            @Override
//            public int compare(Product product1, Product product2) {
//                return product1.getName().toUpperCase().compareTo(product2.getName().toUpperCase());
//            }
//        };

//        iii. Lambda expression
//        Comparator<Product> comparator = (product1, product2) -> product1.getName().toUpperCase().compareTo(product2.getName().toUpperCase());
//
//        products.sort(comparator);
        products.sort((product1, product2) -> product1.getName().toUpperCase().compareTo(product2.getName().toUpperCase()));

        for (Product product : products) {
            System.out.println(product);
        }
    }
}
