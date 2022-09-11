package section08.tasks.task1.grades;

import java.util.Locale;
import java.util.Scanner;

public class StudentApplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Name: ");
        student.name = scanner.nextLine();

        System.out.print("Grade 1: ");
        student.grade1 = scanner.nextDouble();

        System.out.print("Grade 2: ");
        student.grade2 = scanner.nextDouble();

        System.out.print("Grade 3: ");
        student.grade3 = scanner.nextDouble();

        scanner.close();

        System.out.println("\nFINAL GRADE: " + String.format("%.2f", student.finalGrade()));
        System.out.println(student.approved());

        if (student.missingPoints() > 0.0)
            System.out.println("MISING " + String.format("%.2f", student.missingPoints()) + " POINTS");
    }
}
