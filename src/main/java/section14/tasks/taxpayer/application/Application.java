package section14.tasks.taxpayer.application;

import section14.tasks.taxpayer.entities.Company;
import section14.tasks.taxpayer.entities.Individual;
import section14.tasks.taxpayer.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<TaxPayer> taxPayers = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int numberOfTaxPayers = scanner.nextInt();

        for (int i = 1; i <= numberOfTaxPayers; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char taxPayerType = scanner.next().charAt(0);

            System.out.print("Name: ");
            String name = scanner.next();

            System.out.print("Annual income: ");
            Double annualIncome = scanner.nextDouble();

            if (taxPayerType == 'i') {
                System.out.print("Health expenditures: ");
                Double healthExpenses = scanner.nextDouble();

                taxPayers.add(new Individual(name, annualIncome, healthExpenses));
            } else if (taxPayerType == 'c') {
                System.out.print("Number of employees: ");
                Integer numberOfEmployees = scanner.nextInt();

                taxPayers.add(new Company(name, annualIncome, numberOfEmployees));
            }
        }
        scanner.close();

        Double totalTaxes = 0.0;
        System.out.println("\nTAXES PAID:");
        for (TaxPayer taxPayer : taxPayers) {
            System.out.println(taxPayer);
            totalTaxes += taxPayer.tax();
        }

        System.out.println("\nTOTAL TAXES: $" + String.format("%.2f", totalTaxes));
    }
}
