package section15.tasks.hotel.application;

import section15.tasks.hotel.model.entities.Reservation;
import section15.tasks.hotel.model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Room number: ");
            Integer roomNumber = scanner.nextInt();

            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkIn = simpleDateFormat.parse(scanner.next());

            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkOut = simpleDateFormat.parse(scanner.next());

            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println("\nEnter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = simpleDateFormat.parse(scanner.next());

            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = simpleDateFormat.parse(scanner.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        } catch (ParseException e) {
            System.out.println("Invalid date format");
        } catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }
        scanner.close();
    }
}
