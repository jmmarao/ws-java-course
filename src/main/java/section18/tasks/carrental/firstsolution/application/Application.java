package section18.tasks.carrental.firstsolution.application;

import section18.tasks.carrental.firstsolution.model.entities.CarRental;
import section18.tasks.carrental.firstsolution.model.entities.Vehicle;
import section18.tasks.carrental.firstsolution.model.services.BrazilService;
import section18.tasks.carrental.firstsolution.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter rental data");
        System.out.print("Car model: ");
        String model = scanner.nextLine();

        System.out.print("Pickup (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(scanner.nextLine(), dateTimeFormatter);

        System.out.print("Return (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(scanner.nextLine(), dateTimeFormatter);

        System.out.print("Enter price per hour: $");
        Double pricePerHour = scanner.nextDouble();

        System.out.print("Enter price per day: $");
        Double pricePerDay = scanner.nextDouble();

        scanner.close();

        CarRental carRental = new CarRental(start, finish, new Vehicle(model));
        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilService());
        rentalService.processInvoice(carRental);

        System.out.println("INVOICE:");
        System.out.println("Basic payment: $" + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
        System.out.println("Tax: $" + String.format("%.2f", carRental.getInvoice().getTax()));
        System.out.println("Total payment: $" + String.format("%.2f", carRental.getInvoice().totalPayment()));
    }
}
