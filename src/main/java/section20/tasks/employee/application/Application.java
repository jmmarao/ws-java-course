package section20.tasks.employee.application;

import section20.tasks.employee.model.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        String path = "src/main/java/section20/tasks/employee/temp/employees.txt";
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            List<Employee> employees = new ArrayList<>();

            String line = bufferedReader.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                employees.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = bufferedReader.readLine();
            }

            System.out.print("Enter salary: $");
            Double salaryToFind = scanner.nextDouble();

            Comparator<String> comparator = (string1, string2) -> string1.toUpperCase().compareTo(string2.toUpperCase());

            List<String> employeesEmailAboveSalaryToFind = employees.stream()
                    .filter(employee -> employee.getSalary() > salaryToFind)
                    .map(employee -> employee.getEmail())
                    .sorted(comparator)
                    .collect(Collectors.toList());

            double sum = employees.stream()
                    .filter(employee -> employee.getName().charAt(0) == 'M')
                    .map(employee -> employee.getSalary())
                    .reduce(0.0, (x, y) -> x + y);


            System.out.println("Email of people whose salary is more than " + String.format("%.2f", salaryToFind));
            employeesEmailAboveSalaryToFind.forEach(System.out::println);
            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));
        } catch (IOException exception) {
            System.out.println("Error: " + exception.getMessage());
        }

        scanner.close();
    }
}
