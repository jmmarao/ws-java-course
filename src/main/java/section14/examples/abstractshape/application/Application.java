package section14.examples.abstractshape.application;

import section14.examples.abstractshape.entities.Circle;
import section14.examples.abstractshape.entities.Color;
import section14.examples.abstractshape.entities.Rectangle;
import section14.examples.abstractshape.entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Shape> shapes = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int numberOfShapes = scanner.nextInt();

        for (int i = 1; i <= numberOfShapes; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char shapeType = scanner.next().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(scanner.next());

            if (shapeType == 'r') {
                System.out.print("Width: ");
                Double width = scanner.nextDouble();

                System.out.print("Height: ");
                Double height = scanner.nextDouble();

                shapes.add(new Rectangle(color, width, height));
            } else if (shapeType == 'c') {
                System.out.print("Radius: ");
                Double radius = scanner.nextDouble();

                shapes.add(new Circle(color, radius));
            }
        }

        scanner.close();

        System.out.println("\nSHAPE AREAS");
        for (Shape shape : shapes) {
            System.out.println(String.format("%.2f", shape.area()));
        }
    }
}
