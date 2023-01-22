package section19.examples.generics.printservice.application;

import section19.examples.generics.printservice.service.PrintService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PrintService<Integer> integerPrintService = new PrintService<>();

        System.out.print("How many values? ");
        int listSize = scanner.nextInt();

        for (int i = 0; i < listSize; i++) {
            Integer value = scanner.nextInt();
            integerPrintService.addValue(value);
        }
        scanner.close();

        integerPrintService.print();
        System.out.println("First: " + integerPrintService.firstValue());
    }
}
