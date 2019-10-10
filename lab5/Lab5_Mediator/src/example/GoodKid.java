package example;

public class GoodKid implements Kid{
	
	private String gift;
	private Kid pair;
	
	public GoodKid(String s){
		gift = s;
	}
	
	@Override
	public void acquirePair(Kid k) {
		pair = k;
		
	}
	@Override
	public void releasePair() {
		pair = null;
		
	}

	@Override
	public String getGift() {
		return gift;
	}
	
	@Override
	public void setGift(String s) {
		gift = s;
	}
	
	

	@Override
	public void trade() {
		if(pair==null) return;
		String temp = new String(pair.getGift());
		pair.setGift(this.gift);
		this.gift = temp;
	}

}
