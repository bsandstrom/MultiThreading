package race;

public class CounterTask implements Runnable{
	Counter counter;
	
	public CounterTask(Counter counter){
		this.counter = counter;
	}

	@Override
	public void run() {
		for(int i = 0; i < 1000; i++){
			counter.increment();
		}
		
		for(int i = 0; i < 1000; i++){
			counter.decrement();
		}
	}

}
