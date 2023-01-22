package section20.tasks.product.application;

import section20.tasks.product.model.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String path = "src/main/java/section20/tasks/product/temp/products.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            List<Product> products = new ArrayList<>();

            String line = bufferedReader.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                products.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = bufferedReader.readLine();
            }

            double average = products.stream()
                    .map(product -> product.getPrice())
                    .reduce(0.0, (x, y) -> x + y) / products.size();

            Comparator<String> comparator = (string1, string2) -> string1.toUpperCase().compareTo(string2.toUpperCase());

            List<String> productNameBelowAverage = products.stream()
                    .filter(product -> product.getPrice() < average)
                    .map(product -> product.getName())
                    .sorted(comparator.reversed())
                    .collect(Collectors.toList());

            System.out.println("Average price: $" + String.format("%.2f", average));
            productNameBelowAverage.forEach(System.out::println);
        } catch (IOException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
