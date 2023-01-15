package section14.tasks.employee.application;

import section14.tasks.employee.entities.Employee;
import section14.tasks.employee.entities.OutsourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        Integer numberOfEmployees = scanner.nextInt();

        for (int i = 1; i <= numberOfEmployees; i++) {
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)? ");
            char answer = scanner.next().charAt(0);

            System.out.print("Name: ");
            String name = scanner.next();

            System.out.print("Hours: ");
            Integer hours = scanner.nextInt();

            System.out.print("Value per hour: ");
            Double valuePerHour = scanner.nextDouble();


            if (answer == 'y') {
                System.out.print("Additional charge: ");
                Double additionalCharge = scanner.nextDouble();

                Employee employeeOutsorced = new OutsourceEmployee(name, hours, valuePerHour, additionalCharge);
                employees.add(employeeOutsorced);
            } else {
                Employee employee = new Employee(name, hours, valuePerHour);
                employees.add(employee);
            }
        }

        scanner.close();

        System.out.println("\nPAYMENTS:");
        for (Employee employee : employees)
            System.out.println(employee);
    }
}
