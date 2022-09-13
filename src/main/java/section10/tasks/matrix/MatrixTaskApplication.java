package section10.tasks.matrix;

import java.util.Scanner;

public class MatrixTaskApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("value[%d][%d] = ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.print("\nNumber to find from the matrix: ");
        int numberToFind = scanner.nextInt();

        scanner.close();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == numberToFind) {
                    System.out.printf("Position %d, %d\n", i, j);

                    // Not at first column
                    if (j > 0)
                        System.out.println("   Left: " + matrix[i][j - 1]);

                    // Not at first row
                    if (i > 0)
                        System.out.println("   Up: " + matrix[i - 1][j]);

                    // Not at last column
                    if (j < matrix[i].length - 1)
                        System.out.println("   Right: " + matrix[i][j + 1]);

                    // Not at last row
                    if (i < matrix[i].length - 1)
                        System.out.println("   Down: " + matrix[i + 1][j]);
                }
            }
        }

    }
}
