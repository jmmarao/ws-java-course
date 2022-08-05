package section05.tasks;

import java.util.Scanner;

public class TotalToPaid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Code\tItem\t\t\tPrice");
        System.out.println("------------------------------");
        System.out.println("#1\t\tHot dog\t\t\t$4.00");
        System.out.println("#2\t\tCheese salad\t$4.50");
        System.out.println("#3\t\tCheese bacon\t$5.00");
        System.out.println("#4\t\tToast\t\t\t$2.00");
        System.out.println("#5\t\tSoda\t\t\t$1.50");
        System.out.println("------------------------------");

        System.out.print("Code: ");
        int itemCode = scanner.nextInt();

        System.out.print("Quantity: ");
        int itemQuantity = scanner.nextInt();

        double itemPrice = switch (itemCode) {
            case 1 -> 4.0;
            case 2 -> 4.5;
            case 3 -> 5.0;
            case 4 -> 2.0;
            case 5 -> 1.50;
            default -> 0.0;
        };

        System.out.printf("Total to be paid: U$%.2f", itemQuantity * itemPrice);

        scanner.close();
    }
}
