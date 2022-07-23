package section04.tasks;

import java.util.Locale;
import java.util.Scanner;

public class GeometricShapes {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type three values: ");
        double value1 = scanner.nextDouble();
        double value2 = scanner.nextDouble();
        double value3 = scanner.nextDouble();

        System.out.println("-------------------");
        System.out.println("Areas");
        System.out.printf("   Right triangle:\t%.3f", value1 * value3 / 2);
        System.out.printf("\n   Cirle:\t%.3f", Math.PI * Math.pow(value3, 2));
        System.out.printf("\n   Trapezoid:\t%.3f", (value1 + value2) * value3/ 2);
        System.out.printf("\n   Square:\t%.3f", Math.pow(value2, 2));
        System.out.printf("\n   Rectangle:\t%.3f", value1 * value2);

        scanner.close();
    }
}
