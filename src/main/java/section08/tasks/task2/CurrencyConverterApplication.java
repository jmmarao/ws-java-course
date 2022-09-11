package section08.tasks.task2;

import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverterApplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the dollar price? $");
        double dollarPrice = scanner.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double amount = scanner.nextDouble();

        scanner.close();

        double result = CurrencyConverter.converterToReais(dollarPrice, amount);

        System.out.printf("Amount to be paid in reais: R$%.2f", result);
    }
}
