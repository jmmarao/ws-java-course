package section20.examples.function.application;

import section20.examples.function.entities.Product;
import section20.examples.function.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> products = new ArrayList<>();

        products.add(new Product("TV", 900.0));
        products.add(new Product("Mouse", 50.0));
        products.add(new Product("Tablet", 350.50));
        products.add(new Product("HD Case", 80.90));

//        i. Interface implementation
//        List<String> productNames = products.stream().map(new UpperCaseName()).collect(Collectors.toList());

//        ii. Reference method with static method
//        List<String> productNames = products.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

//        iii. Reference method with non static method
//        List<String> productNames = products.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());

//        iv. Lambda expression declared
//        Function<Product, String> function = product -> product.getName().toUpperCase();
//        List<String> productNames = products.stream().map(function).collect(Collectors.toList());

//        iv. Lambda expression inline
        List<String> productNames = products.stream().map(product -> product.getName().toUpperCase()).collect(Collectors.toList());

        productNames.forEach(System.out::println);
    }
}
