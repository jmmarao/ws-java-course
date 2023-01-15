package section14.tasks.taxpayer.entities;

public class Company extends TaxPayer {
    private static final double TAX_16P = 0.16;
    private static final double TAX_14P = 0.14;
    private static final int MIN_EMPLOYEES = 10;

    private Integer numberOfEmployees;

    public Company(String name, Double annualIncome, Integer numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        if (numberOfEmployees > MIN_EMPLOYEES) {
            return TAX_14P * getAnnualIncome();
        }
        return TAX_16P * getAnnualIncome();
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
}
