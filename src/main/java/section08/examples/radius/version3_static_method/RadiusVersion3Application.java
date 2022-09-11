package section08.examples.radius.version3_static_method;

import java.util.Locale;
import java.util.Scanner;

public class RadiusVersion3Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        scanner.close();

        double circumference = CalculatorUtils.circumference(radius);
        double volume = CalculatorUtils.volume(radius);

        System.out.printf("Circumference: %.2f\n", circumference);
        System.out.printf("Volume: %.2f\n", volume);
        System.out.printf("PI: %.2f\n", CalculatorUtils.PI);
    }
}
