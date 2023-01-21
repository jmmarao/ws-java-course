package section18.tasks.carrental.secondsolution.model.services;

public class BrazilService implements TaxService {
    private static final Double TAX_20P = 0.2;
    private static final Double TAX_15P = 0.15;

    public BrazilService() {
    }

    @Override
    public Double tax(Double amount) {
        if (amount <= 100.0) {
            return TAX_20P * amount;
        }
        return TAX_15P * amount;
    }
}
