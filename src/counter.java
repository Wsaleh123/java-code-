
public class counter {
	private int init;
	
	public counter() {
		init = 0;
	}
	
	public counter(int start) {
		init = start;
	}
	
	
	public void count() {
		this.init+=1;
	}
	
	public void count(int amount) {
		this.init = this.init + amount;
	}

	
	public int showCounter() {
		return init;
	}

}
