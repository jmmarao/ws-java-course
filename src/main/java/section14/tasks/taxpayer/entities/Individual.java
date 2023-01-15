package section14.tasks.taxpayer.entities;

public class Individual extends TaxPayer {
    private static final double TAX_15P = 0.15;
    private static final double TAX_25P = 0.25;
    private static final double TAX_50P = 0.50;
    private static final double MIN_ANNUAL_INCOME = 20000.0;

    private Double healthExpenses;

    public Individual(String name, Double annualIncome, Double healthExpenses) {
        super(name, annualIncome);
        this.healthExpenses = healthExpenses;
    }

    @Override
    public Double tax() {
        if (getAnnualIncome() < MIN_ANNUAL_INCOME) {
            return TAX_15P * getAnnualIncome() - TAX_50P * healthExpenses;
        }
        return TAX_25P * getAnnualIncome() - TAX_50P * healthExpenses;
    }

    public Double getHealthExpenses() {
        return healthExpenses;
    }

    public void setHealthExpenses(Double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }
}
