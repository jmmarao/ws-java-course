package section13.examples.worker.application;

import section13.examples.worker.entities.Department;
import section13.examples.worker.entities.HourContract;
import section13.examples.worker.entities.Worker;
import section13.examples.worker.entities.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = scanner.nextLine();

        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Level: ");
        WorkerLevel level = WorkerLevel.valueOf(scanner.nextLine());

        System.out.print("Base salary: $");
        Double baseSalary = scanner.nextDouble();

        System.out.print("How many contracts to this worker? ");
        Integer numberOfContracts = scanner.nextInt();

        Department department = new Department(departmentName);
        Worker worker = new Worker(name, level, baseSalary, department);

        for (int i = 0; i < numberOfContracts; i++) {
            System.out.println("Enter contract #" + (i + 1) + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = dateFormat.parse(scanner.next());

            System.out.print("Value per hour: ");
            Double valuePerHour = scanner.nextDouble();

            System.out.print("Duration (hours): ");
            Integer hours = scanner.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);

            worker.addContract(contract);
        }

        System.out.print("\nEnter month and year to caalculate income (MM/YYYY): ");
        String monthAndYearString = scanner.next();

        scanner.close();

        Integer incomeMonth = Integer.parseInt(monthAndYearString.substring(0, 2));
        Integer incomeYear = Integer.parseInt(monthAndYearString.substring(3));

        System.out.println(worker);
        System.out.println("Income for " + monthAndYearString + ": $"
                + String.format("%.2f", worker.income(incomeMonth, incomeYear)));
    }
}
