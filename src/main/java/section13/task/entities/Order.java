package section13.task.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Double total() {
        Double total = 0.00;

        for (OrderItem item : items) {
            total += item.subTotal();
        }

        return total;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItens(OrderItem item) {
        items.add(item);
    }

    public void removeItens(OrderItem item) {
        items.remove(item);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nORDER SUMMARY:");
        stringBuilder.append("\nOrder moment: " + simpleDateFormat.format(moment));
        stringBuilder.append("\nOrder status: " + status);
        stringBuilder.append("\nClient: " + client);
        stringBuilder.append("\nOrder items:\n");
        getItem(stringBuilder);
        stringBuilder.append("Total price: $" + String.format("%.2f", total()));
        return stringBuilder.toString();
    }

    private void getItem(StringBuilder stringBuilder) {
        for (OrderItem item : items) {
            stringBuilder.append(item + "\n");
        }
    }
}
