package section20.examples.comparator.application;

import section20.examples.comparator.entities.Product;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        return product1.getName().toUpperCase().compareTo(product2.getName().toUpperCase());
    }
}
