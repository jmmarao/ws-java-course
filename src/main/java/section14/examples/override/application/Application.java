package section14.examples.override.application;

import section14.examples.override.entities.Account;
import section14.examples.override.entities.BusinessAccount;
import section14.examples.override.entities.SavingsAccount;

public class Application {
    public static void main(String[] args) {
        Account account = new Account(1001, "Hulk", 1000.0);
        account.withdraw(200.0);
        System.out.println(account.getBalance());

        Account accountSavings = new SavingsAccount(1004, "Scarlet Witch", 1000.0, 0.01);
        accountSavings.withdraw(200.0);
        System.out.println(accountSavings.getBalance());

        Account accountBusiness = new BusinessAccount(1003, "Black Panther", 1000.0, 500.0);
        accountBusiness.withdraw(200.0);
        System.out.println(accountBusiness.getBalance());
    }
}
