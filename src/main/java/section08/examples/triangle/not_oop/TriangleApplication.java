package section08.examples.triangle.not_oop;

import java.util.Scanner;

public class TriangleApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double triangleXSide1, triangleXSide2, triangleXSide3;
        double triangleYSide1, triangleYSide2, triangleYSide3;

        System.out.print("Enter the measures of triangle X: ");
        triangleXSide1 = scanner.nextDouble();
        triangleXSide2 = scanner.nextDouble();
        triangleXSide3 = scanner.nextDouble();

        System.out.print("Enter the measures of triangle Y: ");
        triangleYSide1 = scanner.nextDouble();
        triangleYSide2 = scanner.nextDouble();
        triangleYSide3 = scanner.nextDouble();

        scanner.close();

        double p = (triangleXSide1 + triangleXSide2 + triangleXSide3) / 2.0;
        double triangleXArea = Math.sqrt(p * (p - triangleXSide1) * (p - triangleXSide2) * (p - triangleXSide3));

        p = (triangleYSide1 + triangleYSide2 + triangleYSide3) / 2.0;
        double triangleYArea = Math.sqrt(p * (p - triangleYSide1) * (p - triangleYSide2) * (p - triangleYSide3));

        System.out.printf("Triangle X area: %.2f\n", triangleXArea);
        System.out.printf("Triangle Y area: %.2f\n", triangleYArea);

        if (triangleXArea > triangleYArea)
            System.out.println("Larger area: triangle X");
        else
            System.out.println("Larger area: triangle Y");
    }
}
