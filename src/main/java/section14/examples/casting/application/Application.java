package section14.examples.casting.application;

import section14.examples.casting.entities.Account;
import section14.examples.casting.entities.BusinessAccount;
import section14.examples.casting.entities.SavingsAccount;

public class Application {
    public static void main(String[] args) {
        Account account = new Account(1001, "Hulk", 0.0);
        BusinessAccount businessAccount = new BusinessAccount(1002, "Black Widow", 0.0, 500.0);

        // Upcasting
        Account accountUpcasting = businessAccount;
        Account accountBusiness = new BusinessAccount(1003, "Black Panther", 0.0, 200.0);
        Account accountSavings = new SavingsAccount(1004, "Scarlet Witch", 0.0, 0.01);

        // Downcasting
        BusinessAccount businessAccountDowncasting = (BusinessAccount) accountBusiness;
        businessAccountDowncasting.loan(100.0);

        // Downcasting may thrown runtime exception, to avoid that it is required to validate the types with instanceof
        if (accountSavings instanceof BusinessAccount) {
            BusinessAccount businessAccountInstanceOf = (BusinessAccount) accountSavings;
            businessAccountInstanceOf.loan(200.0);
            System.out.println("Loan!");
        }

        if (accountSavings instanceof SavingsAccount) {
            SavingsAccount savingsAccountInstanceOf = (SavingsAccount) accountSavings;
            savingsAccountInstanceOf.updateBalance();
            System.out.println("Update!");
        }
    }
}
