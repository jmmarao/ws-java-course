package section08.tasks.task1.employee;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeApplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = scanner.nextLine();

        System.out.print("Gross salary: $");
        employee.grossSalary = scanner.nextDouble();

        System.out.print("Tax: $");
        employee.tax = scanner.nextDouble();

        System.out.println("\nEmployee: " + employee);

        System.out.print("Which percentage to increase salary? ");
        double percentage = scanner.nextDouble();
        scanner.close();

        employee.increaseSalary(percentage);

        System.out.println("\nUpdated data: " + employee);
    }
}
