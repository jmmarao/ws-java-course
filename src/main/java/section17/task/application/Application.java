package section17.task.application;

import section17.task.model.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.print("Enter file path: ");
        String sourceFileString = scanner.nextLine();

        File sourceFile = new File(sourceFileString);
        String sourceFolderString = sourceFile.getParent();

        boolean success = new File(sourceFolderString + "\\out").mkdir();

        String targetFileString = sourceFolderString + "\\out\\summary.csv";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFileString))) {
            String itemCSV = bufferedReader.readLine();

            while (itemCSV != null) {
                String[] fields = itemCSV.split(",");
                String name = fields[0];
                Double price = Double.parseDouble(fields[1]);
                Integer quantity = Integer.parseInt(fields[2]);

                products.add(new Product(name, price, quantity));

                itemCSV = bufferedReader.readLine();
            }

            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(targetFileString))) {
                for (Product product : products) {
                    bufferedWriter.write(product.getName() + "," + String.format("%.2f", product.total()));
                    bufferedWriter.newLine();
                }
                System.out.println(targetFileString + " CREATED!");
            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
