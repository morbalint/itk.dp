package nullObject;

import java.util.HashMap;

public class PhoneBook {
	private HashMap<String,People> records;
	public PhoneBook() {
		records = new HashMap<String,People> ();
	}
	public IPeople search(String name) {

		People concretePerson = records.get(name);
		if(concretePerson == null){
			return DefaultPerson.getInstance();
		}
		else {
			return concretePerson;
		}
	}
	public void add(People p) {
		records.put(p.getName(), p);
	}
}
