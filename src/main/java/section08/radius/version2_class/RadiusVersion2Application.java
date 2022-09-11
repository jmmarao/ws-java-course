package section08.radius.version2_class;

import java.util.Locale;
import java.util.Scanner;

public class RadiusVersion2Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        CalculatorUtils calculatorUtils = new CalculatorUtils();

        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        scanner.close();

        double circumference = calculatorUtils.circumference(radius);
        double volume = calculatorUtils.volume(radius);

        System.out.printf("Circumference: %.2f\n", circumference);
        System.out.printf("Volume: %.2f\n", volume);
        System.out.printf("PI: %.2f\n", calculatorUtils.PI);
    }
}
