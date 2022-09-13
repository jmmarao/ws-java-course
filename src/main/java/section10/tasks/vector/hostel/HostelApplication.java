package section10.tasks.vector.hostel;

import java.util.Scanner;

public class HostelApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rent[] rooms = new Rent[9];

        System.out.print("How many rooms will be rented: ");
        int roomsToRent = scanner.nextInt();

        for (int i = 0; i < roomsToRent; i++) {
            System.out.print("\nRent #" + (i + 1));

            System.out.print("\nName: ");
            scanner.nextLine();
            String name = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Room: ");
            int roomNumber = scanner.nextInt();

            rooms[roomNumber] = new Rent(name, email);
        }
        scanner.close();

        System.out.println("\nBusy rooms:");
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                System.out.println(i + ": " + rooms[i]);
            }
        }
    }
}
