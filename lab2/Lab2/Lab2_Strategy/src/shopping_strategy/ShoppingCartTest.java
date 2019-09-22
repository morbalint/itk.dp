package shopping_strategy;

public class ShoppingCartTest {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("1234",10);
		Item item2 = new Item("5678",40);
		
		cart.addItem(item1);
		cart.addItem(item2);

		PaymentStrategy pp = PaymentFactory.createPaypalStrategy("myemail@example.com", "mypwd");
		cart.pay(pp);

		PaymentStrategy cc = PaymentFactory.createCreditCardStrategy(
				"Kiss Pista",
				"1234567890123456",
				"786",
				"12/16");
		cart.pay(cc);
	}
}
