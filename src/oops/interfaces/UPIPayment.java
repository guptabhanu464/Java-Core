package oops.interfaces;

public class UPIPayment implements PaymentGateway{

    static void getPayment() {
        System.out.println("Get Payment");
    }

    @Override
    public void processPayment(Double amount) {
        System.out.printf("Processing UPI payment of %.2f%n", amount);
    }


}
