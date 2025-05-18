package oops.interfaces;

public class TestInterface {

    public static void main(String[] args) {

        UPIPayment.getPayment();


        PaymentGateway creditCard = new CreditCardPayment();
        creditCard.processPayment(7458d);

        PaymentGateway upi = new UPIPayment();
        upi.processPayment(78947d);


    }

}
