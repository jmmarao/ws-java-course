package section08.tasks.task2;

public class CurrencyConverter {
    private static final double IOF = 6.0;

    public static double converterToReais(double dollarPrice, double amount) {

        return (1.0 + IOF / 100.0) * dollarPrice * amount;
    }
}
