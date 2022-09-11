package section08.tasks.task1.rectangle;

import java.util.Locale;
import java.util.Scanner;

public class RectangleApplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.print("Rectangle width: ");
        rectangle.width = scanner.nextDouble();

        System.out.print("Rectangle height: ");
        rectangle.height = scanner.nextDouble();

        scanner.close();

        System.out.println("Area: " + String.format("%.2f", rectangle.area()));
        System.out.println("Perimeter: " + String.format("%.2f", rectangle.perimeter()));
        System.out.println("Diagonal: " + String.format("%.2f", rectangle.diagonal()));
    }
}
