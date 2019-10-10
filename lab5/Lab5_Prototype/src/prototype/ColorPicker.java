package prototype;

import java.util.HashMap;

public class ColorPicker {
	HashMap<String, Color> map;
	
	public ColorPicker() {
		map = new HashMap<String, Color>();
		map.put("red", new Color(255,0,0));
		map.put("green", new Color(0,255,0));
		map.put("blue", new Color(0,0,255));
	}
	
	public void set(String name, Color c) {
		map.put(name, c);
	}
	
	public Color get(String name) {
		Color c = map.get(name);
		return c.clone();
	}
	
	public static void main(String[] args) {
		ColorPicker picker = new ColorPicker();
		picker.set("magenta",new Color(255,0,255));
		picker.set("purple", new Color(128,0,128));
		//then we get to actually asking for colors
		Color c = picker.get("red");
		c = picker.get("magenta");
		//...
	}

}
