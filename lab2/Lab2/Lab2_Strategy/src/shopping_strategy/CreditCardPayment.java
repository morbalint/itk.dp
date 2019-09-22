package shopping_strategy;

public class CreditCardPayment implements PaymentStrategy {

    private final String name;
    private final String cardNumber;
    private final String ccv;
    private final String expiry;

    public CreditCardPayment(String name, String cardNumber, String ccv, String expiry){

        this.name = name;
        this.cardNumber = cardNumber;
        this.ccv = ccv;
        this.expiry = expiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println("credit card payment");
    }
}
