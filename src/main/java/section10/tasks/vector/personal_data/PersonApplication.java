package section10.tasks.vector.personal_data;

import java.util.Locale;
import java.util.Scanner;

public class PersonApplication {
    private static final int MINOR_AGE = 16;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many people do you want to register? ");
        int numberOfPeople = scanner.nextInt();

        Person[] people = new Person[numberOfPeople];

        for (int i = 0; i < people.length; i++) {
            System.out.println("Person #" + (i + 1) + " data:");

            System.out.print("   Height: ");
            double height = scanner.nextDouble();

            System.out.print("   Gender: ");
            char gender = scanner.next().charAt(0);

            people[i] = new Person(gender, height);
        }
        scanner.close();

        double lowerHeight = people[0].getHeight();
        double higherHeight = people[0].getHeight();
        double sumWomenHeight = 0.0;
        int countMen = 0;

        for (int i = 0; i < people.length; i++) {
            if (people[i].getHeight() < lowerHeight)
                lowerHeight = people[i].getHeight();

            if (people[i].getHeight() > higherHeight)
                higherHeight = people[i].getHeight();

            if (people[i].getGender() == 'F')
                sumWomenHeight += people[i].getHeight();
            else
                countMen++;
        }

        int countWomen = people.length - countMen;
        double averageWomenHeight = sumWomenHeight / countWomen;

        System.out.println("-------------------");
        System.out.println("Lower height = " + String.format("%.2f", lowerHeight));
        System.out.println("Higher height = " + String.format("%.2f", higherHeight));
        System.out.println("Average height of women  = " + String.format("%.2f", averageWomenHeight));
        System.out.println("Number of men = " + countMen);
    }
}
