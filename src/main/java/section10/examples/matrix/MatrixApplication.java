package section10.examples.matrix;

import java.util.Scanner;

public class MatrixApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Order of matrix: ");
        int orderOfMatrix = scanner.nextInt();

        int[][] matrix = new int[orderOfMatrix][orderOfMatrix];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("value[%d][%d] = ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        System.out.print("\nMain diagonal: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        int negativeCounter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0)
                    negativeCounter++;
            }
        }
        System.out.println("\nNegative numbers = " + negativeCounter);
    }
}
