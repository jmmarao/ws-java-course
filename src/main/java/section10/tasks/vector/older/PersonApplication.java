package section10.tasks.vector.older;

import java.util.Scanner;

public class PersonApplication {
    public static void main(String[] args) {
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

            people[i] = new Person(name, age);
        }
        scanner.close();

        int older = people[0].getAge();
        int olderPersonPosition = 0;

        for (int i = 0; i < people.length; i++) {
            if (people[i].getAge() > older) {
                older = people[i].getAge();
                olderPersonPosition = i;
            }
        }
        System.out.println("\nOlder person: " + people[olderPersonPosition].getName());
    }
}
