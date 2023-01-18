package section15.tasks.account.application;

import section15.tasks.account.model.entities.Account;
import section15.tasks.account.model.exceptions.BusinessException;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            Integer number = scanner.nextInt();

            System.out.print("Holder: ");
            scanner.next();
            String holder = scanner.nextLine();

            System.out.print("Initial balance: ");
            Double initialBalance = scanner.nextDouble();

            System.out.print("Withdraw limit: ");
            Double withdrawLimit = scanner.nextDouble();

            Account account = new Account(number, holder, initialBalance, withdrawLimit);

            System.out.print("\nEnter amount for withdraw: ");
            Double amount = scanner.nextDouble();

            account.withdraw(amount);
            System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
        } catch (BusinessException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }
        scanner.close();
    }
}
