package section09.task;

public class BankAccount {
    private static double WITHDRAW_TAX = 5.0;

    private int number;
    private String holder;
    private double balance;

    public BankAccount(Integer number, String holder) {
        this.number = number;
        this.holder = holder;
        deposit(0.0);
    }

    public BankAccount(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + WITHDRAW_TAX;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account " + getNumber() + ", Holder: " + getHolder() +
                ", Balance: $" + String.format("%.2f", getBalance()) + "\n";
    }
}
