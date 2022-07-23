package section04;

import java.util.Locale;

public class DataOutput {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.println("Number output");

        int intNumber = 32;
        double doubleNumber = 10.35784;

        System.out.println(intNumber);
        System.out.println(doubleNumber);
        System.out.printf("%.2f | formated\n", doubleNumber);
        System.out.println("-------------------");

        System.out.println("Concat string format output");

        String name = "Jones";
        int age = 29;
        double income = 4000.0;
        System.out.printf("[%s] has %d years old. His income is $%.2f", name, age, income);
    }
}
