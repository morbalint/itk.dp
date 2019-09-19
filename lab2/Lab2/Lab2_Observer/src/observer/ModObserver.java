package observer;

public class ModObserver implements Observer {
	protected  int m_mod;
	private final Subject subject;

	public ModObserver(int mod, Subject subject)
	{
		m_mod = mod;
		this.subject = subject;
	}
	public void update()
	{
		int val = subject.getState();
		System.out.println(val + " mod " + m_mod + " is " + val % m_mod + '\n');
	}
}
