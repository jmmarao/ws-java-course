package section10.tasks.vector.approved;

import java.util.Locale;
import java.util.Scanner;

public class StudentApplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many students do you want to register? ");
        int numberOfStudents = scanner.nextInt();

        Student[] students = new Student[numberOfStudents];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Student #" + (i + 1) + " data:");

            System.out.print("   Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();

            System.out.print("   First semester grade: ");
            double firstGrade = scanner.nextDouble();

            System.out.print("   Second semester grade: ");
            double secondGrade = scanner.nextDouble();

            students[i] = new Student(name, firstGrade, secondGrade);
        }
        scanner.close();

        System.out.println("Approved students:");
        for (int i = 0; i < students.length; i++) {
            if (students[i].isApproved())
                System.out.println(students[i].getName());
        }
    }
}
