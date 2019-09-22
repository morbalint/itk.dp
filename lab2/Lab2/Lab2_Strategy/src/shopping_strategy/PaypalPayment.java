package shopping_strategy;

public class PaypalPayment implements PaymentStrategy {

    private final String email;
    private final String password;

    public PaypalPayment(String email, String password){

        this.email = email;
        this.password = password;
    }

    public void pay(int amount){
        System.out.println("paypal payment");
    }
}
