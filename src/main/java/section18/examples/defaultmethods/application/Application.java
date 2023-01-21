package section18.examples.defaultmethods.application;

import section18.examples.defaultmethods.model.services.InterestService;
import section18.examples.defaultmethods.model.services.USAInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Amount: $");
        Double amount = scanner.nextDouble();

        System.out.print("Months: ");
        Integer months = scanner.nextInt();

        scanner.close();

        InterestService interestService = new USAInterestService(1.0);
        Double payment = interestService.payment(amount, months);

        System.out.println("Payment after " + months + " months:");
        System.out.println(String.format("%.2f", payment));
    }
}
