package section08.radius.version1_unique_program;

import java.util.Locale;
import java.util.Scanner;

public class RadiusVersion1Application {
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        scanner.close();

        double circumference = circumference(radius);
        double volume = volume(radius);

        System.out.printf("Circumference: %.2f\n", circumference);
        System.out.printf("Volume: %.2f\n", volume);
        System.out.printf("PI: %.2f\n", PI);
    }

    private static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    private static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
