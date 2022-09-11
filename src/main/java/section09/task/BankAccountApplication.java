package section09.task;

import java.util.Locale;
import java.util.Scanner;

public class BankAccountApplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        BankAccount bankAccount;

        System.out.print("Enter account number: ");
        int number = scanner.nextInt();

        System.out.print("Enter account holder: ");
        scanner.nextLine();
        String holder = scanner.nextLine();

        System.out.print("Is there an initial deposit (y/n): ");
        char option = scanner.nextLine().charAt(0);

        if (option == 'n')
            bankAccount = new BankAccount(number, holder);
        else {
            System.out.print("Enter initial deposit value: $");
            double balance = scanner.nextDouble();

            bankAccount = new BankAccount(number, holder, balance);
        }

        System.out.println("\nAccount data:\n" + bankAccount);

        System.out.print("Enter a deposit value: $");
        double amount = scanner.nextDouble();

        bankAccount.deposit(amount);
        System.out.println("Updated account data:\n" + bankAccount);

        System.out.print("Enter a withdraw value: $");
        amount = scanner.nextDouble();

        bankAccount.withdraw(amount);
        System.out.println("Updated account data:\n" + bankAccount);

        scanner.close();
    }
}
