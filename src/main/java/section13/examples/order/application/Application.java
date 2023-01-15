package section13.examples.order.application;

import section13.examples.order.entities.Order;
import section13.examples.order.entities.OrderStatus;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        Order order = new Order(1, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus orderStatusDelivered = OrderStatus.DELIVERED;
        OrderStatus orderStatusValueOf = OrderStatus.valueOf("DELIVERED");

        System.out.println(orderStatusDelivered);
        System.out.println(orderStatusValueOf);
    }
}
