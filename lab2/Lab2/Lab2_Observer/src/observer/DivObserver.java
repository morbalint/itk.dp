package observer;

public class DivObserver implements Observer {
	protected final int m_div;
	private final Subject subject;

	public DivObserver(int div, Subject subject)
	{
		m_div = div;
		this.subject = subject;
	}
	public void update()
	{
		int val = subject.getState();
		System.out.println(val + " div " + m_div + " is " + val / m_div + '\n');
	}

}
