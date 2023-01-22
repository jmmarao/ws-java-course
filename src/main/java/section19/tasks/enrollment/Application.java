package section19.tasks.enrollment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> courseA = new HashSet<>();
        Set<Integer> courseB = new HashSet<>();
        Set<Integer> courseC = new HashSet<>();

        System.out.print("How many students for course A? ");
        int numberOfStudents = scanner.nextInt();

        for (int i = 0; i < numberOfStudents; i++) {
            courseA.add(scanner.nextInt());
        }

        System.out.print("How many students for course B? ");
        numberOfStudents = scanner.nextInt();

        for (int i = 0; i < numberOfStudents; i++) {
            courseB.add(scanner.nextInt());
        }

        System.out.print("How many students for course C? ");
        numberOfStudents = scanner.nextInt();

        for (int i = 0; i < numberOfStudents; i++) {
            courseC.add(scanner.nextInt());
        }

        scanner.close();

        Set<Integer> totalStudents = new HashSet<>(courseA);
        totalStudents.addAll(courseB);
        totalStudents.addAll(courseC);

        System.out.print("Total students: " + totalStudents.size());
    }
}
