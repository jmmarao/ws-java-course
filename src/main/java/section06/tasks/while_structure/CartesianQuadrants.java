package section06.tasks.while_structure;

import java.util.Scanner;

public class CartesianQuadrants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int xCoordinate = 1;
        int yCoordinate = 1;

        while (xCoordinate != 0 && yCoordinate != 0) {
            System.out.print("x coordinate: ");
            xCoordinate = scanner.nextInt();

            System.out.print("y coordinate: ");
            yCoordinate = scanner.nextInt();

            if (xCoordinate != 0 && yCoordinate != 0) {
                if (xCoordinate > 0 && yCoordinate > 0)
                    System.out.println("Quadrant I");
                else if (xCoordinate < 0 && yCoordinate > 0)
                    System.out.println("Quadrant II");
                else if (xCoordinate < 0)
                    System.out.println("Quadrant III");
                else
                    System.out.println("Quadrant IV");
            }
        }
        scanner.close();
    }
}
