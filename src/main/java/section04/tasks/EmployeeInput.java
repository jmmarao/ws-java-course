package section04.tasks;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeInput {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Employee id: ");
        int employeeId = scanner.nextInt();

        System.out.print("Hours worked: ");
        int workedHours = scanner.nextInt();

        System.out.print("Value per hour worked: U$");
        double valuePerHourWorked = scanner.nextDouble();

        System.out.println("-------------------");
        System.out.printf("[#%d] Salary = U$%.2f", employeeId, valuePerHourWorked * workedHours);

        scanner.close();
    }
}
