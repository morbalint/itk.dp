package observer;

import java.util.List;
import java.util.ArrayList;

public class Subject {
	protected int m_value;
	private List<Observer> observerList = new ArrayList<>();

	public Subject()
	{
	}

	public void addObserver(Observer observer){
		observerList.add(observer);
	}

	public void set_value(int value)
	{
		m_value = value;
		notifyObservers();
	}
	public void notifyObservers()
	{
		for (Observer o : observerList) {
			o.update();
		}
	}

	public int getState() {
		return m_value;
	}

	public static void main(String[] args) {
		Subject subj = new Subject();
		subj.addObserver(new DivObserver(4, subj));
		subj.addObserver(new ModObserver(3, subj));
		subj.addObserver(new ModObserver(7, subj));
		subj.set_value(14);
	}

}
