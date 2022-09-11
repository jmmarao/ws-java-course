package section05.examples;

import java.util.Scanner;

public class PhoneBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Minutes in a call: ");
        int minutesInCall = scanner.nextInt();

        double phoneBill = 50.0;

        if (minutesInCall > 100.0)
            phoneBill += 2.0 * (minutesInCall - 100);

        System.out.println("-------------------");
        System.out.printf("Phone bill: $%.2f", phoneBill);

        scanner.close();
    }
}
