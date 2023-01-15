package section13.task.application;

import section13.task.entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String clientName = scanner.nextLine();

        System.out.print("Email: ");
        String clientEmail = scanner.next();

        System.out.print("Birth date (DD/MM/YYYY): ");
        Date clientBirthDate = simpleDateFormat.parse(scanner.next());

        Client client = new Client(clientName, clientEmail, clientBirthDate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(scanner.next());

        Order order = new Order(new Date(), status, client);

        System.out.print("How many items to this order? ");
        int numberOfItems = scanner.nextInt();

        for (int i = 1; i <= numberOfItems; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            String productName = scanner.next();

            System.out.print("Product price: ");
            Double productPrice = scanner.nextDouble();

            System.out.print("Quantity: ");
            Integer quantity = scanner.nextInt();

            OrderItem item = new OrderItem(quantity, productPrice, new Product(productName, productPrice));

            order.addItens(item);
        }

        scanner.close();

        System.out.println(order);
    }
}
