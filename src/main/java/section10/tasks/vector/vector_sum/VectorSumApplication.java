package section10.tasks.vector.vector_sum;

import java.util.Scanner;

public class VectorSumApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to type in each vector? ");
        int numbersToType = scanner.nextInt();

        int[] vectorA = new int[numbersToType];
        int[] vectorB = new int[numbersToType];

        System.out.println("VECTOR A");
        for (int i = 0; i < vectorA.length; i++) {
            System.out.print("   #" + (i + 1) + " type a number: ");
            vectorA[i] = scanner.nextInt();
        }

        System.out.println("\nVECTOR B");
        for (int i = 0; i < vectorB.length; i++) {
            System.out.print("   #" + (i + 1) + " type a number: ");
            vectorB[i] = scanner.nextInt();
        }
        scanner.close();

        int[] vectorC = new int[numbersToType];
        for (int i = 0; i < numbersToType; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
        }

        System.out.println("\nRESULTING VECTOR");
        for (int number : vectorC)
            System.out.println(number);
    }
}
