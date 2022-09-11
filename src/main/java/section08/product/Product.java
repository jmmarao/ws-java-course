package section08.product;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValuenInStock() {
        return quantity * price;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return name +", $" + String.format("%.2f", price) +", " + quantity + " units, Total: $" + String.format("%.2f", totalValuenInStock()) + "\n";
    }
}
