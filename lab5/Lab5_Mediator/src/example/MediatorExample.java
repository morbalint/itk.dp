package example;

import java.util.ArrayList;

public class MediatorExample {

	public static void main(String[] args) {
		//Let's add some kids with preset gifts
		ArrayList<Kid> kids = new ArrayList<>();
		kids.add(new GoodKid("Chocolate"));
		kids.add(new BadKid("Chocolate"));
		kids.add(new BadKid("Coal"));

		Mediator mediator = new Mediator();

		mediator.register(TradeRequest.class, new TradeHandler());

		//unorganized first-come-first-serve based trading
		for(int i=0;i<kids.size();i++){
			for(int j=i+1;j<kids.size();j++){
				Kid a = kids.get(i);
				Kid b = kids.get(j);
				mediator.dispatch(new TradeRequest(a,b));
			}
		}
		
		/*
		 * It'd be better if there was some central Mediator that could organize trades more efficiently.
		 * Make it so that it only lets trades happen which actually result in a chocolate <-> coal switch.
		 */
		
	}

}
