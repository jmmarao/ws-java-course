package section18.tasks.contract.application;

import section18.tasks.contract.model.entities.Contract;
import section18.tasks.contract.model.entities.Installment;
import section18.tasks.contract.model.services.ContractService;
import section18.tasks.contract.model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter contract data");
        System.out.print("Number: ");
        Integer number = scanner.nextInt();

        System.out.print("Date (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(scanner.next(), dateTimeFormatter);

        System.out.print("Contract value: $");
        Double totalValue = scanner.nextDouble();

        System.out.print("Enter number of installments: ");
        Integer months = scanner.nextInt();

        scanner.close();

        ContractService contractService = new ContractService(new PaypalService());
        Contract contract = new Contract(number, date, totalValue);

        contractService.processContract(contract, months);
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }
    }
}
