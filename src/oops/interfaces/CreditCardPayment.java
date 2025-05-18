package oops.interfaces;

public class CreditCardPayment implements PaymentGateway{

    @Override
    public void processPayment(Double amount) {
        System.out.printf("Processing credit card payment of %.2f%n", amount);
    }
}
