package section19.examples.generics.maxvalue.application;

import section19.examples.generics.maxvalue.model.entities.Product;
import section19.examples.generics.maxvalue.model.service.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> products = new ArrayList<>();

        String path = "src/main/java/section19/generics/maxvalue/temp/in.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                products.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = bufferedReader.readLine();
            }

            Product maxValueProduct = CalculationService.max(products);
            System.out.println("Most expensive:");
            System.out.println(maxValueProduct);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
