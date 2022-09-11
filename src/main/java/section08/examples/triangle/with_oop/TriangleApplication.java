package section08.examples.triangle.with_oop;

import java.util.Locale;
import java.util.Scanner;

public class TriangleApplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Triangle triangleX = new Triangle();
        Triangle triangleY = new Triangle();

        System.out.print("Enter the measures of triangle X: ");
        triangleX.side1 = scanner.nextDouble();
        triangleX.side2 = scanner.nextDouble();
        triangleX.side3 = scanner.nextDouble();

        System.out.print("Enter the measures of triangle Y: ");
        triangleY.side1 = scanner.nextDouble();
        triangleY.side2 = scanner.nextDouble();
        triangleY.side3 = scanner.nextDouble();

        scanner.close();

        double triangleXArea = triangleX.area();
        double triangleYArea = triangleY.area();

        System.out.printf("Triangle X area: %.2f\n", triangleXArea);
        System.out.printf("Triangle Y area: %.2f\n", triangleYArea);

        if (triangleXArea > triangleYArea)
            System.out.println("Larger area: triangle X");
        else
            System.out.println("Larger area: triangle Y");
    }
}
