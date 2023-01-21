package section18.tasks.carrental.firstsolution.model.services;

public class BrazilService {
    private static final Double TAX_20P = 0.2;
    private static final Double TAX_15P = 0.15;

    public BrazilService() {
    }

    public Double tax(Double amount) {
        if (amount <= 100.0) {
            return TAX_20P * amount;
        }
        return TAX_15P * amount;
    }
}
