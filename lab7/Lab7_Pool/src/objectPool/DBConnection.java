package objectPool;

public class DBConnection {
	private String url;
	private boolean isOpen = false;
	public DBConnection(String _url) throws Exception {
		this.open(_url);
	}

	public DBConnection() throws Exception {
	}
	
	public String query(String q) {
		return "Result of " + q;
	}
	
	public void close() throws Exception {
		if(isOpen){
			System.out.println("Closing connection to "+this.url);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			isOpen = false;
		}
	}

	public void open(String _url) throws Exception {
		if(isOpen){
			if(_url != this.url) {
				throw new Exception("connection is already open!");
			}
		}
		else {
			this.url = _url;
			System.out.println("Initialising connection to " + this.url);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			isOpen = true;
		}
	}
}
