package race;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RunRace {

	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		System.out.println("counter is " + counter.getCounter());
		ExecutorService es = Executors.newFixedThreadPool(3);
		for(int i = 0; i < 100; i ++){
			es.execute(new CounterTask(counter));
		}
		es.shutdown();
		es.awaitTermination(2, TimeUnit.MINUTES);
		System.out.println(counter.getCounter());

	}
}
