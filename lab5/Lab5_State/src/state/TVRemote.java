package state;

public class TVRemote {

	private State active = new OFFState();

	private State passive = new ONState();

	public void pushPower(){
		State temp = this.active;
		this.active = this.passive;
		this.passive = temp;
		this.active.printState();
	}
	public void increaseVolume(){
		active.increaseVolume();
	}

	public void decreaseVolume(){
		active.decreaseVolume();
	}
}
