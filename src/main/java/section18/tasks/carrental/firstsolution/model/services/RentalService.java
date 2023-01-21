package section18.tasks.carrental.firstsolution.model.services;

import section18.tasks.carrental.firstsolution.model.entities.CarRental;
import section18.tasks.carrental.firstsolution.model.entities.Invoice;

import java.time.Duration;

public class RentalService {
    private Double pricePerHour;
    private Double pricePerDay;
    private BrazilService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, BrazilService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60.0;
        double basicPayments;

        if (hours <= 12.0) {
            basicPayments = pricePerHour * Math.ceil(hours);
        } else {
            basicPayments = pricePerDay * Math.ceil(hours / 24.0);
        }

        double tax = taxService.tax(basicPayments);

        carRental.setInvoice(new Invoice(basicPayments, tax));
    }
}
