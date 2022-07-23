package section04;

import java.util.Locale;

public class FormatedOutput {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, whice price is $ %.2f\n", product1, price1);
        System.out.printf("%s, whice price is $ %.2f\n", product2, price2);

        System.out.println("\nRecord: " + age + " years old, code " + code + " and gender: " + gender);

        System.out.printf("\nMeasure with eight decimal places: %.8f", measure);
        System.out.printf("\nRouded (three decimal places): %.3f", measure);

        Locale.setDefault(Locale.US);
        System.out.printf("\nUS decimal point: %.3f", measure);
    }
}
