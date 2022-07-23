package section04.tasks;

import java.util.Locale;
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Radius: ");
        double radius = scanner.nextDouble();

        System.out.println("-------------------");
        System.out.printf("Circle area: %.2f x (%.2f)² = %.4f", Math.PI, radius, Math.PI * Math.pow(radius, 2));

        scanner.close();
    }
}
