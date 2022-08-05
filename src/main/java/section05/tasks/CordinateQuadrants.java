package section05.tasks;

import java.util.Locale;
import java.util.Scanner;

public class CordinateQuadrants {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.print("x = ");
        double x = scanner.nextDouble();

        System.out.print("y = ");
        double y = scanner.nextDouble();

        System.out.println("-------------------");

        if (x == 0.0 && y == 0.0)
            System.out.println("Origin");
        else if (x == 0.0)
            System.out.println("Y-axis");
        else if (y == 0.0)
            System.out.println("X-axis");
        else if (x > 0.0 && y > 0.0)
            System.out.println("Q1");
        else if (x < 0.0 && y > 0.0)
            System.out.println("Q2");
        else if (x < 0.0 && y < 0.0)
            System.out.println("Q3");
        else
            System.out.println("Q4");

        scanner.close();
    }
}
