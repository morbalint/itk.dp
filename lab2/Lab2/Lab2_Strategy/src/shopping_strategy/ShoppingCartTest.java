package shopping_strategy;

public class ShoppingCartTest {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("1234",10);
		Item item2 = new Item("5678",40);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
		//pay by paypal: user "myemail@example.com", password: mypwd
		//pay by credit card: name "Kiss Pista", number "1234567890123456", ccv "786", expiry "12/16"
	}
}
