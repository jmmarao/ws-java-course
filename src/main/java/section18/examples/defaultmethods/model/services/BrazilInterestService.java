package section18.examples.defaultmethods.model.services;

public class BrazilInterestService implements InterestService {
    private Double interestRate;

    public BrazilInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public Double getInterestRate() {
        return interestRate;
    }
}
