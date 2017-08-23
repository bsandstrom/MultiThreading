package race;

public class Counter {
	private int counter = 0;
	
	public void increment(){
		counter = counter + 1;
	}
	
	public void decrement(){
		counter = counter - 1;
	}
	
	public int getCounter(){
		return this.counter;
	}
}
