package section18.tasks.contract.model.services;

public interface OnlinePaymentService {
    Double paymentFee(Double amount);
    Double interest(Double amount, Integer mounths);
}
