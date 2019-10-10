package prototype;

public class Color {
	protected int r;
	protected int g;
	protected int b;
	public Color(int _r, int _g, int _b) {
		r=_r;
		g=_g;
		b=_b;
	}
	
	public int getR() {
		return r;
	}
	public int getG() {
		return g;
	}
	public int getB() {
		return b;
	}
	
	public void setR(int _r) {
		r = _r;
	}
	public void setG(int _g) {
		g = _g;
	}
	public void setB(int _b) {
		b = _b;
	}

	public Color clone(){
        return new Color(r, g, b);
    }

}
