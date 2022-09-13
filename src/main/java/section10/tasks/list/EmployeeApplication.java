package section10.tasks.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmployeeApplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int numberOfEmployees = scanner.nextInt();

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("\nEmployee #" + (i + 1));

            System.out.print("Id: ");
            int id = scanner.nextInt();
            while (hasId(employees, id) != null) {
                System.out.print("Id already taken. Try again: ");
                id = scanner.nextInt();
            }

            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();

            System.out.print("Salary: $");
            double salary = scanner.nextDouble();

            employees.add(new Employee(id, name, salary));
        }

        System.out.print("\nEnter the employee id that will have salary increase: ");
        int idToFind = scanner.nextInt();

        Employee employeeToFind = hasId(employees, idToFind);

        if (employeeToFind == null)
            System.out.println("\nThis id does not exist!");
        else {
            System.out.print("Enter the percentage: ");
            double percentage = scanner.nextDouble();

            employeeToFind.increaseSalary(percentage);
        }
        scanner.close();

        System.out.println("\nList of employees:");
        employees.forEach(System.out::println);
    }

    public static Employee hasId(List<Employee> employees, int id) {
        return employees.stream().filter(employeeId -> employeeId.getId().equals(id)).findFirst().orElse(null);
    }
}
