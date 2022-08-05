package section05.tasks;

import java.util.Locale;
import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);
        double incomeTax = 0.0;

        System.out.print("Wage: R$");
        double wage = scanner.nextDouble();
        System.out.println("-------------------");

        if (wage >= 0 && wage <= 2000.0)
            System.out.println("Tax free");
        else if (wage <= 3000.0)
            incomeTax = 0.08 * (wage - 2000.0);
        else if (wage <= 4500.0)
            incomeTax = 0.08 * 1000.0 + 0.18 * (wage - 3000.0);
        else
            incomeTax = 0.08 * 1000.0 + 0.18 * 1500.0 + 0.28 * (wage - 4500.0);

        if (incomeTax != 0.0)
            System.out.printf("Income tax: R$%.2f", incomeTax);

        scanner.close();
    }
}
