package shopping_strategy;

// Where is the static class? or just a function library/module ?
public abstract class PaymentFactory {

    private PaymentFactory() {}

    public static PaymentStrategy createPaypalStrategy(String email, String password) {
        return new PaypalPayment(email, password);
    }

    public static PaymentStrategy createCreditCardStrategy(String name, String cardNumber, String ccv, String expiry) {
        return new CreditCardPayment(name, cardNumber, ccv, expiry);
    }

}