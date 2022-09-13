package section10.tasks.vector.height;

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

            System.out.print("   Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();

            System.out.print("   Age: ");
            int age = scanner.nextInt();

            System.out.print("   Height: ");
            double height = scanner.nextDouble();

            people[i] = new Person(name, age, height);
        }
        scanner.close();

        double sumHeight = 0.0;
        int countMinorAge = 0;

        for (int i = 0; i < people.length; i++) {
            sumHeight += people[i].getHeight();

            if (people[i].getAge() < MINOR_AGE)
                countMinorAge++;
        }

        double averageHeight = sumHeight / people.length;
        double percentageMinorPeople = ((double) countMinorAge / people.length) * 100.0;

        System.out.println("\nAverage height: " + String.format("%.2f", averageHeight));
        System.out.println("People with less than 16 years old: " + String.format("%.1f", percentageMinorPeople) + "%");

        for (int i = 0; i < people.length; i++) {
            if (people[i].getAge() < MINOR_AGE)
                System.out.println(people[i].getName());
        }
    }
}
