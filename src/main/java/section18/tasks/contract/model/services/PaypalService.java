package section18.tasks.contract.model.services;

public class PaypalService implements OnlinePaymentService {
    private static final Double INSTALLMENT_TAX = 0.01;
    private static final Double PAYMENT_TAX = 0.02;

    @Override
    public Double paymentFee(Double amount) {
        return PAYMENT_TAX * amount;
    }

    @Override
    public Double interest(Double amount, Integer mounths) {
        return INSTALLMENT_TAX * amount * mounths;
    }
}
