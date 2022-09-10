package section06.tasks.while_structure;

import java.util.Scanner;

public class WishList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option = 0;
        int alcoholCustomers = 0;
        int gasolineCustomers = 0;
        int dieselCustomers = 0;

        System.out.println("\t1. Alcohol\n\t2. Gasoline\n\t3. Diesel\n\t4. Exit");

        while (option != 4) {
            System.out.print("Option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> alcoholCustomers += 1;
                case 2 -> gasolineCustomers += 1;
                case 3 -> dieselCustomers += 1;
                default -> System.out.println("Invalid option. Try again\n");
            }
        }
        System.out.println("Thank you for your preference");
        System.out.println("Alcohol: " + alcoholCustomers);
        System.out.println("Gasoline: " + gasolineCustomers);
        System.out.println("Dieses: " + dieselCustomers);

        scanner.close();
    }
}
